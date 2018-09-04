package p000;

import com.google.android.libraries.smartburst.filterfw.decoder.ImageDecoder;
import com.google.googlex.gcam.Gcam;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: bxj */
public final class bxj {
    /* renamed from: d */
    private static final String f1703d = bli.m862a("HdrPCpuPriority");
    /* renamed from: a */
    public final Object f1704a = new Object();
    /* renamed from: b */
    public final List f1705b = new ArrayList();
    /* renamed from: c */
    public Future f1706c;
    /* renamed from: e */
    private final Gcam f1707e;
    /* renamed from: f */
    private final ScheduledExecutorService f1708f;
    /* renamed from: g */
    private float f1709g = 1.0f;

    public bxj(Gcam gcam, ScheduledExecutorService scheduledExecutorService) {
        this.f1707e = gcam;
        this.f1708f = scheduledExecutorService;
    }

    /* renamed from: a */
    public final iqo m1038a(int i) {
        String str = f1703d;
        StringBuilder stringBuilder = new StringBuilder(28);
        stringBuilder.append("Registering shot ");
        stringBuilder.append(i);
        bli.m871d(str, stringBuilder.toString());
        bxm bxm = new bxm(i);
        synchronized (this.f1704a) {
            this.f1705b.add(bxm);
        }
        return new bxk(this, bxm);
    }

    /* renamed from: a */
    public final void m1039a() {
        bli.m869c(f1703d, "Setting HDR+ high processing priority");
        synchronized (this.f1704a) {
            Future future = this.f1706c;
            if (future != null) {
                future.cancel(false);
            }
        }
        m1040a(1.0f);
    }

    /* renamed from: b */
    public final void m1041b() {
        bli.m869c(f1703d, "Setting HDR+ low processing priority");
        m1040a(0.5f);
        synchronized (this.f1704a) {
            this.f1706c = this.f1708f.schedule(new bxl(this), ImageDecoder.CONSUMER_REGISTRATION_DELAY_MS, TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: a */
    final void m1040a(float f) {
        synchronized (this.f1704a) {
            if (f == this.f1709g) {
                return;
            }
            this.f1709g = f;
            for (bxm bxm : this.f1705b) {
                String str = f1703d;
                int i = bxm.f1711a;
                StringBuilder stringBuilder = new StringBuilder(62);
                stringBuilder.append("Setting HDR+ CPU usage to ");
                stringBuilder.append(f);
                stringBuilder.append(" for shot ");
                stringBuilder.append(i);
                bli.m869c(str, stringBuilder.toString());
                this.f1707e.LimitShotCpuUsage(bxm.f1711a, f);
            }
        }
    }
}
