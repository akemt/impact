package com.scholar.mapper;

import com.scholar.entity.CoreAuthor;
import java.util.List;

public interface CoreAuthorMapper {
    int deleteByPrimaryKey(String autid);

    int insert(CoreAuthor record);

    CoreAuthor selectByPrimaryKey(String autid);

    List<CoreAuthor> selectAll();

    int updateByPrimaryKey(CoreAuthor record);
}