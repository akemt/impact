package com.scholar.infra.impl;

import com.github.pagehelper.Page;
import com.scholar.entity.ImpactCacheRanking;
import com.scholar.infra.ImpactListService;
import com.scholar.mapper.ImpactCacheRankingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ImpactListServiceImpl implements ImpactListService {



    @Autowired
    private ImpactCacheRankingMapper impactCacheRankingMapper;

    @Override
    public Page<ImpactCacheRanking> getImpactList() {
//        Page<ImpactCacheRanking> impactCacheRankingPage = impactCacheRankingMapper.selectAll();
//
//        List<ImpactCacheRanking> impactCacheRankingsResult = impactCacheRankingPage.getResult();
//        ImpactCacheRanking impactCacheRanking = new ImpactCacheRanking();
//        for(int i=0;i<impactCacheRankingsResult.size();i++){
//            impactCacheRanking = impactCacheRankingsResult.get(i);
//            impactCacheRanking.setPerson(JSONArray.fromObject(impactCacheRanking.getTop5()));
//        }
        return impactCacheRankingMapper.selectAll();
    }

    @Override
    public long getImpactCacheRankingCnt() {
        Page<ImpactCacheRanking> impactCacheRankings = impactCacheRankingMapper.selectAll();
        return impactCacheRankings.size();
    }
}
