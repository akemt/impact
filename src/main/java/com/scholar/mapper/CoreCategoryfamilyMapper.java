package com.scholar.mapper;

import com.scholar.entity.CoreCategoryfamily;
import java.util.List;

public interface CoreCategoryfamilyMapper {
    int deleteByPrimaryKey(String cgfid);

    int insert(CoreCategoryfamily record);

    CoreCategoryfamily selectByPrimaryKey(String cgfid);

    List<CoreCategoryfamily> selectAll();

    int updateByPrimaryKey(CoreCategoryfamily record);
}