package com.scholar.mapper;

import com.scholar.entity.CoreDomain;
import java.util.List;

public interface CoreDomainMapper {
    int deleteByPrimaryKey(String dmnid);

    int insert(CoreDomain record);

    CoreDomain selectByPrimaryKey(String dmnid);

    List<CoreDomain> selectAll();

    int updateByPrimaryKey(CoreDomain record);
}