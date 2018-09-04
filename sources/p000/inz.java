package p000;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: inz */
public enum inz {
    QUALITY_480P(2002, ine.RES_480P),
    QUALITY_720P(2003, ine.RES_720P),
    QUALITY_1080P(2004, ine.RES_1080P),
    QUALITY_2160P(2005, ine.RES_2160P);
    
    /* renamed from: f */
    private static final Map f7186f = null;
    /* renamed from: g */
    private static final Map f7187g = null;
    /* renamed from: a */
    public final int f7189a;
    /* renamed from: h */
    private final ine f7190h;

    static {
        f7186f = new HashMap();
        f7187g = new HashMap();
        inz[] values = inz.values();
        int length = values.length;
        int i;
        while (i < length) {
            inz inz = values[i];
            f7186f.put(inz.f7190h, inz);
            f7187g.put(Integer.valueOf(inz.f7189a), inz);
            i++;
        }
    }

    private inz(int i, ine ine) {
        this.f7189a = i;
        this.f7190h = ine;
    }

    /* renamed from: a */
    public static inz m3902a(ine ine) {
        return (inz) f7186f.get(ine);
    }
}
