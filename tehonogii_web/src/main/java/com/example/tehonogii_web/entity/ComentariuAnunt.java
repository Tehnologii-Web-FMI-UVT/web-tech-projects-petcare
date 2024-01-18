package com.example.tehonogii_web.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.sql.Date;
@Entity
@Table( name = "comentariuanunt")
public class ComentariuAnunt {
    @Id
    @Column(name = "commId")
    private int commId;
    @Column(name = "userId")
    private int userId;
    @Column(name = "anuntId")
    private int anuntId;
    @Column(name = "parentCommId")
    private int parentCommId;
    @Column(name = "titlu")
    private String titlu;
    @Column(name = "continut")
    private String continut;
    @Column(name = "data")
    private Date data;

    public ComentariuAnunt(int commId, int userId, int anuntId, int parentCommId, String titlu, String continut, Date data) {
        this.commId = commId;
        this.userId = userId;
        this.anuntId = anuntId;
        this.parentCommId = parentCommId;
        this.titlu = titlu;
        this.continut = continut;
        this.data = data;
    }
    public ComentariuAnunt(){}

    public int getCommId() {
        return commId;
    }

    public void setCommId(int commId) {
        this.commId = commId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getAnuntId() {
        return anuntId;
    }

    public void setAnuntId(int anuntId) {
        this.anuntId = anuntId;
    }

    public int getParentCommId() {
        return parentCommId;
    }

    public void setParentCommId(int parentCommId) {
        this.parentCommId = parentCommId;
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
}
