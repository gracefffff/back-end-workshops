package com.sevenbits.roguelike.characters;

import com.sevenbits.roguelike.IObject;
import com.sevenbits.roguelike.containers.Chest;
import com.sevenbits.roguelike.containers.Inventory;
import com.sevenbits.roguelike.items.Armor;
import com.sevenbits.roguelike.items.IItem;

public class Player implements IPlayer {
    private int positionX;
    private int positionY;
    private int health;
    private Inventory inventory;

    public String showInventory() {
        return inventory.toString();
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Player() {
        positionX = 0;
        positionY = 0;
        health = 100;
        inventory = new Inventory();
    }

    public void move(int x, int y) {
        positionX = x;
        positionY = y;
    }

    public int getX() {
        return positionX;
    }

    public int getY() {
        return positionY;
    }

    public void takeItem(Chest chest) {
        inventory.setItem(chest.getItem());
    }

}
