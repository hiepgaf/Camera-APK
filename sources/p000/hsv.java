package p000;

import android.graphics.Bitmap;

/* compiled from: PG */
/* renamed from: hsv */
final class hsv implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ Bitmap f6596a;
    /* renamed from: b */
    private final /* synthetic */ hsu f6597b;

    hsv(hsu hsu, Bitmap bitmap) {
        this.f6597b = hsu;
        this.f6596a = bitmap;
    }

    public final void run() {
        this.f6597b.f6590a.mo1824a(this.f6596a);
    }
}
