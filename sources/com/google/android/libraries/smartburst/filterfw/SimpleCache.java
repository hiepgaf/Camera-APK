package com.google.android.libraries.smartburst.filterfw;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

/* compiled from: PG */
class SimpleCache extends LinkedHashMap {
    public int mMaxEntries;

    public SimpleCache(int i) {
        super(i + 1, 1.0f, true);
        this.mMaxEntries = i;
    }

    protected boolean removeEldestEntry(Entry entry) {
        return super.size() > this.mMaxEntries;
    }
}
