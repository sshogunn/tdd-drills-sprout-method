package com.epam.engx.tdd.drills.sproutmethod;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Nurmakanov on 29.05.2016.
 */
public class BadTransactionGate {
    private TransactionBundle transactionBundle = new TransactionBundle();

    public void postEntries(List<Entry> entries) {
        List<Entry> entriesToAdd = new LinkedList<Entry>();
        for (Entry entry : entries) {
            if (!transactionBundle.getListManager().hasEntry(entry)) {
                entry.postDate();
                entriesToAdd.add(entry);
            }
        }
        transactionBundle.getListManager().add(entriesToAdd);
    }
}
