package p000;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* renamed from: fgr */
public final class fgr extends fiw {
    /* renamed from: a */
    public final ReentrantLock f15993a = new ReentrantLock();
    /* renamed from: b */
    public final Condition f15994b = this.f15993a.newCondition();
    /* renamed from: c */
    public long f15995c = -1;
    /* renamed from: d */
    private TreeMap f15996d = new TreeMap();
    /* renamed from: e */
    private long f15997e = -1;
    /* renamed from: f */
    private final Set f15998f = new HashSet();

    /* renamed from: a */
    public final long m10337a() {
        this.f15993a.lock();
        try {
            long j = this.f15995c;
            return j;
        } finally {
            this.f15993a.unlock();
        }
    }

    /* renamed from: b */
    public final long m10339b() {
        this.f15993a.lock();
        try {
            long j = this.f15997e;
            return j;
        } finally {
            this.f15993a.unlock();
        }
    }

    /* renamed from: a */
    public final void mo508a(fhq fhq) {
        super.mo508a(fhq);
        this.f15993a.lock();
        try {
            long j = fhq.f4563b;
            if (this.f15995c < j) {
                this.f15995c = j;
                this.f15997e = fhq.f4562a;
                this.f15994b.signal();
                while (!this.f15996d.isEmpty() && ((Long) this.f15996d.firstKey()).longValue() >= this.f15995c) {
                    ((Runnable) ((Entry) jri.m13152b(this.f15996d.pollFirstEntry())).getValue()).run();
                }
                Iterator it = this.f15998f.iterator();
                while (it.hasNext()) {
                    it.next();
                    if (this.f15995c % 0 == 0) {
                        Runnable runnable = null;
                        runnable.run();
                    }
                }
            }
            this.f15993a.unlock();
        } catch (Throwable th) {
            this.f15993a.unlock();
        }
    }
}
