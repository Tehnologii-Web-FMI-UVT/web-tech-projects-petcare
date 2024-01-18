package com.example.tehonogii_web.entity;

import jakarta.persistence.Column;

import java.sql.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "eveniment")
public class Eveniment {
    @Id
    @Column(name = "evenimentId")
    private int evenimentId;
    @Column(name = "adminId")
    private int adminId;
    @Column(name = "titlu")
    private String titlu;
    @Column(name = "continut")
    private String continut;
    @Column(name = "data")
    private Date data;
    @Column(name = "photoURL")
    private String photoURL;

    public Eveniment(int evenimentId, int adminId, String titlu, String continut, Date data, String photoURL) {
        this.evenimentId = evenimentId;
        this.adminId = adminId;
        this.titlu = titlu;
        this.continut = continut;
        this.data = data;
        this.photoURL = photoURL;
    }
    public Eveniment(){}
    public int getEvenimentId() {
        return evenimentId;
    }

    public void setEvenimentId(int evenimentId) {
        this.evenimentId = evenimentId;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public String getContinut() {
        return continut;
    }

    public void setContinut(String continut) {
        this.continut = continut;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getPhotoURL() {
        return photoURL;
    }

    public void setPhotoURL(String photoURL) {
        this.photoURL = photoURL;
    }
}
