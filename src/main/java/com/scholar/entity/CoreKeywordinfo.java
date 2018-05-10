package com.scholar.entity;

public class CoreKeywordinfo {
    private String keyword;

    private String zhnname;

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    public String getZhnname() {
        return zhnname;
    }

    public void setZhnname(String zhnname) {
        this.zhnname = zhnname == null ? null : zhnname.trim();
    }
}