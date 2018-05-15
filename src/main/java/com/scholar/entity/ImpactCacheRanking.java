package com.scholar.entity;

import com.alibaba.fastjson.JSONArray;

import java.util.Date;

public class ImpactCacheRanking {
    private Integer id;

    private Integer rid;

    private String name;

    private String instruction;

    private Date date;

    private String cols;

    private String top5;

    private String content;

    private Integer lid;

    private String description;

    private Object person;

    public Integer getLid() {
        return lid;
    }

    public void setLid(Integer lid) {
        this.lid = lid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Object getPerson() {
        return person;
    }

    public void setPerson(Object person) {
        this.person = person;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction == null ? null : instruction.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCols() {
        return cols;
    }

    public void setCols(String cols) {
        this.cols = cols == null ? null : cols.trim();
    }

    public String getTop5() {
        return top5;
    }

    public void setTop5(String top5) {
        this.top5 = top5 == null ? "" : top5.trim();
        setPerson(JSONArray.parse(top5));
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}