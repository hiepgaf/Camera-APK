package p000;

/* compiled from: PG */
/* renamed from: ix */
public class ix implements iw {
    /* renamed from: a */
    private final Object[] f18640a;
    /* renamed from: b */
    private int f18641b;

    public ix(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f18640a = new Object[i];
    }

    /* renamed from: a */
    public Object mo341a() {
        int i = this.f18641b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f18640a;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.f18641b = i2;
        return obj;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public boolean mo342a(java.lang.Object r6) {
        /*
        r5 = this;
        r2 = 1;
        r1 = 0;
        r0 = r1;
    L_0x0003:
        r3 = r5.f18641b;
        if (r0 >= r3) goto L_0x0028;
    L_0x0007:
        r4 = r5.f18640a;
        r4 = r4[r0];
        if (r4 == r6) goto L_0x0010;
    L_0x000d:
        r0 = r0 + 1;
        goto L_0x0003;
    L_0x0010:
        r0 = r2;
    L_0x0011:
        if (r0 == 0) goto L_0x001b;
    L_0x0013:
        r0 = new java.lang.IllegalStateException;
        r1 = "Already in the pool!";
        r0.<init>(r1);
        throw r0;
    L_0x001b:
        r0 = r5.f18640a;
        r4 = r0.length;
        if (r3 >= r4) goto L_0x0027;
    L_0x0020:
        r0[r3] = r6;
        r0 = r3 + 1;
        r5.f18641b = r0;
        r1 = r2;
    L_0x0027:
        return r1;
    L_0x0028:
        r0 = r1;
        goto L_0x0011;
        */
        throw new UnsupportedOperationException("Method not decompiled: ix.a(java.lang.Object):boolean");
    }
}
