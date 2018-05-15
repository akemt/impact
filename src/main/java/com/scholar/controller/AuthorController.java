package com.scholar.controller;

import com.alibaba.fastjson.JSONArray;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.scholar.common.JsonUtil;
import com.scholar.common.Success;
import com.scholar.config.RedisClient;
import com.scholar.entity.CoreAuthor;
import com.scholar.infra.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * 榜单人员控制层
 */
@RestController
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @Autowired
    private RedisClient redisClinet;

    /**
     * 获取作者的文章列表
     *
     * @param orderby
     * @param page
     * @param size
     * @param aid
     * @return
     */
    @GetMapping(value = "/{aid}/papers")
    @ResponseBody
    public Success getAuthorImpactList(@PathVariable(value = "aid") Integer aid, String orderby, Integer page, Integer size) {


        //page 默认1
        if (page == null) {
            page = 1;
        }
        //size 每页的个数，null 显示全部
        if (size == null) {
            size = (int) authorService.getAuthorImpactCnt(aid);
        }

        Map<String, Object> map = new HashMap<>();
//        try {
//            if (redisClinet.get("getAuthorImpactList") == null) {
        //分页
        PageHelper.startPage(page, size);

        Page<Map<String, Object>> mapPage = authorService.getAuthorImpactList(aid);
        //        impactList.getPageNum();
        //        impactList.getTotal();
        //        impactList.getPages();
        map.put("page", page);//第几页
        map.put("total", mapPage.getPages());//一共有几页
        map.put("list", mapPage);

//                redisClinet.set("getAuthorImpactList", JSONArray.toJSONString(map));
//
//            } else {
//                map = JSONArray.parseObject(redisClinet.get("getAuthorImpactList"), Map.class);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        return Success.ok(map);
    }

    /**
     * 获取basic图
     *
     * @param aid
     * @return
     */
    @GetMapping(value = "/{aid}/graph/citation")
    @ResponseBody
    public Success getAuthorGraphCitation(@PathVariable(value = "aid") Integer aid) {

        List<Map<String, Object>> impactLindexDetails = new ArrayList<>();
        try {
            if (redisClinet.get("getAuthorGraphCitation") == null) {

                impactLindexDetails = authorService.getGraphImpactbyAid(aid);
                redisClinet.set("getAuthorGraphCitation", JSONArray.toJSONString(impactLindexDetails));
            } else {
                impactLindexDetails = JsonUtil.parseJsonArrayStrToListForMaps(redisClinet.get("getAuthorGraphCitation"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return Success.ok(impactLindexDetails);
    }

    /**
     * 获取社交引用数
     *
     * @param aid
     * @return
     */
    @GetMapping(value = "/{aid}/social")
    @ResponseBody
    public Success getAuthorSocial(@PathVariable(value = "aid") Integer aid) {
        List<Map<String, Object>> impactLindexDetails = null;
        try {
            if (redisClinet.get("getAuthorSocial") == null) {
                impactLindexDetails = authorService.getGraphImpactbyAid(aid);
                redisClinet.set("getAuthorSocial", JSONArray.toJSONString(impactLindexDetails));
            } else {
                impactLindexDetails = JsonUtil.parseJsonArrayStrToListForMaps(redisClinet.get("getAuthorSocial"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return Success.ok(impactLindexDetails);
    }

    /**
     * 获取个人信息
     *
     * @param aid
     * @return
     */
    @GetMapping(value = "/{aid}")
    @ResponseBody
    public Success getAuthorInfo(@PathVariable(value = "aid") String aid) {

        CoreAuthor coreAuthor = authorService.getAuthorInfo(aid);

        return Success.ok(coreAuthor);
    }


    /**
     * statistics最下面的表格
     *
     * @param aid
     * @param orderby
     * @param page
     * @param size
     * @return
     */
    @GetMapping(value = "/{aid}/jifs")
    @ResponseBody
    public Success getAuthorJifsList(@PathVariable(value = "aid") String aid, String orderby, Integer page, Integer size) {


        //page 默认1
        if (page == null) {
            page = 1;
        }
        //size 每页的个数，null 显示全部
        if (size == null) {
            size = (int) authorService.getAuthorJifsListCnt(aid);
        }

        Map<String, Object> map = new HashMap<>();
//        try {
//            if (redisClinet.get("getAuthorJifsList") == null) {
        //分页
        PageHelper.startPage(page, size);

        Page<Map<String, Object>> mapPage = authorService.getAuthorJifsList(aid);
        //        impactList.getPageNum();
        //        impactList.getTotal();
        //        impactList.getPages();
        map.put("page", page);//第几页
        map.put("total", mapPage.getPages());//一共有几页
        map.put("data", mapPage);

//                redisClinet.set("getAuthorJifsList", JSONArray.toJSONString(map));
//
//            } else {
//                map = JSONArray.parseObject(redisClinet.get("getAuthorJifsList"), Map.class);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        return Success.ok(map);
    }


    /**
     * 作者每年的文献published图
     *
     * @param aid
     * @return
     */
    @GetMapping(value = "/{aid}/graph/published/by/year")
    @ResponseBody
    public Success getAuthorGraphPublishedByYear(@PathVariable(value = "aid") String aid) {

        List<Map<String, Object>> impactLindexDetails = null;
        try {
            if (redisClinet.get("getAuthorGraphPublishedByYear") == null) {
                impactLindexDetails = authorService.getAuthorGraphPublishedByYear(aid);
                redisClinet.set("getAuthorGraphPublishedByYear", JSONArray.toJSONString(impactLindexDetails));
            } else {
                impactLindexDetails = JsonUtil.parseJsonArrayStrToListForMaps(redisClinet.get("getAuthorGraphPublishedByYear"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Success.ok(impactLindexDetails);
    }

    /**
     * 作者每年的文献h-index图
     *
     * @param aid
     * @return
     */
    @GetMapping(value = "/{aid}/graph/hindex/by/year")
    @ResponseBody
    public Success getAuthorGraphhindexByYear(@PathVariable(value = "aid") String aid) {

        Map<String, Object> impactLindexDetails = null;
        try {
            if (redisClinet.get("getAuthorGraphhindexByYear") == null) {
                impactLindexDetails = authorService.getAuthorGraphhindexByYear(aid);
                redisClinet.set("getAuthorGraphhindexByYear", JSONArray.toJSONString(impactLindexDetails));
            } else {
                impactLindexDetails = JsonUtil.parseJsonObjectStrToMap(redisClinet.get("getAuthorGraphhindexByYear"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return Success.ok(impactLindexDetails);
    }

    /**
     * 作者每年的文献proportions图
     *
     * @param aid
     * @return
     */
    @GetMapping(value = "/{aid}/graph/proportions")
    @ResponseBody
    public Success getAuthorGraphProportions(@PathVariable(value = "aid") String aid) {

        List<Map<String, Object>> impactLindexDetails = null;
        try {
            if (redisClinet.get("getAuthorGraphProportions") == null) {
                impactLindexDetails = authorService.getAuthorGraphProportions(aid);
                redisClinet.set("getAuthorGraphProportions", JSONArray.toJSONString(impactLindexDetails));
            } else {
                impactLindexDetails = JsonUtil.parseJsonArrayStrToListForMaps(redisClinet.get("getAuthorGraphProportions"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return Success.ok(impactLindexDetails);
    }


    /**
     * 作者每年的文献jif图
     *
     * @param aid
     * @return
     */
    @GetMapping(value = "/{aid}/graph/jif")
    @ResponseBody
    public Success getAuthorGraphJif(@PathVariable(value = "aid") String aid) {
        List<Map<String, Object>> impactLindexDetails = null;
        try {
            if (redisClinet.get("getAuthorGraphJif") == null) {
                impactLindexDetails = authorService.getAuthorGraphJif(aid);
                redisClinet.set("getAuthorGraphJif", JSONArray.toJSONString(impactLindexDetails));
            } else {
                impactLindexDetails = JsonUtil.parseJsonArrayStrToListForMaps(redisClinet.get("getAuthorGraphJif"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return Success.ok(impactLindexDetails);
    }

    /**
     * 被引用的组织impact中affilications图
     *
     * @param aid
     * @return
     */
    @GetMapping(value = "/{aid}/papers/cite/affilication")
    @ResponseBody
    public Success getAuthorPapersCiteAffil(@PathVariable(value = "aid") String aid, String orderby, Integer page, Integer size) {

        //page 默认1
        if (page == null) {
            page = 1;
        }
        //size 每页的个数，null 显示全部
        if (size == null) {
            size = 200;
        }

        Map<String, Object> map = new HashMap<>();
        PageHelper.startPage(page, size);

        Page<Map<String, Object>> mapPage = authorService.getAuthorPapersCiteAffil(aid);
        map.put("page", page);//第几页
        map.put("total", mapPage.getPages());//一共有几页
        map.put("list", mapPage);
        return Success.ok(map);
    }

    /**
     * 被引用的国家impact中country图
     *
     * @param aid
     * @return
     */
    @GetMapping(value = "/{aid}/papers/cite/country")
    @ResponseBody
    public Success getAuthorPapersCiteCountry(@PathVariable(value = "aid") String aid, String orderby, Integer page, Integer size) {

        //page 默认1
        if (page == null) {
            page = 1;
        }
        //size 每页的个数，null 显示全部
        if (size == null) {
            size = 100;
        }

        Map<String, Object> map = new HashMap<>();
        PageHelper.startPage(page, size);

        Page<Map<String, Object>> mapPage = authorService.getAuthorPapersCiteCountry(aid);
        map.put("page", page);//第几页
        map.put("total", mapPage.getPages());//一共有几页
        map.put("list", mapPage);

        return Success.ok(map);
    }

    /**
     * 被引用的期刊impact中journal图
     *
     * @param aid
     * @return
     */
    @GetMapping(value = "/{aid}/papers/cite/journal")
    @ResponseBody
    public Success getAuthorPapersCiteJournal(@PathVariable(value = "aid") String aid, String orderby, Integer page, Integer size) {


        //page 默认1
        if (page == null) {
            page = 1;
        }
        //size 每页的个数，null 显示全部
        if (size == null) {
            size = 100;
        }

        Map<String, Object> map = new HashMap<>();
        PageHelper.startPage(page, size);

        Page<Map<String, Object>> mapPage = authorService.getAuthorPapersCiteJournal(aid);
        map.put("page", page);//第几页
        map.put("total", mapPage.getPages());//一共有几页
        map.put("list", mapPage);

        return Success.ok(map);
    }

    /**
     * 被引用的国家impact中country图-前10和othoer
     *
     * @param aid
     * @return
     */
    @GetMapping(value = "/{aid}/graph/impact/countries")
    @ResponseBody
    public Success getAuthorGraphImpactCountry(@PathVariable(value = "aid") String aid) {

        List<Map<String, Object>> impactLindexDetails = null;
        try {
            if (redisClinet.get("getAuthorGraphImpactCountry") == null) {
                impactLindexDetails = authorService.getAuthorGraphImpactCountry(aid);
                redisClinet.set("getAuthorGraphImpactCountry", JSONArray.toJSONString(impactLindexDetails));
            } else {
                impactLindexDetails = JsonUtil.parseJsonArrayStrToListForMaps(redisClinet.get("getAuthorGraphImpactCountry"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Success.ok(impactLindexDetails);
    }

    /**
     * 被引用的组织impact中affilications图-前10和othoer
     *
     * @param aid
     * @return
     */
    @GetMapping(value = "/{aid}/graph/impact/affilications")
    @ResponseBody
    public Success getAuthorGraphImpactAffil(@PathVariable(value = "aid") String aid) {

        List<Map<String, Object>> impactLindexDetails = null;
        try {
            if (redisClinet.get("getAuthorGraphImpactAffil") == null) {
                impactLindexDetails = authorService.getAuthorGraphImpactAffil(aid);
                redisClinet.set("getAuthorGraphImpactAffil", JSONArray.toJSONString(impactLindexDetails));
            } else {
                impactLindexDetails = JsonUtil.parseJsonArrayStrToListForMaps(redisClinet.get("getAuthorGraphImpactAffil"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Success.ok(impactLindexDetails);
    }

    /**
     * 被引用的期刊impact中journal图-前10和othoer
     *
     * @param aid
     * @return
     */
    @GetMapping(value = "/{aid}/graph/impact/journals")
    @ResponseBody
    public Success getAuthorGraphImpactJournals(@PathVariable(value = "aid") String aid) {

        List<Map<String, Object>> impactLindexDetails = null;
        try {
            if (redisClinet.get("getAuthorGraphImpactJournals") == null) {
                impactLindexDetails = authorService.getAuthorGraphImpactJournals(aid);
                redisClinet.set("getAuthorGraphImpactJournals", JSONArray.toJSONString(impactLindexDetails));
            } else {
                impactLindexDetails = JsonUtil.parseJsonArrayStrToListForMaps(redisClinet.get("getAuthorGraphImpactJournals"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Success.ok(impactLindexDetails);
    }

    /**
     * publications中graph表
     *
     * @param aid
     * @return
     */
    @GetMapping(value = "/{aid}/graph/papers")
    @ResponseBody
    public Success getAuthorGraphPapers(@PathVariable(value = "aid") String aid) {

        List<Map<String, Object>> impactLindexDetails = null;
        try {
            if (redisClinet.get("getAuthorGraphPapers") == null) {
                impactLindexDetails = authorService.getAuthorGraphPapers(aid);
                redisClinet.set("getAuthorGraphPapers", JSONArray.toJSONString(impactLindexDetails));
            } else {
                impactLindexDetails = JsonUtil.parseJsonArrayStrToListForMaps(redisClinet.get("getAuthorGraphPapers"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Success.ok(impactLindexDetails);
    }
}
