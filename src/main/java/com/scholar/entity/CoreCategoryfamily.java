package com.scholar.entity;

public class CoreCategoryfamily {
    private String cgfid;

    private String name;

    public String getCgfid() {
        return cgfid;
    }

    public void setCgfid(String cgfid) {
        this.cgfid = cgfid == null ? null : cgfid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}