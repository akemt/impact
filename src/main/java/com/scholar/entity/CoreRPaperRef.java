package com.scholar.entity;

public class CoreRPaperRef {
    private String id;

    private String citingpapid;

    private String citedpapid;

    private Long rank;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCitingpapid() {
        return citingpapid;
    }

    public void setCitingpapid(String citingpapid) {
        this.citingpapid = citingpapid == null ? null : citingpapid.trim();
    }

    public String getCitedpapid() {
        return citedpapid;
    }

    public void setCitedpapid(String citedpapid) {
        this.citedpapid = citedpapid == null ? null : citedpapid.trim();
    }

    public Long getRank() {
        return rank;
    }

    public void setRank(Long rank) {
        this.rank = rank;
    }
}