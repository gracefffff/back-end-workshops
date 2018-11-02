package com.sevenbits.roguelike.items;

public class Armor implements IArmor {
    private int bonusHealthPoints;
    private int positionX;
    private int positionY;

    public void setBonusHealthPoints(int bonusHealthPoints) {
        this.bonusHealthPoints = bonusHealthPoints;
    }

    public int getBonusHealthPoints() {
        return bonusHealthPoints;
    }

    public int getX() {
        return positionX;
    }

    public int getY() {
        return positionY;
    }

    public Armor() {
    }
}
