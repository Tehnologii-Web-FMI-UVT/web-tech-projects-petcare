package com.example.tehonogii_web.entity;

import java.sql.Date;
import jakarta.persistence.Column;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "forum")
public class Forum {
    @Id
    @Column(name = "forumId")
    private int forumId;
    @Column(name = "userId")
    private int userId;
    @Column(name = "titlu")
    private String titlu;
    @Column(name = "continut")
    private String continut;
    @Column(name = "data")
    private Date data;

    public Forum(int forumId, int userId, String titlu, String continut, Date data) {
        this.forumId = forumId;
        this.userId = userId;
        this.titlu = titlu;
        this.continut = continut;
        this.data = data;
    }

    public Forum(){}
    public int getForumId() {
        return forumId;
    }

    public void setForumId(int forumId) {
        this.forumId = forumId;
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

    @Override
    public String toString() {
        return "Forum{" +
                "forumId=" + forumId +
                ", userId=" + userId +
                ", titlu='" + titlu + '\'' +
                ", continut='" + continut + '\'' +
                ", data=" + data +
                '}';
    }
}
