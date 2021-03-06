package com.example.libdata;

import java.util.Date;

public class urnikSchema implements Comparable<urnikSchema>{
    String tip;
    Date zacetek;
    Date konec;
    predmetSchema predmet;
    izvajalecSchema izvajalec;
    prostorSchema prostor;

    public urnikSchema(String tip, Date zacetek, Date konec, predmetSchema predmet, izvajalecSchema izvajalec, prostorSchema prostor) {
        this.tip = tip;
        this.zacetek = zacetek;
        this.konec = konec;
        this.predmet = predmet;
        this.izvajalec = izvajalec;
        this.prostor = prostor;
    }


    @Override
    public int compareTo(urnikSchema comp){
        int res=getZacetek().compareTo(comp.getZacetek());
        if(res==0){
            res=getKonec().compareTo(comp.getKonec());
        }
        if(res>1){
            res=1;
        }else if(res<-1){
            res=-1;
        }
        return res;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public Date getZacetek() {
        return zacetek;
    }

    public void setZacetek(Date zacetek) {
        this.zacetek = zacetek;
    }

    public Date getKonec() {
        return konec;
    }

    public void setKonec(Date konec) {
        this.konec = konec;
    }

    public predmetSchema getPredmet() {
        return predmet;
    }

    public void setPredmet(predmetSchema predmet) {
        this.predmet = predmet;
    }

    public izvajalecSchema getIzvajalec() {
        return izvajalec;
    }

    public void setIzvajalec(izvajalecSchema izvajalec) {
        this.izvajalec = izvajalec;
    }

    public prostorSchema getProstor() {
        return prostor;
    }

    public void setProstor(prostorSchema prostor) {
        this.prostor = prostor;
    }
}
