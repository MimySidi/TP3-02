package com.example.recipes;

public class Recipe {
    private String nom;
    private String des;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public Recipe(String nom, String des) {
        this.nom = nom;
        this.des = des;
    }
}
