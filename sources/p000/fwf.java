package p000;

import android.graphics.Bitmap;

/* compiled from: PG */
/* renamed from: fwf */
final class fwf implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ Bitmap f4762a;
    /* renamed from: b */
    private final /* synthetic */ int f4763b;
    /* renamed from: c */
    private final /* synthetic */ fwd f4764c;

    fwf(fwd fwd, Bitmap bitmap, int i) {
        this.f4764c = fwd;
        this.f4762a = bitmap;
        this.f4763b = i;
    }

    public final void run() {
        this.f4764c.f21420b.mo2864a(this.f4762a, this.f4763b);
    }
}
