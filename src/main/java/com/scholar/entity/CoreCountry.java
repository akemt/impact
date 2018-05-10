package com.scholar.entity;

public class CoreCountry {
    private String cnyid;

    private String rgnid;

    private String name;

    private String city;

    public String getCnyid() {
        return cnyid;
    }

    public void setCnyid(String cnyid) {
        this.cnyid = cnyid == null ? null : cnyid.trim();
    }

    public String getRgnid() {
        return rgnid;
    }

    public void setRgnid(String rgnid) {
        this.rgnid = rgnid == null ? null : rgnid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }
}