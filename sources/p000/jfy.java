package p000;

import android.media.MediaFormat;
import android.os.Handler;

/* compiled from: PG */
/* renamed from: jfy */
public final class jfy extends jgh implements jgc {
    /* renamed from: a */
    private final MediaFormat f18761a;
    /* renamed from: b */
    private final jhf f18762b;
    /* renamed from: c */
    private Handler f18763c = null;
    /* renamed from: d */
    private jgm f18764d;

    jfy(MediaFormat mediaFormat, jhf jhf) {
        this.f18761a = mediaFormat;
        this.f18762b = jhf;
        this.f18764d = new jgm(jgk.f7809b);
    }

    /* renamed from: a */
    public final /* synthetic */ jgb mo1993a() {
        return (jgb) super.m4468c();
    }

    /* renamed from: d */
    private final jgb m12805d() {
        try {
            jgm jgm = this.f18764d;
            jgm.f7810a = new jgi(jgm.f7810a, this.f18762b);
            return new jgb(this.f18761a, this.f18762b, this.f18764d.f7810a, this.f18763c);
        } catch (Throwable th) {
            IllegalStateException illegalStateException = new IllegalStateException("Could not build track encoder", th);
        }
    }

    /* renamed from: b */
    protected final /* synthetic */ Object mo1996b() {
        return m12805d();
    }

    /* renamed from: a */
    public final /* synthetic */ jgc mo1994a(Handler handler) {
        this.f18763c = handler;
        return this;
    }

    /* renamed from: a */
    public final /* synthetic */ jgc mo1995a(jgk jgk) {
        this.f18764d = new jgm(jgk);
        return this;
    }
}
