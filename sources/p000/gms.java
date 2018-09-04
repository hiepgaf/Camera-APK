package p000;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

@TargetApi(19)
/* compiled from: PG */
/* renamed from: gms */
public final class gms extends gkk {
    /* renamed from: F */
    private static final String f23489F = bli.m862a("PortraitCaptureSess");
    /* renamed from: G */
    private final bvm f23490G;

    public gms(ContentResolver contentResolver, glt glt, gmp gmp, eqa eqa, gsp gsp, gtg gtg, gsx gsx, gsl gsl, grg grg, bcv bcv, ixv ixv, ird ird, bvm bvm, gnh gnh, irs irs, String str, kbg kbg, iut iut, long j, Executor executor, gev gev) {
        super(contentResolver, glt, gmp, eqa, null, null, gsp, gtg, gsx, gsl, grg, bcv, ixv, ird, null, null, gnh, irs, str, kbg, iut, j, executor, gev);
        this.f23490G = bvm;
    }

    /* renamed from: q */
    protected final void mo3565q() {
        this.E.mo3058a();
    }

    /* renamed from: r */
    protected final void mo3566r() {
        m15758A().m2510a(this.E);
    }

    /* renamed from: s */
    final String mo3449s() {
        return f23489F;
    }

    /* renamed from: t */
    protected final void mo3567t() {
        if (this.a.size() == 1) {
            this.f23490G.mo591a(((eql) kow.m13625c((Future) jri.m13152b(this.z))).mo1263b(), bve.NONE);
        }
    }

    /* renamed from: v */
    protected final void mo3568v() {
        boolean z;
        if (this.k == glw.PORTRAIT) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
    }
}
