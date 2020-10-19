package com.RiZe.Modul1;

// class main / Demo class
public class Objek {
    public static void main(String[] args) {
        // Deklarasi object tanpa parameter
        Mahasiswa mahasiswaTanpa = new Mahasiswa();

        mahasiswaTanpa.setNama("Rifqi");
        mahasiswaTanpa.setNim(19104031);

        System.out.println("Mahasiswa 1");
        System.out.println("Nama\t: "+ mahasiswaTanpa.getNama());
        System.out.println("NIM\t\t: "+ mahasiswaTanpa.getNim());

        // Deklarasi object langsung dengan parameter
        Mahasiswa mahasiswa = new Mahasiswa("Paimon", 12345);

        System.out.println("Mahasiswa 2");
        System.out.println("Nama\t: "+ mahasiswa.getNama());
        System.out.println("NIM\t\t: "+mahasiswa.getNim());
    }
}
