package com.example.tehonogii_web.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Date;
@Entity
@Table(name = "anunt")
public class Anunt {

    @Id
    @Column(name = "anuntId")
    private int anuntId;
    @Column(name = "userId")
    private int userId;
    @Column(name = "titlu")
    private String titlu;
    @Column(name = "continut")
    private String continut;
    @Column(name = "data")
    private Date data;
    @Column(name = "photoURL")
    private String photoURL;
    @Column(name = "locatie")
    private String locatie;
    @Column(name = "categorie")
    private String categorie;

    public Anunt(int anuntId, int userId, String titlu, String continut, Date data, String photoURL, String locatie, String categorie) {
        this.anuntId = anuntId;
        this.userId = userId;
        this.titlu = titlu;
        this.continut = continut;
        this.data = data;
        this.photoURL = photoURL;
        this.locatie = locatie;
        this.categorie = categorie;
    }

    public Anunt(){}

    public int getAnuntId() {
        return anuntId;
    }

    public void setAnuntId(int anuntId) {
        this.anuntId = anuntId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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

    public String getLocatie() {
        return locatie;
    }

    public void setLocatie(String locatie) {
        this.locatie = locatie;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }
}
