package p000;

/* compiled from: PG */
/* renamed from: eyo */
public final class eyo implements eyt {
    /* renamed from: a */
    public final byte[] f15762a;
    /* renamed from: b */
    public final int f15763b;
    /* renamed from: c */
    public final int f15764c;
    /* renamed from: d */
    public final int f15765d;

    public eyo(byte[] bArr, int i, int i2, int i3) {
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
        this.f15762a = bArr;
        this.f15765d = i;
        this.f15763b = i2;
        this.f15764c = i3;
    }

    /* renamed from: a */
    public final long mo1319a() {
        eyv eyv = null;
        return eyv.mo1319a();
    }

    /* renamed from: a */
    public final void mo1320a(eyu eyu) {
        eyv eyv = null;
        eyv.mo1320a(new eyp(this, eyu));
    }
}
