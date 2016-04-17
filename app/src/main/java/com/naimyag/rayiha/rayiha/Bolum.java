package com.naimyag.rayiha.rayiha;

/**
 * Created by Ali on 22.8.2015.
 */
public class Bolum {

    private int bolumno;

    private boolean gecildi;

    private boolean olusturuldu;

    public Bolum(int bolumno,boolean gecildi,boolean olusturuldu) {
        this.bolumno = bolumno; this.gecildi=gecildi; this.olusturuldu=olusturuldu;
    }

    public int getBolumno() {
        return bolumno;
    }

    public boolean getGecildi() { return gecildi;}

    public void setBolumno(int bolumno) {
        this.bolumno = bolumno;
    }

    public void setGecildi(boolean gecildi) {
        this.gecildi = gecildi;
    }

    public boolean isOlusturuldu() {
        return olusturuldu;
    }

    public void setOlusturuldu(boolean olusturuldu) {
        this.olusturuldu = olusturuldu;
    }
}
