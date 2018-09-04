package p000;

import com.google.googlex.gcam.DngColorCalibration.Illuminant;

/* compiled from: PG */
/* renamed from: ero */
final class ero implements erq {
    /* renamed from: a */
    private final byte[] f15430a;
    /* renamed from: b */
    private int f15431b = 0;

    ero(byte[] bArr) {
        this.f15430a = bArr;
    }

    public final void close() {
    }

    /* renamed from: a */
    public final int mo1269a() {
        int i = this.f15431b;
        byte[] bArr = this.f15430a;
        if (i >= bArr.length) {
            return -1;
        }
        this.f15431b = i + 1;
        return bArr[i] & Illuminant.kOther;
    }

    /* renamed from: a */
    public final eyo mo1271a(int i, int i2) {
        int min = Math.min(i, m9854b());
        eyo eyo = new eyo(this.f15430a, i2, this.f15431b, min);
        this.f15431b = min + this.f15431b;
        return eyo;
    }

    /* renamed from: a */
    public final eyo mo1270a(int i) {
        return mo1271a(this.f15430a.length - this.f15431b, i);
    }

    /* renamed from: b */
    private final int m9854b() {
        return this.f15430a.length - this.f15431b;
    }

    /* renamed from: b */
    public final void mo1272b(int i) {
        this.f15431b += Math.min(i, m9854b());
    }
}
