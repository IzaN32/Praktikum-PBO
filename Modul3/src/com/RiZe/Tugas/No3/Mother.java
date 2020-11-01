package com.RiZe.Tugas.No3;

public class Mother {
    private int idMother;
    private String nameMother;
    private int ageMother;

    // Constructor
    public Mother(int idMother, String nameMother, int ageMother) {
        this.idMother = idMother;
        this.nameMother = nameMother;
        this.ageMother = ageMother;
    }

    // Getter
    public int getIdMother() {
        return idMother;
    }

    public String getNameMother() {
        return nameMother;
    }

    public int getAgeMother() {
        return ageMother;
    }
}
