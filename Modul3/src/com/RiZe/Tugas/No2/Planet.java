package com.RiZe.Tugas.No2;

public class Planet {
    // Inisiasi Variabel
    private int PlanetId;
    private int PlanetOrder;
    private String PlanetName;

    // Constructor tanpa Parameter
    public Planet() {
    }

    // Constructor dengan Parameter
    public Planet(int PlanetId, int PlanetOrder, String PlanetName) {
        this.PlanetId = PlanetId;
        this.PlanetOrder = PlanetOrder;
        this.PlanetName = PlanetName;
    }

    // Getter & Setter
    public int getPlanetId() {
        return PlanetId;
    }

    public void setPlanetId(int planetId) {
        this.PlanetId = planetId;
    }

    public int getPlanetOrder() {
        return PlanetOrder;
    }

    public void setPlanetOrder(int planetOrder) {
        this.PlanetOrder = planetOrder;
    }

    public String getPlanetName() {
        return PlanetName;
    }

    public void setPlanetName(String planetName) {
        this.PlanetName = planetName;
    }
}
