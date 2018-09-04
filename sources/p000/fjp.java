package p000;

import android.hardware.camera2.CaptureResult;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* renamed from: fjp */
public final class fjp extends fiw implements fjs {
    /* renamed from: a */
    private final AtomicLong f16073a = new AtomicLong(Long.MAX_VALUE);
    /* renamed from: b */
    private final long f16074b;

    public fjp(long j) {
        this.f16074b = j;
    }

    /* renamed from: a */
    public final boolean mo1392a(iwp iwp) {
        long longValue = ((Long) jri.m13152b((Long) iwp.mo3143a(CaptureResult.SENSOR_TIMESTAMP))).longValue();
        long j = this.f16073a.get();
        if (j == Long.MAX_VALUE) {
            return false;
        }
        return longValue < j - this.f16074b;
    }

    public final void a_(iwp iwp) {
        this.f16073a.set(((Long) jri.m13152b((Long) iwp.mo3143a(CaptureResult.SENSOR_TIMESTAMP))).longValue());
    }
}
