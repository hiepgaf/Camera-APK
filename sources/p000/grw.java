package p000;

import java.io.File;

/* compiled from: PG */
/* renamed from: grw */
public final class grw {
    /* renamed from: a */
    public final klx f5655a = new klx();
    /* renamed from: b */
    public File f5656b;

    /* renamed from: a */
    public static kmb m2764a(jzr jzr) {
        kmb kmb = new kmb();
        kmb.f22434a = (float) jzr.f8152a;
        kmb.f22435b = (float) jzr.f8153b;
        kmb.f22436c = (float) jzr.f8154c;
        kmb.f22437d = (float) Math.sqrt(jzr.f8155d);
        return kmb;
    }

    /* renamed from: a */
    public static kma m2763a(String str, int i) {
        boolean z;
        jri.m13152b((Object) str);
        if (str.length() == 4) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
        kma kma = new kma();
        kma.f22432a = str;
        kma.f22433b = i;
        return kma;
    }

    /* renamed from: a */
    public final klv m2766a() {
        klx klx = this.f5655a;
        if (klx.f22421e == null) {
            klx.f22421e = new klv();
        }
        return this.f5655a.f22421e;
    }

    /* renamed from: b */
    public final kly m2769b() {
        klx klx = this.f5655a;
        if (klx.f22422f == null) {
            klx.f22422f = new kly();
        }
        return this.f5655a.f22422f;
    }

    /* renamed from: c */
    private final klz m2765c() {
        klx klx = this.f5655a;
        if (klx.f22419c == null) {
            klx.f22419c = new klz();
        }
        return this.f5655a.f22419c;
    }

    /* renamed from: a */
    public final void m2767a(int i) {
        m2765c().f22428a = i;
    }

    /* renamed from: a */
    public final void m2768a(int i, int i2) {
        klz c = m2765c();
        c.f22429b = i;
        c.f22430c = i2;
    }
}
