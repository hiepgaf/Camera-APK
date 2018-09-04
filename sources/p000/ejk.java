package p000;

/* compiled from: PG */
/* renamed from: ejk */
public final class ejk {
    /* renamed from: a */
    public float f3675a;
    /* renamed from: b */
    public float f3676b;
    /* renamed from: c */
    public float f3677c;

    static {
        ejk ejk = new ejk(0.0f, 0.0f, 0.0f);
    }

    public ejk(float f, float f2, float f3) {
        m1784a(f, f2, f3);
    }

    /* renamed from: a */
    public final void m1784a(float f, float f2, float f3) {
        this.f3675a = f;
        this.f3676b = f2;
        this.f3677c = f3;
    }

    public final String toString() {
        float f = this.f3675a;
        float f2 = this.f3676b;
        float f3 = this.f3677c;
        StringBuilder stringBuilder = new StringBuilder(49);
        stringBuilder.append(f);
        stringBuilder.append(", ");
        stringBuilder.append(f2);
        stringBuilder.append(", ");
        stringBuilder.append(f3);
        return stringBuilder.toString();
    }
}
