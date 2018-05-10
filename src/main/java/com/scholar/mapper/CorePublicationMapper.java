package com.scholar.mapper;

import com.scholar.entity.CorePublication;
import java.util.List;

public interface CorePublicationMapper {
    int deleteByPrimaryKey(String pubid);

    int insert(CorePublication record);

    CorePublication selectByPrimaryKey(String pubid);

    List<CorePublication> selectAll();

    int updateByPrimaryKey(CorePublication record);
}