package p000;

/* compiled from: PG */
/* renamed from: hqp */
public final class hqp extends ksb implements ktg {
    /* renamed from: c */
    public static final hqp f23588c = new hqp();
    /* renamed from: i */
    private static volatile ktn f23589i;
    /* renamed from: a */
    public int f23590a;
    /* renamed from: b */
    public int f23591b;
    /* renamed from: h */
    private byte f23592h = (byte) 2;

    static {
        hqp hqp = f23588c;
        kry.f23437f.put(hqp.class, hqp);
    }

    private hqp() {
    }

    /* renamed from: a */
    protected final Object mo3571a(int i, Object obj) {
        byte b = (byte) 0;
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.f23592h);
            case 1:
                if (obj != null) {
                    b = (byte) 1;
                }
                this.f23592h = b;
                return null;
            case 2:
                return new ktp(f23588c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004\u0000", new Object[]{"a", "b"});
            case 3:
                return new hqp();
            case 4:
                return new ksa((byte) 0);
            case 5:
                return f23588c;
            case 6:
                Object obj2 = f23589i;
                if (obj2 != null) {
                    return obj2;
                }
                synchronized (hqp.class) {
                    obj2 = f23589i;
                    if (obj2 == null) {
                        obj2 = new kqq((byte) 0);
                        f23589i = obj2;
                    }
                }
                return obj2;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
