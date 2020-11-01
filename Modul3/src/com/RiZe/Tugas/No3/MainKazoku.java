package com.RiZe.Tugas.No3;

import java.util.ArrayList;
import java.util.List;

public class MainKazoku {
    public static void main(String[] args) {
        Kazoku kazoku = new Kazoku("Furuichi", "Kanagawa-ku, Yokohama");

        Father father = new Father(4006, "Furuichi Mohammad R Zein", 20);
        Mother mother = new Mother(4600, "Furuichi Angeline R", 20);
        Kids kids = new Kids(001, "Furuichi Kinako", 10, "Student at Kamihashi Elementary School");
        Kids kids2 = new Kids(002, "Furuichi Kanade", 6, "Student at Tsukikage Kindergarten");

        List<Kids> kidsList = new ArrayList<>();
        kidsList.add(kids);
        kidsList.add(kids2);
        kazoku.addAnggotaKeluarga(father, mother, kidsList);
        kazoku.getDataKeluarga();
    }
}
