package com.scholar.entity;

public class CoreRPubCat {
    private String id;

    private String pcgid;

    private String pubid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPcgid() {
        return pcgid;
    }

    public void setPcgid(String pcgid) {
        this.pcgid = pcgid == null ? null : pcgid.trim();
    }

    public String getPubid() {
        return pubid;
    }

    public void setPubid(String pubid) {
        this.pubid = pubid == null ? null : pubid.trim();
    }
}