package p000;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;

/* compiled from: PG */
/* renamed from: iqk */
class iqk implements NavigableMap {
    /* renamed from: a */
    private final NavigableMap f7320a;

    iqk(NavigableMap navigableMap) {
        this.f7320a = navigableMap;
    }

    public Entry ceilingEntry(Object obj) {
        return this.f7320a.ceilingEntry(obj);
    }

    public Object ceilingKey(Object obj) {
        return this.f7320a.ceilingKey(obj);
    }

    public void clear() {
        this.f7320a.clear();
    }

    public Comparator comparator() {
        return this.f7320a.comparator();
    }

    public boolean containsKey(Object obj) {
        return this.f7320a.containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return this.f7320a.containsValue(obj);
    }

    public NavigableSet descendingKeySet() {
        return this.f7320a.descendingKeySet();
    }

    public NavigableMap descendingMap() {
        return this.f7320a.descendingMap();
    }

    public Set entrySet() {
        return this.f7320a.entrySet();
    }

    public Entry firstEntry() {
        return this.f7320a.firstEntry();
    }

    public Object firstKey() {
        return this.f7320a.firstKey();
    }

    public Entry floorEntry(Object obj) {
        return this.f7320a.floorEntry(obj);
    }

    public Object floorKey(Object obj) {
        return this.f7320a.floorKey(obj);
    }

    public Object get(Object obj) {
        return this.f7320a.get(obj);
    }

    public SortedMap headMap(Object obj) {
        return this.f7320a.headMap(obj);
    }

    public NavigableMap headMap(Object obj, boolean z) {
        return this.f7320a.headMap(obj, z);
    }

    public Entry higherEntry(Object obj) {
        return this.f7320a.higherEntry(obj);
    }

    public Object higherKey(Object obj) {
        return this.f7320a.higherKey(obj);
    }

    public boolean isEmpty() {
        return this.f7320a.isEmpty();
    }

    public Set keySet() {
        return this.f7320a.keySet();
    }

    public Entry lastEntry() {
        return this.f7320a.lastEntry();
    }

    public Object lastKey() {
        return this.f7320a.lastKey();
    }

    public Entry lowerEntry(Object obj) {
        return this.f7320a.lowerEntry(obj);
    }

    public Object lowerKey(Object obj) {
        return this.f7320a.lowerKey(obj);
    }

    public NavigableSet navigableKeySet() {
        return this.f7320a.navigableKeySet();
    }

    public Entry pollFirstEntry() {
        return this.f7320a.pollFirstEntry();
    }

    public Entry pollLastEntry() {
        return this.f7320a.pollLastEntry();
    }

    public Object put(Object obj, Object obj2) {
        return this.f7320a.put(obj, obj2);
    }

    public void putAll(Map map) {
        this.f7320a.putAll(map);
    }

    public Object remove(Object obj) {
        return this.f7320a.remove(obj);
    }

    public int size() {
        return this.f7320a.size();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return this.f7320a.subMap(obj, obj2);
    }

    public NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return this.f7320a.subMap(obj, z, obj2, z2);
    }

    public SortedMap tailMap(Object obj) {
        return this.f7320a.tailMap(obj);
    }

    public NavigableMap tailMap(Object obj, boolean z) {
        return this.f7320a.tailMap(obj, z);
    }

    public Collection values() {
        return this.f7320a.values();
    }
}
