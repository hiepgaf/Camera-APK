package p000;

import android.graphics.Bitmap;
import android.os.Handler;

/* compiled from: PG */
/* renamed from: aoe */
final class aoe extends aqq {
    /* renamed from: a */
    public final int f23446a;
    /* renamed from: b */
    public Bitmap f23447b;
    /* renamed from: c */
    private final Handler f23448c;
    /* renamed from: d */
    private final long f23449d;

    aoe(Handler handler, int i, long j) {
        this.f23448c = handler;
        this.f23446a = i;
        this.f23449d = j;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo3364a(Object obj, ara ara) {
        this.f23447b = (Bitmap) obj;
        this.f23448c.sendMessageAtTime(this.f23448c.obtainMessage(1, this), this.f23449d);
    }
}
