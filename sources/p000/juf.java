package p000;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* renamed from: juf */
public final class juf implements juk {
    /* renamed from: a */
    public final juk[] f19065a;

    private juf(juk[] jukArr) {
        jri.m13152b((Object) jukArr);
        this.f19065a = jukArr;
    }

    /* renamed from: a */
    public static juf m13235a(juk... jukArr) {
        return new juf(jukArr);
    }

    /* renamed from: a */
    public final List mo2054a(List list) {
        for (juk a : this.f19065a) {
            list = a.mo2054a(list);
        }
        return list;
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f19065a);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(arrays).length() + 29);
        stringBuilder.append("ChainedSegmenter[segmenters=");
        stringBuilder.append(arrays);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
