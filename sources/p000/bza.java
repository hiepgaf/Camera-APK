package p000;

import com.google.googlex.gcam.SimpleCallback;

/* compiled from: PG */
/* renamed from: bza */
final class bza extends SimpleCallback {
    /* renamed from: a */
    private final /* synthetic */ byy f11520a;

    bza(byy byy) {
        this.f11520a = byy;
    }

    public final void Run() {
        if (!this.f11520a.f1722c.isEmpty()) {
            bli.m866b(byy.f1720a, String.format(null, "HDR+ is idle, but we have %d shots in flight", new Object[]{Integer.valueOf(this.f11520a.f1722c.size())}));
        }
    }
}
