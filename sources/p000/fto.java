package p000;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: fto */
public final class fto {
    /* renamed from: a */
    private final String f4711a;
    /* renamed from: b */
    private final List f4712b = new ArrayList();

    public fto(String str) {
        this.f4711a = str;
    }

    /* renamed from: a */
    public final ftn m2383a() {
        return new ftn(this.f4711a, this.f4712b);
    }

    /* renamed from: a */
    public final fto m2384a(String str, boolean z) {
        if (!z) {
            this.f4712b.add(str);
        }
        return this;
    }
}
