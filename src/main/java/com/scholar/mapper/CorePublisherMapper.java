package com.scholar.mapper;

import com.scholar.entity.CorePublisher;
import java.util.List;

public interface CorePublisherMapper {
    int deleteByPrimaryKey(String pbsid);

    int insert(CorePublisher record);

    CorePublisher selectByPrimaryKey(String pbsid);

    List<CorePublisher> selectAll();

    int updateByPrimaryKey(CorePublisher record);
}