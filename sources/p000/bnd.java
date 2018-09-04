package p000;

import android.annotation.TargetApi;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureRequest.Key;
import com.google.android.apps.camera.stats.BurstSessionStatistics;
import com.google.android.apps.camera.stats.Instrumentation;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

@TargetApi(19)
/* compiled from: PG */
/* renamed from: bnd */
public final class bnd implements bna {
    /* renamed from: a */
    public final fhg f11043a;
    /* renamed from: b */
    public final fjk f11044b;
    /* renamed from: c */
    public final bni f11045c;
    /* renamed from: d */
    public final ixm f11046d;
    /* renamed from: e */
    public final bnn f11047e;
    /* renamed from: f */
    public final bwq f11048f;
    /* renamed from: g */
    public final AtomicReference f11049g = new AtomicReference();
    /* renamed from: h */
    public final Map f11050h = new ConcurrentHashMap();
    /* renamed from: i */
    public final Executor f11051i;
    /* renamed from: j */
    public final ixq f11052j;
    /* renamed from: k */
    public final ixv f11053k;
    /* renamed from: l */
    public final Object f11054l = new Object();
    /* renamed from: m */
    public final int f11055m;
    /* renamed from: n */
    public final AtomicBoolean f11056n = new AtomicBoolean();
    /* renamed from: o */
    public bwp f11057o;
    /* renamed from: p */
    private final kpk f11058p;
    /* renamed from: q */
    private final fff f11059q;
    /* renamed from: r */
    private final ilp f11060r;
    /* renamed from: s */
    private final bwo f11061s;
    /* renamed from: t */
    private final Map f11062t = new ConcurrentHashMap();

    public bnd(ixm ixm, bnn bnn, kpk kpk, fhg fhg, fjk fjk, ilp ilp, fff fff, Executor executor, bwo bwo, bwq bwq, ixq ixq, ixv ixv) {
        this.f11047e = bnn;
        this.f11058p = kpk;
        this.f11043a = fhg;
        this.f11044b = fjk;
        this.f11059q = fff;
        this.f11051i = executor;
        this.f11045c = new bni(this);
        this.f11060r = ilp;
        this.f11046d = ixm;
        this.f11061s = bwo;
        this.f11048f = bwq;
        this.f11057o = null;
        this.f11052j = ixq;
        this.f11053k = ixv;
        this.f11055m = (this.f11046d.mo1951a() + 6) + 1;
    }

    /* renamed from: g */
    final fio m7574g() {
        int i;
        if (this.f11060r.mo2860b() == fxi.ON) {
            i = 2;
        } else {
            i = 0;
        }
        ffw ffw = (ffw) kow.m13625c(this.f11058p);
        fis[] fisArr = new fis[1];
        r5 = new fin[6];
        Key key = CaptureRequest.CONTROL_AE_MODE;
        Integer valueOf = Integer.valueOf(1);
        r5[0] = new fin(key, valueOf);
        r5[1] = new fin(CaptureRequest.CONTROL_MODE, valueOf);
        r5[2] = new fin(CaptureRequest.FLASH_MODE, Integer.valueOf(i));
        r5[3] = new fin(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(4));
        r5[4] = new fin(CaptureRequest.EDGE_MODE, valueOf);
        r5[5] = new fin(CaptureRequest.NOISE_REDUCTION_MODE, valueOf);
        fisArr[0] = fds.m10240a(Arrays.asList(r5));
        return new fio((fim) ffw.m17308a(fisArr).mo2860b()).m2302a(5);
    }

    /* renamed from: a */
    public final void mo525a() {
        bnh bnh = (bnh) this.f11049g.get();
        if (bnh != null) {
            m7568a(bnh.f1338b, false);
            m7563b(null);
        }
    }

    /* renamed from: a */
    public final kpk mo524a(gkr gkr, iqm iqm, bnx bnx, iqp iqp) {
        UUID randomUUID = UUID.randomUUID();
        kpk d = kpw.m18056d();
        this.f11062t.put(randomUUID, d);
        m7563b(new bnh(gkr, randomUUID, System.currentTimeMillis(), iqm, bnx, (BurstSessionStatistics) Instrumentation.instance().burstStats().getCurrentSession(), iqp));
        return d;
    }

    /* renamed from: a */
    final void m7568a(UUID uuid, boolean z) {
        kpw kpw = (kpw) this.f11062t.remove(uuid);
        if (kpw != null) {
            kpw.mo3557a(Boolean.valueOf(z));
        }
    }

    /* renamed from: b */
    public final void mo526b() {
        ffe ffe = this.f11045c;
        if (ffe.f11064a.compareAndSet(false, true)) {
            ffe.f11065b.f11059q.m2273a(ffe);
        }
    }

    /* renamed from: c */
    public final void mo527c() {
        this.f11047e.mo546a(new bng(this));
    }

    /* renamed from: d */
    public final void mo528d() {
        synchronized (this.f11054l) {
            try {
                bwp bwp = this.f11057o;
                if (bwp != null) {
                    bwp.close();
                    this.f11057o = null;
                }
                this.f11057o = this.f11061s.mo606b();
            } catch (Throwable th) {
                String valueOf = String.valueOf(th);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 60);
                stringBuilder.append("Gyro is unavailable and cannot be used for burst selection: ");
                stringBuilder.append(valueOf);
                bli.m866b("BurstController", stringBuilder.toString());
                this.f11057o = null;
            }
        }
    }

    /* renamed from: e */
    public final void mo529e() {
        this.f11045c.m7585b();
    }

    /* renamed from: f */
    public final void mo530f() {
        synchronized (this.f11054l) {
            bwp bwp = this.f11057o;
            if (bwp != null) {
                bwp.close();
                this.f11057o = null;
            }
        }
    }

    /* renamed from: a */
    final void m7567a(fhh fhh) {
        try {
            fio g = m7574g();
            g.m2303a(CaptureRequest.CONTROL_AF_TRIGGER, Integer.valueOf(2));
            g.m2303a(CaptureRequest.FLASH_MODE, Integer.valueOf(0));
            fhh.mo1381a(Collections.singletonList(g.m2301a()), fiv.REPEATING);
            fhh.mo1381a(Collections.singletonList(g.m2301a()), fiv.NON_REPEATING);
            return;
        } catch (isr e) {
        } catch (InterruptedException e2) {
        }
        bli.m866b("BurstController", "Could not submit unlock AF request! Perhaps camera is shutting down.");
    }

    /* renamed from: b */
    private final void m7563b(bnh bnh) {
        if (bnh != null) {
            this.f11050h.put(bnh.f1338b, bnh);
        }
        bnh bnh2 = (bnh) this.f11049g.getAndSet(bnh);
        if (bnh2 != null) {
            m7566a(bnh2);
        }
    }

    /* renamed from: a */
    final void m7566a(bnh bnh) {
        boolean z;
        UUID uuid = bnh.f1338b;
        bnh bnh2 = (bnh) this.f11049g.get();
        if (bnh2 == null || !bnh2.f1338b.equals(uuid)) {
            for (fkp a : this.f11046d.mo1955b()) {
                if (((UUID) a.m17317a(fkr.f4604d)).equals(uuid)) {
                    z = true;
                    break;
                }
            }
            z = false;
            if (z) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        if (z && this.f11050h.remove(bnh.f1338b) != null) {
            if (bnh.f1342f.get() >= 3) {
                this.f11051i.execute(new bnf(bnh));
                bnh.f1337a.mo2879f();
                return;
            }
            bnh.f1337a.mo2861a();
            m7568a(bnh.f1338b, false);
        }
    }

    /* renamed from: h */
    public final void m7575h() {
        if (this.f11046d.mo1960g() == 0) {
            bli.m871d("BurstController", "All images drained. Shutting down save broker!");
            this.f11047e.mo547b();
        }
    }
}
