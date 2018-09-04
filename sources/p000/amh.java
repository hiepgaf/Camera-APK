package p000;

/* compiled from: PG */
/* renamed from: amh */
final class amh extends amf {
    amh() {
    }

    /* renamed from: a */
    public final int mo113a() {
        return go.f5569g;
    }

    /* renamed from: a */
    public final float mo112a(int i, int i2, int i3, int i4) {
        int i5 = 1;
        int ceil = (int) Math.ceil((double) Math.max(((float) i2) / ((float) i4), ((float) i) / ((float) i3)));
        int max = Math.max(1, Integer.highestOneBit(ceil));
        if (max >= ceil) {
            i5 = 0;
        }
        return 1.0f / ((float) (max << i5));
    }
}
