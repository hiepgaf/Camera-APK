package p000;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* renamed from: jte */
public final class jte implements jtf {
    /* renamed from: a */
    private final jtf[] f19028a;

    public jte(jtf[] jtfArr) {
        this.f19028a = jtfArr;
    }

    /* renamed from: a */
    public final List mo2048a(Bitmap bitmap) {
        jri.m13152b((Object) bitmap);
        List arrayList = new ArrayList();
        for (jtf a : this.f19028a) {
            arrayList.addAll(a.mo2048a(bitmap));
        }
        return arrayList;
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f19028a);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(arrays).length() + 34);
        stringBuilder.append("ComboFeatureExtractor[extractors=");
        stringBuilder.append(arrays);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
