package com.scholar.mapper;

import com.scholar.entity.ImpactLindexDetail;
import java.util.List;

public interface ImpactLindexDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ImpactLindexDetail record);

    ImpactLindexDetail selectByPrimaryKey(Integer id);

    List<ImpactLindexDetail> selectAll();

    List<ImpactLindexDetail> selectAllbyAid(Integer aid);

    int updateByPrimaryKey(ImpactLindexDetail record);
}