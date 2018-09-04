package p000;

import com.google.android.apps.camera.stats.BurstSessionStatistics;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: bni */
public final class bni implements ffe {
    /* renamed from: a */
    public final AtomicBoolean f11064a = new AtomicBoolean(false);
    /* renamed from: b */
    public final /* synthetic */ bnd f11065b;
    /* renamed from: c */
    private final AtomicReference f11066c = new AtomicReference();

    /* renamed from: a */
    private static /* synthetic */ void m7581a(Throwable th, fhh fhh) {
        if (th != null) {
            try {
                fhh.close();
                return;
            } catch (Throwable th2) {
                kqg.m5044a(th, th2);
                return;
            }
        }
        fhh.close();
    }

    /* renamed from: a */
    private static /* synthetic */ void m7582a(Throwable th, fjj fjj) {
        if (th != null) {
            try {
                fjj.close();
                return;
            } catch (Throwable th2) {
                kqg.m5044a(th, th2);
                return;
            }
        }
        fjj.close();
    }

    /* renamed from: a */
    private static /* synthetic */ void m7583a(Throwable th, fjl fjl) {
        if (th != null) {
            try {
                fjl.close();
                return;
            } catch (Throwable th2) {
                kqg.m5044a(th, th2);
                return;
            }
        }
        fjl.close();
    }

    bni(bnd bnd) {
        this.f11065b = bnd;
    }

    /* renamed from: a */
    public final void mo347a() {
        fhh a = this.f11065b.f11043a.mo1382a();
        try {
            fjl a2 = this.f11065b.f11044b.mo1398a();
            bnd bnd = this.f11065b;
            fhz x_ = a2.x_();
            fio g = bnd.m7574g();
            g.m2305a(x_);
            a.mo1381a(Collections.singletonList(g.m2301a()), fiv.REPEATING);
            this.f11066c.set(a2);
            ixm ixm = this.f11065b.f11046d;
            this.f11066c.set(a2);
            while (true) {
                if (!this.f11064a.get()) {
                    break loop0;
                }
                Object obj;
                int i;
                if (a2.mo3439d() >= this.f11065b.f11055m) {
                    i = 1;
                } else if (a2.mo3438b(1)) {
                    i = 1;
                } else {
                    obj = null;
                }
                if (obj == null) {
                    bli.m873e("BurstController", "Could not increase capacity for burst. Will retry next frame...");
                    try {
                        Thread.sleep(33);
                    } catch (InterruptedException e) {
                        bli.m873e("BurstController", "Delaying frame was interrupted.");
                        Thread.currentThread().interrupt();
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            if (a2 != null) {
                                bni.m7583a(th, a2);
                            }
                            throw th2;
                        }
                    }
                }
                try {
                    fjj fjj = (fjj) a2.mo2649a();
                    try {
                        fkp fkp;
                        kpk d = fjj.mo3043d();
                        iwz a3 = fds.m10247a(fjj, 35);
                        if (a3 == null) {
                            fkp = null;
                        } else {
                            if (this.f11065b.f11049g.get() != null) {
                                a3.mo2714a(ion.m3936a(iqp.m4043a(a3.mo2720g(), a3.mo2717d()), ((bnh) this.f11065b.f11049g.get()).f1346j));
                            }
                            fkp = new fkp(a3, d);
                        }
                        if (fkp != null) {
                            bnh bnh = (bnh) this.f11065b.f11049g.get();
                            if (bnh != null) {
                                fkp a4 = m7580a(fkp, bnh.f1345i);
                                a4.m17316a(fkr.f4604d, bnh.f1338b);
                                a4.m17316a(fkr.f4605e, Long.valueOf(bnh.f1339c));
                                a4.m17316a(fkr.f4606f, Integer.valueOf(bnh.f1341e.getAndIncrement()));
                                a4.m17316a(fkr.f4603c, bnh.f1340d);
                                ixm.mo1953a(fkp.mo2719f(), a4);
                                bnh.f1345i.m8412d();
                                this.f11065b.f11047e.mo545a();
                            }
                        }
                        if (fjj != null) {
                            bni.m7582a(null, fjj);
                        }
                    } catch (Throwable th3) {
                        if (fjj == null) {
                            break;
                        }
                        bni.m7582a(th2, fjj);
                        throw th3;
                    }
                } catch (bbg e2) {
                    bli.m873e("BurstController", "Burst stopped prematurely as buffer-queue was externally closed!");
                    m7585b();
                }
            }
            if (a2 != null) {
                bni.m7583a(null, a2);
            }
            try {
                this.f11065b.m7567a(a);
                if (a != null) {
                    bni.m7581a(null, a);
                }
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th22) {
                    if (a != null) {
                        bni.m7581a(th4, a);
                    }
                    throw th22;
                }
            }
        } catch (Throwable th42) {
            this.f11065b.m7567a(a);
            throw th42;
        }
    }

    /* renamed from: a */
    private final fkp m7580a(fkp fkp, BurstSessionStatistics burstSessionStatistics) {
        synchronized (this.f11065b.f11054l) {
            bwp bwp = this.f11065b.f11057o;
            if (bwp != null) {
                bwp.mo2712a(fkp.mo2719f() - 3000000, fkp.mo2719f() + 3000000, this.f11065b.f11048f);
            }
        }
        kow.m13622a((kpk) jri.m13152b(fkp.m17318h()), new bnj(this, burstSessionStatistics), kpq.f8410a);
        return fkp;
    }

    /* renamed from: b */
    public final void m7585b() {
        if (this.f11064a.compareAndSet(true, false)) {
            fjl fjl = (fjl) this.f11066c.getAndSet(null);
            if (fjl != null) {
                fjl.close();
            }
        }
    }
}
