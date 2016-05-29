package com.epam.engx.tdd.drills.sproutmethod;

import java.util.List;

/**
 * @author Nurmakanov
 */
public class TransactionGate {
    private TransactionBundle transactionBundle = new TransactionBundle();

    public void post(List<Item> items) {
        for (Item item : items) {
            item.postDate();
        }
        transactionBundle.getListManager().add(items);
    }
}
