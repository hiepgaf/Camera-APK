package p000;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* renamed from: ghh */
public class ghh {
    /* renamed from: a */
    private int f5197a = 0;
    /* renamed from: b */
    private final ReentrantLock f5198b = new ReentrantLock();
    /* renamed from: c */
    private Condition f5199c = this.f5198b.newCondition();

    /* renamed from: a */
    public final int m2552a(int i) {
        this.f5198b.lock();
        try {
            this.f5197a += i;
            int i2 = this.f5197a;
            return i2;
        } finally {
            this.f5198b.unlock();
        }
    }

    /* renamed from: a */
    public final void m2553a() {
        this.f5198b.lock();
        while (this.f5197a != 0) {
            try {
                this.f5199c.await();
            } catch (InterruptedException e) {
                throw e;
            } catch (Throwable th) {
                this.f5198b.unlock();
            }
        }
        this.f5198b.unlock();
    }

    /* renamed from: b */
    public final int m2554b() {
        this.f5198b.lock();
        int i = this.f5197a;
        this.f5198b.unlock();
        return i;
    }

    /* renamed from: b */
    public final ghh m2555b(int i) {
        this.f5198b.lock();
        this.f5197a = i;
        this.f5198b.unlock();
        return this;
    }

    /* renamed from: c */
    public final void m2556c() {
        this.f5198b.lock();
        this.f5199c.signal();
        this.f5198b.unlock();
    }
}
