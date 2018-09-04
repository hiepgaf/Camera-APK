package p000;

import android.hardware.camera2.CaptureResult;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* renamed from: bjd */
public final class bjd implements ioi {
    /* renamed from: a */
    private static final String f20087a = bli.m862a("DynBitOpt");
    /* renamed from: b */
    private final AtomicLong f20088b = new AtomicLong(0);
    /* renamed from: c */
    private final ios f20089c;
    /* renamed from: d */
    private bjf f20090d;

    public bjd(ios ios) {
        this.f20089c = ios;
        this.f20090d = bjf.FPS_30;
    }

    public final void close() {
        this.f20088b.set(0);
        this.f20090d = bjf.FPS_30;
    }

    /* renamed from: a */
    public final void mo2684a(iwp iwp) {
        boolean z;
        Object obj = (Long) iwp.mo3143a(CaptureResult.SENSOR_TIMESTAMP);
        if (obj != null) {
            z = true;
        } else {
            z = false;
        }
        jri.m13153b(z);
        long longValue = ((Long) jri.m13152b(obj)).longValue() - this.f20088b.getAndSet(obj.longValue());
        int a;
        String str;
        StringBuilder stringBuilder;
        if (bjf.FPS_30.m839a(longValue) && this.f20090d != bjf.FPS_30) {
            this.f20090d = bjf.FPS_30;
            a = this.f20089c.m12334a(this.f20090d.f1204c);
            str = f20087a;
            stringBuilder = new StringBuilder(63);
            stringBuilder.append("FPS changes from 60 to 30, new bitrate would be ");
            stringBuilder.append((float) a);
            bli.m863a(str, stringBuilder.toString());
        } else if (bjf.FPS_60.m839a(longValue) && this.f20090d != bjf.FPS_60) {
            this.f20090d = bjf.FPS_60;
            a = this.f20089c.m12334a(this.f20090d.f1204c);
            str = f20087a;
            stringBuilder = new StringBuilder(63);
            stringBuilder.append("FPS changes from 30 to 60, new bitrate would be ");
            stringBuilder.append((float) a);
            bli.m863a(str, stringBuilder.toString());
        }
    }
}
