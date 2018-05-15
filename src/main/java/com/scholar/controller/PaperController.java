package com.scholar.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.scholar.common.Success;
import com.scholar.entity.CoreAuthor;
import com.scholar.entity.CorePaper;
import com.scholar.infra.PaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * 文章控制层
 */
@RestController
@RequestMapping(value = "/paper")
public class PaperController {

    @Autowired
    private PaperService paperService;


    /**
     * 获取文章paper详情信息
     *
     * @param pid
     * @return
     */
    @GetMapping(value = "/{pid}")
    @ResponseBody
    public Success getPaperInfo(@PathVariable(value = "pid") String pid) {

        Map<String, Object> corePaper = paperService.getPaperInfo(pid);

        return Success.ok(corePaper);
    }


    /**
     * 获取paper详情的社交统计数
     *
     * @param pid
     * @return
     */
    @GetMapping(value = "/{pid}/social")
    @ResponseBody
    public Success getPaperScoialInfo(@PathVariable(value = "pid") String pid) {

        Map<String, Object> corePaper = paperService.getPaperScoialInfo(pid);

        return Success.ok(corePaper);
    }

    /**
     * paper详情被引用的列表(?orderby?page?size)
     * @param pid
     * @param orderby
     * @param page
     * @param size
     * @return
     */
    @GetMapping(value = "/{pid}/cites")
    @ResponseBody
    public Success getPaperCiteslist(@PathVariable(value = "pid") String pid, String orderby, Integer page, Integer size) {


        //page 默认1
        if (page == null) {
            page = 1;
        }
        //size 每页的个数，null 显示全部
        if (size == null) {
            size = (int) paperService.getPaperCiteslist(pid).size();
        }

        Map<String, Object> map = new HashMap<>();
//        try {
//            if (redisClinet.get("getAuthorJifsList") == null) {
        //分页
        PageHelper.startPage(page, size);

        Page<Map<String, Object>> mapPage = paperService.getPaperCiteslist(pid);
        //        impactList.getPageNum();
        //        impactList.getTotal();
        //        impactList.getPages();
                map.put("page", page);//第几页
                map.put("total", mapPage.getPages());//一共有几页
                map.put("list", mapPage);

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
     * 获取paper的bibtex
     *
     * @param pid
     * @return
     */
    @GetMapping(value = "/{pid}/bibtex")
    @ResponseBody
    public Success getPaperBibtexInfo(@PathVariable(value = "pid") String pid) {

        Map<String, Object> corePaper = paperService.getPaperBibtexInfo(pid);

        return Success.ok(corePaper);
    }
}
