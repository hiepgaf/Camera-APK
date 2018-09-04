package p000;

import android.os.Handler;
import com.google.android.libraries.smartburst.filterfw.FrameType;

/* compiled from: PG */
/* renamed from: xu */
final class xu implements Runnable {
    /* renamed from: a */
    public final /* synthetic */ zw f9513a;
    /* renamed from: b */
    public final /* synthetic */ Handler f9514b;
    /* renamed from: c */
    private final /* synthetic */ xt f9515c;

    xu(xt xtVar, zw zwVar, Handler handler) {
        this.f9515c = xtVar;
        this.f9513a = zwVar;
        this.f9514b = handler;
    }

    public final void run() {
        Object xvVar;
        if (this.f9513a != null) {
            xvVar = new xv(this);
        } else {
            xvVar = null;
        }
        this.f9515c.f19698c.f19684c.m77b(48);
        this.f9515c.f19698c.f19683b.obtainMessage(FrameType.ELEMENT_RGBA8888, xvVar).sendToTarget();
    }
}
