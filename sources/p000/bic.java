package p000;

import android.annotation.TargetApi;
import android.view.Surface;

@TargetApi(21)
/* compiled from: PG */
/* renamed from: bic */
public final class bic implements iqo {
    /* renamed from: a */
    public static final String f10911a = bli.m862a("CdrRecReqStarter");
    /* renamed from: b */
    public final bhr f10912b;
    /* renamed from: c */
    public final bhu f10913c;
    /* renamed from: d */
    public final Surface f10914d;
    /* renamed from: e */
    public final Object f10915e = new Object();
    /* renamed from: f */
    public boolean f10916f;
    /* renamed from: g */
    private final ijx f10917g;

    public bic(bhr bhr, bhu bhu, ijx ijx, Surface surface) {
        this.f10912b = bhr;
        this.f10913c = bhu;
        this.f10917g = ijx;
        this.f10914d = surface;
    }

    public final void close() {
        synchronized (this.f10915e) {
            this.f10916f = true;
        }
    }

    /* renamed from: a */
    public final kpk m7406a(bhj bhj, Surface surface, bhs bhs) {
        if (bhj == null) {
            return kow.m13617a(null);
        }
        kpk d = kpw.m18056d();
        this.f10917g.execute(new bid(this, surface, bhj, bhs, d));
        return d;
    }
}
