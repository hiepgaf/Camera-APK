package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jsy */
public final class jsy implements jau {
    /* renamed from: a */
    private final jqo f19016a;
    /* renamed from: b */
    private final /* synthetic */ jsw f19017b;

    public jsy(jsw jsw, jqo jqo) {
        this.f19017b = jsw;
        this.f19016a = jqo;
    }

    /* renamed from: a */
    public final /* synthetic */ jaq mo716a(Object obj, Executor executor) {
        Long l = (Long) obj;
        return this.f19017b.f7954d.m13130b(l.longValue()).mo1973a(executor, new jsz(this.f19017b, l.longValue(), this.f19016a));
    }
}
