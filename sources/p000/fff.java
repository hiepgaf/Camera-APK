package p000;

import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* renamed from: fff */
public final class fff {
    /* renamed from: a */
    public final ird f4523a;
    /* renamed from: b */
    public final ikd f4524b;
    /* renamed from: c */
    public final Object f4525c = new Object();
    /* renamed from: d */
    public kpm f4526d;
    /* renamed from: e */
    public boolean f4527e;
    /* renamed from: f */
    private final kwk f4528f;

    public fff(ira ira, ird ird, ikd ikd, kwk kwk) {
        this.f4524b = ikd;
        this.f4523a = ird;
        ira.mo511a("CommandExecutor");
        this.f4528f = kwk;
        this.f4527e = false;
    }

    /* renamed from: a */
    public final kpk m2273a(ffe ffe) {
        kpk a;
        synchronized (this.f4525c) {
            if (this.f4527e) {
                a = kow.m13617a(null);
            } else {
                if (this.f4526d == null) {
                    this.f4526d = khx.m4941a((ExecutorService) this.f4528f.mo345a());
                }
                jri.m13152b(this.f4526d);
                a = this.f4526d.mo2197a(new ffg(this, ffe));
            }
        }
        return a;
    }

    /* renamed from: a */
    public final boolean m2274a() {
        boolean z;
        synchronized (this.f4525c) {
            z = this.f4527e;
        }
        return z;
    }
}
