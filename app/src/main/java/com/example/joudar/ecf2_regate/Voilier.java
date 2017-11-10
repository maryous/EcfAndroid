package com.example.joudar.ecf2_regate;

/**
 * Created by joudar on 09/11/17.
 */

public class Voilier {

    private int id_classe;
    private int id_proprietaire;
    private int id_voilier;
    private String nom_voilier;
    private int num_voile;

    public Voilier(String nom_voilier) {
        this.nom_voilier = nom_voilier;
    }

    public String getNom_voilier() {
        return nom_voilier;
    }

    public void setNom_voilier(String nom_voilier) {
        this.nom_voilier = nom_voilier;
    }

    @Override
    public String toString() {
        return "Voilier{" +
                "nom_voilier='" + nom_voilier + '\'' +
                '}';
    }
}
