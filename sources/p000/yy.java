package p000;

import android.hardware.Camera;
import android.hardware.Camera.AutoFocusCallback;
import android.os.Handler;

/* compiled from: PG */
/* renamed from: yy */
final class yy implements AutoFocusCallback {
    /* renamed from: a */
    public final /* synthetic */ zw f9552a;
    /* renamed from: b */
    public final /* synthetic */ yu f9553b;
    /* renamed from: c */
    private final /* synthetic */ Handler f9554c;

    yy(yu yuVar, Handler handler, zw zwVar) {
        this.f9553b = yuVar;
        this.f9554c = handler;
        this.f9552a = zwVar;
    }

    public final void onAutoFocus(boolean z, Camera camera) {
        if (this.f9553b.f19755a.f19748e.m74a() == 16) {
            this.f9553b.f19755a.f19748e.m75a(2);
        } else {
            abx.m91e(yo.f19743a, "onAutoFocus callback returning when not focusing");
        }
        this.f9554c.post(new yz(this, z));
    }
}
