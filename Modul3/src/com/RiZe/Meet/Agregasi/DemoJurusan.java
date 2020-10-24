package com.RiZe.Meet.Agregasi;

import com.RiZe.Meet.Asosiasi.Mahasiswa;

import java.util.ArrayList;
import java.util.List;

public class DemoJurusan {
    public static void main(String[] args) {
        Jurusan jurusan = new Jurusan("2110", "Software EngIneering");

        Mahasiswa mahasiswa1 = new Mahasiswa(21190298, "Fischl");
        Mahasiswa mahasiswa2 = new Mahasiswa(21092112, "Beidou");
        Mahasiswa mahasiswa3 = new Mahasiswa(21948243, "Rita");

        //List Mahasiswa dari Class Demo
        List<Mahasiswa> mahasiswaList = new ArrayList<>();
        mahasiswaList.add(mahasiswa1);
        mahasiswaList.add(mahasiswa2);
        mahasiswaList.add(new Mahasiswa(2187450, "Klee"));

        //copy data dari list mahasiswa class "demoJurusan" ke class "jurusan"
        jurusan.setMahasiswaList(mahasiswaList);

        //memasukan data mahasiswa
        jurusan.addMahasiswa(mahasiswa3);

        jurusan.printDataJurusan();
    }
}
