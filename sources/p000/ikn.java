package p000;

import com.google.googlex.gcam.DngColorCalibration.Illuminant;
import java.io.OutputStream;

/* compiled from: PG */
/* renamed from: ikn */
public abstract class ikn {
    /* renamed from: a */
    public final iqa f7060a;
    /* renamed from: b */
    public final OutputStream f7061b;
    /* renamed from: c */
    public int f7062c = 0;
    /* renamed from: d */
    public int f7063d = 0;
    /* renamed from: e */
    private int f7064e;
    /* renamed from: f */
    private int f7065f = 0;

    public ikn(OutputStream outputStream, iqa iqa) {
        this.f7061b = outputStream;
        this.f7060a = iqa;
        this.f7064e = 0;
    }

    /* renamed from: c */
    public abstract int mo1908c(int i);

    /* renamed from: a */
    public final void m3793a(int i, int i2) {
        if (this.f7060a.m4028a() < i || this.f7063d != 0 || this.f7062c != 0) {
            throw new iko(i, i2);
        }
    }

    /* renamed from: a */
    public final void m3792a() {
        if (this.f7063d != 0 || this.f7062c != 0) {
            throw new IllegalStateException("Can not read or write bytes while forwarding or skipping");
        }
    }

    /* renamed from: a */
    public final boolean m3797a(int i) {
        m3792a();
        if (this.f7060a.m4028a() >= i) {
            this.f7060a.m4030a(this.f7061b, i);
            return true;
        }
        this.f7063d = i - this.f7060a.m4028a();
        iqa iqa = this.f7060a;
        iqa.m4030a(this.f7061b, iqa.m4028a());
        return false;
    }

    /* renamed from: a */
    public final void m3796a(byte[] bArr, int i, int i2) {
        int i3 = this.f7062c;
        if (i3 < i2 && i3 >= 0) {
            int i4 = this.f7063d;
            if (i4 >= i2 || i4 < 0) {
                this.f7061b.write(bArr, i, i2);
                i3 = this.f7063d;
                if (i3 > 0) {
                    this.f7063d = i3 - i2;
                    return;
                }
                return;
            }
            if (i3 > 0) {
                i += i3;
                i2 -= i3;
                this.f7062c = 0;
            } else if (i4 > 0) {
                this.f7061b.write(bArr, i, i4);
                i3 = this.f7063d;
                i += i3;
                i2 -= i3;
                this.f7063d = 0;
            }
            iqa iqa = this.f7060a;
            iqa.m4029a(i2);
            System.arraycopy(bArr, i, iqa.f7312a, iqa.f7314c, i2);
            iqa.f7314c += i2;
            m3798b();
        } else if (i3 > 0) {
            this.f7062c = i3 - i2;
        }
    }

    /* renamed from: b */
    final void m3798b() {
        while (this.f7060a.m4028a() >= this.f7065f && this.f7063d == 0 && this.f7062c == 0) {
            try {
                this.f7065f = 0;
                this.f7064e = mo1908c(this.f7064e);
            } catch (iko e) {
                this.f7065f = e.f7066a;
                this.f7064e = e.f7067b;
                return;
            }
        }
    }

    /* renamed from: b */
    public final boolean m3799b(int i) {
        m3792a();
        if (this.f7060a.m4028a() >= i) {
            this.f7060a.m4031b(i);
            return true;
        }
        this.f7062c = i - this.f7060a.m4028a();
        iqa iqa = this.f7060a;
        iqa.m4031b(iqa.m4028a());
        return false;
    }

    /* renamed from: d */
    public final short m3801d(int i) {
        m3792a();
        m3793a(2, i);
        m3792a();
        iqa iqa = this.f7060a;
        int i2 = iqa.f7313b;
        if (i2 + 2 <= iqa.f7314c) {
            byte[] bArr = iqa.f7312a;
            iqa.f7313b = i2 + 1;
            byte b = bArr[i2];
            int i3 = iqa.f7313b;
            iqa.f7313b = i3 + 1;
            return (short) (((b & Illuminant.kOther) << 8) + (bArr[i3] & Illuminant.kOther));
        }
        throw new IllegalStateException("Byte queue is too short");
    }

    /* renamed from: a */
    public final void m3795a(byte[] bArr) {
        m3792a();
        this.f7061b.write(bArr);
    }

    /* renamed from: a */
    public final void m3794a(short s) {
        m3792a();
        this.f7061b.write((s >> 8) & Illuminant.kOther);
        this.f7061b.write(s & Illuminant.kOther);
    }
}
