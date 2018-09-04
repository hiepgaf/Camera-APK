package p000;

import android.util.Log;
import com.google.android.libraries.smartburst.buffers.FeatureTable;
import com.google.android.libraries.smartburst.utils.Feature;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* renamed from: jkx */
public final class jkx implements FeatureTable {
    /* renamed from: a */
    public final EnumSet f18905a;
    /* renamed from: b */
    private final int[] f18906b;
    /* renamed from: c */
    private final AtomicIntegerArray f18907c;
    /* renamed from: d */
    private final AtomicIntegerArray f18908d;
    /* renamed from: e */
    private final int f18909e;
    /* renamed from: f */
    private final int f18910f;
    /* renamed from: g */
    private final long f18911g;
    /* renamed from: h */
    private final AtomicLong f18912h = new AtomicLong();
    /* renamed from: i */
    private final AtomicBoolean f18913i = new AtomicBoolean(true);
    /* renamed from: j */
    private final AtomicIntegerArray f18914j;
    /* renamed from: k */
    private final float f18915k;

    public jkx(EnumSet enumSet, int i, float f) {
        boolean z;
        boolean z2 = true;
        int i2 = 0;
        if (enumSet.size() > 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
        if (i <= 0) {
            z2 = false;
        }
        jri.m13143a(z2);
        this.f18911g = (long) (1.0E9f / f);
        this.f18915k = f;
        Iterator it = enumSet.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            jza jza = (jza) it.next();
            if (jza.f8131z > i3) {
                i3 = jza.f8131z;
            }
        }
        int i4 = i3 + 1;
        this.f18906b = new int[i4];
        Arrays.fill(this.f18906b, -1);
        Iterator it2 = enumSet.iterator();
        i3 = 0;
        while (it2.hasNext()) {
            jza = (jza) it2.next();
            this.f18906b[jza.f8131z] = i3;
            i3 = jza.f8127A + i3;
        }
        this.f18909e = i3;
        this.f18910f = i;
        this.f18905a = enumSet;
        this.f18907c = new AtomicIntegerArray(this.f18909e * i);
        this.f18908d = new AtomicIntegerArray(i4);
        while (i2 < i4) {
            this.f18908d.set(i2, -1);
            i2++;
        }
        this.f18914j = new AtomicIntegerArray(i4);
    }

    /* renamed from: a */
    private final void m12919a(jza jza) {
        if (!this.f18905a.contains(jza)) {
            String name = jza.name();
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(name).length() + 52);
            stringBuilder.append("Unknown feature '");
            stringBuilder.append(name);
            stringBuilder.append("': Feature is not tracked in table!");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    public final int getAssignmentCount(jza jza) {
        return this.f18905a.contains(jza) ? this.f18914j.get(jza.f8131z) : 0;
    }

    public final int getCapacity() {
        return this.f18910f;
    }

    /* renamed from: a */
    private final int m12918a(jza jza, int i) {
        return (this.f18909e * i) + this.f18906b[jza.f8131z];
    }

    public final int getColumnCount() {
        return this.f18909e;
    }

    public final Feature[] getColumnValues(jza jza) {
        int i = 0;
        m12919a(jza);
        int i2 = this.f18908d.get(jza.f8131z);
        if (i2 < 0) {
            return new Feature[0];
        }
        Feature[] featureArr = new Feature[(i2 + 1)];
        while (i <= i2) {
            featureArr[i] = m12921a(jza, i, i2);
            i++;
        }
        return featureArr;
    }

    public final long getEarliestTimestamp() {
        return this.f18912h.get();
    }

    public final Feature getFeature(long j, jza jza) {
        return getRowForTimestamp(j).m4525a(jza);
    }

    /* renamed from: a */
    final Feature m12921a(jza jza, int i, int i2) {
        int min;
        int i3 = 0;
        m12919a(jza);
        if (i >= 0) {
            min = Math.min(i, i2);
        } else {
            min = 0;
        }
        if (min < 0) {
            return new Feature(jza);
        }
        float[] fArr = new float[jza.f8127A];
        min = m12918a(jza, min);
        while (i3 < fArr.length) {
            fArr[i3] = Float.intBitsToFloat(this.f18907c.get(min + i3));
            i3++;
        }
        return new Feature(jza, fArr);
    }

    public final int getFeatureCount() {
        return this.f18905a.size();
    }

    public final EnumSet getFeatureTypes() {
        return this.f18905a;
    }

    public final float getFrameRate() {
        return this.f18915k;
    }

    public final long getLatestValidTimestamp() {
        Iterator it = this.f18905a.iterator();
        long j = Long.MAX_VALUE;
        while (it.hasNext()) {
            jza jza = (jza) it.next();
            int i = this.f18908d.get(jza.f8131z);
            if (i != -1) {
                long a = jza.f8130D + m12920a(i);
                if (a >= j) {
                    a = j;
                }
                j = a;
            }
        }
        return j;
    }

    public final int getNumRowsWithData() {
        int i = -1;
        for (int i2 = 0; i2 < this.f18908d.length(); i2++) {
            if (this.f18908d.get(i2) > i) {
                i = this.f18908d.get(i2);
            }
        }
        if (i != -1) {
            return i + 1;
        }
        return 0;
    }

    public final int getRowCount() {
        return this.f18910f;
    }

    public final jky getRowForTimestamp(long j) {
        return (jky) getRowIterator(j).next();
    }

    public final jkz getRowIterator(long j) {
        return new jkz(this, this.f18908d, m12917a(j));
    }

    /* renamed from: a */
    private final int m12917a(long j) {
        long j2 = j - this.f18912h.get();
        long j3;
        if (j2 >= 0) {
            j3 = this.f18911g;
            j2 = (j2 + (j3 / 2)) / j3;
        } else {
            j3 = this.f18911g;
            j2 = (j2 - (j3 / 2)) / j3;
        }
        return (int) j2;
    }

    public final boolean setFeatureValue(long j, Feature feature) {
        m12919a(feature.getType());
        if (this.f18913i.compareAndSet(true, false)) {
            this.f18912h.set(j);
        }
        jza type = feature.getType();
        int i = type.f8131z;
        int a = m12917a(j);
        if (a >= this.f18910f || a < 0) {
            String name = feature.getType().name();
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(name).length() + 70);
            stringBuilder.append("Table has overflowed or timestamp is too far in the past for feature ");
            stringBuilder.append(name);
            stringBuilder.append("!");
            Log.w("DenseFeatureTable", stringBuilder.toString());
            return false;
        }
        int i2 = this.f18908d.get(i);
        if (i2 >= a) {
            name = feature.getType().name();
            stringBuilder = new StringBuilder(String.valueOf(name).length() + 51);
            stringBuilder.append("Target row is earlier than latest row for feature ");
            stringBuilder.append(name);
            stringBuilder.append("!");
            Log.w("DenseFeatureTable", stringBuilder.toString());
            return false;
        } else if (this.f18908d.compareAndSet(i, i2, LfuScheduler.MAX_PRIORITY)) {
            int a2 = m12918a(feature.getType(), a);
            float[] values = feature.getValues();
            for (int i3 = 0; i3 < values.length; i3++) {
                boolean z;
                int i4 = a2 + i3;
                this.f18907c.set(i4, Float.floatToIntBits(values[i3]));
                float f = values[i3];
                jzg jzg = type.f8128B;
                if (i2 >= -1) {
                    z = true;
                } else {
                    z = false;
                }
                jri.m13143a(z);
                int i5 = a - i2;
                if (i5 > 1) {
                    int i6 = i5 - 1;
                    if (i2 < 0) {
                        int floatToIntBits = Float.floatToIntBits(f);
                        for (i5 = 0; i5 < i6; i5++) {
                            i4 -= this.f18909e;
                            this.f18907c.set(i4, floatToIntBits);
                        }
                    } else {
                        float f2 = 1.0f / ((float) i5);
                        int i7 = this.f18909e;
                        float intBitsToFloat = Float.intBitsToFloat(this.f18907c.get(i4 - (i5 * i7)));
                        for (i5 = 0; i5 < i6; i5++) {
                            float a3 = jzg.mo2077a(intBitsToFloat, f, ((float) (i6 - i5)) * f2);
                            i4 -= this.f18909e;
                            this.f18907c.set(i4, Float.floatToIntBits(a3));
                        }
                    }
                }
            }
            this.f18914j.incrementAndGet(i);
            this.f18908d.set(i, a);
            return true;
        } else {
            Log.w("DenseFeatureTable", "Attempting to write to same feature column from multiple threads!");
            return false;
        }
    }

    /* renamed from: a */
    final long m12920a(int i) {
        return this.f18912h.get() + (this.f18911g * ((long) i));
    }

    public final String toString() {
        long j = this.f18911g;
        String a = kaz.m4732a(",").m4735a(this.f18905a);
        int i = this.f18910f;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(a).length() + 66);
        stringBuilder.append("DenseFeatureTable[rows=");
        stringBuilder.append(i);
        stringBuilder.append(",rate=");
        stringBuilder.append(1.0E9f / ((float) j));
        stringBuilder.append(",features=");
        stringBuilder.append(a);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
