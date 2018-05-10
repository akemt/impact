package com.scholar.entity;

public class CoreSynonym {
    private String id;

    private String keyword;

    private String synkeyword;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    public String getSynkeyword() {
        return synkeyword;
    }

    public void setSynkeyword(String synkeyword) {
        this.synkeyword = synkeyword == null ? null : synkeyword.trim();
    }
}