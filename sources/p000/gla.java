package p000;

import android.graphics.Bitmap;

/* renamed from: gla */
final /* synthetic */ class gla implements Runnable {
    /* renamed from: a */
    private final gkt f5350a;
    /* renamed from: b */
    private final Bitmap f5351b;
    /* renamed from: c */
    private final int f5352c;

    gla(gkt gkt, Bitmap bitmap, int i) {
        this.f5350a = gkt;
        this.f5351b = bitmap;
        this.f5352c = i;
    }

    public final void run() {
        gkt gkt = this.f5350a;
        gkt.f21505r.m2632a(this.f5351b, this.f5352c);
    }
}
