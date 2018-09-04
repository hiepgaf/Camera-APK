package p000;

/* compiled from: PG */
/* renamed from: izc */
public final class izc {
    /* renamed from: a */
    public final byte[] f7584a;
    /* renamed from: b */
    public final int f7585b;
    /* renamed from: c */
    public final int f7586c;
    /* renamed from: d */
    public final int f7587d;

    public izc(byte[] bArr, int i, int i2, int i3) {
        boolean z;
        boolean z2 = true;
        if (i2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13144a(z, (Object) "offset must be >= 0");
        if (i3 > 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13144a(z, (Object) "length must be > 0");
        if (i3 > bArr.length) {
            z2 = false;
        }
        jri.m13144a(z2, (Object) "length exceeds data length");
        this.f7584a = bArr;
        this.f7587d = i;
        this.f7585b = i2;
        this.f7586c = i3;
    }
}
