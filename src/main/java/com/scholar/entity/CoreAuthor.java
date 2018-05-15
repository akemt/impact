package com.scholar.entity;

import java.util.Date;

public class CoreAuthor {
    private String autid;

    private String name;

    private String imgurl;

    private String drCurorgname;

    private String drCurorgid;

    private String address;

    private String email;

    private String portalurl;

    private String paperlisturl;

    private Date instime;

    private Date updtime;

    private String elsautid;

    private String elsorgid;

    private Short flag;

    private String pic;

    private Long drCitedcnt;

    private Date citedcntUpdtime;

    private Long drPapercnt;

    private Date papercntUpdtime;

    private Long drFirstautcnt;

    private Date firstautcntUpdtime;

    private Long drCorrpautcnt;

    private Date corrpautcntUpdtime;

    private String company;

    private String country;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAutid() {
        return autid;
    }

    public void setAutid(String autid) {
        this.autid = autid == null ? null : autid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl == null ? null : imgurl.trim();
    }

    public String getDrCurorgname() {
        return drCurorgname;
    }

    public void setDrCurorgname(String drCurorgname) {
        this.drCurorgname = drCurorgname == null ? null : drCurorgname.trim();
    }

    public String getDrCurorgid() {
        return drCurorgid;
    }

    public void setDrCurorgid(String drCurorgid) {
        this.drCurorgid = drCurorgid == null ? null : drCurorgid.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPortalurl() {
        return portalurl;
    }

    public void setPortalurl(String portalurl) {
        this.portalurl = portalurl == null ? null : portalurl.trim();
    }

    public String getPaperlisturl() {
        return paperlisturl;
    }

    public void setPaperlisturl(String paperlisturl) {
        this.paperlisturl = paperlisturl == null ? null : paperlisturl.trim();
    }

    public Date getInstime() {
        return instime;
    }

    public void setInstime(Date instime) {
        this.instime = instime;
    }

    public Date getUpdtime() {
        return updtime;
    }

    public void setUpdtime(Date updtime) {
        this.updtime = updtime;
    }

    public String getElsautid() {
        return elsautid;
    }

    public void setElsautid(String elsautid) {
        this.elsautid = elsautid == null ? null : elsautid.trim();
    }

    public String getElsorgid() {
        return elsorgid;
    }

    public void setElsorgid(String elsorgid) {
        this.elsorgid = elsorgid == null ? null : elsorgid.trim();
    }

    public Short getFlag() {
        return flag;
    }

    public void setFlag(Short flag) {
        this.flag = flag;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public Long getDrCitedcnt() {
        return drCitedcnt;
    }

    public void setDrCitedcnt(Long drCitedcnt) {
        this.drCitedcnt = drCitedcnt;
    }

    public Date getCitedcntUpdtime() {
        return citedcntUpdtime;
    }

    public void setCitedcntUpdtime(Date citedcntUpdtime) {
        this.citedcntUpdtime = citedcntUpdtime;
    }

    public Long getDrPapercnt() {
        return drPapercnt;
    }

    public void setDrPapercnt(Long drPapercnt) {
        this.drPapercnt = drPapercnt;
    }

    public Date getPapercntUpdtime() {
        return papercntUpdtime;
    }

    public void setPapercntUpdtime(Date papercntUpdtime) {
        this.papercntUpdtime = papercntUpdtime;
    }

    public Long getDrFirstautcnt() {
        return drFirstautcnt;
    }

    public void setDrFirstautcnt(Long drFirstautcnt) {
        this.drFirstautcnt = drFirstautcnt;
    }

    public Date getFirstautcntUpdtime() {
        return firstautcntUpdtime;
    }

    public void setFirstautcntUpdtime(Date firstautcntUpdtime) {
        this.firstautcntUpdtime = firstautcntUpdtime;
    }

    public Long getDrCorrpautcnt() {
        return drCorrpautcnt;
    }

    public void setDrCorrpautcnt(Long drCorrpautcnt) {
        this.drCorrpautcnt = drCorrpautcnt;
    }

    public Date getCorrpautcntUpdtime() {
        return corrpautcntUpdtime;
    }

    public void setCorrpautcntUpdtime(Date corrpautcntUpdtime) {
        this.corrpautcntUpdtime = corrpautcntUpdtime;
    }
}