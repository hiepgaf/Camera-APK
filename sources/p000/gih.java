package p000;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: gih */
public enum gih {
    INACTIVE(0),
    PASSIVE_SCAN(1),
    PASSIVE_FOCUSED(2),
    ACTIVE_SCAN(3),
    FOCUSED_LOCKED(4),
    NOT_FOCUSED_LOCKED(5),
    PASSIVE_UNFOCUSED(6);
    
    /* renamed from: h */
    public static final Map f5241h = null;
    /* renamed from: i */
    public final int f5243i;

    static {
        f5241h = new HashMap();
        gih[] values = gih.values();
        int length = values.length;
        int i;
        while (i < length) {
            gih gih = values[i];
            f5241h.put(Integer.valueOf(gih.f5243i), gih);
            i++;
        }
    }

    private gih(int i) {
        this.f5243i = i;
    }
}
