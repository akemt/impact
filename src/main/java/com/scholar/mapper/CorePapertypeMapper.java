package com.scholar.mapper;

import com.scholar.entity.CorePapertype;
import java.util.List;

public interface CorePapertypeMapper {
    int deleteByPrimaryKey(String ptpid);

    int insert(CorePapertype record);

    CorePapertype selectByPrimaryKey(String ptpid);

    List<CorePapertype> selectAll();

    int updateByPrimaryKey(CorePapertype record);
}