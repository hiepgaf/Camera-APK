package p000;

/* compiled from: PG */
/* renamed from: jzc */
public final class jzc extends jzf {
    /* renamed from: a */
    private final float f19128a;

    public jzc(float f) {
        this.f19128a = f;
    }

    /* renamed from: a */
    private final int m13351a(jzf jzf) {
        if (this == jzf) {
            return 0;
        }
        float f = ((jzc) jzf).f19128a;
        float f2 = this.f19128a;
        if (f2 < f) {
            return -1;
        }
        if (f2 > f) {
            return 1;
        }
        return 0;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return m13351a((jzf) obj);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if ((obj instanceof jzf) && m13351a((jzf) obj) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final float mo2076a() {
        return this.f19128a;
    }
}
