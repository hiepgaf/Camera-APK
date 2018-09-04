package p000;

import java.lang.ref.WeakReference;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* renamed from: kpd */
enum kpd implements kpb {
    ;
    
    /* renamed from: b */
    private static final Set f19247b = null;

    static {
        f19247b = new CopyOnWriteArraySet();
    }

    private kpd(String str) {
    }

    /* renamed from: a */
    public final void mo2202a(Class cls) {
        for (WeakReference weakReference : f19247b) {
            if (cls.equals(weakReference.get())) {
                return;
            }
        }
        koz.m5030a(cls);
        if (f19247b.size() > 1000) {
            f19247b.clear();
        }
        f19247b.add(new WeakReference(cls));
    }
}
