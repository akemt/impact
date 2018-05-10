package com.scholar.mapper;

import com.scholar.entity.CorePaperinfocrawl;
import java.util.List;

public interface CorePaperinfocrawlMapper {
    int deleteByPrimaryKey(String id);

    int insert(CorePaperinfocrawl record);

    CorePaperinfocrawl selectByPrimaryKey(String id);

    List<CorePaperinfocrawl> selectAll();

    int updateByPrimaryKey(CorePaperinfocrawl record);
}