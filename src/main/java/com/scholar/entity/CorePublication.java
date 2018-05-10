package com.scholar.entity;

public class CorePublication {
    private String pubid;

    private String cnyid;

    private String pbsid;

    private String name;

    private String abbrname;

    private Short annualcnt;

    private String isbn;

    public String getPubid() {
        return pubid;
    }

    public void setPubid(String pubid) {
        this.pubid = pubid == null ? null : pubid.trim();
    }

    public String getCnyid() {
        return cnyid;
    }

    public void setCnyid(String cnyid) {
        this.cnyid = cnyid == null ? null : cnyid.trim();
    }

    public String getPbsid() {
        return pbsid;
    }

    public void setPbsid(String pbsid) {
        this.pbsid = pbsid == null ? null : pbsid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAbbrname() {
        return abbrname;
    }

    public void setAbbrname(String abbrname) {
        this.abbrname = abbrname == null ? null : abbrname.trim();
    }

    public Short getAnnualcnt() {
        return annualcnt;
    }

    public void setAnnualcnt(Short annualcnt) {
        this.annualcnt = annualcnt;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn == null ? null : isbn.trim();
    }
}