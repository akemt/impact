package com.scholar.mapper;

import com.scholar.entity.CoreAuthorextra;
import java.util.List;

public interface CoreAuthorextraMapper {
    int deleteByPrimaryKey(String autid);

    int insert(CoreAuthorextra record);

    CoreAuthorextra selectByPrimaryKey(String autid);

    List<CoreAuthorextra> selectAll();

    int updateByPrimaryKey(CoreAuthorextra record);
}