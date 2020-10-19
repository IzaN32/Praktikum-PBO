package com.RiZe.Tugas.No1;

public class DemoClub {
    public static void main(String[] args) {

        Club club1 = new Club();
        Club club2 = new Club("Chelsea");
        Club club3 = new Club("Chelsea", " Chelsea Football Club are an English professional football club based in Fulham, London. Founded in 1905, the club competes in the Premier League, the top division of English football.");
        Club club4 = new Club("Chelsea", 1905, "Stamford Bridge");
        Club club5 = new Club("Chelsea", 1905, "Stamford Bridge", 16, "Chelsea Football Club are an English professional football club based in Fulham, London. Founded in 1905, the club competes in the Premier League, the top division of English football.");

        club1.getTeam();
        System.out.println();
        club2.getTeam();
        System.out.println();
        club3.getTeam();
        System.out.println();
        club4.getTeam();
        System.out.println();
        club5.getTeam();
    }
}