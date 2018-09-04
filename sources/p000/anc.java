package p000;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* compiled from: PG */
/* renamed from: anc */
final class anc implements Lock {
    anc() {
    }

    public final void lock() {
    }

    public final void lockInterruptibly() {
    }

    public final Condition newCondition() {
        throw new UnsupportedOperationException("Should not be called");
    }

    public final boolean tryLock() {
        return true;
    }

    public final boolean tryLock(long j, TimeUnit timeUnit) {
        return true;
    }

    public final void unlock() {
    }
}
