package p000;

import android.media.MediaFormat;

/* compiled from: PG */
/* renamed from: ewf */
public final class ewf implements kwk {
    /* renamed from: a */
    private final kwk f15630a;
    /* renamed from: b */
    private final kwk f15631b;
    /* renamed from: c */
    private final kwk f15632c;
    /* renamed from: d */
    private final kwk f15633d;
    /* renamed from: e */
    private final kwk f15634e;
    /* renamed from: f */
    private final kwk f15635f;
    /* renamed from: g */
    private final kwk f15636g;

    private ewf(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5, kwk kwk6, kwk kwk7) {
        this.f15630a = kwk;
        this.f15631b = kwk2;
        this.f15632c = kwk3;
        this.f15633d = kwk4;
        this.f15634e = kwk5;
        this.f15635f = kwk6;
        this.f15636g = kwk7;
    }

    /* renamed from: a */
    public static ewf m10000a(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5, kwk kwk6, kwk kwk7) {
        return new ewf(kwk, kwk2, kwk3, kwk4, kwk5, kwk6, kwk7);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        kwk kwk = this.f15630a;
        kwk kwk2 = this.f15632c;
        kwk kwk3 = this.f15633d;
        kwk kwk4 = this.f15634e;
        kwk kwk5 = this.f15635f;
        MediaFormat mediaFormat = (MediaFormat) kwk.mo345a();
        euj euj = (euj) kwk2.mo345a();
        exi exi = (exi) kwk3.mo345a();
        iuw iuw = (iuw) kwk4.mo345a();
        evo evo = (evo) kwk5.mo345a();
        this.f15636g.mo345a();
        evm evm = new evm(evo, euj, kau.f19138a);
        exi.getClass();
        evb evb = new evb(mediaFormat, new etf(exi), evm, iuw, euh.m2126a("mv-vid-encoder"));
        evb.getClass();
        exi.mo1315a(new ewb(evb), kpq.f8410a);
        return (evb) ktm.m13963a(evb, "Cannot return null from a non-@Nullable @Provides method");
    }
}
