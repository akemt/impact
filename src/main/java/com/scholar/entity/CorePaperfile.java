package com.scholar.entity;

import java.util.Date;

public class CorePaperfile {
    private String id;

    private String papid;

    private String paperurl;

    private String storeurl;

    private Date storetime;

    private String filecrc;

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

    public String getPaperurl() {
        return paperurl;
    }

    public void setPaperurl(String paperurl) {
        this.paperurl = paperurl == null ? null : paperurl.trim();
    }

    public String getStoreurl() {
        return storeurl;
    }

    public void setStoreurl(String storeurl) {
        this.storeurl = storeurl == null ? null : storeurl.trim();
    }

    public Date getStoretime() {
        return storetime;
    }

    public void setStoretime(Date storetime) {
        this.storetime = storetime;
    }

    public String getFilecrc() {
        return filecrc;
    }

    public void setFilecrc(String filecrc) {
        this.filecrc = filecrc == null ? null : filecrc.trim();
    }
}