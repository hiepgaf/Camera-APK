package p000;

import java.util.List;

/* compiled from: PG */
/* renamed from: fhj */
public final class fhj implements fhh {
    /* renamed from: a */
    private boolean f21356a = false;
    /* renamed from: b */
    private final fyr f21357b;
    /* renamed from: c */
    private final /* synthetic */ fhi f21358c;

    fhj(fhi fhi, fyr fyr) {
        this.f21358c = fhi;
        this.f21357b = fyr;
    }

    public final void close() {
        if (!this.f21356a) {
            this.f21356a = true;
            this.f21357b.close();
        }
    }

    /* renamed from: a */
    public final void mo1381a(List list, fiv fiv) {
        jri.m13154b(this.f21356a ^ 1, (Object) "submitRequest() cannot be used after the Session is closed");
        this.f21358c.f16021a.mo1381a(list, fiv);
    }
}
