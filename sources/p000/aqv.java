package p000;

/* compiled from: PG */
/* renamed from: aqv */
public final class aqv implements arc {
    /* renamed from: a */
    private final int f10161a;
    /* renamed from: b */
    private final boolean f10162b = false;
    /* renamed from: c */
    private aqx f10163c;

    public aqv(int i) {
        this.f10161a = i;
    }

    /* renamed from: a */
    public final ara mo338a(adf adf) {
        if (adf == adf.MEMORY_CACHE) {
            return aqy.f10166a;
        }
        if (this.f10163c == null) {
            this.f10163c = new aqx(this.f10161a, false);
        }
        return this.f10163c;
    }
}
