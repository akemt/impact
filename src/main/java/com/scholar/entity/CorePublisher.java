package com.scholar.entity;

public class CorePublisher {
    private String pbsid;

    private String name;

    private String address;

    public String getPbsid() {
        return pbsid;
    }

    public void setPbsid(String pbsid) {
        this.pbsid = pbsid == null ? null : pbsid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }
}