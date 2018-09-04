package p000;

import android.graphics.PointF;

/* compiled from: PG */
/* renamed from: awb */
final class awb implements kaw {
    /* renamed from: a */
    private final /* synthetic */ avy f10410a;

    awb(avy avy) {
        this.f10410a = avy;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo370a(Object obj) {
        gvd gvd = (gvd) obj;
        PointF pointF = new PointF(gvd.m2839c().centerX(), gvd.m2839c().centerY());
        if (gvd.m2838b()) {
            return this.f10410a.f10398c.m2265b(pointF);
        }
        return pointF;
    }
}
