package com.scholar.mapper;

import com.scholar.entity.CoreRPaperRef;
import java.util.List;

public interface CoreRPaperRefMapper {
    int deleteByPrimaryKey(String id);

    int insert(CoreRPaperRef record);

    CoreRPaperRef selectByPrimaryKey(String id);

    List<CoreRPaperRef> selectAll();

    int updateByPrimaryKey(CoreRPaperRef record);
}