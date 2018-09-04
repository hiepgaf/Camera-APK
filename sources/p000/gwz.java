package p000;

import android.graphics.Paint;

/* compiled from: PG */
/* renamed from: gwz */
public abstract class gwz implements gzh {
    /* renamed from: a */
    public static final String f17515a = bli.m862a("FocusRingRenderer");
    /* renamed from: b */
    public final gzk f17516b;
    /* renamed from: c */
    public final Paint f17517c;
    /* renamed from: d */
    public final gzg f17518d;
    /* renamed from: e */
    public final gzn f17519e;
    /* renamed from: f */
    public final gzn f17520f;
    /* renamed from: g */
    public final float f17521g;
    /* renamed from: h */
    public final float f17522h;
    /* renamed from: i */
    public int f17523i;
    /* renamed from: j */
    public int f17524j;
    /* renamed from: k */
    public long f17525k = 0;
    /* renamed from: l */
    public long f17526l = 0;
    /* renamed from: m */
    public long f17527m = 0;
    /* renamed from: n */
    public int f17528n = go.bh;

    gwz(gzk gzk, Paint paint, float f) {
        this.f17516b = gzk;
        this.f17517c = paint;
        this.f17521g = f;
        this.f17522h = 80.0f;
        this.f17519e = gzo.f5867a;
        this.f17520f = gzo.f5868b;
        this.f17518d = new gzg();
    }

    /* renamed from: a */
    public final boolean mo1664a() {
        return this.f17528n != go.bh;
    }

    /* renamed from: b */
    public final boolean m11637b() {
        return this.f17528n == go.bk || this.f17528n == go.bl;
    }

    /* renamed from: a */
    public final void m11635a(long j, float f, float f2) {
        if (this.f17528n != go.bh) {
            bli.m863a(f17515a, "start() called while the ring was still focusing.");
        }
        this.f17518d.m2951b();
        gzg gzg = this.f17518d;
        gzg.f5854b = f;
        gzg.f5853a = f2;
        this.f17525k = j;
        this.f17528n = go.bi;
        this.f17516b.invalidate();
    }

    /* renamed from: a */
    public final void m11634a(long j) {
        if (this.f17518d.m2950a()) {
            this.f17518d.m2951b();
        }
        this.f17528n = go.bl;
        long j2 = this.f17525k;
        float f = this.f17521g;
        if (((float) j2) + f > ((float) j)) {
            j -= (long) (gzo.m2957a(this.f17519e, this.f17520f, ((float) (j - j2)) / f) * 64.0f);
        }
        this.f17527m = j;
    }
}
