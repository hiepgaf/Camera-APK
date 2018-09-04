package p000;

/* compiled from: PG */
/* renamed from: amg */
final class amg extends amf {
    amg() {
    }

    /* renamed from: a */
    public final int mo113a() {
        return go.f5570h;
    }

    /* renamed from: a */
    public final float mo112a(int i, int i2, int i3, int i4) {
        int min = Math.min(i2 / i4, i / i3);
        if (min != 0) {
            return 1.0f / ((float) Integer.highestOneBit(min));
        }
        return 1.0f;
    }
}
