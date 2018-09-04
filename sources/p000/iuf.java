package p000;

import android.hardware.camera2.CaptureResult.Key;
import android.hardware.camera2.TotalCaptureResult;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: PG */
/* renamed from: iuf */
public final class iuf extends itr implements iwp {
    /* renamed from: b */
    private final TotalCaptureResult f23366b;

    public iuf(TotalCaptureResult totalCaptureResult) {
        super(totalCaptureResult);
        this.f23366b = totalCaptureResult;
    }

    /* renamed from: a */
    public final iud mo2713a() {
        return new iud(this.f23366b);
    }

    public final String toString() {
        String valueOf;
        Iterable arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(this.f21772a.getKeys());
        Collections.sort(arrayList2, new iug());
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            Key key = (Key) arrayList2.get(i);
            String name = key.getName();
            valueOf = String.valueOf(mo3143a(key));
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(name).length() + 2) + String.valueOf(valueOf).length());
            stringBuilder.append(name);
            stringBuilder.append(": ");
            stringBuilder.append(valueOf);
            arrayList.add(stringBuilder.toString());
            i = i2;
        }
        valueOf = kaz.m4732a(", ").m4735a(arrayList);
        StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf).length() + 22);
        stringBuilder2.append("TotalCaptureResult: {");
        stringBuilder2.append(valueOf);
        stringBuilder2.append("}");
        return stringBuilder2.toString();
    }
}
