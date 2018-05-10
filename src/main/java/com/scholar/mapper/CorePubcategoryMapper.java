package com.scholar.mapper;

import com.scholar.entity.CorePubcategory;
import java.util.List;

public interface CorePubcategoryMapper {
    int deleteByPrimaryKey(String pcgid);

    int insert(CorePubcategory record);

    CorePubcategory selectByPrimaryKey(String pcgid);

    List<CorePubcategory> selectAll();

    int updateByPrimaryKey(CorePubcategory record);
}