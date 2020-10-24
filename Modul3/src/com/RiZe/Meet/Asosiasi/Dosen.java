package com.RiZe.Meet.Asosiasi;

public class Dosen {
    private String kodeDosen;
    private int nimMhs[] =  new int[100];
    private int jmlMahasiswa;

    public Dosen() {
    }

    public String getKodeDosen() {
        return kodeDosen;
    }

    public void setKodeDosen(String kodeDosen) {
        this.kodeDosen = kodeDosen;
    }

    public int getJmlMahasiswa() {
        return jmlMahasiswa;
    }

    public int getNimMhs(int indeks){
        return (nimMhs[indeks]);
    }

    public void setNimMHS(int nim){
        nimMhs[jmlMahasiswa] = nim;
        jmlMahasiswa++;
    }
}