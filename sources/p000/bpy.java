package p000;

/* compiled from: PG */
/* renamed from: bpy */
class bpy extends gqj {
    /* renamed from: a */
    private final /* synthetic */ bpx f20143a;

    bpy(bpx bpx) {
        this.f20143a = bpx;
        super((byte) 0);
    }

    /* renamed from: a */
    public void mo2698a(int i, int i2, float f) {
        boolean z;
        bqb bqb = this.f20143a.f20141d;
        bqb.f20151f = i;
        bqb.f20152g = i2 - i;
        bqb.f20153h = f;
        bpr bpr = bqb.f20146a.f2279a;
        if (i + i2 == 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13146a(z, "Expecting -minExposure to be equal to maxExposure, was [%s, %s]", i, i2);
        bpr.f1412s = (((int) (((float) i2) * f)) * 6) + 1;
    }

    /* renamed from: a */
    public final void mo1562a() {
        this.f20143a.f20138a.setVisibility(8);
    }

    /* renamed from: b */
    public final void mo1563b() {
        this.f20143a.f20138a.setVisibility(0);
    }
}
