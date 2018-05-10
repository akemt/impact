package com.scholar.mapper;

import com.scholar.entity.CoreKeywordinfo;
import java.util.List;

public interface CoreKeywordinfoMapper {
    int deleteByPrimaryKey(String keyword);

    int insert(CoreKeywordinfo record);

    CoreKeywordinfo selectByPrimaryKey(String keyword);

    List<CoreKeywordinfo> selectAll();

    int updateByPrimaryKey(CoreKeywordinfo record);
}