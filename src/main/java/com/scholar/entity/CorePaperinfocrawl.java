package com.scholar.entity;

public class CorePaperinfocrawl {
    private String id;

    private String papid;

    private Long citedcnt;

    private Short autcnt;

    private String autlist;

    private String src;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPapid() {
        return papid;
    }

    public void setPapid(String papid) {
        this.papid = papid == null ? null : papid.trim();
    }

    public Long getCitedcnt() {
        return citedcnt;
    }

    public void setCitedcnt(Long citedcnt) {
        this.citedcnt = citedcnt;
    }

    public Short getAutcnt() {
        return autcnt;
    }

    public void setAutcnt(Short autcnt) {
        this.autcnt = autcnt;
    }

    public String getAutlist() {
        return autlist;
    }

    public void setAutlist(String autlist) {
        this.autlist = autlist == null ? null : autlist.trim();
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src == null ? null : src.trim();
    }
}