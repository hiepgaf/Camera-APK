package p000;

import com.google.googlex.gcam.DngColorCalibration.Illuminant;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* compiled from: PG */
/* renamed from: wj */
public final class wj {
    /* renamed from: a */
    public byte[] f9455a;
    /* renamed from: b */
    public int f9456b;
    /* renamed from: c */
    private String f9457c;

    public wj(int i) {
        this.f9457c = null;
        this.f9455a = new byte[i];
        this.f9456b = 0;
    }

    public wj(InputStream inputStream) {
        this.f9457c = null;
        this.f9456b = 0;
        this.f9455a = new byte[16384];
        while (true) {
            int read = inputStream.read(this.f9455a, this.f9456b, 16384);
            if (read > 0) {
                this.f9456b += read;
                if (read == 16384) {
                    m6132a(this.f9456b + 16384);
                } else {
                    return;
                }
            }
            return;
        }
    }

    public wj(byte[] bArr) {
        this.f9457c = null;
        this.f9455a = bArr;
        this.f9456b = bArr.length;
    }

    /* renamed from: a */
    public final void m6133a(byte[] bArr, int i) {
        m6132a(this.f9456b + i);
        System.arraycopy(bArr, 0, this.f9455a, this.f9456b, i);
        this.f9456b += i;
    }

    /* renamed from: a */
    public final void m6132a(int i) {
        Object obj = this.f9455a;
        int length = obj.length;
        if (i > length) {
            this.f9455a = new byte[(length + length)];
            System.arraycopy(obj, 0, this.f9455a, 0, length);
        }
    }

    /* renamed from: a */
    public final InputStream m6131a() {
        return new ByteArrayInputStream(this.f9455a, 0, this.f9456b);
    }

    /* renamed from: b */
    public final String m6134b() {
        if (this.f9457c == null) {
            int i = this.f9456b;
            if (i < 2) {
                this.f9457c = "UTF-8";
            } else {
                byte[] bArr = this.f9455a;
                byte b = bArr[0];
                if (b != (byte) 0) {
                    int i2 = b & Illuminant.kOther;
                    if (i2 < 128) {
                        if (bArr[1] != (byte) 0) {
                            this.f9457c = "UTF-8";
                        } else if (i < 4 || bArr[2] != (byte) 0) {
                            this.f9457c = "UTF-16LE";
                        } else {
                            this.f9457c = "UTF-32LE";
                        }
                    } else if (i2 == 239) {
                        this.f9457c = "UTF-8";
                    } else if (i2 == 254) {
                        this.f9457c = "UTF-16";
                    } else if (i < 4 || bArr[2] != (byte) 0) {
                        this.f9457c = "UTF-16";
                    } else {
                        this.f9457c = "UTF-32";
                    }
                } else if (i < 4 || bArr[1] != (byte) 0) {
                    this.f9457c = "UTF-16BE";
                } else if ((bArr[2] & Illuminant.kOther) == 254 && (bArr[3] & Illuminant.kOther) == Illuminant.kOther) {
                    this.f9457c = "UTF-32BE";
                } else {
                    this.f9457c = "UTF-32";
                }
            }
        }
        return this.f9457c;
    }
}
