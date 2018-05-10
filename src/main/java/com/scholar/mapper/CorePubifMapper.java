package com.scholar.mapper;

import com.scholar.entity.CorePubif;
import java.util.List;

public interface CorePubifMapper {
    int deleteByPrimaryKey(String id);

    int insert(CorePubif record);

    CorePubif selectByPrimaryKey(String id);

    List<CorePubif> selectAll();

    int updateByPrimaryKey(CorePubif record);
}