package com.scholar.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.scholar.common.Result;
import com.scholar.common.Success;
import com.scholar.entity.ImpactCacheRanking;
import com.scholar.infra.ImpactListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 榜单控制层
 */
@RestController
@RequestMapping("")
public class ImpactListController {


    @Autowired
    private ImpactListService listService;

    /**
     * 查询榜单列表
     *
     * @return
     */
    @GetMapping(value = "/lists")
    @ResponseBody
    public Success getImpactList(String orderby, Integer page, Integer size) {


        //page 默认1
        if (page == null) {
            page = 1;
        }
        //size 每页的个数，null 显示全部
        if (size == null) {
            size = (int)listService.getImpactCacheRankingCnt();
            size =10;
        }

        //分页
        PageHelper.startPage(page, size);

        Page<ImpactCacheRanking> impactList = listService.getImpactList();
//        impactList.getPageNum();
//        impactList.getTotal();
//        impactList.getPages();
        Map<String, Object> map = new HashMap<>();
        map.put("page", page);//第几页
        map.put("total", impactList.getPages());//一共有几页
        map.put("list", impactList);

        return Success.ok(map);
    }

    /**
     * 查询榜单列表
     *
     * @return
     */
    @GetMapping(value = "/lists/{lid}/persons")
    @ResponseBody
    public Success getImpactPersonsList(@PathVariable(value = "lid")String lid, String orderby, Integer page, Integer size) {


        //page 默认1
        if (page == null) {
            page = 1;
        }
        //size 每页的个数，null 显示全部
        if (size == null) {
            size = (int)listService.getImpactCacheRankingCnt();
            size =10;
        }

        //分页
        PageHelper.startPage(page, size);

        Page<ImpactCacheRanking> impactList = listService.getImpactList();
        Map<String, Object> map = new HashMap<>();
        map.put("page", page);//第几页
        map.put("total", impactList.getPages());//一共有几页
        map.put("list", impactList);

        return Success.ok(map);
    }
}
