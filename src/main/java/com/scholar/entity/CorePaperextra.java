package com.scholar.entity;

import java.util.Date;

public class CorePaperextra {
    private String papid;

    private String issn;

    private String elsissn;

    private String isbn;

    private Date updtime;

    private String bibtex;

    public String getPapid() {
        return papid;
    }

    public void setPapid(String papid) {
        this.papid = papid == null ? null : papid.trim();
    }

    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn == null ? null : issn.trim();
    }

    public String getElsissn() {
        return elsissn;
    }

    public void setElsissn(String elsissn) {
        this.elsissn = elsissn == null ? null : elsissn.trim();
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn == null ? null : isbn.trim();
    }

    public Date getUpdtime() {
        return updtime;
    }

    public void setUpdtime(Date updtime) {
        this.updtime = updtime;
    }

    public String getBibtex() {
        return bibtex;
    }

    public void setBibtex(String bibtex) {
        this.bibtex = bibtex == null ? null : bibtex.trim();
    }
}