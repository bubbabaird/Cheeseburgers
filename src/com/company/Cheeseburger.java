package com.company;

public class Cheeseburger {

    boolean mayo;
    int patties;
    int buns;
    int bacon;
    String instructions;

    public Cheeseburger() {
    }

    public Cheeseburger(boolean mayo, int patties, int buns, int bacon, String instructions) {
        this.mayo = mayo;
        this.patties = patties;
        this.buns = buns;
        this.bacon = bacon;
        this.instructions = instructions;
    }

    public boolean isMayo() {
        return mayo;
    }

    public void setMayo(boolean mayo) {
        this.mayo = mayo;
    }

    public int getPatties() {
        return patties;
    }

    public void setPatties(int patties) {
        this.patties = patties;
    }

    public int getBuns() {
        return buns;
    }

    public void setBuns(int buns) {
        this.buns = buns;
    }

    public int getBacon() {
        return bacon;
    }

    public void setBacon(int bacon) {
        this.bacon = bacon;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }
}
