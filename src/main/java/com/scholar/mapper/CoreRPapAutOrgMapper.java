package com.scholar.mapper;

import com.scholar.entity.CoreRPapAutOrg;
import java.util.List;

public interface CoreRPapAutOrgMapper {
    int deleteByPrimaryKey(String id);

    int insert(CoreRPapAutOrg record);

    CoreRPapAutOrg selectByPrimaryKey(String id);

    List<CoreRPapAutOrg> selectAll();

    int updateByPrimaryKey(CoreRPapAutOrg record);
}