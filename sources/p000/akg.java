package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* renamed from: akg */
final class akg implements adw, adx {
    /* renamed from: a */
    private final List f9849a;
    /* renamed from: b */
    private final iw f9850b;
    /* renamed from: c */
    private int f9851c = 0;
    /* renamed from: d */
    private acg f9852d;
    /* renamed from: e */
    private adx f9853e;
    /* renamed from: f */
    private List f9854f;

    akg(List list, iw iwVar) {
        this.f9850b = iwVar;
        aqe.m587a((Collection) list);
        this.f9849a = list;
    }

    /* renamed from: b */
    public final void mo25b() {
        for (adw b : this.f9849a) {
            b.mo25b();
        }
    }

    /* renamed from: c */
    public final void mo26c() {
        List list = this.f9854f;
        if (list != null) {
            this.f9850b.mo342a(list);
        }
        this.f9854f = null;
        for (adw c : this.f9849a) {
            c.mo26c();
        }
    }

    /* renamed from: a */
    public final Class mo33a() {
        return ((adw) this.f9849a.get(0)).mo33a();
    }

    /* renamed from: d */
    public final adf mo27d() {
        return ((adw) this.f9849a.get(0)).mo27d();
    }

    /* renamed from: a */
    public final void mo24a(acg acg, adx adx) {
        this.f9852d = acg;
        this.f9853e = adx;
        this.f9854f = (List) this.f9850b.mo341a();
        ((adw) this.f9849a.get(this.f9851c)).mo24a(acg, this);
    }

    /* renamed from: a */
    public final void mo37a(Object obj) {
        if (obj != null) {
            this.f9853e.mo37a(obj);
        } else {
            m6552e();
        }
    }

    /* renamed from: a */
    public final void mo36a(Exception exception) {
        ((List) aqe.m585a(this.f9854f, "Argument must not be null")).add(exception);
        m6552e();
    }

    /* renamed from: e */
    private final void m6552e() {
        if (this.f9851c < this.f9849a.size() - 1) {
            this.f9851c++;
            mo24a(this.f9852d, this.f9853e);
            return;
        }
        aqe.m585a(this.f9854f, "Argument must not be null");
        this.f9853e.mo36a(new agg("Fetch failed", new ArrayList(this.f9854f)));
    }
}
