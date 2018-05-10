package com.scholar.mapper;

import com.scholar.entity.CoreRPubCat;
import java.util.List;

public interface CoreRPubCatMapper {
    int deleteByPrimaryKey(String id);

    int insert(CoreRPubCat record);

    CoreRPubCat selectByPrimaryKey(String id);

    List<CoreRPubCat> selectAll();

    int updateByPrimaryKey(CoreRPubCat record);
}