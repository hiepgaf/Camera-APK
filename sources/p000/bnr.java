package p000;

import java.io.IOException;
import java.util.UUID;

/* compiled from: PG */
/* renamed from: bnr */
final class bnr implements kov {
    /* renamed from: a */
    private final /* synthetic */ bno f11100a;
    /* renamed from: b */
    private final /* synthetic */ fkp f11101b;

    bnr(bno bno, fkp fkp) {
        this.f11100a = bno;
        this.f11101b = fkp;
    }

    /* renamed from: a */
    public final void mo349a(Throwable th) {
        bno bno = this.f11100a;
        fkp fkp = this.f11101b;
        bno.mo534a((UUID) fkp.m17317a(fkr.f4604d), fkp.mo2719f(), new IOException(th));
    }

    public final /* synthetic */ void b_(Object obj) {
        obj = (foz) obj;
        jri.m13152b(obj);
        this.f11100a.mo531a(obj.f4652a);
    }
}
