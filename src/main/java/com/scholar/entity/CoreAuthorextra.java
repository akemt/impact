package com.scholar.entity;

import java.util.Date;

public class CoreAuthorextra {
    private String autid;

    private String surname;

    private String givenname;

    private String initials;

    private Date updtime;

    private String abbrname;

    private String alias;

    private Date tagcloudUpdtime;

    private String summary;

    private String tagcloud;

    public String getAutid() {
        return autid;
    }

    public void setAutid(String autid) {
        this.autid = autid == null ? null : autid.trim();
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname == null ? null : surname.trim();
    }

    public String getGivenname() {
        return givenname;
    }

    public void setGivenname(String givenname) {
        this.givenname = givenname == null ? null : givenname.trim();
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials == null ? null : initials.trim();
    }

    public Date getUpdtime() {
        return updtime;
    }

    public void setUpdtime(Date updtime) {
        this.updtime = updtime;
    }

    public String getAbbrname() {
        return abbrname;
    }

    public void setAbbrname(String abbrname) {
        this.abbrname = abbrname == null ? null : abbrname.trim();
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias == null ? null : alias.trim();
    }

    public Date getTagcloudUpdtime() {
        return tagcloudUpdtime;
    }

    public void setTagcloudUpdtime(Date tagcloudUpdtime) {
        this.tagcloudUpdtime = tagcloudUpdtime;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    public String getTagcloud() {
        return tagcloud;
    }

    public void setTagcloud(String tagcloud) {
        this.tagcloud = tagcloud == null ? null : tagcloud.trim();
    }
}