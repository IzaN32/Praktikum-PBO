package com.RiZe.Modul1.Hooman;

public class HoomanDemo {
    public static void main(String[] args) {
        // Array of object
        Hooman arrayMahasiswa[] = new Hooman[3];

        // constructor tipe pertama
        Hooman hooman1 = new Hooman();
        hooman1.setNama("Jean");
        hooman1.setUmur(20);

        // constructor tipe kedua
        Hooman hooman2 = new Hooman("Fischl");

        // constructor tipe ketiga
        Hooman hooman3 = new Hooman("Barbara", 18);

        arrayMahasiswa[0] = hooman1;
        arrayMahasiswa[1] = hooman2;
        arrayMahasiswa[2] = hooman3;

        for (Hooman x : arrayMahasiswa) {
            System.out.println("Character");
            System.out.println("Nama\t: " + x.getNama());
            System.out.println("Umur\t: " + x.getUmur());
        }
    }
}
