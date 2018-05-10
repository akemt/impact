package com.scholar.mapper;

import com.scholar.entity.CorePaper;
import java.util.List;

public interface CorePaperMapper {
    int deleteByPrimaryKey(String papid);

    int insert(CorePaper record);

    CorePaper selectByPrimaryKey(String papid);

    List<CorePaper> selectAll();

    int updateByPrimaryKey(CorePaper record);
}