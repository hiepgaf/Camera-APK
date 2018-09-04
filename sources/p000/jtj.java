package p000;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: jtj */
public final class jtj {
    /* renamed from: a */
    public final jtl f7961a;
    /* renamed from: b */
    public float[] f7962b;
    /* renamed from: c */
    public float[] f7963c;
    /* renamed from: d */
    public float[] f7964d;
    /* renamed from: e */
    public float f7965e;
    /* renamed from: f */
    private final List f7966f = new ArrayList();
    /* renamed from: g */
    private final List f7967g = new ArrayList();

    jtj(jtl jtl) {
        this.f7961a = jtl;
    }

    /* renamed from: a */
    public final jtj m4630a(jtv jtv) {
        this.f7967g.add(jqk.m13090a((Object) jtv));
        return this;
    }

    /* renamed from: a */
    public final jtj m4631a(jxi jxi) {
        this.f7967g.add(m4627a(jxi.f8068a));
        return this;
    }

    /* renamed from: a */
    public final jtj m4632a(jza jza) {
        this.f7967g.add(m4627a(jza.name()));
        return this;
    }

    /* renamed from: a */
    public final jtj m4629a(jto jto) {
        this.f7966f.add(jto);
        return this;
    }

    /* renamed from: a */
    public final jti m4628a() {
        return new jti(this.f7967g, this.f7965e, this.f7966f, this.f7962b, this.f7963c, this.f7964d);
    }

    /* renamed from: a */
    private final kbn m4627a(String str) {
        return jqk.m13091a(new jtk(this, str));
    }
}
