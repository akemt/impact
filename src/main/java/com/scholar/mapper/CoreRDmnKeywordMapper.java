package com.scholar.mapper;

import com.scholar.entity.CoreRDmnKeyword;
import java.util.List;

public interface CoreRDmnKeywordMapper {
    int deleteByPrimaryKey(String id);

    int insert(CoreRDmnKeyword record);

    CoreRDmnKeyword selectByPrimaryKey(String id);

    List<CoreRDmnKeyword> selectAll();

    int updateByPrimaryKey(CoreRDmnKeyword record);
}