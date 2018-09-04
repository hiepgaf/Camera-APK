package p000;

import android.os.Bundle;
import android.util.Log;

/* renamed from: hzg */
final class hzg implements hzn {
    /* renamed from: a */
    private final /* synthetic */ Bundle f18147a;
    /* renamed from: b */
    private final /* synthetic */ long f18148b;
    /* renamed from: c */
    private final /* synthetic */ hzf f18149c;

    hzg(hzf hzf, Bundle bundle, long j) {
        this.f18149c = hzf;
        this.f18147a = bundle;
        this.f18148b = j;
    }

    /* renamed from: a */
    public final void mo1788a() {
        Log.w("gH_GetAsyncHelpPsd", "Failed to send async help psd to Help.");
    }

    /* renamed from: b */
    public final huu mo1789b() {
        hzh hzh = hzj.f6840b;
        hzf hzf = this.f18149c;
        return hzh.mo1791a(hzf.f6836a, hzf.f6837b, this.f18147a, this.f18148b);
    }
}
