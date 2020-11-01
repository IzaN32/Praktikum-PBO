package com.RiZe.Tugas.No3;

public class Father {
    private int idFather;
    private String nameFather;
    private int ageFather;

    // Constructor
    public Father(int idFather, String nameFather, int ageFather) {
        this.idFather = idFather;
        this.nameFather = nameFather;
        this.ageFather = ageFather;
    }

    // Getter
    public int getIdFather() {
        return idFather;
    }
    public String getNameFather() {
        return nameFather;
    }
    public int getAgeFather() {
        return ageFather;
    }
}
