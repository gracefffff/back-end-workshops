package com.sevenbits.roguelike.items;

public interface IWeapon extends IItem {
    void setDamage(int damage);
    int getDamage();
}
