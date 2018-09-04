package p000;

import android.database.Observable;

/* compiled from: PG */
/* renamed from: ty */
public final class ty extends Observable {
    ty() {
    }

    /* renamed from: a */
    public final boolean m5874a() {
        return this.mObservers.isEmpty() ^ 1;
    }

    /* renamed from: b */
    public final void m5875b() {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((tz) this.mObservers.get(size)).mo734a();
        }
    }
}
