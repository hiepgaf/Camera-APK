package p000;

/* compiled from: PG */
/* renamed from: jmr */
public enum jmr {
    FIXED_FPS,
    SMART_BURST,
    HYBRID_BURST;

    /* renamed from: a */
    public final boolean m4593a() {
        return this == SMART_BURST || this == HYBRID_BURST;
    }
}
