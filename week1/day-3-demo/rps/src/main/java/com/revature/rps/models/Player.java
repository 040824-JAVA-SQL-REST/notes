package com.revature.rps.models;

public class Player {
    private String name;
    private boolean isCPU;
    private int win;
    private int lose;
    private int draw;

    //Default Constructor
    public Player() {

    }

    //Constructor
    public Player(String name, boolean isCPU, int win, int lose, int draw) {
        this.name = name;
        this.isCPU = isCPU;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }

    //Getter and Setter methods

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCPU() {
        return isCPU;
    }

    public void setCPU(boolean isCPU) {
        this.isCPU = isCPU;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getLose() {
        return lose;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

}
