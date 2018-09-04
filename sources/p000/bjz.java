package p000;

import android.annotation.TargetApi;
import android.os.Handler;
import android.view.Surface;
import java.util.Timer;
import java.util.TimerTask;

@TargetApi(21)
/* compiled from: PG */
/* renamed from: bjz */
public final class bjz implements bjw {
    /* renamed from: a */
    public static final String f20095a = bli.m862a("CdrSnapshotTaker");
    /* renamed from: b */
    public final Byte f20096b;
    /* renamed from: c */
    public final bhr f20097c;
    /* renamed from: d */
    public final gtf f20098d;
    /* renamed from: e */
    public final gsi f20099e;
    /* renamed from: f */
    public final ixb f20100f;
    /* renamed from: g */
    public final kbg f20101g;
    /* renamed from: h */
    public final ilp f20102h;
    /* renamed from: i */
    private final Handler f20103i;
    /* renamed from: j */
    private final ijx f20104j;
    /* renamed from: k */
    private final ilp f20105k;
    /* renamed from: l */
    private final ilp f20106l;
    /* renamed from: m */
    private final Timer f20107m;
    /* renamed from: n */
    private final Surface f20108n;
    /* renamed from: o */
    private int f20109o = go.f5586x;
    /* renamed from: p */
    private boolean f20110p = false;
    /* renamed from: q */
    private final Object f20111q = new Object();

    bjz(gtf gtf, gsi gsi, Handler handler, ijx ijx, Byte b, bhr bhr, ixb ixb, kbg kbg, ilp ilp, ilp ilp2, ilp ilp3) {
        this.f20096b = (Byte) jri.m13152b((Object) b);
        this.f20097c = (bhr) jri.m13152b((Object) bhr);
        this.f20098d = (gtf) jri.m13152b((Object) gtf);
        this.f20099e = (gsi) jri.m13152b((Object) gsi);
        this.f20103i = (Handler) jri.m13152b((Object) handler);
        this.f20104j = (ijx) jri.m13152b((Object) ijx);
        this.f20100f = (ixb) jri.m13152b((Object) ixb);
        this.f20101g = (kbg) jri.m13152b((Object) kbg);
        this.f20105k = (ilp) jri.m13152b((Object) ilp);
        this.f20106l = (ilp) jri.m13152b((Object) ilp2);
        this.f20102h = (ilp) jri.m13152b((Object) ilp3);
        this.f20108n = this.f20100f.mo3154g();
        this.f20107m = new Timer();
    }

    public final void close() {
        synchronized (this.f20111q) {
            if (this.f20109o == go.f5585w) {
            } else if (this.f20109o == go.f5587y) {
                this.f20110p = true;
            } else {
                this.f20107m.cancel();
                this.f20100f.close();
                this.f20108n.release();
                this.f20109o = go.f5585w;
                this.f20110p = false;
            }
        }
    }

    /* renamed from: a */
    public final Surface mo2686a() {
        return this.f20108n;
    }

    /* renamed from: a */
    public final bjv mo2687a(bhj bhj) {
        bjv bjv;
        synchronized (this.f20111q) {
            if (this.f20109o == go.f5585w) {
                bjv = new bjv(new IllegalStateException("has been closed."));
            } else if (this.f20109o == go.f5587y) {
                bjv = new bjv(new IllegalStateException("there is already a snapshot request in flight."));
            } else {
                boolean z;
                if (this.f20109o == go.f5586x) {
                    z = true;
                } else {
                    z = false;
                }
                jri.m13153b(z);
                this.f20109o = go.f5587y;
                long currentTimeMillis = System.currentTimeMillis();
                Float f = (Float) this.f20106l.mo2860b();
                Boolean bool = (Boolean) this.f20105k.mo2860b();
                kpk d = kpw.m18056d();
                TimerTask bka = new bka(this, d);
                this.f20107m.schedule(bka, 1000);
                this.f20100f.mo3148a(new bkb(this, bka, d), this.f20103i);
                kpk d2 = kpw.m18056d();
                kpk d3 = kpw.m18056d();
                this.f20104j.execute(new bkc(this, bhj, d3, d2, d));
                bjv = new bjv(iel.m3716a(d2, d, new bke(this, currentTimeMillis, bool, f)), d3);
            }
        }
        return bjv;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    final void m14849b() {
        /*
        r3 = this;
        r1 = r3.f20111q;
        monitor-enter(r1);
        r0 = r3.f20109o;	 Catch:{ all -> 0x0018 }
        r2 = p000.go.f5586x;	 Catch:{ all -> 0x0018 }
        if (r0 != r2) goto L_0x000b;
    L_0x0009:
        monitor-exit(r1);	 Catch:{ all -> 0x0018 }
    L_0x000a:
        return;
    L_0x000b:
        r0 = p000.go.f5586x;	 Catch:{ all -> 0x0018 }
        r3.f20109o = r0;	 Catch:{ all -> 0x0018 }
        r0 = r3.f20110p;	 Catch:{ all -> 0x0018 }
        if (r0 == 0) goto L_0x0016;
    L_0x0013:
        r3.close();	 Catch:{ all -> 0x0018 }
    L_0x0016:
        monitor-exit(r1);	 Catch:{ all -> 0x0018 }
        goto L_0x000a;
    L_0x0018:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0018 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: bjz.b():void");
    }
}
