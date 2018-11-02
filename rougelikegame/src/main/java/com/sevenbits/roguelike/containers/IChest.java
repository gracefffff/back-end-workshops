package com.sevenbits.roguelike.containers;

import com.sevenbits.roguelike.items.IItem;

public interface IChest extends IContainer {
    IItem getItem();
}
