package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: bwh */
public final class bwh implements bwp {
    /* renamed from: a */
    private final List f20166a = new ArrayList(100);
    /* renamed from: b */
    private boolean f20167b = true;
    /* renamed from: c */
    private final /* synthetic */ bxq f20168c;

    public bwh(bxq bxq) {
        this.f20168c = bxq;
    }

    public final synchronized void close() {
        this.f20167b = false;
        this.f20168c.m7851a(this);
    }

    /* renamed from: a */
    public final synchronized void mo2712a(long j, long j2, bwq bwq) {
        if (this.f20167b) {
            cci cci;
            synchronized (this.f20168c) {
                cci = this.f20168c.f11418a;
                if (cci != null) {
                    cci.f11638d.m7999a(j, j2, this.f20166a);
                }
            }
            bwq.mo549a(this.f20166a);
            synchronized (this.f20168c) {
                cci = this.f20168c.f11418a;
                if (cci != null) {
                    cci.f11638d.m8000a(this.f20166a);
                }
            }
        } else {
            bwq.mo549a(Collections.emptyList());
        }
    }
}
