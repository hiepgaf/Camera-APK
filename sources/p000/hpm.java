package p000;

/* compiled from: PG */
/* renamed from: hpm */
class hpm extends hpe {
    /* renamed from: a */
    private final /* synthetic */ hpf f23321a;

    hpm(hpf hpf) {
        this.f23321a = hpf;
    }

    /* renamed from: a */
    public final void mo1562a() {
        boolean z;
        if (this.f23321a.f23317t != 0.0f) {
            z = true;
        } else {
            z = false;
        }
        jri.m13144a(z, (Object) "max zoom value hasn't been initialized properly");
        if (this.f23321a.f23318u != 0.0f) {
            z = true;
        } else {
            z = false;
        }
        jri.m13144a(z, (Object) "min zoom value hasn't been initialized properly");
        hpf hpf = this.f23321a;
        float f = hpf.f23318u;
        f *= (float) Math.sqrt((double) (hpf.f23317t / f));
        float floatValue = ((Float) this.f23321a.f23308k.mo2860b()).floatValue();
        hpf hpf2 = this.f23321a;
        float f2 = hpf2.f23318u;
        if (floatValue != f2) {
            f = f2;
        }
        if (f == f2) {
            hpf2.f23300a.mo1567a(9);
        } else {
            hpf2.f23300a.mo1567a(8);
        }
        this.f23321a.f23314q.setFloatValues(new float[]{((Float) hpf.f23308k.mo2860b()).floatValue(), f});
        this.f23321a.f23314q.start();
    }

    /* renamed from: b */
    public final void mo1563b() {
        this.f23321a.f23314q.cancel();
    }

    /* renamed from: e */
    public void mo2701e() {
        this.f23321a.f23311n.reverse();
    }

    public void aj() {
    }
}
