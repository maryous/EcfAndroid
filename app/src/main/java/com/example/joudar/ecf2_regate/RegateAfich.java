package com.example.joudar.ecf2_regate;

import java.util.Date;

/**
 * Created by joudar on 08/11/17.
 */

public class RegateAfich {
    private int id_regate;
    private String nom_regate;
    private int num_regate;
    private Date date_regate;
    private int distance_regate;
    private int id_challenge;


    public RegateAfich(int id_regate, String nom_regate, int num_regate, Date date_regate,
                       int distance_regate, int id_challenge) {
        this.id_regate = id_regate;
        this.nom_regate = nom_regate;
        this.num_regate = num_regate;
        this.date_regate = date_regate;
        this.distance_regate = distance_regate;
        this.id_challenge = id_challenge;
    }

    public RegateAfich(String nom_regate, int num_regate, Date date_regate, int distance_regate) {
        this.nom_regate = nom_regate;
        this.num_regate = num_regate;
        this.date_regate = date_regate;
        this.distance_regate = distance_regate;
    }

    public int getId_regate() {
        return id_regate;
    }

    public void setId_regate(int id_regate) {
        this.id_regate = id_regate;
    }

    public String getNom_regate() {
        return nom_regate;
    }

    public void setNom_regate(String nom_regate) {
        this.nom_regate = nom_regate;
    }

    public int getNum_regate() {
        return num_regate;
    }

    public void setNum_regate(int num_regate) {
        this.num_regate = num_regate;
    }

    public Date getDate_regate() {
        return date_regate;
    }

    public void setDate_regate(Date date_regate) {
        this.date_regate = date_regate;
    }

    public int getDistance_regate() {
        return distance_regate;
    }

    public void setDistance_regate(int distance_regate) {
        this.distance_regate = distance_regate;
    }

    public int getId_challenge() {
        return id_challenge;
    }

    public void setId_challenge(int id_challenge) {
        this.id_challenge = id_challenge;
    }



    @Override
    public String toString() {
        return "Regate hiver ::"  + '\n'+
                "nom de la regate ==>"  + nom_regate + '\n' +
                ", num regate     ==>" + num_regate +"\n" +
                ", date de regate ==>" + date_regate + "\n" +
                ", distance regate==>" + distance_regate + "\n"
                ;
    }
}
