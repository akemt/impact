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
        Map<String, Object> map = listService.getImpactList(orderby,page,size);
        return Success.ok(map);
    }

    /**
     * 获取作者列表
     *
     * @return
     */
    @GetMapping(value = "/list/{lid}/persons")
    @ResponseBody
    public Success getImpactPersonsList(@PathVariable(value = "lid")String lid, String orderby, Integer page, Integer size) {
        Map<String, Object> map = listService.getImpactPersonsList(lid,orderby,page,size);
        return Success.ok(map);
    }
}
