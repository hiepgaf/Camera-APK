package p000;

/* compiled from: PG */
/* renamed from: hqm */
public final class hqm extends kry implements ktg {
    /* renamed from: c */
    public static final hqm f23518c = new hqm();
    /* renamed from: g */
    private static volatile ktn f23519g;
    /* renamed from: a */
    public int f23520a;
    /* renamed from: b */
    public boolean f23521b;

    static {
        hqm hqm = f23518c;
        kry.f23437f.put(hqm.class, hqm);
    }

    private hqm() {
    }

    /* renamed from: a */
    protected final Object mo3571a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return new ktp(f23518c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007\u0000", new Object[]{"a", "b"});
            case 3:
                return new hqm();
            case 4:
                return new krz('\u0000');
            case 5:
                return f23518c;
            case 6:
                Object obj2 = f23519g;
                if (obj2 != null) {
                    return obj2;
                }
                synchronized (hqm.class) {
                    obj2 = f23519g;
                    if (obj2 == null) {
                        obj2 = new kqq((byte) 0);
                        f23519g = obj2;
                    }
                }
                return obj2;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
