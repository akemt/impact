package com.scholar.entity;

import java.math.BigDecimal;
import java.util.Date;

public class CorePaperaltmetriccrawl {
    private String id;

    private String papid;

    private Long mendeleyReaders;

    private Long scopusCitiaions;

    private Long citeulikeBookmarks;

    private Long altmeticComCitedByPostsCount;

    private Long altmeticComCitedByAccountsCount;

    private Long altmeticComCitedByTweetersCount;

    private Long altmeticComCitedByGplusCount;

    private Long altmeticComCitedByFeedsCount;

    private Long altmeticComCitedByFbwalsCount;

    private Long altmeticComCitedByReadersCount;

    private Long altmeticComReadersCount;

    private Long altmeticComBlogPosts;

    private Long altmeticComFacebookPosts;

    private Long altmeticComGplusPosts;

    private Long plosalmPdfViews;

    private Long plosalmHtmlViews;

    private Long wikipediaMentions;

    private BigDecimal journalImpact;

    private Date updtime;

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

    public Long getMendeleyReaders() {
        return mendeleyReaders;
    }

    public void setMendeleyReaders(Long mendeleyReaders) {
        this.mendeleyReaders = mendeleyReaders;
    }

    public Long getScopusCitiaions() {
        return scopusCitiaions;
    }

    public void setScopusCitiaions(Long scopusCitiaions) {
        this.scopusCitiaions = scopusCitiaions;
    }

    public Long getCiteulikeBookmarks() {
        return citeulikeBookmarks;
    }

    public void setCiteulikeBookmarks(Long citeulikeBookmarks) {
        this.citeulikeBookmarks = citeulikeBookmarks;
    }

    public Long getAltmeticComCitedByPostsCount() {
        return altmeticComCitedByPostsCount;
    }

    public void setAltmeticComCitedByPostsCount(Long altmeticComCitedByPostsCount) {
        this.altmeticComCitedByPostsCount = altmeticComCitedByPostsCount;
    }

    public Long getAltmeticComCitedByAccountsCount() {
        return altmeticComCitedByAccountsCount;
    }

    public void setAltmeticComCitedByAccountsCount(Long altmeticComCitedByAccountsCount) {
        this.altmeticComCitedByAccountsCount = altmeticComCitedByAccountsCount;
    }

    public Long getAltmeticComCitedByTweetersCount() {
        return altmeticComCitedByTweetersCount;
    }

    public void setAltmeticComCitedByTweetersCount(Long altmeticComCitedByTweetersCount) {
        this.altmeticComCitedByTweetersCount = altmeticComCitedByTweetersCount;
    }

    public Long getAltmeticComCitedByGplusCount() {
        return altmeticComCitedByGplusCount;
    }

    public void setAltmeticComCitedByGplusCount(Long altmeticComCitedByGplusCount) {
        this.altmeticComCitedByGplusCount = altmeticComCitedByGplusCount;
    }

    public Long getAltmeticComCitedByFeedsCount() {
        return altmeticComCitedByFeedsCount;
    }

    public void setAltmeticComCitedByFeedsCount(Long altmeticComCitedByFeedsCount) {
        this.altmeticComCitedByFeedsCount = altmeticComCitedByFeedsCount;
    }

    public Long getAltmeticComCitedByFbwalsCount() {
        return altmeticComCitedByFbwalsCount;
    }

    public void setAltmeticComCitedByFbwalsCount(Long altmeticComCitedByFbwalsCount) {
        this.altmeticComCitedByFbwalsCount = altmeticComCitedByFbwalsCount;
    }

    public Long getAltmeticComCitedByReadersCount() {
        return altmeticComCitedByReadersCount;
    }

    public void setAltmeticComCitedByReadersCount(Long altmeticComCitedByReadersCount) {
        this.altmeticComCitedByReadersCount = altmeticComCitedByReadersCount;
    }

    public Long getAltmeticComReadersCount() {
        return altmeticComReadersCount;
    }

    public void setAltmeticComReadersCount(Long altmeticComReadersCount) {
        this.altmeticComReadersCount = altmeticComReadersCount;
    }

    public Long getAltmeticComBlogPosts() {
        return altmeticComBlogPosts;
    }

    public void setAltmeticComBlogPosts(Long altmeticComBlogPosts) {
        this.altmeticComBlogPosts = altmeticComBlogPosts;
    }

    public Long getAltmeticComFacebookPosts() {
        return altmeticComFacebookPosts;
    }

    public void setAltmeticComFacebookPosts(Long altmeticComFacebookPosts) {
        this.altmeticComFacebookPosts = altmeticComFacebookPosts;
    }

    public Long getAltmeticComGplusPosts() {
        return altmeticComGplusPosts;
    }

    public void setAltmeticComGplusPosts(Long altmeticComGplusPosts) {
        this.altmeticComGplusPosts = altmeticComGplusPosts;
    }

    public Long getPlosalmPdfViews() {
        return plosalmPdfViews;
    }

    public void setPlosalmPdfViews(Long plosalmPdfViews) {
        this.plosalmPdfViews = plosalmPdfViews;
    }

    public Long getPlosalmHtmlViews() {
        return plosalmHtmlViews;
    }

    public void setPlosalmHtmlViews(Long plosalmHtmlViews) {
        this.plosalmHtmlViews = plosalmHtmlViews;
    }

    public Long getWikipediaMentions() {
        return wikipediaMentions;
    }

    public void setWikipediaMentions(Long wikipediaMentions) {
        this.wikipediaMentions = wikipediaMentions;
    }

    public BigDecimal getJournalImpact() {
        return journalImpact;
    }

    public void setJournalImpact(BigDecimal journalImpact) {
        this.journalImpact = journalImpact;
    }

    public Date getUpdtime() {
        return updtime;
    }

    public void setUpdtime(Date updtime) {
        this.updtime = updtime;
    }
}