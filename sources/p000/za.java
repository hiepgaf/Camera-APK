package p000;

import android.hardware.Camera.AutoFocusCallback;
import com.google.android.libraries.smartburst.filterfw.FrameType;

/* compiled from: PG */
/* renamed from: za */
final class za implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ AutoFocusCallback f9557a;
    /* renamed from: b */
    private final /* synthetic */ yu f9558b;

    za(yu yuVar, AutoFocusCallback autoFocusCallback) {
        this.f9558b = yuVar;
        this.f9557a = autoFocusCallback;
    }

    public final void run() {
        if (!this.f9558b.f19755a.f19748e.m78c()) {
            this.f9558b.f19755a.f19748e.m77b(2);
            this.f9558b.f19755a.f19747d.obtainMessage(FrameType.ELEMENT_RGBA8888, this.f9557a).sendToTarget();
        }
    }
}
