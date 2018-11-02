package com.sevenbits.roguelike.items;

public interface IArmor extends IItem {
    void setBonusHealthPoints(int bonusHealthPoints);
    int getBonusHealthPoints();
}
