package p000;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: gif */
public enum gif {
    INACTIVE(0),
    SEARCHING(1),
    CONVERGED(2),
    LOCKED(3),
    FLASH_REQUIRED(4),
    PRECAPTURE(5);
    
    /* renamed from: b */
    public static final Map f5217b = null;
    /* renamed from: h */
    private final int f5224h;

    static {
        f5217b = new HashMap();
        gif[] values = gif.values();
        int length = values.length;
        int i;
        while (i < length) {
            gif gif = values[i];
            f5217b.put(Integer.valueOf(gif.f5224h), gif);
            i++;
        }
    }

    private gif(int i) {
        this.f5224h = i;
    }
}
