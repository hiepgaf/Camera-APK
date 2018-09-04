package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jjs */
final class jjs implements jau {
    /* renamed from: a */
    public final jrg f18861a;
    /* renamed from: b */
    public final float f18862b;
    /* renamed from: c */
    public final jqo f18863c;
    /* renamed from: d */
    public final jqr f18864d;

    public jjs(jrg jrg, float f, jqo jqo, jqr jqr) {
        jri.m13152b((Object) jrg);
        jri.m13152b((Object) jqo);
        jri.m13152b((Object) jqr);
        this.f18861a = jrg;
        this.f18862b = f;
        this.f18863c = jqo;
        this.f18864d = jqr;
    }

    /* renamed from: a */
    public final /* synthetic */ jaq mo716a(Object obj, Executor executor) {
        obj = (jkq) obj;
        jri.m13152b(obj);
        return jli.m12948b(Long.valueOf(obj.f7895b)).mo1975a(executor, new jjt(this)).mo1973a(executor, new jju(this, obj));
    }
}
