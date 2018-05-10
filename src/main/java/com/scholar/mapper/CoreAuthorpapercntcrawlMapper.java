package com.scholar.mapper;

import com.scholar.entity.CoreAuthorpapercntcrawl;
import java.util.List;

public interface CoreAuthorpapercntcrawlMapper {
    int deleteByPrimaryKey(String id);

    int insert(CoreAuthorpapercntcrawl record);

    CoreAuthorpapercntcrawl selectByPrimaryKey(String id);

    List<CoreAuthorpapercntcrawl> selectAll();

    int updateByPrimaryKey(CoreAuthorpapercntcrawl record);
}