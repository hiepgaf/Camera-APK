package p000;

import android.hardware.camera2.CaptureRequest;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: dsr */
public final class dsr implements kaw {
    /* renamed from: a */
    private final /* synthetic */ fis f14389a;

    public dsr(fis fis) {
        this.f14389a = fis;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo370a(Object obj) {
        ffw ffw = (ffw) obj;
        r0 = new fis[3];
        r0[1] = fds.m10240a(Arrays.asList(new fin[]{new fin(CaptureRequest.CONTROL_CAPTURE_INTENT, Integer.valueOf(1))}));
        r0[2] = this.f14389a;
        return ffw.m17308a(r0);
    }
}
