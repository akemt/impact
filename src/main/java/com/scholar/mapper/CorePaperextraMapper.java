package com.scholar.mapper;

import com.scholar.entity.CorePaperextra;
import java.util.List;

public interface CorePaperextraMapper {
    int deleteByPrimaryKey(String papid);

    int insert(CorePaperextra record);

    CorePaperextra selectByPrimaryKey(String papid);

    List<CorePaperextra> selectAll();

    int updateByPrimaryKey(CorePaperextra record);
}