package com.sevenbits.roguelike.characters;

import com.sevenbits.roguelike.IObject;

public interface ICharacter extends IObject {
    void move(int y, int x);
    int getHealth();
    void setHealth(int health);
}
