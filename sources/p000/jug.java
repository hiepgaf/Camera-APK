package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: jug */
public final class jug implements juk {
    /* renamed from: a */
    private final juk[] f19066a;

    public jug(juk[] jukArr) {
        jri.m13152b((Object) jukArr);
        this.f19066a = jukArr;
    }

    /* renamed from: a */
    public final List mo2054a(List list) {
        for (juk a : this.f19066a) {
            List a2 = a.mo2054a(list);
            if (!a2.isEmpty()) {
                return a2;
            }
        }
        return Collections.emptyList();
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f19066a);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(arrays).length() + 34);
        stringBuilder.append("FirstNonEmptySelector[segmenters=");
        stringBuilder.append(arrays);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
