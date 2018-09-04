package p000;

import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.view.Surface;

/* renamed from: iyi */
final /* synthetic */ class iyi implements Runnable {
    /* renamed from: a */
    private final iye f7550a;
    /* renamed from: b */
    private final jek f7551b;
    /* renamed from: c */
    private final izv f7552c;
    /* renamed from: d */
    private final OnFrameAvailableListener f7553d;
    /* renamed from: e */
    private final kpw f7554e;

    iyi(iye iye, jek jek, izv izv, OnFrameAvailableListener onFrameAvailableListener, kpw kpw) {
        this.f7550a = iye;
        this.f7551b = jek;
        this.f7552c = izv;
        this.f7553d = onFrameAvailableListener;
        this.f7554e = kpw;
    }

    public final void run() {
        iye iye = this.f7550a;
        jek jek = this.f7551b;
        izu izu = this.f7552c;
        OnFrameAvailableListener onFrameAvailableListener = this.f7553d;
        knk knk = this.f7554e;
        synchronized (iye.f18683m) {
            if (iye.f18688r) {
                return;
            }
            iye.f18678h.mo1903a("createInputSurface");
            iye.f18676f = new SurfaceTexture(((jfb) jek.mo3492c()).mo3493i(), false);
            iye.f18676f.setDefaultBufferSize(izu.f7592a[0], izu.m4369b());
            iye.f18676f.setOnFrameAvailableListener(onFrameAvailableListener);
            knk.mo3557a(new Surface(iye.f18676f));
            iye.f18678h.mo1904b();
        }
    }
}
