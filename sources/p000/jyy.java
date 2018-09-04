package p000;

import android.util.LongSparseArray;
import java.io.Writer;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: PG */
/* renamed from: jyy */
public final class jyy implements jyv {
    /* renamed from: a */
    private final Map f19126a = new TreeMap();
    /* renamed from: b */
    private final boolean f19127b = true;

    /* renamed from: a */
    public final void m13350a(String str, long j, float f) {
        LongSparseArray longSparseArray = (LongSparseArray) this.f19126a.get(str);
        if (longSparseArray == null) {
            longSparseArray = new LongSparseArray();
            this.f19126a.put(str, longSparseArray);
        }
        if (!this.f19127b || longSparseArray.get(j) == null) {
            longSparseArray.put(j, Float.valueOf(f));
        }
    }

    /* renamed from: a */
    public final void mo2003a(Writer writer) {
        Set keySet = this.f19126a.keySet();
        String[] strArr = (String[]) keySet.toArray(new String[keySet.size()]);
        LongSparseArray longSparseArray = new LongSparseArray();
        int i = 0;
        while (true) {
            int i2;
            if (i >= i2) {
                break;
            }
            LongSparseArray longSparseArray2 = (LongSparseArray) this.f19126a.get(strArr[i]);
            for (i2 = 0; i2 < longSparseArray2.size(); i2++) {
                float[] fArr;
                long keyAt = longSparseArray2.keyAt(i2);
                float[] fArr2 = (float[]) longSparseArray.get(keyAt);
                if (fArr2 == null) {
                    Object obj = new float[strArr.length];
                    Arrays.fill(obj, Float.NaN);
                    longSparseArray.put(keyAt, obj);
                    fArr = obj;
                } else {
                    fArr = fArr2;
                }
                fArr[i] = ((Float) longSparseArray2.valueAt(i2)).floatValue();
            }
            i++;
        }
        writer.write("timestamp");
        for (Object valueOf : strArr) {
            String valueOf2 = String.valueOf(valueOf);
            String str = ",";
            if (valueOf2.length() == 0) {
                valueOf2 = new String(str);
            } else {
                valueOf2 = str.concat(valueOf2);
            }
            writer.write(valueOf2);
        }
        writer.write("\n");
        for (int i3 = 0; i3 < longSparseArray.size(); i3++) {
            float[] fArr3 = (float[]) longSparseArray.valueAt(i3);
            writer.write(String.valueOf(longSparseArray.keyAt(i3)));
            for (float f : fArr3) {
                if (Float.isNaN(f)) {
                    writer.write(",");
                } else {
                    StringBuilder stringBuilder = new StringBuilder(16);
                    stringBuilder.append(",");
                    stringBuilder.append(f);
                    writer.write(stringBuilder.toString());
                }
            }
            writer.write("\n");
        }
    }
}
