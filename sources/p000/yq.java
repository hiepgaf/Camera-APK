package p000;

import android.annotation.TargetApi;
import android.hardware.Camera;
import android.hardware.Camera.AutoFocusMoveCallback;
import android.os.Handler;

@TargetApi(16)
/* compiled from: PG */
/* renamed from: yq */
final class yq implements AutoFocusMoveCallback {
    /* renamed from: a */
    public final zx f9538a;
    /* renamed from: b */
    public final aah f9539b;
    /* renamed from: c */
    private final Handler f9540c;

    yq(Handler handler, aah aah, zx zxVar) {
        this.f9540c = handler;
        this.f9539b = aah;
        this.f9538a = zxVar;
    }

    public final void onAutoFocusMoving(boolean z, Camera camera) {
        this.f9540c.post(new yr(this, z));
    }
}
