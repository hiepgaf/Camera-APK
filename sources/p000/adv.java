package p000;

import java.io.OutputStream;

/* compiled from: PG */
/* renamed from: adv */
public final class adv extends OutputStream {
    /* renamed from: a */
    private final OutputStream f340a;
    /* renamed from: b */
    private byte[] f341b;
    /* renamed from: c */
    private agu f342c;
    /* renamed from: d */
    private int f343d;

    public adv(OutputStream outputStream, agu agu) {
        this(outputStream, agu, (byte) 0);
    }

    private adv(OutputStream outputStream, agu agu, byte b) {
        this.f340a = outputStream;
        this.f342c = agu;
        this.f341b = (byte[]) agu.m258a(65536, byte[].class);
    }

    public final void close() {
        try {
            flush();
            Object obj = this.f341b;
            if (obj != null) {
                this.f342c.m262a(obj);
                this.f341b = null;
            }
        } finally {
            this.f340a.close();
        }
    }

    public final void flush() {
        m174a();
        this.f340a.flush();
    }

    /* renamed from: a */
    private final void m174a() {
        int i = this.f343d;
        if (i > 0) {
            this.f340a.write(this.f341b, 0, i);
            this.f343d = 0;
        }
    }

    /* renamed from: b */
    private final void m175b() {
        if (this.f343d == this.f341b.length) {
            m174a();
        }
    }

    public final void write(int i) {
        byte[] bArr = this.f341b;
        int i2 = this.f343d;
        this.f343d = i2 + 1;
        bArr[i2] = (byte) i;
        m175b();
    }

    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public final void write(byte[] bArr, int i, int i2) {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            int i6 = this.f343d;
            if (i6 != 0 || i4 < this.f341b.length) {
                i4 = Math.min(i4, this.f341b.length - i6);
                System.arraycopy(bArr, i5, this.f341b, this.f343d, i4);
                this.f343d += i4;
                i3 += i4;
                m175b();
            } else {
                this.f340a.write(bArr, i5, i4);
                return;
            }
        } while (i3 < i2);
    }
}
