package p000;

import android.annotation.TargetApi;
import android.hardware.camera2.CaptureResult;
import java.util.Set;

@TargetApi(21)
/* compiled from: PG */
/* renamed from: dvo */
public final class dvo extends fiw {
    /* renamed from: a */
    private final Set f14619a;
    /* renamed from: b */
    private long f14620b = -1;
    /* renamed from: c */
    private double f14621c = -1.0d;

    public dvo(Set set) {
        this.f14619a = set;
    }

    public final void a_(iwp iwp) {
        long longValue;
        double d;
        double d2 = -1.0d;
        Long l = (Long) iwp.mo3143a(CaptureResult.SENSOR_TIMESTAMP);
        if (l != null) {
            longValue = l.longValue();
        } else {
            longValue = -1;
        }
        long j = this.f14620b;
        if (j >= 0) {
            double d3 = ((double) (longValue - j)) / 1000000.0d;
            d = this.f14621c;
            if (d > 0.0d) {
                d2 = d;
            }
            this.f14621c = d3;
            d = d2;
            d2 = d3;
        } else {
            d = -1.0d;
        }
        this.f14620b = longValue;
        for (dvp a : this.f14619a) {
            a.mo1178a(iwp, d2, d);
        }
    }
}
