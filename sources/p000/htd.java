package p000;

/* renamed from: htd */
public final class htd {
    /* renamed from: b */
    private static int f6634b = 31;
    /* renamed from: a */
    public int f6635a = 1;

    /* renamed from: a */
    public final htd m3367a(Object obj) {
        this.f6635a = (obj != null ? obj.hashCode() : 0) + (this.f6635a * f6634b);
        return this;
    }

    /* renamed from: a */
    public final htd m3368a(boolean z) {
        this.f6635a = (f6634b * this.f6635a) + z;
        return this;
    }
}
