package p000;

import android.os.Handler;

/* renamed from: exn */
public final /* synthetic */ class exn implements ijk {
    /* renamed from: a */
    private final kwk f15707a;
    /* renamed from: b */
    private final ird f15708b;
    /* renamed from: c */
    private final kwk f15709c;

    public exn(kwk kwk, ird ird, kwk kwk2) {
        this.f15707a = kwk;
        this.f15708b = ird;
        this.f15709c = kwk2;
    }

    /* renamed from: a */
    public final kpk mo385a() {
        ((Handler) this.f15707a.mo345a()).post(new exo(this.f15708b, this.f15709c));
        return kow.m13617a(Boolean.valueOf(true));
    }
}
