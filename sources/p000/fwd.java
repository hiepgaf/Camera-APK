package p000;

import android.graphics.Bitmap;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* renamed from: fwd */
public final class fwd implements fwb {
    /* renamed from: c */
    private static final String f21418c = bli.m862a("ProcProgress");
    /* renamed from: a */
    public final fbk f21419a;
    /* renamed from: b */
    public final gkr f21420b;
    /* renamed from: d */
    private final bpn f21421d;
    /* renamed from: e */
    private final ikd f21422e;
    /* renamed from: f */
    private final Object f21423f = new Object();
    /* renamed from: g */
    private boolean f21424g = false;
    /* renamed from: h */
    private boolean f21425h = false;
    /* renamed from: i */
    private boolean f21426i = false;
    /* renamed from: j */
    private boolean f21427j = false;
    /* renamed from: k */
    private boolean f21428k = false;

    public fwd(fbk fbk, gkr gkr, ikd ikd, bpn bpn) {
        this.f21419a = fbk;
        this.f21420b = gkr;
        this.f21422e = ikd;
        this.f21421d = bpn;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void close() {
        /*
        r3 = this;
        r1 = r3.f21423f;
        monitor-enter(r1);
        r0 = r3.f21424g;	 Catch:{ all -> 0x0031 }
        if (r0 == 0) goto L_0x0009;
    L_0x0007:
        monitor-exit(r1);	 Catch:{ all -> 0x0031 }
    L_0x0008:
        return;
    L_0x0009:
        r0 = 1;
        r3.f21424g = r0;	 Catch:{ all -> 0x0031 }
        r0 = r3.f21428k;	 Catch:{ all -> 0x0031 }
        if (r0 != 0) goto L_0x0021;
    L_0x0010:
        r0 = r3.f21425h;	 Catch:{ all -> 0x0031 }
        if (r0 != 0) goto L_0x001c;
    L_0x0014:
        r0 = r3.f21426i;	 Catch:{ all -> 0x0031 }
        if (r0 != 0) goto L_0x001c;
    L_0x0018:
        r0 = r3.f21427j;	 Catch:{ all -> 0x0031 }
        if (r0 == 0) goto L_0x0021;
    L_0x001c:
        r0 = r3.f21421d;	 Catch:{ all -> 0x0031 }
        r0.mo559a();	 Catch:{ all -> 0x0031 }
    L_0x0021:
        r0 = r3.f21428k;	 Catch:{ all -> 0x0031 }
        if (r0 != 0) goto L_0x002f;
    L_0x0025:
        r0 = r3.f21422e;	 Catch:{ all -> 0x0031 }
        r2 = new fwk;	 Catch:{ all -> 0x0031 }
        r2.<init>(r3);	 Catch:{ all -> 0x0031 }
        r0.execute(r2);	 Catch:{ all -> 0x0031 }
    L_0x002f:
        monitor-exit(r1);	 Catch:{ all -> 0x0031 }
        goto L_0x0008;
    L_0x0031:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0031 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: fwd.close():void");
    }

    /* renamed from: a */
    public final void mo3052a(Bitmap bitmap, int i) {
        synchronized (this.f21423f) {
            if (this.f21426i) {
                return;
            }
            this.f21426i = true;
            this.f21422e.execute(new fwf(this, bitmap, i));
        }
    }

    /* renamed from: a */
    public final void mo3053a(fwc fwc) {
        synchronized (this.f21423f) {
            if (this.f21424g) {
                return;
            }
            jri.m13153b(this.f21428k ^ 1);
            this.f21428k = true;
            Executors.newSingleThreadExecutor(iel.m3721c("ProPrgsFin", 0)).submit(new fwj(this, fwc));
        }
    }

    /* renamed from: a */
    public final void mo3055a(byte[] bArr) {
        synchronized (this.f21423f) {
            jri.m13153b(this.f21427j ^ 1);
            this.f21427j = true;
            this.f21422e.execute(new fwg(this, bArr));
        }
    }

    /* renamed from: a */
    public final void mo3051a(Bitmap bitmap) {
        synchronized (this.f21423f) {
            if (this.f21425h) {
                bli.m873e(f21418c, "Duplicate thumbnail set");
                return;
            }
            this.f21425h = true;
            this.f21422e.execute(new fwe(this, bitmap));
        }
    }

    /* renamed from: a */
    public final void mo3050a(float f) {
        synchronized (this.f21423f) {
            if (this.f21424g) {
                return;
            }
            this.f21422e.execute(new fwi(this, f));
        }
    }

    /* renamed from: a */
    public final void mo3054a(hec hec) {
        synchronized (this.f21423f) {
            if (this.f21424g) {
                return;
            }
            this.f21422e.execute(new fwh(this, hec));
        }
    }
}
