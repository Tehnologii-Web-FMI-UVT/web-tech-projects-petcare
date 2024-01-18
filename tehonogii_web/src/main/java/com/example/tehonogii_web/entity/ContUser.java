package com.example.tehonogii_web.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "contuser")
public class ContUser {
    @Id
    @Column(name = "userId")
    private int userId;
    @Column(name = "nume")
    private String nume;
    @Column(name = "prenume")
    private String prenume;
    @Column(name = "email")
    private String email;
    @Column(name = "parola")
    private String parola;
    @Column(name = "photoURL")
    private String photoURL;
    @Column(name = "nrTel")
    private String nrTel;

    public ContUser(int userId, String nume, String prenume, String email, String parola, String photoURL, String nrTel) {
        this.userId = userId;
        this.nume = nume;
        this.prenume = prenume;
        this.email = email;
        this.parola = parola;
        this.photoURL = photoURL;
        this.nrTel = nrTel;
    }

    public ContUser() {
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public String getPhotoURL() {
        return photoURL;
    }

    public void setPhotoURL(String photoURL) {
        this.photoURL = photoURL;
    }

    public String getNrTel() {
        return nrTel;
    }

    public void setNrTel(String nrTel) {
        this.nrTel = nrTel;
    }
}
