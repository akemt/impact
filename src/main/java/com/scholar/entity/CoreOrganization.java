package com.scholar.entity;

import java.util.Date;

public class CoreOrganization {
    private String orgid;

    private String cnyid;

    private String name;

    private String abbrname;

    private String city;

    private String abstracts;

    private String imgurl;

    private String alias;

    private String portalurl;

    private String drCountryname;

    private Date updtime;

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid == null ? null : orgid.trim();
    }

    public String getCnyid() {
        return cnyid;
    }

    public void setCnyid(String cnyid) {
        this.cnyid = cnyid == null ? null : cnyid.trim();
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getAbstracts() {
        return abstracts;
    }

    public void setAbstracts(String abstracts) {
        this.abstracts = abstracts == null ? null : abstracts.trim();
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl == null ? null : imgurl.trim();
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias == null ? null : alias.trim();
    }

    public String getPortalurl() {
        return portalurl;
    }

    public void setPortalurl(String portalurl) {
        this.portalurl = portalurl == null ? null : portalurl.trim();
    }

    public String getDrCountryname() {
        return drCountryname;
    }

    public void setDrCountryname(String drCountryname) {
        this.drCountryname = drCountryname == null ? null : drCountryname.trim();
    }

    public Date getUpdtime() {
        return updtime;
    }

    public void setUpdtime(Date updtime) {
        this.updtime = updtime;
    }
}