package com.scholar.entity;

import java.math.BigDecimal;
import java.util.Date;

public class CorePubif {
    private String id;

    private String pubid;

    private String drPubname;

    private Integer yearid;

    private BigDecimal ifactor;

    private Date updtime;

    private String src;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPubid() {
        return pubid;
    }

    public void setPubid(String pubid) {
        this.pubid = pubid == null ? null : pubid.trim();
    }

    public String getDrPubname() {
        return drPubname;
    }

    public void setDrPubname(String drPubname) {
        this.drPubname = drPubname == null ? null : drPubname.trim();
    }

    public Integer getYearid() {
        return yearid;
    }

    public void setYearid(Integer yearid) {
        this.yearid = yearid;
    }

    public BigDecimal getIfactor() {
        return ifactor;
    }

    public void setIfactor(BigDecimal ifactor) {
        this.ifactor = ifactor;
    }

    public Date getUpdtime() {
        return updtime;
    }

    public void setUpdtime(Date updtime) {
        this.updtime = updtime;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src == null ? null : src.trim();
    }
}