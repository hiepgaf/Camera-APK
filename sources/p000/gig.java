package p000;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: gig */
public enum gig {
    OFF(0),
    AUTO(1),
    MACRO(2),
    CONTINUOUS_VIDEO(3),
    CONTINUOUS_PICTURE(4),
    EDOF(5);
    
    /* renamed from: d */
    public static final Map f5228d = null;
    /* renamed from: e */
    public final int f5233e;

    static {
        f5228d = new HashMap();
        gig[] values = gig.values();
        int length = values.length;
        int i;
        while (i < length) {
            gig gig = values[i];
            f5228d.put(Integer.valueOf(gig.f5233e), gig);
            i++;
        }
    }

    private gig(int i) {
        this.f5233e = i;
    }
}
