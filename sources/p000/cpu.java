package p000;

import android.content.ContentResolver;
import android.content.Context;

/* compiled from: PG */
/* renamed from: cpu */
public final class cpu implements kwk {
    /* renamed from: a */
    private final kwk f12499a;
    /* renamed from: b */
    private final kwk f12500b;
    /* renamed from: c */
    private final kwk f12501c;
    /* renamed from: d */
    private final kwk f12502d;
    /* renamed from: e */
    private final kwk f12503e;

    public cpu(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5) {
        this.f12499a = kwk;
        this.f12500b = kwk2;
        this.f12501c = kwk3;
        this.f12502d = kwk4;
        this.f12503e = kwk5;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        kwk kwk = this.f12499a;
        kwk kwk2 = this.f12500b;
        return (cqm) ktm.m13963a(new cqm((Context) kwk.mo345a(), (cqb) this.f12501c.mo345a(), (ContentResolver) kwk2.mo345a(), (cqi) this.f12502d.mo345a(), (gsp) this.f12503e.mo345a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
