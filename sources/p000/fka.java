package p000;

import android.view.Surface;

/* compiled from: PG */
/* renamed from: fka */
final class fka extends fiw {
    /* renamed from: a */
    private final /* synthetic */ fki f16089a;
    /* renamed from: b */
    private final /* synthetic */ fjz f16090b;

    fka(fjz fjz, fki fki) {
        this.f16090b = fjz;
        this.f16089a = fki;
    }

    /* renamed from: b */
    public final void mo1390b(fhq fhq) {
        super.mo1390b(fhq);
        synchronized (this.f16090b.f16081c) {
            this.f16090b.f16082d.add(fhq);
        }
        this.f16090b.m10446a();
    }

    /* renamed from: a */
    public final void mo455a(Surface surface, long j) {
        iqz iqz = this.f16090b.f16080b;
        StringBuilder stringBuilder = new StringBuilder(34);
        stringBuilder.append("onBufferLost: ");
        stringBuilder.append(j);
        iqz.mo520f(stringBuilder.toString());
    }

    /* renamed from: a */
    public final void mo508a(fhq fhq) {
        super.mo508a(fhq);
        this.f16089a.m10462c(fhq);
        this.f16090b.f16083e.m10462c(fhq);
        this.f16090b.m10446a();
    }
}
