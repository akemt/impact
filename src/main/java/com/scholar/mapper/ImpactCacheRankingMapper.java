package com.scholar.mapper;

import com.github.pagehelper.Page;
import com.scholar.entity.ImpactCacheRanking;
import java.util.List;

public interface ImpactCacheRankingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ImpactCacheRanking record);

    ImpactCacheRanking selectByPrimaryKey(Integer id);

//    List<ImpactCacheRanking> selectAll();

    Page<ImpactCacheRanking> selectAll();

    int updateByPrimaryKey(ImpactCacheRanking record);
}