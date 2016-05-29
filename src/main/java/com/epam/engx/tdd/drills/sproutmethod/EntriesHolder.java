package com.epam.engx.tdd.drills.sproutmethod;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Nurmakanov
 */
class EntriesHolder {
    private List<Entry> entries = new ArrayList<Entry>();

    void add(List<Entry> entries) {
        this.entries.addAll(entries);
    }

    boolean hasEntry(Entry entry) {
        return this.entries.contains(entry);
    }
}
