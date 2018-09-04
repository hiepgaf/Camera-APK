package p000;

/* compiled from: PG */
/* renamed from: hqg */
public final class hqg extends ksb implements ktg {
    /* renamed from: c */
    public static final hqg f23583c = new hqg();
    /* renamed from: i */
    private static volatile ktn f23584i;
    /* renamed from: a */
    public int f23585a;
    /* renamed from: b */
    public int f23586b;
    /* renamed from: h */
    private byte f23587h = (byte) 2;

    static {
        hqg hqg = f23583c;
        kry.f23437f.put(hqg.class, hqg);
    }

    private hqg() {
    }

    /* renamed from: a */
    protected final Object mo3571a(int i, Object obj) {
        byte b = (byte) 0;
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.f23587h);
            case 1:
                if (obj != null) {
                    b = (byte) 1;
                }
                this.f23587h = b;
                return null;
            case 2:
                return new ktp(f23583c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004\u0000", new Object[]{"a", "b"});
            case 3:
                return new hqg();
            case 4:
                return new ksa();
            case 5:
                return f23583c;
            case 6:
                Object obj2 = f23584i;
                if (obj2 != null) {
                    return obj2;
                }
                synchronized (hqg.class) {
                    obj2 = f23584i;
                    if (obj2 == null) {
                        obj2 = new kqq((byte) 0);
                        f23584i = obj2;
                    }
                }
                return obj2;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
