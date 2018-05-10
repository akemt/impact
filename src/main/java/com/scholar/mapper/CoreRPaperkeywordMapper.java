package com.scholar.mapper;

import com.scholar.entity.CoreRPaperkeyword;
import java.util.List;

public interface CoreRPaperkeywordMapper {
    int deleteByPrimaryKey(String id);

    int insert(CoreRPaperkeyword record);

    CoreRPaperkeyword selectByPrimaryKey(String id);

    List<CoreRPaperkeyword> selectAll();

    int updateByPrimaryKey(CoreRPaperkeyword record);
}