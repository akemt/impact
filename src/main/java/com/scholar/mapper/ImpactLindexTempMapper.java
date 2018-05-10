package com.scholar.mapper;

import com.scholar.entity.ImpactLindexTemp;
import java.util.List;

public interface ImpactLindexTempMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ImpactLindexTemp record);

    ImpactLindexTemp selectByPrimaryKey(Integer id);

    List<ImpactLindexTemp> selectAll();

    int updateByPrimaryKey(ImpactLindexTemp record);
}