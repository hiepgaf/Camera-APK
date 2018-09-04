package p000;

/* compiled from: PG */
/* renamed from: ius */
public enum ius {
    FULL(2),
    SIMPLE(1),
    NONE(0);
    
    /* renamed from: d */
    public final int f7487d;

    private ius(int i) {
        this.f7487d = i;
    }

    /* renamed from: a */
    public static ius m4256a(int i) {
        switch (i) {
            case 1:
                return SIMPLE;
            case 2:
                return FULL;
            default:
                return NONE;
        }
    }
}
