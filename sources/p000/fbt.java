package p000;

import android.hardware.camera2.CaptureResult;

/* compiled from: PG */
/* renamed from: fbt */
public final class fbt implements fdx {
    /* renamed from: a */
    private final kpw f21335a = kpw.m18056d();

    /* renamed from: a */
    public final iwp mo3032a() {
        try {
            return (iwp) this.f21335a.get();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo348a(Object obj) {
        obj = (iwp) obj;
        Boolean bool = (Boolean) obj.mo3143a(CaptureResult.CONTROL_AE_LOCK);
        if (!this.f21335a.isDone() && bool != null && !bool.booleanValue()) {
            this.f21335a.mo3557a(obj);
        }
    }
}
