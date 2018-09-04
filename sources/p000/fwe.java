package p000;

import android.graphics.Bitmap;

/* compiled from: PG */
/* renamed from: fwe */
final class fwe implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ Bitmap f4760a;
    /* renamed from: b */
    private final /* synthetic */ fwd f4761b;

    fwe(fwd fwd, Bitmap bitmap) {
        this.f4761b = fwd;
        this.f4760a = bitmap;
    }

    public final void run() {
        this.f4761b.f21420b.mo2863a(this.f4760a);
    }
}
