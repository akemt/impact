package com.scholar.entity;

public class CoreRDmnKeyword {
    private String id;

    private String dmnid;

    private String keyword;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getDmnid() {
        return dmnid;
    }

    public void setDmnid(String dmnid) {
        this.dmnid = dmnid == null ? null : dmnid.trim();
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }
}