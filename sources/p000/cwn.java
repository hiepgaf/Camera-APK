package p000;

import com.google.android.apps.camera.stats.BurstSessionStatistics;

/* compiled from: PG */
/* renamed from: cwn */
final class cwn implements kaw {
    /* renamed from: a */
    private final /* synthetic */ boolean f12734a;
    /* renamed from: b */
    private final /* synthetic */ BurstSessionStatistics f12735b;
    /* renamed from: c */
    private final /* synthetic */ cwj f12736c;

    cwn(cwj cwj, boolean z, BurstSessionStatistics burstSessionStatistics) {
        this.f12736c = cwj;
        this.f12734a = z;
        this.f12735b = burstSessionStatistics;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo370a(Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool.booleanValue()) {
            this.f12736c.f12711g.mo1550c();
            this.f12736c.f12716l.m925b(this.f12734a);
            this.f12735b.m8417i();
        } else if (this.f12734a) {
            this.f12736c.f12716l.m923a();
            ((chy) this.f12736c.f12714j.mo345a()).h_();
            ((chy) this.f12736c.f12714j.mo345a()).i_();
        }
        return bool;
    }
}
