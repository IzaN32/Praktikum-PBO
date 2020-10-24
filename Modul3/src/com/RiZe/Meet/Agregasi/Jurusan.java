package com.RiZe.Meet.Agregasi;

import com.RiZe.Meet.Asosiasi.Mahasiswa;

import java.util.ArrayList;
import java.util.List;

public class Jurusan {
    private String kodejurusan;
    private String namaJurusan;
    private List<Mahasiswa> mahasiswaList = new ArrayList<>();

    public String getKodejurusan() {
        return kodejurusan;
    }
    public Jurusan(String kodejurusan, String namaJurusan) {
        this.kodejurusan = kodejurusan;
        this.namaJurusan = namaJurusan;
    }

    public void setKodejurusan(String kodejurusan) {
        this.kodejurusan = kodejurusan;
    }

    public String getNamaJurusan() {
        return namaJurusan;
    }

    public void setNamaJurusan(String namaJurusan) {
        this.namaJurusan = namaJurusan;
    }

    public List<Mahasiswa> getMahasiswaList() {
        return mahasiswaList;
    }

    public void setMahasiswaList(List<Mahasiswa> mahasiswaList) {
        this.mahasiswaList = mahasiswaList;
    }

    public void addMahasiswa(Mahasiswa mahasiswa){
        mahasiswaList.add(mahasiswa);
    }

    public void printDataJurusan(){
        System.out.println("Nama Jurusan\t: "+getNamaJurusan());
        System.out.println("Kode Jurusan\t: "+getKodejurusan());
        System.out.println("List Mahasiswa\t: ");
        for (Mahasiswa mahasiswa : mahasiswaList){
            System.out.println("- Nama\t: "+mahasiswa.getNama() +
                    "\t - NIM\t: " + mahasiswa.getNim());
        }
    }


}
