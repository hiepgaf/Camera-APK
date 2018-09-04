package p000;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: iob */
public enum iob {
    QUALITY_QCIF(2, ine.RES_QCIF),
    QUALITY_QVGA(7, ine.RES_QVGA),
    QUALITY_CIF(3, ine.RES_CIF),
    QUALITY_480P(4, ine.RES_480P),
    QUALITY_720P(5, ine.RES_720P),
    QUALITY_1080P(6, ine.RES_1080P),
    QUALITY_2160P(8, ine.RES_2160P);
    
    /* renamed from: j */
    private static final Map f7205j = null;
    /* renamed from: k */
    private static final Map f7206k = null;
    /* renamed from: a */
    public final int f7208a;
    /* renamed from: b */
    public final ine f7209b;

    static {
        f7205j = new HashMap();
        f7206k = new HashMap();
        iob[] values = iob.values();
        int length = values.length;
        int i;
        while (i < length) {
            iob iob = values[i];
            f7205j.put(iob.f7209b, iob);
            f7206k.put(Integer.valueOf(iob.f7208a), iob);
            i++;
        }
    }

    private iob(int i, ine ine) {
        this.f7208a = i;
        this.f7209b = ine;
    }

    /* renamed from: a */
    public static iob m3918a(ine ine) {
        return (iob) f7205j.get(ine);
    }
}
