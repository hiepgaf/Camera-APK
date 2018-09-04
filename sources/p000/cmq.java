package p000;

import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: cmq */
public final class cmq implements jx {
    /* renamed from: a */
    private final /* synthetic */ cmp f12186a;

    public cmq(cmp cmp) {
        this.f12186a = cmp;
    }

    /* renamed from: a */
    public final void mo723a(int i) {
        if (i == 0) {
            for (Entry entry : this.f12186a.f2171l.entrySet()) {
                cmp cmp = this.f12186a;
                if (!((cot) cmp.f2161b.get(cmp.f2172m.f585e)).f12527c.f12515e.f4155h.equals(entry.getKey())) {
                    ((kvr) entry.getValue()).m5472e();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo722a() {
    }

    /* renamed from: b */
    public final void mo724b() {
    }
}
