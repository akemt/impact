package com.scholar.infra.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.Page;
import com.scholar.common.ArrayUtils;
import com.scholar.entity.CoreAuthor;
import com.scholar.entity.ImpactLindexDetail;
import com.scholar.infra.AuthorService;
import com.scholar.mapper.CoreAuthorMapper;
import com.scholar.mapper.CorePaperMapper;
import com.scholar.mapper.ImpactLindexDetailMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private ImpactLindexDetailMapper impactLindexDetailMapper;

    @Autowired
    private CorePaperMapper corePaperMapper;

    @Autowired
    private CoreAuthorMapper coreAuthorMapper;

    @Override
    public long getAuthorImpactCnt(Integer aid) {
        Page<Map<String, Object>> mapPage = corePaperMapper.getAuthorImpactList(aid);
        return mapPage.size();
    }

    @Override
    public List<Map<String, Object>> getGraphImpactbyAid(Integer aid) {

        List<ImpactLindexDetail> lindexDetailList = impactLindexDetailMapper.selectAllbyAid(aid);
        ImpactLindexDetail impactLindexDetail = null;
        JSONObject lSeJson = new JSONObject();
        JSONObject lCitations = new JSONObject();
        for (int i = 0; i < lindexDetailList.size(); i++) {
            impactLindexDetail = lindexDetailList.get(i);
            String lSequence = impactLindexDetail.getlSequence();
            lSeJson = JSONArray.parseObject(lSequence);
            String strCitations = impactLindexDetail.getCitations();
            lCitations = JSONArray.parseObject(strCitations);

        }
        List<Map<String, Object>> mapList = getGroupList(lSeJson, lCitations);

        listSort(mapList);
        return mapList;
    }

    @Override
    public Page<Map<String, Object>> getAuthorImpactList(Integer aid) {
        return corePaperMapper.getAuthorImpactList(aid);
    }

    @Override
    public CoreAuthor getAuthorInfo(String aid) {
        CoreAuthor coreAuthor  = coreAuthorMapper.selectAuthorInfoByPrimaryKey(aid);
        coreAuthor.setPic("/static/img/"+aid+".jpg");

        return coreAuthor;
    }

    @Override
    public Page<Map<String, Object>> getAuthorJifsList(String aid) {


        return coreAuthorMapper.getAuthorJifsList(aid);
    }

    @Override
    public long getAuthorJifsListCnt(String aid) {
        return coreAuthorMapper.getAuthorJifsList(aid).size();
    }

    @Override
    public List<Map<String, Object>> getAuthorGraphPublishedByYear(String aid) {
        return coreAuthorMapper.getAuthorGraphPublishedByYear(aid);
    }

    @Override
    public List<Map<String, Object>> getAuthorGraphJif(String aid) {
        return coreAuthorMapper.getAuthorGraphJif(aid);
    }

    @Override
    public Page<Map<String, Object>> getAuthorPapersCiteAffil(String aid) {
        return coreAuthorMapper.getAuthorPapersCiteAffil(aid);
    }


    @Override
    public List<Map<String, Object>> getAuthorGraphImpactAffil(String aid) {


        List<Map<String, Object>> mapList = coreAuthorMapper.getAuthorPapersCiteAffilTop10(aid,10);
        Map<String, Object> map = null;
        Integer count = 0;
        for (int i = 0; i < mapList.size(); i++) {
            map = mapList.get(i);
            count = count + Integer.valueOf(map.get("count").toString());
        }

        Integer cnt = coreAuthorMapper.getAuthorPapersCiteAffilAll(aid);
        Map<String, Object> map1 = new HashMap<>();
        map1.put("count", cnt - count);
        map1.put("affiliation", "other");
        mapList.add(map1);
        return mapList;
    }

    @Override
    public  Page<Map<String, Object>> getAuthorPapersCiteCountry(String aid) {
        return coreAuthorMapper.getAuthorPapersCiteCountry(aid);
    }

    @Override
    public List<Map<String, Object>> getAuthorGraphImpactCountry(String aid) {


        List<Map<String, Object>> mapList = coreAuthorMapper.getAuthorPapersCiteCountryTop10(aid,10);
        Map<String, Object> map = null;
        Integer count = 0;
        for (int i = 0; i < mapList.size(); i++) {
            map = mapList.get(i);
            count = count + Integer.valueOf(map.get("count").toString());
        }

        Integer cnt = coreAuthorMapper.getAuthorPapersCiteCountryAll(aid);
        Map<String, Object> map1 = new HashMap<>();
        map1.put("count", cnt - count);
        map1.put("country", "other");
        mapList.add(map1);
        return mapList;
    }

    @Override
    public Page<Map<String, Object>>  getAuthorPapersCiteJournal(String aid) {
        return coreAuthorMapper.getAuthorPapersCiteJournal(aid);
    }

    @Override
    public List<Map<String, Object>> getAuthorGraphImpactJournals(String aid) {
        List<Map<String, Object>> mapList = coreAuthorMapper.getAuthorPapersCiteJournalTop10(aid,10);
        Map<String, Object> map = null;
        Integer count = 0;
        Double jif = 0.0;
        for (int i = 0; i < mapList.size(); i++) {
            map = mapList.get(i);
            count = count + Integer.valueOf(map.get("count").toString());
            jif = jif + Double.valueOf(map.get("jif").toString());
        }

        Map<String,Object> mapPaperCite = coreAuthorMapper.getAuthorPapersCiteJournalAll(aid);
        Map<String, Object> map1 = new HashMap<>();
        map1.put("count", Integer.valueOf(mapPaperCite.get("count").toString()) - count);
        map1.put("jif",Double.valueOf(mapPaperCite.get("jif").toString()) - jif);
        map1.put("journal", "other");
        mapList.add(map1);
        return mapList;
    }


    @Override
    public List<Map<String, Object>> getAuthorGraphPapers(String aid) {
        return null;
    }


    @Override
    public Map<String, Object> getAuthorGraphhindexByYear(String aid) {

        List<Map<String, Object>>  mapList = coreAuthorMapper.getAuthorGraphhindexByYear(aid);
        Map<String, Object> map = new HashMap<>();
        map.put("citedList", ArrayUtils.listMapToLong(mapList));
        map.put("hindex",0);
        return map;
    }

    @Override
    public List<Map<String, Object>> getAuthorGraphProportions(String aid) {
        List<Map<String, Object>> mapList = coreAuthorMapper.getAuthorGraphProportionsTop10(aid);
        Map<String, Object> map = null;
        Integer count = 0;
        for (int i = 0; i < mapList.size(); i++) {
            map = mapList.get(i);
            count = count + Integer.valueOf(map.get("count").toString());
        }

        Integer cnt = coreAuthorMapper.getAuthorGraphProportionsAll(aid);
        Map<String, Object> map1 = new HashMap<>();
        map1.put("count", cnt - count);
        map1.put("proportions", "other");
        mapList.add(map1);
        return mapList;
    }

    /**
     * 遍历graph impact 数据
     *
     * @param mapSeq
     * @param mapCit
     * @return
     */
    public List<Map<String, Object>> getGroupList(Map<String, Object> mapSeq, Map<String, Object> mapCit) {

        List<Map<String, Object>> list = new ArrayList<>();
        for (String k : mapSeq.keySet()) {
            Map<String, Object> map = new HashMap<>();
            boolean state = false;
            for (String c : mapCit.keySet()) {
                if (k.equals(c)) {
                    map.put("year", k);
                    map.put("citation", mapCit.get(c));
                    map.put("Lindex", mapSeq.get(k));
                    list.add(map);
                    state = true;
                    break;
                }
            }
            if (!state) {
                map.put("year", k);
                map.put("citation", 0);
                map.put("Lindex", mapSeq.get(k));
                list.add(map);
            }
        }
        return list;
    }

    /**
     * 排序 List<Map<String,Object>>
     *
     * @param resultList
     * @throws Exception
     */
    public void listSort(List<Map<String, Object>> resultList) {
        // resultList是需要排序的list，其内放的是Map
        // 返回的结果集
        Collections.sort(resultList, new Comparator<Map<String, Object>>() {

            public int compare(Map<String, Object> o1, Map<String, Object> o2) {

                //o1，o2是list中的Map，可以在其内取得值，按其排序，此例为升序，s1和s2是排序字段值
                Integer s1 = Integer.valueOf(o1.get("year").toString());
                Integer s2 = Integer.valueOf(o2.get("year").toString());

                if (s1 > s2) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });

    }
}
