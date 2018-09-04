package p000;

import android.os.SystemClock;
import java.util.LinkedList;

/* compiled from: PG */
/* renamed from: grk */
public final class grk {
    /* renamed from: a */
    public static final String f5650a = bli.m862a("GcamUsageStats");
    /* renamed from: b */
    public LinkedList f5651b = new LinkedList();
    /* renamed from: c */
    private final irs f5652c;

    public grk(irs irs) {
        this.f5652c = irs;
    }

    /* renamed from: a */
    public final void m2762a(grg grg) {
        this.f5651b.add(new epq(SystemClock.uptimeMillis(), this.f5651b.size()));
        this.f5652c.mo1575a(7, null, null, null);
        grg.mo1522b();
    }
}
