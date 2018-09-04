package p000;

import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.TreeMap;

/* compiled from: PG */
/* renamed from: ixr */
public final class ixr {
    /* renamed from: a */
    private final int f7526a = 200;
    /* renamed from: b */
    private final NavigableMap f7527b = new TreeMap();
    /* renamed from: c */
    private final float[] f7528c = new float[600];
    /* renamed from: d */
    private int f7529d = 0;

    /* renamed from: a */
    private final synchronized Entry m4322a(long j) {
        return ixr.m4323a(this.f7527b.ceilingEntry(Long.valueOf(j)), j);
    }

    /* renamed from: a */
    private static Entry m4323a(Entry entry, long j) {
        if (entry == null) {
            return null;
        }
        if (Math.abs(((Long) entry.getKey()).longValue() - j) >= 3000000) {
            return null;
        }
        return entry;
    }

    /* renamed from: b */
    private final synchronized Entry m4326b(long j) {
        return ixr.m4323a(this.f7527b.floorEntry(Long.valueOf(j)), j);
    }

    /* renamed from: a */
    private final synchronized void m4324a(int i, float[] fArr) {
        for (int i2 = 0; i2 < 3; i2++) {
            fArr[i2] = this.f7528c[(i * 3) + i2];
        }
    }

    /* renamed from: a */
    public final synchronized void m4327a(long j, float f, float f2, float f3) {
        float[] fArr = this.f7528c;
        int i = this.f7529d;
        int i2 = i * 3;
        fArr[i2] = f;
        fArr[i2 + 1] = f2;
        fArr[i2 + 2] = f3;
        this.f7527b.put(Long.valueOf(j), Integer.valueOf(i));
        this.f7529d = (this.f7529d + 1) % this.f7526a;
        while (this.f7527b.size() > this.f7526a) {
            NavigableMap navigableMap = this.f7527b;
            navigableMap.remove(navigableMap.firstKey());
        }
    }

    /* renamed from: a */
    private final synchronized void m4325a(long j, Entry entry, Entry entry2, float[] fArr) {
        if (((Long) entry.getKey()).equals(entry2.getKey())) {
            m4324a(((Integer) entry.getValue()).intValue(), fArr);
        } else {
            float longValue = (float) (((Long) entry2.getKey()).longValue() - ((Long) entry.getKey()).longValue());
            float longValue2 = ((float) (((Long) entry2.getKey()).longValue() - j)) / longValue;
            longValue = ((float) (j - ((Long) entry.getKey()).longValue())) / longValue;
            int intValue = ((Integer) entry.getValue()).intValue();
            int intValue2 = ((Integer) entry2.getValue()).intValue();
            for (int i = 0; i < 3; i++) {
                float[] fArr2 = this.f7528c;
                fArr[i] = (fArr2[(intValue2 * 3) + i] * longValue) + (fArr2[(intValue * 3) + i] * longValue2);
            }
        }
    }

    /* renamed from: a */
    public final synchronized boolean m4328a(long j, float[] fArr) {
        boolean z;
        Entry b = m4326b(j);
        Entry a = m4322a(j);
        if (b != null && a != null) {
            m4325a(j, b, a, fArr);
            z = true;
        } else if (b != null) {
            m4324a(((Integer) b.getValue()).intValue(), fArr);
            z = true;
        } else if (a != null) {
            m4324a(((Integer) a.getValue()).intValue(), fArr);
            z = true;
        } else {
            z = false;
        }
        return z;
    }
}
