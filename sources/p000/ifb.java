package p000;

import android.content.Context;
import android.location.Location;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ifb */
public final class ifb {
    /* renamed from: a */
    public final ifi f6981a;
    /* renamed from: b */
    public final Map f6982b = new HashMap();
    /* renamed from: c */
    public final Map f6983c = new HashMap();
    /* renamed from: d */
    private final Context f6984d;

    public ifb(Context context, ifi ifi) {
        this.f6984d = context;
        this.f6981a = ifi;
    }

    /* renamed from: a */
    public final Location m3729a() {
        this.f6981a.f6985a.m3525o();
        try {
            return ((ifa) this.f6981a.f6985a.m3526p()).m3727a(this.f6984d.getPackageName());
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: a */
    final ifn m3730a(ieg ieg) {
        ifn ifn;
        synchronized (this.f6982b) {
            ifn = (ifn) this.f6982b.get(ieg.f6971b);
            if (ifn == null) {
                ifn = new ifn(ieg);
            }
            this.f6982b.put(ieg.f6971b, ifn);
        }
        return ifn;
    }
}
