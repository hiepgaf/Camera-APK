package p000;

import com.google.android.gms.internal.zzbgq;
import java.lang.ref.WeakReference;

/* renamed from: idi */
final class idi extends iaz {
    /* renamed from: a */
    private final WeakReference f21701a;

    idi(idb idb) {
        super((byte) 0);
        this.f21701a = new WeakReference(idb);
    }

    /* renamed from: a */
    public final void mo1799a(zzbgq zzbgq) {
        idb idb = (idb) this.f21701a.get();
        if (idb != null) {
            idb.f18226a.m16028a(new idj(idb, idb, zzbgq));
        }
    }
}
