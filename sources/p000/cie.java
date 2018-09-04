package p000;

import java.util.Comparator;

/* compiled from: PG */
/* renamed from: cie */
final class cie implements Comparator {
    /* renamed from: a */
    private final iqp f2025a;

    public cie(iqp iqp) {
        this.f2025a = iqp;
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return (Math.abs(((iqp) obj).m4046a() - this.f2025a.m4046a()) > Math.abs(((iqp) obj2).m4046a() - this.f2025a.m4046a()) ? 1 : (Math.abs(((iqp) obj).m4046a() - this.f2025a.m4046a()) == Math.abs(((iqp) obj2).m4046a() - this.f2025a.m4046a()) ? 0 : -1));
    }
}
