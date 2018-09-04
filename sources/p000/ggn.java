package p000;

import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: ggn */
public final class ggn extends ggx {
    /* renamed from: a */
    public static final String f21458a = bli.m862a("TaskCompMImg2Jpg");
    /* renamed from: b */
    private final ird f21459b;

    public ggn(gfw gfw, Executor executor, gfv gfv, get get, ird ird) {
        super(gfw, executor, gfv, go.aU, get);
        this.f21459b = ird;
    }

    public final void run() {
        this.f21459b.mo1903a(f21458a);
        gfw gfw = (gfw) jri.m13152b(this.g);
        ((grg) jri.m13152b(this.h.mo1482h())).mo1522b();
        if (gfw.f5149b.mo2716c() != 35) {
            this.c.mo1472a(gfw.f5149b, this.d);
            throw new IllegalArgumentException("Unsupported input image format for TaskCompressMarkedImageToJpeg");
        }
        ggt ggt = new ggt(this.g.f5150c, gfw.f5149b.mo2720g(), gfw.f5149b.mo2717d());
        ggt ggt2 = new ggt(this.g.f5150c, gfw.f5149b.mo2720g(), gfw.f5149b.mo2717d());
        byte[] bArr;
        try {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            m2546a(this.e, ggt2, go.aX);
            iwz iwz = gfw.f5149b;
            List e = iwz.mo2718e();
            ByteBuffer a = ((ixa) e.get(0)).mo637a();
            ByteBuffer a2 = ((ixa) e.get(1)).mo637a();
            ByteBuffer a3 = ((ixa) e.get(2)).mo637a();
            bArr = new byte[(a3.capacity() + (a.capacity() + a2.capacity()))];
            int g = iwz.mo2720g();
            int d = iwz.mo2717d();
            List e2 = iwz.mo2718e();
            ByteBuffer a4 = ((ixa) e2.get(0)).mo637a();
            ByteBuffer a5 = ((ixa) e2.get(1)).mo637a();
            ByteBuffer a6 = ((ixa) e2.get(2)).mo637a();
            int b = ((ixa) e2.get(0)).mo638b();
            int c = ((ixa) e2.get(0)).mo639c();
            int b2 = ((ixa) e2.get(1)).mo638b();
            int c2 = ((ixa) e2.get(1)).mo639c();
            int i6 = g * d;
            for (i = 0; i < g; i++) {
                for (i2 = 0; i2 < d; i2++) {
                    bArr[(i2 * g) + i] = a4.get((i * b) + (i2 * c));
                }
            }
            for (i2 = 0; i2 < d / 2; i2++) {
                for (i = 0; i < g / 2; i++) {
                    i3 = ((g * i2) + i6) + (i + i);
                    b = (i2 * c2) + (i * b2);
                    bArr[i3] = a6.get(b);
                    bArr[i3 + 1] = a5.get(b);
                }
            }
            r7 = new int[3];
            i = ggt.f5172c;
            r7[0] = i;
            r7[1] = i;
            r7[2] = i;
            i2 = gfw.f5149b.mo2720g();
            d = gfw.f5149b.mo2717d();
            i3 = i2 * d;
            for (i = 0; i < 20; i++) {
                for (i4 = 0; i4 < d / 2; i4++) {
                    i5 = ((i + i) + i3) + (i4 * i2);
                    bArr[i5] = (byte) -1;
                    bArr[i5 + 1] = (byte) -1;
                }
            }
            for (i4 = (i2 - 40) / 2; i4 < i2 / 2; i4++) {
                for (i = 0; i < d / 2; i++) {
                    i5 = ((i4 + i4) + i3) + (i * i2);
                    bArr[i5] = (byte) -1;
                    bArr[i5 + 1] = (byte) -1;
                }
            }
            for (i4 = 0; i4 < i2 / 2; i4++) {
                for (i = 0; i < 20; i++) {
                    i5 = ((i4 + i4) + i3) + (i * i2);
                    bArr[i5] = (byte) -1;
                    bArr[i5 + 1] = (byte) -1;
                }
            }
            for (i4 = 0; i4 < i2 / 2; i4++) {
                for (i = (d - 40) / 2; i < d / 2; i++) {
                    i5 = ((i4 + i4) + i3) + (i * i2);
                    bArr[i5] = (byte) -1;
                    bArr[i5 + 1] = (byte) -1;
                }
            }
            this.c.mo1474a((ggr) this, new ggo(this, go.aU, bArr, ggt, r7, ggt2, this.g.f5151d));
            this.f21459b.mo1904b();
        } finally {
            gfv gfv = this.c;
            gfw = gfw.f5149b;
            bArr = this.d;
            gfv.mo1472a((iwz) gfw, (Executor) bArr);
        }
    }
}
