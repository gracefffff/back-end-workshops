package com.sevenbits.roguelike.items;

public class Coin implements ICoin {
    private int cost;
    private int positionX;
    private int positionY;
    public int  getCost(){
        return cost;
    }

    public void Coins(int cost, int positionX, int positionY) {
        this.cost = cost;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getX() {
        return positionX;
    }

    public int getY() {
        return positionY;
    }
}
