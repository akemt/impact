package com.scholar.mapper;

import com.scholar.entity.ImpactList;
import java.util.List;

public interface ImpactListMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ImpactList record);

    ImpactList selectByPrimaryKey(Integer id);

    List<ImpactList> selectAll();

    int updateByPrimaryKey(ImpactList record);
}