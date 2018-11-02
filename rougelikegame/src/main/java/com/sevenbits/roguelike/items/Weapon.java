package com.sevenbits.roguelike.items;

public class Weapon implements IWeapon {
    private int damage;
    private int positionX;
    private int positionY;

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public int getX() {
        return positionX;
    }

    public int getY() {
        return positionY;
    }

    public Weapon(int positionX, int positionY, int damage) {

        this.positionX = positionX;
        this.positionY = positionY;
        this.damage = damage;
    }
}
