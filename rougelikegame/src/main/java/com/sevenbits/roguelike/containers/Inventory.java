package com.sevenbits.roguelike.containers;

import com.sevenbits.roguelike.items.Armor;
import com.sevenbits.roguelike.items.IItem;

public class Inventory implements IInventory {
 private  IItem item;
 public Inventory(){
     this.item = new Armor();
 }
    public void setItem(IItem item){
         this.item = item;
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "item=" + item +
                '}';
    }
}
