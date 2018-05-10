package com.scholar.mapper;

import com.scholar.entity.CoreRAutOrg;
import java.util.List;

public interface CoreRAutOrgMapper {
    int deleteByPrimaryKey(String id);

    int insert(CoreRAutOrg record);

    CoreRAutOrg selectByPrimaryKey(String id);

    List<CoreRAutOrg> selectAll();

    int updateByPrimaryKey(CoreRAutOrg record);
}