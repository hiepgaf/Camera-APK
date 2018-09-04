package p000;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: hmu */
public final class hmu {
    /* renamed from: a */
    public final List f6372a = new ArrayList();
    /* renamed from: b */
    public volatile iqm f6373b = iqm.CLOCKWISE_0;

    hmu() {
    }

    /* renamed from: a */
    final synchronized void m3250a(Runnable runnable) {
        this.f6372a.add(runnable);
    }

    /* renamed from: a */
    final synchronized void m3249a(iqm iqm) {
        this.f6373b = iqm;
    }
}
