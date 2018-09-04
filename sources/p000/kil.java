package p000;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: kil */
final class kil implements Serializable {
    public static final long serialVersionUID = 0;
    /* renamed from: a */
    private final String f8312a;
    /* renamed from: b */
    private final int f8313b;
    /* renamed from: c */
    private final String f8314c;

    kil(String str, int i, String str2) {
        this.f8312a = str;
        this.f8313b = i;
        this.f8314c = str2;
    }

    private final Object readResolve() {
        return new kij(this.f8312a, this.f8313b, this.f8314c);
    }
}
