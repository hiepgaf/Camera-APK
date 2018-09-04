package p000;

import android.graphics.Bitmap;

/* compiled from: PG */
/* renamed from: ddd */
final class ddd implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ Bitmap f2998a;
    /* renamed from: b */
    private final /* synthetic */ ddc f2999b;

    ddd(ddc ddc, Bitmap bitmap) {
        this.f2999b = ddc;
        this.f2998a = bitmap;
    }

    public final void run() {
        this.f2999b.f13095a.f1595a.mo573a(new dat(this.f2998a));
    }
}
