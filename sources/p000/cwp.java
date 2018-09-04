package p000;

import com.google.android.apps.camera.stats.BurstSessionStatistics;
import java.util.Map;

/* compiled from: PG */
/* renamed from: cwp */
final class cwp implements kov {
    /* renamed from: a */
    public final /* synthetic */ BurstSessionStatistics f12738a;
    /* renamed from: b */
    public final /* synthetic */ cwj f12739b;
    /* renamed from: c */
    private final /* synthetic */ chw f12740c;

    cwp(cwj cwj, chw chw, BurstSessionStatistics burstSessionStatistics) {
        this.f12739b = cwj;
        this.f12740c = chw;
        this.f12738a = burstSessionStatistics;
    }

    /* renamed from: a */
    public final void mo349a(Throwable th) {
        this.f12739b.f12705a.mo513a("error when stopping burst", th);
    }

    public final /* synthetic */ void b_(Object obj) {
        kpk kpk;
        Boolean bool = (Boolean) obj;
        if (this.f12740c != chw.FORCE_STOP || this.f12739b.f12715k.keySet().isEmpty()) {
            kpk = (kpk) this.f12739b.f12715k.remove(this.f12740c);
        } else {
            Map map = this.f12739b.f12715k;
            kpk = (kpk) map.remove(map.keySet().iterator().next());
        }
        if (bool.booleanValue() && kpk != null) {
            kow.m13622a(kpk, new cwq(this), this.f12739b.f12706b);
        }
    }
}
