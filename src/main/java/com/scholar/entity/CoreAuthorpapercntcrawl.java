package com.scholar.entity;

import java.util.Date;

public class CoreAuthorpapercntcrawl {
    private String id;

    private String autid;

    private Long papercnt;

    private String src;

    private Date updtime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getAutid() {
        return autid;
    }

    public void setAutid(String autid) {
        this.autid = autid == null ? null : autid.trim();
    }

    public Long getPapercnt() {
        return papercnt;
    }

    public void setPapercnt(Long papercnt) {
        this.papercnt = papercnt;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src == null ? null : src.trim();
    }

    public Date getUpdtime() {
        return updtime;
    }

    public void setUpdtime(Date updtime) {
        this.updtime = updtime;
    }
}