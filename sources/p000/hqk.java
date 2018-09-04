package p000;

/* compiled from: PG */
/* renamed from: hqk */
public final class hqk extends kry implements ktg {
    /* renamed from: c */
    public static final hqk f23514c = new hqk();
    /* renamed from: g */
    private static volatile ktn f23515g;
    /* renamed from: a */
    public int f23516a;
    /* renamed from: b */
    public int f23517b;

    static {
        hqk hqk = f23514c;
        kry.f23437f.put(hqk.class, hqk);
    }

    private hqk() {
    }

    /* renamed from: a */
    protected final Object mo3571a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return new ktp(f23514c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004\u0000", new Object[]{"a", "b"});
            case 3:
                return new hqk();
            case 4:
                return new krz((byte) 0);
            case 5:
                return f23514c;
            case 6:
                Object obj2 = f23515g;
                if (obj2 != null) {
                    return obj2;
                }
                synchronized (hqk.class) {
                    obj2 = f23515g;
                    if (obj2 == null) {
                        obj2 = new kqq((byte) 0);
                        f23515g = obj2;
                    }
                }
                return obj2;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
