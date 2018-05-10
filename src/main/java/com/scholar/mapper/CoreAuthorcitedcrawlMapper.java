package com.scholar.mapper;

import com.scholar.entity.CoreAuthorcitedcrawl;
import java.util.List;

public interface CoreAuthorcitedcrawlMapper {
    int deleteByPrimaryKey(String id);

    int insert(CoreAuthorcitedcrawl record);

    CoreAuthorcitedcrawl selectByPrimaryKey(String id);

    List<CoreAuthorcitedcrawl> selectAll();

    int updateByPrimaryKey(CoreAuthorcitedcrawl record);
}