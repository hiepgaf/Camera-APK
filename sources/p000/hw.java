package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* renamed from: hw */
final class hw implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ AtomicReference f6755a;
    /* renamed from: b */
    private final /* synthetic */ Callable f6756b;
    /* renamed from: c */
    private final /* synthetic */ ReentrantLock f6757c;
    /* renamed from: d */
    private final /* synthetic */ AtomicBoolean f6758d;
    /* renamed from: e */
    private final /* synthetic */ Condition f6759e;

    hw(AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
        this.f6755a = atomicReference;
        this.f6756b = callable;
        this.f6757c = reentrantLock;
        this.f6758d = atomicBoolean;
        this.f6759e = condition;
    }

    public final void run() {
        try {
            this.f6755a.set(this.f6756b.call());
        } catch (Exception e) {
        }
        this.f6757c.lock();
        try {
            this.f6758d.set(false);
            this.f6759e.signal();
        } finally {
            this.f6757c.unlock();
        }
    }
}
