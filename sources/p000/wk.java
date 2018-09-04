package p000;

import java.io.OutputStream;

/* compiled from: PG */
/* renamed from: wk */
public final class wk extends OutputStream {
    /* renamed from: a */
    public int f9458a = 0;
    /* renamed from: b */
    private final OutputStream f9459b;

    public wk(OutputStream outputStream) {
        this.f9459b = outputStream;
    }

    public final void write(int i) {
        this.f9459b.write(i);
        this.f9458a++;
    }

    public final void write(byte[] bArr) {
        this.f9459b.write(bArr);
        this.f9458a += bArr.length;
    }

    public final void write(byte[] bArr, int i, int i2) {
        this.f9459b.write(bArr, i, i2);
        this.f9458a += i2;
    }
}
