package com.scholar.infra;

import com.github.pagehelper.Page;
import com.scholar.entity.CorePaper;

import java.util.Map;

public interface PaperService {

    Map<String, Object> getPaperInfo(String pid);

    Map<String, Object>  getPaperScoialInfo(String pid);

    Page<Map<String, Object>> getPaperCiteslist(String pid);

    Map<String, Object> getPaperBibtexInfo(String pid);
}
