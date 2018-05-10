package com.scholar.entity;

public class CoreDomain {
    private String dmnid;

    private String name;

    private String zhnname;

    public String getDmnid() {
        return dmnid;
    }

    public void setDmnid(String dmnid) {
        this.dmnid = dmnid == null ? null : dmnid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getZhnname() {
        return zhnname;
    }

    public void setZhnname(String zhnname) {
        this.zhnname = zhnname == null ? null : zhnname.trim();
    }
}