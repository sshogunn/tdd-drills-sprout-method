package com.epam.engx.tdd.drills.sproutmethod;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Nurmakanov
 */
class ItemsHolder {
    private List<Item> items = new ArrayList<Item>();

    void add(List<Item> newItems) {
        this.items.addAll(newItems);
    }

    boolean hasItem(Item item) {
        return this.items.contains(item);
    }
}
