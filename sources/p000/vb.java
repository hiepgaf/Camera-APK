package p000;

/* compiled from: PG */
/* renamed from: vb */
public final class vb {
    /* renamed from: a */
    public int f9395a = 0;
    /* renamed from: b */
    public int f9396b = 0;
    /* renamed from: c */
    public int f9397c = kvl.UNSET_ENUM_VALUE;
    /* renamed from: d */
    public int f9398d = kvl.UNSET_ENUM_VALUE;
    /* renamed from: e */
    public int f9399e = 0;
    /* renamed from: f */
    public int f9400f = 0;
    /* renamed from: g */
    public boolean f9401g = false;
    /* renamed from: h */
    public boolean f9402h = false;

    /* renamed from: a */
    public final void m6038a(int i, int i2) {
        this.f9397c = i;
        this.f9398d = i2;
        this.f9402h = true;
        if (this.f9401g) {
            if (i2 != kvl.UNSET_ENUM_VALUE) {
                this.f9395a = i2;
            }
            if (i != kvl.UNSET_ENUM_VALUE) {
                this.f9396b = i;
                return;
            }
            return;
        }
        if (i != kvl.UNSET_ENUM_VALUE) {
            this.f9395a = i;
        }
        if (i2 != kvl.UNSET_ENUM_VALUE) {
            this.f9396b = i2;
        }
    }
}
