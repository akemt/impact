package com.scholar.infra.impl;

import com.alibaba.fastjson.JSONArray;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.scholar.entity.ImpactCacheRanking;
import com.scholar.infra.ImpactListService;
import com.scholar.mapper.ImpactCacheRankingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ImpactListServiceImpl implements ImpactListService {



    @Autowired
    private ImpactCacheRankingMapper impactCacheRankingMapper;

    @Override
    public Map<String, Object> getImpactList(String orderby, Integer page, Integer size) {
        //page 默认1
        if (page == null) {
            page = 1;
        }
        //size 每页的个数，null 显示全部
        if (size == null) {
            size = (int)impactCacheRankingMapper.selectAll().size();
        }

        //分页
        PageHelper.startPage(page, size);

        Page<ImpactCacheRanking> impactCacheRankingPage = impactCacheRankingMapper.selectAll();

        List<ImpactCacheRanking> impactCacheRankingsResult = impactCacheRankingPage.getResult();
        ImpactCacheRanking impactCacheRanking = new ImpactCacheRanking();
        for(int i=0;i<impactCacheRankingsResult.size();i++){
            impactCacheRanking = impactCacheRankingsResult.get(i);
            impactCacheRanking.setPerson(JSONArray.parse(impactCacheRanking.getTop5()));
        }

        Map<String, Object> map = new HashMap<>();
        map.put("page", page);//第几页
        map.put("total", impactCacheRankingPage.getPages());//一共有几页
        map.put("list", impactCacheRankingPage);

        return map;
    }

    @Override
    public Map<String, Object> getImpactPersonsList(String lid, String orderby, Integer page, Integer size) {
        ImpactCacheRanking impactCacheRankingPage = impactCacheRankingMapper.selectByPrimaryKey(Integer.valueOf(lid));

        Object mapPage =  JSONArray.parse(impactCacheRankingPage.getContent());

        //page 默认1
        if (page == null) {
            page = 1;
        }
        //size 每页的个数，null 显示全部
        if (size == null) {
            size = 200;
        }

        //分页
        PageHelper.startPage(page, size);

        Map<String, Object> map = new HashMap<>();
        map.put("page", page);//第几页
        map.put("total", 200);//一共有几页
        map.put("list", mapPage);

        return map;
    }

    @Override
    public long getImpactCacheRankingCnt() {
        Page<ImpactCacheRanking> impactCacheRankings = impactCacheRankingMapper.selectAll();
        return impactCacheRankings.size();
    }
}
