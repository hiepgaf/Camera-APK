package p000;

import android.hardware.camera2.CaptureRequest;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: dso */
final class dso implements kaw {
    /* renamed from: a */
    private final /* synthetic */ boolean f14377a;
    /* renamed from: b */
    private final /* synthetic */ dsn f14378b;

    dso(dsn dsn, boolean z) {
        this.f14378b = dsn;
        this.f14377a = z;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo370a(Object obj) {
        ffw ffw = (ffw) obj;
        fis[] fisArr = new fis[1];
        fisArr[0] = fds.m10240a(Arrays.asList(new fin[]{new fin(CaptureRequest.CONTROL_CAPTURE_INTENT, Integer.valueOf(2))}));
        ffw a = ffw.m17308a(fisArr);
        if (this.f14377a && !this.f14378b.f3273a.v_()) {
            return a;
        }
        int i;
        if (this.f14377a) {
            i = 5;
        } else {
            i = 3;
        }
        fis[] fisArr2 = new fis[1];
        fisArr2[0] = fds.m10240a(Arrays.asList(new fin[]{new fin(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(i))}));
        return a.m17308a(fisArr2);
    }
}
