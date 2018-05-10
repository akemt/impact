package com.scholar.mapper;

import com.scholar.entity.CoreRDmnOrg;
import java.util.List;

public interface CoreRDmnOrgMapper {
    int deleteByPrimaryKey(String id);

    int insert(CoreRDmnOrg record);

    CoreRDmnOrg selectByPrimaryKey(String id);

    List<CoreRDmnOrg> selectAll();

    int updateByPrimaryKey(CoreRDmnOrg record);
}