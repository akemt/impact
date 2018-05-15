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
        Map<String, Object> map = authorService.getAuthorImpactList(aid, orderby, page, size);
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

        List<Map<String, Object>> impactLindexDetails = authorService.getGraphImpactbyAid(aid);
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
        List<Map<String, Object>> impactLindexDetails = authorService.getGraphImpactbyAid(aid);
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

        Map<String, Object> mapPage = authorService.getAuthorJifsList(aid, orderby, page, size);
        return Success.ok(mapPage);
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

        List<Map<String, Object>> impactLindexDetails = authorService.getAuthorGraphPublishedByYear(aid);
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

        Map<String, Object> impactLindexDetails = authorService.getAuthorGraphhindexByYear(aid);
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

        List<Map<String, Object>> impactLindexDetails = authorService.getAuthorGraphProportions(aid);
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
        List<Map<String, Object>> impactLindexDetails = authorService.getAuthorGraphJif(aid);
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
        Map<String, Object> map = authorService.getAuthorPapersCiteAffil(aid, orderby, page, size);
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

        Map<String, Object> map = authorService.getAuthorPapersCiteCountry(aid, orderby, page, size);
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

        Map<String, Object> map = authorService.getAuthorPapersCiteJournal(aid, orderby, page, size);
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

        List<Map<String, Object>> impactLindexDetails = authorService.getAuthorGraphImpactCountry(aid);
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

        List<Map<String, Object>> impactLindexDetails = authorService.getAuthorGraphImpactAffil(aid);
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

        List<Map<String, Object>> impactLindexDetails = authorService.getAuthorGraphImpactJournals(aid);
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

        List<Map<String, Object>> impactLindexDetails = authorService.getAuthorGraphPapers(aid);
        return Success.ok(impactLindexDetails);
    }
}
