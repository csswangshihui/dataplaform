package com.css.platform.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name = "jcxa_ayxx")
public class AyxxVO {
    @Id
    private String ayuuid;
    private String nsrsbh;
    private String nsrmc;

    public String getNsrsbh() {
        return nsrsbh;
    }

    public void setNsrsbh(String nsrsbh) {
        this.nsrsbh = nsrsbh;
    }

    public String getNsrmc() {
        return nsrmc;
    }

    public void setNsrmc(String nsrmc) {
        this.nsrmc = nsrmc;
    }

    public String getAyuuid() {
        return ayuuid;
    }

    public void setAyuuid(String ayuuid) {
        this.ayuuid = ayuuid;
    }
}
