package com.RiZe.Tugas.No2;

public class Ikan extends Binatang{

    public String Name;
    public String Activ;

    public void getNama(){
        System.out.println("Nama Binatang\t: " + Name);
    }
    public void berenang(){
        System.out.println("Aktivitas\t: " + Activ);
    }
}