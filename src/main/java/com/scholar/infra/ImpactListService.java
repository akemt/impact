package com.scholar.infra;

import com.github.pagehelper.Page;
import com.scholar.entity.ImpactCacheRanking;

import java.util.List;
import java.util.Map;

public interface ImpactListService {


    /**
     * 获取文献列表
     *
     * @return
     */
    Map<String, Object> getImpactList(String orderby, Integer page, Integer size);

    /**
     * 获取文献列表
     *
     * @return
     */
    Map<String, Object> getImpactPersonsList(String lid,String orderby, Integer page, Integer size);

    /**
     * 查询所有条数
     *
     * @return
     */
    long getImpactCacheRankingCnt();
}
