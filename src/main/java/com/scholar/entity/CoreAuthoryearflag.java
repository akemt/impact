package com.scholar.entity;

public class CoreAuthoryearflag {
    private String id;

    private String autid;

    private String drAutname;

    private Integer yearid;

    private Short flag;

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

    public String getDrAutname() {
        return drAutname;
    }

    public void setDrAutname(String drAutname) {
        this.drAutname = drAutname == null ? null : drAutname.trim();
    }

    public Integer getYearid() {
        return yearid;
    }

    public void setYearid(Integer yearid) {
        this.yearid = yearid;
    }

    public Short getFlag() {
        return flag;
    }

    public void setFlag(Short flag) {
        this.flag = flag;
    }
}