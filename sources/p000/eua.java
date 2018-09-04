package p000;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: eua */
public final class eua {
    /* renamed from: a */
    public final Object f4234a = new Object();
    /* renamed from: b */
    public final eun f4235b;
    /* renamed from: c */
    public final Executor f4236c;
    /* renamed from: d */
    public final List f4237d;
    /* renamed from: e */
    public final eue f4238e;
    /* renamed from: f */
    public final Map f4239f = new HashMap();
    /* renamed from: g */
    public volatile boolean f4240g = false;
    /* renamed from: h */
    public jgd f4241h;
    /* renamed from: i */
    private final kpw f4242i = kpw.m18056d();
    /* renamed from: j */
    private volatile boolean f4243j = false;

    public eua(List list, eue eue, eun eun, Executor executor) {
        this.f4237d = list;
        this.f4238e = eue;
        this.f4235b = eun;
        this.f4236c = executor;
        for (eux put : list) {
            this.f4239f.put(put, Boolean.valueOf(false));
        }
    }

    /* renamed from: a */
    final boolean m2117a() {
        for (eux eux : this.f4237d) {
            Boolean bool = (Boolean) this.f4239f.get(eux);
            if (bool == null) {
                String valueOf = String.valueOf(eux);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 27);
                stringBuilder.append("No running state found for ");
                stringBuilder.append(valueOf);
                throw new AssertionError(stringBuilder.toString());
            } else if (bool.booleanValue()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    final void m2118b() {
        if (!this.f4243j) {
            this.f4243j = true;
            jgd jgd = this.f4241h;
            if (jgd != null) {
                this.f4242i.mo3616b(jgd.m4462a());
            } else {
                this.f4242i.mo3557a(izg.f7590a);
            }
            this.f4242i.mo1985a(new eub(this), this.f4236c);
        }
    }

    /* renamed from: c */
    public final void m2119c() {
        synchronized (this.f4234a) {
            for (eux eux : this.f4237d) {
                this.f4239f.put(eux, Boolean.valueOf(true));
                eux.mo1299c();
            }
        }
    }

    /* renamed from: d */
    public final kpk m2120d() {
        synchronized (this.f4234a) {
            this.f4240g = true;
            if (m2117a()) {
                m2118b();
            }
        }
        for (eux b : this.f4237d) {
            b.mo1298b();
        }
        return this.f4242i;
    }
}
