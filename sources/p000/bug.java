package p000;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: bug */
public class bug {
    /* renamed from: a */
    public final buh f1595a;
    /* renamed from: b */
    public final Map f1596b;

    /* renamed from: a */
    public buf mo1133a(Class cls) {
        return (buf) this.f1596b.get(cls);
    }

    /* renamed from: a */
    public buh m987a() {
        return this.f1595a;
    }

    /* renamed from: b */
    public bug mo1134b() {
        return null;
    }

    /* renamed from: c */
    public void mo2953c() {
    }

    public bug(bug bug) {
        this(bug.m987a());
    }

    public bug(buh buh) {
        this.f1595a = buh;
        this.f1596b = new HashMap();
    }

    /* renamed from: d */
    public iqo m991d() {
        return this.f1595a.mo572a();
    }

    /* renamed from: a */
    public void m988a(Class cls, buf buf) {
        this.f1596b.put(cls, buf);
    }
}
