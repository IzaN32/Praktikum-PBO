package com.RiZe.Tugas.No3;

import java.util.ArrayList;
import java.util.List;

public class Kazoku {
    private final String nameKazoku;
    private final String City;

    private List<Kids> kidsList = new ArrayList<>();
    private Father father;
    private Mother mother;

    // Constructor
    public Kazoku(String nameKazoku, String City) {
        this.nameKazoku = nameKazoku;
        this.City = City;
    }

    // Getter
    public String getNameKazoku() {
        return nameKazoku;
    }
    public String getCity() {
        return City;
    }

    public void addAnggotaKeluarga(Father father, Mother mother, List<Kids> kids) {
        this.father = father;
        this.mother = mother;
        this.kidsList = kids;
    }

    public List<Kids> getAnakList() {
        return kidsList;
    }

    public Father getAyah() {
        return father;
    }

    public Mother getIbu() {
        return mother;
    }

    public void getDataKeluarga() {

        System.out.println("==========================================");
        System.out.println("== Nama Keluarga\t : " + getNameKazoku() + "\t\t\t==");
        System.out.println("== Kota Asal\t\t : " + getCity() + "\t\t\t==");
        System.out.println("==========================================");

        // Mengambil data Ayah
        System.out.println("-=| Ayah |=-");
        System.out.println("ID Ayah\t\t: " + getAyah().getIdFather());
        System.out.println("Nama Ayah\t: " + getAyah().getNameFather());
        System.out.println("Umur Ayah\t: " + getAyah().getAgeFather());
        System.out.println();

        // Mengambil data Ibu
        System.out.println("-=| Ibu |=-");
        System.out.println("ID Ibu\t\t: " + getIbu().getIdMother());
        System.out.println("Nama Ibu\t: " + getIbu().getNameMother());
        System.out.println("Umur Ibu\t: " + getIbu().getAgeMother());
        System.out.println();
        // Mengambil data Anak
        for (Kids kids : kidsList) {
            System.out.println("-=| Anak ke-" + kids.getIdKids() + " |=-");
            System.out.println("Nama Anak\t: " + kids.getNameKids());
            System.out.println("Umur Anak\t: " + kids.getAgeKids() + " Tahun");
            System.out.println("Status Anak\t: " + kids.getStatKids());
            System.out.println();
        }

    }
}
