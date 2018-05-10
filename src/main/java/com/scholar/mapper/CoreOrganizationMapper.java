package com.scholar.mapper;

import com.scholar.entity.CoreOrganization;
import java.util.List;

public interface CoreOrganizationMapper {
    int deleteByPrimaryKey(String orgid);

    int insert(CoreOrganization record);

    CoreOrganization selectByPrimaryKey(String orgid);

    List<CoreOrganization> selectAll();

    int updateByPrimaryKey(CoreOrganization record);
}