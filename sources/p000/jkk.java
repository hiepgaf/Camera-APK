package p000;

import java.io.Writer;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jkk */
public final class jkk implements jiq {
    /* renamed from: a */
    public final Writer f18882a;
    /* renamed from: b */
    public final String f18883b;
    /* renamed from: c */
    private final jiq f18884c;

    public jkk(jiq jiq, String str, Writer writer) {
        this.f18884c = jiq;
        this.f18883b = str;
        this.f18882a = writer;
    }

    /* renamed from: a */
    public final int mo2011a() {
        return this.f18884c.mo2011a();
    }

    /* renamed from: b */
    public final String mo2012b() {
        return this.f18884c.mo2012b();
    }

    /* renamed from: a */
    public final jaq mo2013a(juh juh, Executor executor) {
        jaq a = this.f18884c.mo2013a(juh, executor);
        a.mo1973a(jlk.f7915a, new jkl(this, juh)).mo1980a(izw.f18704a);
        return a;
    }
}
