package com.sevenbits.roguelike.containers;

import com.sevenbits.roguelike.items.IItem;
import com.sevenbits.roguelike.items.Weapon;

public class Chest implements IChest{
  private  IItem item;
   public Chest(IItem item){
      this.item = item;
  }
    private int positionX;
    private int positionY;
    public int getX(){
        return positionX;
    }
    public int getY(){
        return positionY;
    }
    public IItem getItem(){
        return item;
    }

    public void setItem(IItem item) {
        this.item = item;
    }
}
