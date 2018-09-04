package p000;

import android.os.SystemClock;
import android.view.Choreographer.FrameCallback;

/* renamed from: gjs */
final /* synthetic */ class gjs implements FrameCallback {
    /* renamed from: a */
    private final kpw f5267a;

    gjs(gjr gjr, kpw kpw) {
        this.f5267a = kpw;
    }

    public final void doFrame(long j) {
        knk knk = this.f5267a;
        Object gkc = new gkc();
        SystemClock.uptimeMillis();
        gkc.f5280a = SystemClock.elapsedRealtimeNanos();
        knk.mo3557a(gkc);
    }
}
