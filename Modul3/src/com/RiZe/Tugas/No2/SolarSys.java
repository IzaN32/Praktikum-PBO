package com.RiZe.Tugas.No2;

import java.util.ArrayList;
import java.util.List;

public class SolarSys {
    private String id;
    private String Name;
    private List<Planet> planetList = new ArrayList<>();


    public SolarSys(String id, String Name) {
        this.id = id;
        this.Name = Name;
    }

    public void getTotalMember(int number) {
        System.out.println("Planet ke : " + number);
    }
    public List<Planet> getPlanetList() {
        return planetList;
    }
    public void setPlanetList(List<Planet> planetList) {
        this.planetList = planetList;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return Name;
    }

    public void getData() {
        System.out.println("ID Tata-Surya\t: " + getId());
        System.out.println("Nama Tata-Surya\t: " + getName());
        System.out.println("Jumlah Planet\t: " + getPlanetList().size());
        System.out.println();
        int i = 1;
        for (Planet planet : planetList) {
            //System.out.print("Planet ke : ");
            getTotalMember(i++);
            System.out.println("- ID Planet\t\t: " + planet.getPlanetId());
            System.out.println("- Urutan Planet\t: " + planet.getPlanetOrder());
            System.out.println("- Nama Planet\t: " + planet.getPlanetName());
            System.out.println();
        }
    }
}
