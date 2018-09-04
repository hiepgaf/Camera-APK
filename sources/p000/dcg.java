package p000;

import android.content.Intent;

/* compiled from: PG */
/* renamed from: dcg */
final class dcg implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ cfh f2986a;
    /* renamed from: b */
    private final /* synthetic */ dcf f2987b;

    dcg(dcf dcf, cfh cfh) {
        this.f2987b = dcf;
        this.f2986a = cfh;
    }

    public final void run() {
        if (this.f2987b.f20912c.mo2084b()) {
            this.f2986a.mo2737a((Intent) this.f2987b.f20912c.mo2081a());
        } else {
            this.f2986a.mo2735a();
        }
    }
}
