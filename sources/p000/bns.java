package p000;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

/* compiled from: PG */
/* renamed from: bns */
final class bns implements kov {
    /* renamed from: a */
    private final /* synthetic */ gik f11102a;
    /* renamed from: b */
    private final /* synthetic */ fkp f11103b;
    /* renamed from: c */
    private final /* synthetic */ bno f11104c;
    /* renamed from: d */
    private final /* synthetic */ gil f11105d;
    /* renamed from: e */
    private final /* synthetic */ bnp f11106e;

    bns(bnp bnp, gik gik, fkp fkp, bno bno, gil gil) {
        this.f11106e = bnp;
        this.f11102a = gik;
        this.f11103b = fkp;
        this.f11104c = bno;
        this.f11105d = gil;
    }

    /* renamed from: a */
    public final void mo349a(Throwable th) {
        bno bno = this.f11104c;
        fkp fkp = this.f11103b;
        bno.mo534a((UUID) fkp.m17317a(fkr.f4604d), fkp.mo2719f(), new IOException(th));
        this.f11106e.m7614a(this.f11105d);
    }

    public final /* synthetic */ void b_(Object obj) {
        File file = (File) obj;
        foz foz = (foz) kow.m13625c(this.f11102a.f5244a);
        fkp fkp = this.f11103b;
        int intValue = ((Integer) fkp.m17317a(fkr.f4606f)).intValue();
        long longValue = ((Long) fkp.m17317a(fkr.f4605e)).longValue();
        long j = foz.f4652a;
        UUID uuid = (UUID) fkp.m17317a(fkr.f4604d);
        iqm a = iqm.m4037a(foz.f4654c);
        iqp iqp = foz.f4656e;
        this.f11104c.mo532a(new bnk(intValue, longValue, j, uuid, file, a, iqp.f7329a, iqp.f7330b));
        this.f11106e.m7614a(this.f11105d);
    }
}
