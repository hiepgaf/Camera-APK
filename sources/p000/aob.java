package p000;

/* compiled from: PG */
/* renamed from: aob */
public final class aob extends anq implements agi {
    public aob(any any) {
        super(any);
    }

    /* renamed from: c */
    public final Class mo56c() {
        return any.class;
    }

    /* renamed from: d */
    public final int mo57d() {
        aod aod = ((any) this.a).f10102a.f796a;
        return arq.m646a(aod.m519a().getWidth(), aod.m519a().getHeight(), aod.m519a().getConfig()) + aod.f798a.mo14c();
    }

    /* renamed from: a */
    public final void mo103a() {
        ((any) this.a).m6869b().prepareToDraw();
    }

    /* renamed from: e */
    public final void mo58e() {
        ((any) this.a).stop();
        any any = (any) this.a;
        any.f10103b = true;
        aod aod = any.f10102a.f796a;
        aod.f799b.clear();
        aod.m524d();
        aod.f801d = false;
        aqs aqs = aod.f802e;
        if (aqs != null) {
            aod.f800c.m6283a(aqs);
            aod.f802e = null;
        }
        aqs = aod.f804g;
        if (aqs != null) {
            aod.f800c.m6283a(aqs);
            aod.f804g = null;
        }
        aqs = aod.f806i;
        if (aqs != null) {
            aod.f800c.m6283a(aqs);
            aod.f806i = null;
        }
        aod.f798a.mo13b();
        aod.f803f = true;
    }
}
