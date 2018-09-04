package p000;

import android.hardware.camera2.CaptureResult;
import com.google.android.apps.camera.stats.BurstSessionStatistics;

/* compiled from: PG */
/* renamed from: bnj */
final class bnj implements kov {
    /* renamed from: a */
    private final /* synthetic */ BurstSessionStatistics f11067a;
    /* renamed from: b */
    private final /* synthetic */ bni f11068b;

    bnj(bni bni, BurstSessionStatistics burstSessionStatistics) {
        this.f11068b = bni;
        this.f11067a = burstSessionStatistics;
    }

    /* renamed from: a */
    public final void mo349a(Throwable th) {
        bli.m873e("BurstController", "Could not score a frame because metadata is missing!");
    }

    public final /* synthetic */ void b_(Object obj) {
        iwp iwp = (iwp) obj;
        long longValue = ((Long) iwp.mo3143a(CaptureResult.SENSOR_TIMESTAMP)).longValue();
        float a = this.f11068b.f11065b.f11052j.mo1961a(iwp);
        if (Float.isNaN(a)) {
            StringBuilder stringBuilder = new StringBuilder(38);
            stringBuilder.append("Score for ");
            stringBuilder.append(longValue);
            stringBuilder.append(" is NaN!");
            bli.m873e("BurstController", stringBuilder.toString());
        } else {
            this.f11068b.f11065b.f11053k.m4331a(a, longValue);
        }
        BurstSessionStatistics burstSessionStatistics = this.f11067a;
        if (burstSessionStatistics != null) {
            burstSessionStatistics.m8415g();
        }
    }
}
