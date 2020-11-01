package com.RiZe.Tugas.No2;

import java.util.ArrayList;
import java.util.List;

public class MainSolarSystem {
    public static void main(String[] args) {
        // Objek solar_system
        SolarSys solarSystem = new SolarSys("6969", "Magic Bima (lol)");

        // memberi nilai baru ke planet
        Planet planet1 = new Planet(10, 1, "Mercury");
        Planet planet2 = new Planet(20, 2, "Venus");
        Planet planet3 = new Planet(30, 3, "Earth");
        Planet planet4 = new Planet(40, 4, "Mars");
        Planet planet5 = new Planet(50, 5, "Jupiter");
        Planet planet6 = new Planet(60, 6, "Saturn");
        Planet planet7 = new Planet();

        // Mengisi data dengan set
        planet7.setPlanetId(70);
        planet7.setPlanetOrder(7);
        planet7.setPlanetName("Ur anus");

        // List Mahasiswa dari Class Main
        List<Planet> planetList = new ArrayList<>();
        // menambahkan ke array planetlist dengan method add
        planetList.add(planet1);
        planetList.add(planet2);
        planetList.add(planet3);
        planetList.add(planet4);
        planetList.add(planet5);
        planetList.add(planet6);
        planetList.add(planet7);


        planetList.add(new Planet(80, 8, "Neptune"));
        solarSystem.setPlanetList(planetList);
        solarSystem.getData();

    }

}
