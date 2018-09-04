package p000;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* renamed from: koe */
abstract class koe {
    /* renamed from: a */
    private static final Logger f8389a = Logger.getLogger(koe.class.getName());
    /* renamed from: c */
    public static final kof f8390c;
    public volatile int remaining;
    public volatile Set seenExceptions = null;

    static {
        kof kog;
        Throwable th;
        try {
            kog = new kog(AtomicReferenceFieldUpdater.newUpdater(koe.class, Set.class, "seenExceptions"), AtomicIntegerFieldUpdater.newUpdater(koe.class, "remaining"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            kog = new koh();
        }
        f8390c = kog;
        if (th != null) {
            f8389a.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    /* renamed from: a */
    abstract void mo2199a(Set set);

    koe(int i) {
        this.remaining = i;
    }
}
