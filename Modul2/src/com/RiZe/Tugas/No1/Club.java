package com.RiZe.Tugas.No1;

public class Club {
    String Name;
    int Since;
    String Stadion;
    int ChampUcl;
    String Desc;


    public Club() {
    }
    public Club(String name) {
        this.Name = name;
    }

    public Club(String Name, String Desc) {
        this.Name = Name;
        this.Desc = Desc;
    }
    public Club(String Name, int Since, String stadion) {
        this.Name = Name;
        this.Since = Since;
        this.Stadion = stadion;
    }
    public Club(String Name, int Since, String stadion, int ChampUcl, String Desc) {
        this.Name = Name;
        this.Since = Since;
        this.Stadion = stadion;
        this.ChampUcl = ChampUcl;
        this.Desc = Desc;
    }
    public void getTeam(){
        System.out.println("Nama Club\t\t: " + Name);
        System.out.println("Tahun Berdiri\t: " + Since);
        System.out.println("Nama Stadion\t: " + Stadion);
        System.out.println("Juara UCL\t\t: " + ChampUcl);
        System.out.println("Deskripsi Club\t: " + Desc);
    }
}