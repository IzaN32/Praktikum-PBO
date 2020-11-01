package com.RiZe.Tugas.No1;

public class House {
    private String idHouse;
    private String houseOwner;
    private int Pipel;

    // Constructor
    public House(String idHouse, String houseOwner, int Pipel) {
        this.idHouse = idHouse;
        this.houseOwner = houseOwner;
        this.Pipel = Pipel;
    }

    // Getter
    public String getIdHouse() {
        return idHouse;
    }
    public String getHouseOwner() {
        return houseOwner;
    }

    public int getPipel() {
        return Pipel;
    }
}
