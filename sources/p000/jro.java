package p000;

import android.graphics.Bitmap;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: jro */
public final class jro implements jry {
    /* renamed from: a */
    private final jry[] f18980a;

    public jro(jry[] jryArr) {
        this.f18980a = jryArr;
    }

    /* renamed from: a */
    public final jxa mo2043a(long j, Bitmap bitmap) {
        jri.m13152b((Object) bitmap);
        jxa jxa = new jxa();
        for (jry a : this.f18980a) {
            jxa.m4667a(a.mo2043a(j, bitmap));
        }
        return jxa;
    }

    /* renamed from: a */
    public static jro m13162a(jry... jryArr) {
        jri.m13152b((Object) jryArr);
        return new jro(jryArr);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f18980a);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(arrays).length() + 35);
        stringBuilder.append("ComboMetadataExtractor[extractors=");
        stringBuilder.append(arrays);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
