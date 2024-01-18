package com.example.tehonogii_web.entity;

public class Eroare {
    private String error;
    public Eroare(){
        this.error="Unexpected error!";
    }
    public Eroare(String m){
        this.error=m;
    }

    @Override
    public String toString() {
        return "Eroare{" +
                "error='" + error + '\'' +
                '}';
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
