package com.scholar.mapper;

import com.scholar.entity.CoreCountry;
import java.util.List;

public interface CoreCountryMapper {
    int deleteByPrimaryKey(String cnyid);

    int insert(CoreCountry record);

    CoreCountry selectByPrimaryKey(String cnyid);

    List<CoreCountry> selectAll();

    int updateByPrimaryKey(CoreCountry record);
}