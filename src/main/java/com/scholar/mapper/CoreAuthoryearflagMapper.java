package com.scholar.mapper;

import com.scholar.entity.CoreAuthoryearflag;
import java.util.List;

public interface CoreAuthoryearflagMapper {
    int deleteByPrimaryKey(String id);

    int insert(CoreAuthoryearflag record);

    CoreAuthoryearflag selectByPrimaryKey(String id);

    List<CoreAuthoryearflag> selectAll();

    int updateByPrimaryKey(CoreAuthoryearflag record);
}