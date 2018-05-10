package com.scholar.entity;

import java.util.Date;

public class CoreRPapAutOrg {
    private String id;

    private String papid;

    private String autid;

    private Short autrank;

    private String orgid;

    private Short orgrank;

    private String drPaptitle;

    private String drAutname;

    private String drOrgname;

    private Date instime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPapid() {
        return papid;
    }

    public void setPapid(String papid) {
        this.papid = papid == null ? null : papid.trim();
    }

    public String getAutid() {
        return autid;
    }

    public void setAutid(String autid) {
        this.autid = autid == null ? null : autid.trim();
    }

    public Short getAutrank() {
        return autrank;
    }

    public void setAutrank(Short autrank) {
        this.autrank = autrank;
    }

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid == null ? null : orgid.trim();
    }

    public Short getOrgrank() {
        return orgrank;
    }

    public void setOrgrank(Short orgrank) {
        this.orgrank = orgrank;
    }

    public String getDrPaptitle() {
        return drPaptitle;
    }

    public void setDrPaptitle(String drPaptitle) {
        this.drPaptitle = drPaptitle == null ? null : drPaptitle.trim();
    }

    public String getDrAutname() {
        return drAutname;
    }

    public void setDrAutname(String drAutname) {
        this.drAutname = drAutname == null ? null : drAutname.trim();
    }

    public String getDrOrgname() {
        return drOrgname;
    }

    public void setDrOrgname(String drOrgname) {
        this.drOrgname = drOrgname == null ? null : drOrgname.trim();
    }

    public Date getInstime() {
        return instime;
    }

    public void setInstime(Date instime) {
        this.instime = instime;
    }
}