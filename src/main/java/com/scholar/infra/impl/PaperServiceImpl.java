package com.scholar.infra.impl;

import com.github.pagehelper.Page;
import com.scholar.entity.CorePaper;
import com.scholar.infra.PaperService;
import com.scholar.mapper.CorePaperMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class PaperServiceImpl implements PaperService {

    @Autowired
    private CorePaperMapper corePaperMapper;

    @Override
    public Map<String, Object> getPaperInfo(String pid) {
        return corePaperMapper.getPaperInfo(pid);
    }

    @Override
    public Map<String, Object> getPaperScoialInfo(String pid) {
        return corePaperMapper.getPaperScoialInfo(pid);
    }

    @Override
    public Page<Map<String, Object>> getPaperCiteslist(String pid) {
        return corePaperMapper.getPaperCiteslist(pid);
    }

    @Override
    public Map<String, Object> getPaperBibtexInfo(String pid) {
        return corePaperMapper.getPaperBibtexInfo(pid);
    }
}
