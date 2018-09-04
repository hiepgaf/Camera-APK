package p000;

import android.hardware.Camera.PictureCallback;
import android.hardware.Camera.ShutterCallback;
import android.os.Handler;

/* compiled from: PG */
/* renamed from: ze */
final class ze implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ Handler f9567a;
    /* renamed from: b */
    private final /* synthetic */ aas f9568b;
    /* renamed from: c */
    private final /* synthetic */ aaf f9569c;
    /* renamed from: d */
    private final /* synthetic */ aaf f9570d = null;
    /* renamed from: e */
    private final /* synthetic */ PictureCallback f9571e;
    /* renamed from: f */
    private final /* synthetic */ yu f9572f;

    ze(yu yuVar, Handler handler, aas aas, aaf aaf, PictureCallback pictureCallback) {
        this.f9572f = yuVar;
        this.f9567a = handler;
        this.f9568b = aas;
        this.f9569c = aaf;
        this.f9571e = pictureCallback;
    }

    public final void run() {
        if (!this.f9572f.f19755a.f19748e.m78c()) {
            this.f9572f.f19755a.f19748e.m77b(6);
            yu yuVar = this.f9572f;
            zf zfVar = yuVar.f19755a.f19747d;
            Handler handler = this.f9567a;
            aas aas = this.f9568b;
            ShutterCallback zmVar = handler != null ? yuVar != null ? aas != null ? new zm(handler, aas) : null : null : null;
            zfVar.obtainMessage(601, new zg(zmVar, zi.m6254a(this.f9567a, this.f9572f, this.f9569c), zi.m6254a(this.f9567a, this.f9572f, null), this.f9571e)).sendToTarget();
        }
    }
}
