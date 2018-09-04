package p000;

import java.util.NavigableMap;
import java.util.TreeMap;

/* compiled from: PG */
/* renamed from: ixv */
public final class ixv {
    /* renamed from: a */
    private final NavigableMap f7531a = khb.m4868a(ion.m3949a(new TreeMap(), this.f7532b, iqd.f18509a), null);
    /* renamed from: b */
    private final /* synthetic */ int f7532b = 9000;

    /* renamed from: a */
    public final void m4331a(float f, long j) {
        this.f7531a.put(Long.valueOf(j), Float.valueOf(f));
    }

    /* renamed from: a */
    public final Float m4330a(long j) {
        return (Float) this.f7531a.get(Long.valueOf(j));
    }
}
