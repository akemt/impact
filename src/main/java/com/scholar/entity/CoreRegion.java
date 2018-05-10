package com.scholar.entity;

public class CoreRegion {
    private String rgnid;

    private String name;

    public String getRgnid() {
        return rgnid;
    }

    public void setRgnid(String rgnid) {
        this.rgnid = rgnid == null ? null : rgnid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}