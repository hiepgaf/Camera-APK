package p000;

import android.view.Surface;
import java.util.Collection;
import java.util.HashSet;

/* compiled from: PG */
/* renamed from: ivr */
public final class ivr {
    /* renamed from: a */
    private final Object f7496a = new Object();
    /* renamed from: b */
    private final HashSet f7497b = new HashSet();

    /* renamed from: a */
    public final void m4259a(Collection collection) {
        synchronized (this.f7496a) {
            this.f7497b.addAll(collection);
        }
    }

    /* renamed from: a */
    public final boolean m4260a(Surface surface) {
        boolean contains;
        synchronized (this.f7496a) {
            contains = this.f7497b.contains(surface);
        }
        return contains;
    }
}
