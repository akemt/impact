package com.scholar.mapper;

import com.github.pagehelper.Page;
import com.scholar.entity.CorePaper;

import java.util.List;
import java.util.Map;

public interface CorePaperMapper {
    int deleteByPrimaryKey(String papid);

    int insert(CorePaper record);

    CorePaper selectByPrimaryKey(String papid);

    List<CorePaper> selectAll();

    int updateByPrimaryKey(CorePaper record);

    Page<Map<String, Object>> getAuthorImpactList(Integer aid);

    Map<String, Object> getPaperInfo(String pid);

    Map<String, Object> getPaperScoialInfo(String pid);

    Page<Map<String, Object>> getPaperCiteslist(String pid);

    Map<String, Object> getPaperBibtexInfo(String pid);
}