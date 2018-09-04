package p000;

/* compiled from: PG */
/* renamed from: hqi */
public final class hqi extends kry implements ktg {
    /* renamed from: c */
    public static final hqi f23510c = new hqi();
    /* renamed from: g */
    private static volatile ktn f23511g;
    /* renamed from: a */
    public int f23512a;
    /* renamed from: b */
    public int f23513b;

    static {
        hqi hqi = f23510c;
        kry.f23437f.put(hqi.class, hqi);
    }

    private hqi() {
    }

    /* renamed from: a */
    protected final Object mo3571a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return new ktp(f23510c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004\u0000", new Object[]{"a", "b"});
            case 3:
                return new hqi();
            case 4:
                return new krz();
            case 5:
                return f23510c;
            case 6:
                Object obj2 = f23511g;
                if (obj2 != null) {
                    return obj2;
                }
                synchronized (hqi.class) {
                    obj2 = f23511g;
                    if (obj2 == null) {
                        obj2 = new kqq((byte) 0);
                        f23511g = obj2;
                    }
                }
                return obj2;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
