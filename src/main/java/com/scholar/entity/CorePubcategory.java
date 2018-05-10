package com.scholar.entity;

public class CorePubcategory {
    private String pcgid;

    private String cgfid;

    private String name;

    public String getPcgid() {
        return pcgid;
    }

    public void setPcgid(String pcgid) {
        this.pcgid = pcgid == null ? null : pcgid.trim();
    }

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