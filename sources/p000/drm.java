package p000;

import android.hardware.camera2.CaptureRequest;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: drm */
final class drm implements kaw {
    /* renamed from: a */
    private final /* synthetic */ fis f14300a;

    drm(fis fis) {
        this.f14300a = fis;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo370a(Object obj) {
        ffw ffw = (ffw) obj;
        r0 = new fis[2];
        r0[0] = fds.m10240a(Arrays.asList(new fin[]{new fin(CaptureRequest.CONTROL_CAPTURE_INTENT, Integer.valueOf(1))}));
        r0[1] = this.f14300a;
        return ffw.m17308a(r0);
    }
}
