package p000;

import android.graphics.SurfaceTexture;

/* compiled from: PG */
/* renamed from: aao */
final class aao implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ SurfaceTexture f28a = null;
    /* renamed from: b */
    private final /* synthetic */ aaw f29b;
    /* renamed from: c */
    private final /* synthetic */ aah f30c;

    aao(aah aah, aaw aaw) {
        this.f30c = aah;
        this.f29b = aaw;
    }

    public final void run() {
        this.f30c.mo2563b().obtainMessage(101, null).sendToTarget();
        this.f30c.mo2563b().post(this.f29b.f38a);
    }
}
