package com.RiZe.Meet.Inheritance;

public class Buku {
        String judul, pengarang;
        long hargaBuku;

        public Buku(String judul, String pengarang, long hargaBuku) {
            this.judul = judul;
            this.pengarang = pengarang;
            this.hargaBuku = hargaBuku;
        }

        public void cetakBuku(){
            System.out.println("\nJudul : " + judul);
            System.out.println("\nPengarang : " + pengarang);
            System.out.println("\nHarga Buku : " + hargaBuku);
        }
    }
