package p000;

import com.google.googlex.gcam.InterleavedReadViewU16;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* renamed from: car */
public final class car implements bzv {
    /* renamed from: a */
    public static final String f20175a = bli.m862a("PostProcImgSvr");
    /* renamed from: b */
    public final hju f20176b;
    /* renamed from: c */
    public final fov f20177c;
    /* renamed from: d */
    public final fov f20178d;
    /* renamed from: e */
    public final Executor f20179e;
    /* renamed from: f */
    public final Executor f20180f;
    /* renamed from: g */
    public final ixv f20181g;
    /* renamed from: h */
    public final cap f20182h;
    /* renamed from: i */
    public final AtomicLong f20183i = new AtomicLong(0);
    /* renamed from: j */
    public final kbg f20184j;
    /* renamed from: k */
    private final kbg f20185k;
    /* renamed from: l */
    private final bmb f20186l;

    public car(hju hju, kbg kbg, ikd ikd, ixv ixv, bmb bmb, cap cap, kbg kbg2) {
        this.f20176b = hju;
        this.f20185k = kbg;
        this.f20181g = ixv;
        this.f20186l = bmb;
        this.f20182h = cap;
        this.f20184j = kbg2;
        this.f20177c = new fov(1);
        this.f20178d = new fov(1);
        this.f20179e = new ikh(ikd, Executors.newSingleThreadExecutor(iel.m3721c("PortEnc", 0)));
        this.f20180f = new ikh(ikd, kpq.f8410a);
    }

    /* renamed from: a */
    public final fux mo404a(fwa fwa) {
        return new cau(this, fwa.f4753b, fwa.f4755d, this.f20185k, UUID.randomUUID());
    }

    /* renamed from: a */
    public final ilp mo405a() {
        return ilq.m3818a(Boolean.valueOf(true));
    }

    /* renamed from: a */
    final InterleavedReadViewU16 m14919a(kpk kpk) {
        bsn bsn = this.f20186l.f1307a;
        try {
            InterleavedReadViewU16 interleavedReadViewU16 = (InterleavedReadViewU16) kpk.get(100, TimeUnit.MILLISECONDS);
            bli.m871d(f20175a, "Got PD data");
            return interleavedReadViewU16;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return new InterleavedReadViewU16();
        } catch (ExecutionException e2) {
            return new InterleavedReadViewU16();
        } catch (TimeoutException e3) {
            return new InterleavedReadViewU16();
        } catch (CancellationException e4) {
            return new InterleavedReadViewU16();
        }
    }

    /* renamed from: b */
    public final fuy mo407b() {
        return fuy.m2400a();
    }

    /* renamed from: c */
    public final bzr mo2721c(fwa fwa) {
        return new cau(this, fwa.f4753b, fwa.f4755d, this.f20185k, UUID.randomUUID());
    }

    /* renamed from: b */
    public final /* synthetic */ fux mo406b(fwa fwa) {
        return mo2721c(fwa);
    }
}
