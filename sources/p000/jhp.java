package p000;

import android.media.MediaFormat;

/* compiled from: PG */
/* renamed from: jhp */
public final class jhp implements jhm {
    /* renamed from: b */
    private final jhf f18816b;
    /* renamed from: c */
    private final kpw f18817c = kpw.m18056d();

    public jhp(jhf jhf) {
        this.f18816b = jhf;
    }

    /* renamed from: a */
    public final kpk mo1999a() {
        return this.f18817c;
    }

    /* renamed from: a */
    public final void mo2001a(jho jho) {
        this.f18816b.mo1295a(jho.f7839a, jho.f7840b);
        jho.close();
    }

    /* renamed from: a */
    public final void mo2000a(MediaFormat mediaFormat) {
        this.f18817c.mo3557a((Object) mediaFormat);
    }
}
