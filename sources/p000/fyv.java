package p000;

import android.hardware.camera2.CaptureResult;

/* compiled from: PG */
/* renamed from: fyv */
final class fyv implements iqt {
    /* renamed from: a */
    public final kpw f16651a;
    /* renamed from: b */
    private final long f16652b;
    /* renamed from: c */
    private final long f16653c;
    /* renamed from: d */
    private Long f16654d;
    /* renamed from: e */
    private boolean f16655e = false;

    public fyv(long j) {
        this.f16652b = j;
        this.f16653c = 10;
        this.f16651a = kpw.m18056d();
    }

    /* renamed from: a */
    public final /* synthetic */ void mo348a(Object obj) {
        iwp iwp = (iwp) obj;
        if (!this.f16655e) {
            if (this.f16654d == null) {
                this.f16654d = Long.valueOf(iwp.mo3144b());
            }
            long b = iwp.mo3144b() - ((Long) jqk.m13102c(this.f16654d)).longValue();
            Long l = (Long) iwp.mo3143a(CaptureResult.SENSOR_TIMESTAMP);
            if (l != null && l.longValue() > this.f16652b) {
                this.f16655e = true;
                this.f16651a.mo3557a(Boolean.valueOf(true));
            } else if (b >= this.f16653c) {
                String str = fyu.f4829a;
                long j = this.f16652b;
                String valueOf = String.valueOf(l);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 78);
                stringBuilder.append("timeout waiting for ");
                stringBuilder.append(j);
                stringBuilder.append(" at ");
                stringBuilder.append(valueOf);
                stringBuilder.append(", after ");
                stringBuilder.append(b);
                stringBuilder.append("frames");
                bli.m873e(str, stringBuilder.toString());
                this.f16655e = true;
                this.f16651a.mo3557a(Boolean.valueOf(false));
            }
        }
    }
}
