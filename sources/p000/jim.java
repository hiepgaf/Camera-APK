package p000;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* renamed from: jim */
public final class jim implements jif {
    /* renamed from: a */
    private final jif[] f18832a;

    public jim(List list) {
        this((jif[]) list.toArray(new jif[list.size()]));
    }

    private jim(jif... jifArr) {
        boolean z;
        int i = 0;
        jri.m13152b((Object) jifArr);
        int length = jifArr.length;
        if (length > 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13144a(z, (Object) "empty array");
        while (i < length) {
            jri.m13152b(jifArr[i]);
            i++;
        }
        this.f18832a = jifArr;
    }

    /* renamed from: a */
    public final int mo2004a() {
        int i = 0;
        jif[] jifArr = this.f18832a;
        int i2 = 0;
        while (i < jifArr.length) {
            i2 += jifArr[i].mo2004a();
            i++;
        }
        return i2;
    }

    /* renamed from: b */
    public final synchronized void mo2006b() {
        for (jif b : this.f18832a) {
            b.mo2006b();
        }
    }

    /* renamed from: a */
    public final synchronized void mo2005a(jzt jzt) {
        jzt jzo = new jzo(jzt);
        for (jif a : this.f18832a) {
            a.mo2005a(jzo);
        }
    }

    /* renamed from: c */
    public final synchronized void mo2007c() {
        for (jif c : this.f18832a) {
            c.mo2007c();
        }
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f18832a);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(arrays).length() + 34);
        stringBuilder.append("MultiFeatureExtractor[extractors=");
        stringBuilder.append(arrays);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
