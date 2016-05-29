package com.epam.engx.tdd.drills.sproutmethod;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Nurmakanov on 29.05.2016.
 */
public class AntiSproutMethodTransactionGate {
    private TransactionBundle transactionBundle = new TransactionBundle();

    public void post(List<Item> items) {
        List<Item> entriesToAdd = new LinkedList<Item>();
        for (Item item : items) {
            if (!transactionBundle.getListManager().hasItem(item)) {
                item.postDate();
                entriesToAdd.add(item);
            }
        }
        transactionBundle.getListManager().add(entriesToAdd);
    }
}
