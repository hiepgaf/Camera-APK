package p000;

import com.google.googlex.gcam.DngColorCalibration.Illuminant;
import java.io.Closeable;

/* compiled from: PG */
/* renamed from: izd */
public final class izd implements Closeable {
    /* renamed from: a */
    public final byte[] f7588a;
    /* renamed from: b */
    public int f7589b = 0;

    public izd(byte[] bArr) {
        this.f7588a = bArr;
    }

    public final void close() {
    }

    /* renamed from: a */
    public final int m4362a() {
        int i = this.f7589b;
        byte[] bArr = this.f7588a;
        if (i >= bArr.length) {
            return -1;
        }
        this.f7589b = i + 1;
        return bArr[i] & Illuminant.kOther;
    }

    /* renamed from: a */
    public final izc m4363a(int i, int i2) {
        int min = Math.min(i, m4364b());
        izc izc = new izc(this.f7588a, i2, this.f7589b, min);
        this.f7589b = min + this.f7589b;
        return izc;
    }

    /* renamed from: b */
    public final int m4364b() {
        return this.f7588a.length - this.f7589b;
    }
}
