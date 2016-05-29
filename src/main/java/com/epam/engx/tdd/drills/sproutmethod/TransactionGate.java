package com.epam.engx.tdd.drills.sproutmethod;

import java.util.List;

/**
 * @author Nurmakanov
 */
public class TransactionGate {
    private TransactionBundle transactionBundle = new TransactionBundle();

    public void postEntries(List<Entry> entries) {
        for (Entry entry : entries) {
            entry.postDate();
        }
        transactionBundle.getListManager().add(entries);
    }
}
