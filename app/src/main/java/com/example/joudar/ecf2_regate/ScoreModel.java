package com.example.joudar.ecf2_regate;

/**
 * Created by joudar on 08/11/17.
 */

public class ScoreModel {

   // private int id_regate;
   // private int id_voilier;
    private int place;
    private int tps_compense;
    private int tps_reel;
    private Voilier voilier;
    private String nom_regate;
    private String nom_voilier;

    public ScoreModel(int id_regate, int id_voilier, int place, int tps_compense, int tps_reel, String nom_voilier) {
      //  this.id_regate = id_regate;
        //this.id_voilier = id_voilier;
        this.place = place;
        this.tps_compense = tps_compense;
        this.tps_reel = tps_reel;
        this.nom_voilier = nom_voilier;
    }

    public ScoreModel(int place, int tps_compense, int tps_reel, String nom_voilier) {
        this.place = place;
        this.tps_compense = tps_compense;
        this.tps_reel = tps_reel;
        this.nom_voilier = nom_voilier;
    }

    public ScoreModel(int place, int tps_compense, int tps_reel, RegateAfich regateAfich, String nom_voilier) {
        this.place = place;
        this.tps_compense = tps_compense;
        this.tps_reel = tps_reel;
        //this.regateAfich = regateAfich;
        this.nom_voilier = nom_voilier;
    }

    public ScoreModel(int place, int tps_compense, int tps_reel, String nom_regate, String nom_voilier) {
        this.place = place;
        this.tps_compense = tps_compense;
        this.tps_reel = tps_reel;
        this.nom_regate = nom_regate;
        this.nom_voilier = nom_voilier;
    }

    public ScoreModel(int id_regate, int id_voilier, int place, int tps_compense, int tps_reel, Voilier voilier, String nom_regate, String nom_voilier) {
       // this.id_regate = id_regate;
        //this.id_voilier = id_voilier;
        this.place = place;
        this.tps_compense = tps_compense;
        this.tps_reel = tps_reel;
        this.voilier = voilier;
        this.nom_regate = nom_regate;
        this.nom_voilier = nom_voilier;
    }

    public Voilier getVoilier() {
        return voilier;
    }

    public void setVoilier(Voilier voilier) {
        this.voilier = voilier;
    }

    @Override
    public String toString() {
        return "Score " +
                //"id_regate=" + id_regate +
                //", id_voilier=" + id_voilier +
                ", place=" + place +
                ", tps_compense=" + tps_compense +
                ", tps_reel=" + tps_reel +
                ", voilier=" + voilier +
                ", nom_voilier='" + nom_regate + '\''
                //", nom_regate='" + nom_voilier + '\''
                ;
    }
}


