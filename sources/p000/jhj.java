package p000;

import java.io.File;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jhj */
public class jhj implements jhk {
    /* renamed from: a */
    public final Executor f18810a;
    /* renamed from: b */
    public kpk f18811b = null;
    /* renamed from: c */
    public kpk f18812c;
    /* renamed from: d */
    public kpk f18813d;
    /* renamed from: e */
    public kpk f18814e;
    /* renamed from: f */
    public boolean f18815f;

    /* renamed from: a */
    public jhk m12844a(File file) {
        this.f18811b = kow.m13617a((Object) file);
        return this;
    }

    public jhj(Executor executor) {
        this.f18810a = executor;
        this.f18812c = kow.m13617a(null);
        this.f18813d = kow.m13617a(null);
        this.f18814e = kow.m13617a(null);
        this.f18815f = true;
    }

    /* renamed from: a */
    public jgx m12842a() {
        kpk kpk = this.f18811b;
        if (kpk != null) {
            return new jgz((koq) kny.m18045a(koq.m16613c(kpk), jhi.f18809a, this.f18810a), this.f18814e, this.f18812c, this.f18813d, this.f18815f, this.f18810a);
        }
        throw new IllegalArgumentException("Output not properly specified");
    }

    /* renamed from: b */
    public jhj m12845b() {
        this.f18815f = false;
        return this;
    }

    /* renamed from: a */
    public jhj m12843a(int i) {
        this.f18814e = kow.m13617a(Integer.valueOf(i));
        return this;
    }
}
