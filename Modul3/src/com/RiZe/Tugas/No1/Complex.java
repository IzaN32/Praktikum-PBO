package com.RiZe.Tugas.No1;

import java.util.ArrayList;
import java.util.List;

public class Complex {
    private String complexId;
    private String complexName;
    private int TotHouse;
    private List<House> idHouse = new ArrayList<>();

    // Constructor
    public Complex(String complexId, String complexName) {
        this.complexId = complexId;
        this.complexName = complexName;
    }

    public void addRumah(House house) {
        idHouse.add(house);
    }

    // Getter, Setter & Method
    public String getComplexId() {
        return complexId;
    }

    public void setComplexId(String complexId) {
        this.complexId = complexId;
    }

    public String getComplexName() {
        return complexName;
    }

    public void setComplexName(String complexName) {
        this.complexName = complexName;
    }

    public int getTotHouse() {
        return TotHouse;
    }

    public void setTotHouse(int totHouse) {
        this.TotHouse = totHouse;
    }

    public List<House> getIdHouse() {
        return idHouse;
    }
    public void setIdHouse(List<House> idHouse) {
        this.idHouse = idHouse;
    }

    public void getDataKomplek() {
        System.out.println("ID Komplek\t\t: " + getComplexId());
        System.out.println("Nama Komplek\t: " + getComplexName());
        System.out.println("Jumlah Rumah\t: " + getTotHouse());
        System.out.println();
        int i = 1;
        for (House house : idHouse) {
            System.out.println("Rumah ke " + i);
            System.out.println("- ID Rumah\t\t: " + house.getIdHouse());
            System.out.println("- Pemilik Rumah\t: " + house.getHouseOwner());
            System.out.println("- Jumlah Orang\t: " + house.getPipel());
            i++;
            System.out.println();
        }

    }

}
