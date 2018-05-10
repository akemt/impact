package com.scholar.mapper;

import com.scholar.entity.CorePaperfile;
import java.util.List;

public interface CorePaperfileMapper {
    int deleteByPrimaryKey(String id);

    int insert(CorePaperfile record);

    CorePaperfile selectByPrimaryKey(String id);

    List<CorePaperfile> selectAll();

    int updateByPrimaryKey(CorePaperfile record);
}