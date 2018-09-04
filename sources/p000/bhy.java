package p000;

import android.annotation.TargetApi;
import android.view.Surface;

@TargetApi(21)
/* compiled from: PG */
/* renamed from: bhy */
public final class bhy implements iqo {
    /* renamed from: a */
    public static final String f10898a = bli.m862a("CdrPreviewStarter");
    /* renamed from: b */
    public final bhr f10899b;
    /* renamed from: c */
    public final bhu f10900c;
    /* renamed from: d */
    public final Object f10901d = new Object();
    /* renamed from: e */
    public boolean f10902e;
    /* renamed from: f */
    private final ijx f10903f;

    public bhy(bhr bhr, bhu bhu, ijx ijx) {
        this.f10899b = bhr;
        this.f10900c = bhu;
        this.f10903f = ijx;
        this.f10902e = false;
    }

    public final void close() {
        bli.m863a(f10898a, "close preview starter");
        synchronized (this.f10901d) {
            this.f10902e = true;
        }
    }

    /* renamed from: a */
    public final kpk m7404a(bhj bhj, Surface surface, bhs bhs) {
        if (bhj == null || !surface.isValid()) {
            return kow.m13617a(null);
        }
        kpk d = kpw.m18056d();
        this.f10903f.execute(new bhz(this, d, bhj, surface, bhs));
        return d;
    }
}
