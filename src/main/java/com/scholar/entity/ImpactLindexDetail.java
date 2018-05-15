package com.scholar.entity;

public class ImpactLindexDetail {
    private Integer id;

    private Integer aid;

    private Integer lIndex;

    private String lSequence;

    private String citations;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Integer getlIndex() {
        return lIndex;
    }

    public void setlIndex(Integer lIndex) {
        this.lIndex = lIndex;
    }

    public String getlSequence() {
        return lSequence;
    }

    public void setlSequence(String lSequence) {
        this.lSequence = lSequence == null ? null : lSequence.trim();
    }

    public String getCitations() {
        return citations;
    }

    public void setCitations(String citations) {
        this.citations = citations == null ? null : citations.trim();
    }
}