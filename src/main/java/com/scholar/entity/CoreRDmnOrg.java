package com.scholar.entity;

public class CoreRDmnOrg {
    private String id;

    private String orgid;

    private String dmnid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid == null ? null : orgid.trim();
    }

    public String getDmnid() {
        return dmnid;
    }

    public void setDmnid(String dmnid) {
        this.dmnid = dmnid == null ? null : dmnid.trim();
    }
}