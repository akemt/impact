package com.scholar.entity;

public class CorePapertype {
    private String ptpid;

    private String name;

    public String getPtpid() {
        return ptpid;
    }

    public void setPtpid(String ptpid) {
        this.ptpid = ptpid == null ? null : ptpid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}