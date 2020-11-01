package com.RiZe.Tugas.No3;

public class Kids {
    private int idKids;
    private String nameKids;
    private int ageKids;
    private String statKids;

    public Kids(int idKids, String nameKids, int ageKids, String statKids) {
        this.idKids = idKids;
        this.nameKids = nameKids;
        this.ageKids = ageKids;
        this.statKids = statKids;
    }
    // Getter
    public int getIdKids() {
        return idKids;
    }
    public String getNameKids() {
        return nameKids;
    }
    public int getAgeKids() {
        return ageKids;
    }
    public String getStatKids() {
        return statKids;
    }
}
