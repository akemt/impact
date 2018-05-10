package com.scholar.mapper;

import com.scholar.entity.CorePaperaltmetriccrawl;
import java.util.List;

public interface CorePaperaltmetriccrawlMapper {
    int deleteByPrimaryKey(String id);

    int insert(CorePaperaltmetriccrawl record);

    CorePaperaltmetriccrawl selectByPrimaryKey(String id);

    List<CorePaperaltmetriccrawl> selectAll();

    int updateByPrimaryKey(CorePaperaltmetriccrawl record);
}