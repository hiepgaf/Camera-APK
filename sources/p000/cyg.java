package p000;

import android.os.SystemClock;
import com.google.android.apps.camera.stats.InstrumentationSession;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: cyg */
final /* synthetic */ class cyg implements iqt {
    /* renamed from: a */
    private final cyd f12846a;
    /* renamed from: b */
    private final grd f12847b;
    /* renamed from: c */
    private final boolean f12848c;
    /* renamed from: d */
    private final boolean f12849d;
    /* renamed from: e */
    private final Long f12850e;
    /* renamed from: f */
    private final AtomicReference f12851f;

    cyg(cyd cyd, grd grd, boolean z, boolean z2, Long l, AtomicReference atomicReference) {
        this.f12846a = cyd;
        this.f12847b = grd;
        this.f12848c = z;
        this.f12849d = z2;
        this.f12850e = l;
        this.f12851f = atomicReference;
    }

    /* renamed from: a */
    public final void mo348a(Object obj) {
        cyd cyd = this.f12846a;
        InstrumentationSession instrumentationSession = this.f12847b;
        boolean z = this.f12848c;
        boolean z2 = this.f12849d;
        Long l = this.f12850e;
        AtomicReference atomicReference = this.f12851f;
        if (((Boolean) obj).booleanValue()) {
            int i;
            int i2;
            iya iya = instrumentationSession.m;
            instrumentationSession.f17233a = SystemClock.elapsedRealtimeNanos();
            instrumentationSession.m1327a("Camera Change", instrumentationSession.f2411k, instrumentationSession.f17233a);
            irs irs = cyd.f22746T;
            if (z) {
                i = 2;
            } else {
                i = 1;
            }
            if (z2) {
                i2 = 1;
            } else {
                i2 = 2;
            }
            irs.mo1571a(i, i2, l.longValue(), System.nanoTime());
            if (atomicReference.get() != null) {
                ((iqo) atomicReference.get()).close();
            }
        }
    }
}
