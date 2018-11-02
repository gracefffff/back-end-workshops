package com.sevenbits.roguelike.items;

public interface ICoin extends IItem {
    void setCost(int cost);
    int getCost();
}
