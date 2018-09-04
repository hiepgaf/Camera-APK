package p000;

import android.os.Bundle;
import android.util.Log;

/* renamed from: hze */
final class hze implements hzn {
    /* renamed from: a */
    private final /* synthetic */ Bundle f18144a;
    /* renamed from: b */
    private final /* synthetic */ long f18145b;
    /* renamed from: c */
    private final /* synthetic */ hzd f18146c;

    hze(hzd hzd, Bundle bundle, long j) {
        this.f18146c = hzd;
        this.f18144a = bundle;
        this.f18145b = j;
    }

    /* renamed from: a */
    public final void mo1788a() {
        Log.w("gH_GetAsyncFeedbackPsd", "Failed to send async feedback psd to Help.");
    }

    /* renamed from: b */
    public final huu mo1789b() {
        hzh hzh = hzj.f6840b;
        hzd hzd = this.f18146c;
        return hzh.mo1793b(hzd.f6833a, hzd.f6834b, this.f18144a, this.f18145b);
    }
}
