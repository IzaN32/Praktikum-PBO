package com.RiZe.Tugas.No2;


public class DemoBinatang {
    public static void main(String[] args) {


        Burung burung = new Burung();
        burung.Name = "Burung";
        burung.Eat = "Burung Makan Bij - Bijian";
        burung.Sleep = "Burung Tidur Pada Malam Hari";
        burung.Act = "Burung Terbang Menggunakan Sayap";


        System.out.println("Bird(ie)");
        burung.getNama();
        burung.binatang();
        burung.terbang();
        System.out.println();


        Ikan ikan = new Ikan();
        ikan.Name = "Ikan";
        ikan.Eat = "Ikan Makan Plankton dan Ikan Kecil";
        ikan.Sleep = "Ikan Tidur Sambil Berenang";
        ikan.Activ = "Ikan Berenang Memakai Sirip";
        System.out.println();


        System.out.println("Fis(c)h(l)");
        ikan.getNama();
        ikan.binatang();
        ikan.berenang();
        System.out.println();

        Kucing kucing = new Kucing();
        kucing.Name = "Kucing";
        kucing.Eat = "Kucing Makan Ikan";
        kucing.Sleep = "Kucing Tidur 16 Jam Sehari";
        kucing.Act = "Kucing Meong Di Atas Genteng";

        System.out.println("Meng");
        kucing.getNama();
        kucing.binatang();
        kucing.meong();
    }
}