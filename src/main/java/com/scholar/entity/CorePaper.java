package com.scholar.entity;

import java.util.Date;

public class CorePaper {
    private String papid;

    private String pubid;

    private String ptpid;

    private String title;

    private String abstracts;

    private Integer yearid;

    private String keywords;

    private String doi;

    private String volume;

    private String issue;

    private String page;

    private String elspapid;

    private String md5code;

    private String gid;

    private String src;

    private Long proof;

    private Long weight;

    private Date instime;

    private Date updtime;

    private String drPublisher;

    private String drVenue;

    private String drVenuetype;

    private Long drCitedcnt;

    private Date citedcntUpdtime;

    private Integer drAutcnt;

    private String drAutlist;

    public String getPapid() {
        return papid;
    }

    public void setPapid(String papid) {
        this.papid = papid == null ? null : papid.trim();
    }

    public String getPubid() {
        return pubid;
    }

    public void setPubid(String pubid) {
        this.pubid = pubid == null ? null : pubid.trim();
    }

    public String getPtpid() {
        return ptpid;
    }

    public void setPtpid(String ptpid) {
        this.ptpid = ptpid == null ? null : ptpid.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getAbstracts() {
        return abstracts;
    }

    public void setAbstracts(String abstracts) {
        this.abstracts = abstracts == null ? null : abstracts.trim();
    }

    public Integer getYearid() {
        return yearid;
    }

    public void setYearid(Integer yearid) {
        this.yearid = yearid;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }

    public String getDoi() {
        return doi;
    }

    public void setDoi(String doi) {
        this.doi = doi == null ? null : doi.trim();
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume == null ? null : volume.trim();
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue == null ? null : issue.trim();
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page == null ? null : page.trim();
    }

    public String getElspapid() {
        return elspapid;
    }

    public void setElspapid(String elspapid) {
        this.elspapid = elspapid == null ? null : elspapid.trim();
    }

    public String getMd5code() {
        return md5code;
    }

    public void setMd5code(String md5code) {
        this.md5code = md5code == null ? null : md5code.trim();
    }

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid == null ? null : gid.trim();
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src == null ? null : src.trim();
    }

    public Long getProof() {
        return proof;
    }

    public void setProof(Long proof) {
        this.proof = proof;
    }

    public Long getWeight() {
        return weight;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
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

    public String getDrPublisher() {
        return drPublisher;
    }

    public void setDrPublisher(String drPublisher) {
        this.drPublisher = drPublisher == null ? null : drPublisher.trim();
    }

    public String getDrVenue() {
        return drVenue;
    }

    public void setDrVenue(String drVenue) {
        this.drVenue = drVenue == null ? null : drVenue.trim();
    }

    public String getDrVenuetype() {
        return drVenuetype;
    }

    public void setDrVenuetype(String drVenuetype) {
        this.drVenuetype = drVenuetype == null ? null : drVenuetype.trim();
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

    public Integer getDrAutcnt() {
        return drAutcnt;
    }

    public void setDrAutcnt(Integer drAutcnt) {
        this.drAutcnt = drAutcnt;
    }

    public String getDrAutlist() {
        return drAutlist;
    }

    public void setDrAutlist(String drAutlist) {
        this.drAutlist = drAutlist == null ? null : drAutlist.trim();
    }
}