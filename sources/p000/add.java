package p000;

import android.util.Log;
import com.google.googlex.gcam.DngColorCalibration.Illuminant;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: add */
public final class add {
    /* renamed from: a */
    public final byte[] f313a = new byte[256];
    /* renamed from: b */
    public ByteBuffer f314b;
    /* renamed from: c */
    public adc f315c;
    /* renamed from: d */
    public int f316d = 0;

    /* renamed from: a */
    public final boolean m156a() {
        return this.f315c.f303b != 0;
    }

    /* renamed from: b */
    public final int m158b() {
        try {
            return this.f314b.get() & Illuminant.kOther;
        } catch (Exception e) {
            this.f315c.f303b = 1;
            return 0;
        }
    }

    /* renamed from: c */
    public final void m159c() {
        int i;
        Throwable e;
        int i2 = 0;
        this.f316d = m158b();
        if (this.f316d > 0) {
            i = 0;
            while (true) {
                try {
                    int i3 = this.f316d;
                    if (i < i3) {
                        i2 = i3 - i;
                        try {
                            this.f314b.get(this.f313a, i, i2);
                            i += i2;
                        } catch (Exception e2) {
                            e = e2;
                        }
                    } else {
                        return;
                    }
                } catch (Exception e3) {
                    e = e3;
                }
            }
        } else {
            return;
        }
        if (Log.isLoggable("GifHeaderParser", 3)) {
            int i4 = this.f316d;
            StringBuilder stringBuilder = new StringBuilder(76);
            stringBuilder.append("Error Reading Block n: ");
            stringBuilder.append(i);
            stringBuilder.append(" count: ");
            stringBuilder.append(i2);
            stringBuilder.append(" blockSize: ");
            stringBuilder.append(i4);
            Log.d("GifHeaderParser", stringBuilder.toString(), e);
        }
        this.f315c.f303b = 1;
    }

    /* renamed from: a */
    public final int[] m157a(int i) {
        int[] iArr;
        Throwable e;
        int i2 = 0;
        byte[] bArr = new byte[(i * 3)];
        try {
            this.f314b.get(bArr);
            iArr = new int[256];
            int i3 = 0;
            while (i3 < i) {
                int i4 = i2 + 1;
                try {
                    int i5 = bArr[i2] & Illuminant.kOther;
                    int i6 = i4 + 1;
                    int i7 = bArr[i4] & Illuminant.kOther;
                    i2 = i6 + 1;
                    i4 = i3 + 1;
                    iArr[i3] = (((i5 << 16) | -16777216) | (i7 << 8)) | (bArr[i6] & Illuminant.kOther);
                    i3 = i4;
                } catch (BufferUnderflowException e2) {
                    e = e2;
                }
            }
        } catch (BufferUnderflowException e3) {
            e = e3;
            iArr = null;
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e);
            }
            this.f315c.f303b = 1;
            return iArr;
        }
        return iArr;
    }

    /* renamed from: d */
    public final void m160d() {
        int b;
        do {
            b = m158b();
            this.f314b.position(Math.min(this.f314b.position() + b, this.f314b.limit()));
        } while (b > 0);
    }
}
