package com.RiZe.Modul1.Hooman;

public class Hooman {
    private String nama;
    private int umur;

    // constructor pertama
    public Hooman(){}

    // cunstructor kedua
    public Hooman(String nama){
        this.nama = nama;
    }

    // constructor ketiga
    public Hooman(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // getter and setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
}