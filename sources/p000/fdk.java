package p000;

import android.hardware.camera2.CaptureRequest;

/* compiled from: PG */
/* renamed from: fdk */
final class fdk implements fdf {
    /* renamed from: a */
    private final /* synthetic */ fdf f15885a;
    /* renamed from: b */
    private final /* synthetic */ Integer f15886b;

    fdk(fdf fdf, Integer num) {
        this.f15885a = fdf;
        this.f15886b = num;
    }

    public final void close() {
        this.f15885a.close();
    }

    /* renamed from: a */
    public final long mo1358a() {
        return this.f15885a.mo1358a();
    }

    /* renamed from: a */
    public final fim mo1359a(fim fim) {
        return new fio(this.f15885a.mo1359a(fim)).m2303a(CaptureRequest.CONTROL_AF_MODE, this.f15886b).m2301a();
    }
}
