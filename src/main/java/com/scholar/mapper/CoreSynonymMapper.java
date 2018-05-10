package com.scholar.mapper;

import com.scholar.entity.CoreSynonym;
import java.util.List;

public interface CoreSynonymMapper {
    int deleteByPrimaryKey(String id);

    int insert(CoreSynonym record);

    CoreSynonym selectByPrimaryKey(String id);

    List<CoreSynonym> selectAll();

    int updateByPrimaryKey(CoreSynonym record);
}