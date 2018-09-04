package p000;

import android.os.Handler;

/* compiled from: PG */
/* renamed from: zb */
final class zb implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ Handler f9559a;
    /* renamed from: b */
    private final /* synthetic */ zx f9560b;
    /* renamed from: c */
    private final /* synthetic */ yu f9561c;

    zb(yu yuVar, Handler handler, zx zxVar) {
        this.f9561c = yuVar;
        this.f9559a = handler;
        this.f9560b = zxVar;
    }

    public final void run() {
        Object obj = null;
        aah aah = this.f9561c;
        zf zfVar = aah.f19755a.f19747d;
        Handler handler = this.f9559a;
        zx zxVar = this.f9560b;
        if (!(handler == null || aah == null || zxVar == null)) {
            obj = new yq(handler, aah, zxVar);
        }
        zfVar.obtainMessage(303, obj).sendToTarget();
    }
}
