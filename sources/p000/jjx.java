package p000;

/* compiled from: PG */
/* renamed from: jjx */
final class jjx implements Comparable {
    /* renamed from: a */
    public final int f7888a;
    /* renamed from: b */
    private final float f7889b;

    public jjx(float f, int i) {
        this.f7889b = f;
        this.f7888a = i;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        jjx jjx = (jjx) obj;
        float f = this.f7889b;
        float f2 = jjx.f7889b;
        if (f <= f2) {
            return f <= f2 ? 0 : 1;
        } else {
            return -1;
        }
    }
}
