package com.RiZe.Meet.Abstrak;

import java.util.Random;

public class DemoAbstrack {
    public static void main(String[] args) {
        //Array Object
        Binatang[] peliharaan = {
                new Burung("Beo"),
                new Kucing("Persia"),
                new Anjim("Buldog"),
                new Kambing("Gembel")
        };
        Binatang kesayangan;

        Random pilihan = new Random();

        kesayangan = peliharaan[pilihan.nextInt(peliharaan.length)];

        System.out.println("Binatang kesayangan anda\t: " + kesayangan);
        System.out.print("Suaranya\t: ");
        kesayangan.suara();
    }
}
