package com.scholar.entity;

public class CoreRPaperkeyword {
    private String id;

    private String papid;

    private String corKeyword;

    private String keyword;

    private Short rank;

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

    public String getCorKeyword() {
        return corKeyword;
    }

    public void setCorKeyword(String corKeyword) {
        this.corKeyword = corKeyword == null ? null : corKeyword.trim();
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    public Short getRank() {
        return rank;
    }

    public void setRank(Short rank) {
        this.rank = rank;
    }
}