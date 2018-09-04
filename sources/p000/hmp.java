package p000;

import android.content.Context;
import android.util.Size;
import android.view.SurfaceHolder;
import java.util.Set;

/* compiled from: PG */
/* renamed from: hmp */
public final class hmp implements hmy {
    /* renamed from: a */
    private final Set f17935a;
    /* renamed from: b */
    private final ird f17936b;

    public hmp(Set set, bsn bsn, ird ird) {
        this.f17935a = set;
        this.f17936b = ird;
    }

    /* renamed from: a */
    public final /* synthetic */ hmx mo1742a(SurfaceHolder surfaceHolder, Size size) {
        hmu hmu = new hmu();
        hmu.getClass();
        iyc a = iye.m12672a(size, new iyd(hmu), this.f17936b, false);
        surfaceHolder.addCallback(new hmv(hmu));
        Set<hml> set = this.f17935a;
        hmx hmr = new hmr(set, a, surfaceHolder.getSurface(), hmu);
        hmr.m15900b();
        for (hml a2 : set) {
            hmr.f21593a.add(a2.mo1739a().mo2859a(new hms(hmr), kpq.f8410a));
        }
        return hmr;
    }

    /* renamed from: a */
    public final hmz mo1743a(Context context) {
        return new hmq(context);
    }
}
