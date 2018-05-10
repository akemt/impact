package com.scholar.mapper;

import com.scholar.entity.CoreRegion;
import java.util.List;

public interface CoreRegionMapper {
    int deleteByPrimaryKey(String rgnid);

    int insert(CoreRegion record);

    CoreRegion selectByPrimaryKey(String rgnid);

    List<CoreRegion> selectAll();

    int updateByPrimaryKey(CoreRegion record);
}