package p000;

/* compiled from: PG */
/* renamed from: fxj */
public enum fxj {
    ON("on", go.aC),
    AUTO("auto", go.aB),
    OFF("off", go.aA);
    
    /* renamed from: d */
    public final String f4793d;
    /* renamed from: e */
    public final int f4794e;

    private fxj(String str, int i) {
        this.f4793d = str;
        this.f4794e = i;
    }

    /* renamed from: a */
    public static fxj m2412a(String str, fxj fxj) {
        jri.m13152b((Object) str);
        if (AUTO.f4793d.equals(str)) {
            return AUTO;
        }
        if (OFF.f4793d.equals(str)) {
            return OFF;
        }
        if (ON.f4793d.equals(str)) {
            return ON;
        }
        return fxj;
    }
}
