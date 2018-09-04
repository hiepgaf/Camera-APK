package p000;

/* compiled from: PG */
/* renamed from: fxi */
public enum fxi {
    AUTO("auto", go.aB),
    OFF("off", go.aA),
    ON("on", go.aC);
    
    /* renamed from: d */
    public final String f4787d;
    /* renamed from: e */
    public final int f4788e;

    private fxi(String str, int i) {
        this.f4787d = str;
        this.f4788e = i;
    }

    /* renamed from: a */
    public static fxi m2411a(String str, fxi fxi) {
        jri.m13152b((Object) str);
        if (AUTO.f4787d.equals(str)) {
            return AUTO;
        }
        if (OFF.f4787d.equals(str)) {
            return OFF;
        }
        if (ON.f4787d.equals(str)) {
            return ON;
        }
        return fxi;
    }
}
