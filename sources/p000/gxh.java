package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.google.googlex.gcam.DngColorCalibration.Illuminant;

/* compiled from: PG */
/* renamed from: gxh */
public final class gxh extends gwz {
    public gxh(gzk gzk, Paint paint) {
        super(gzk, paint, 0.0f);
    }

    /* renamed from: a */
    public final void mo3065a(long j, long j2, Canvas canvas) {
        float a = this.d.m2949a((float) j2);
        if (this.n != go.bh) {
            if (this.n == go.bi && ((float) j) > ((float) this.k) + this.g) {
                this.n = go.bj;
            }
            if (this.n == go.bj && !this.d.m2950a()) {
                this.n = go.bk;
                this.l = j;
            }
            if (this.n == go.bk && ((float) j) > ((float) this.l) + this.h) {
                this.n = go.bh;
            }
            if (this.n == go.bl && ((float) j) > ((float) this.m) + 64.0f) {
                this.n = go.bh;
            }
        }
        if (mo1664a()) {
            int a2;
            this.b.invalidate();
            if (this.n == go.bk) {
                a2 = (int) ((this.f.m2956a(gzj.m11685a(j, this.l, this.h)) * -255.0f) + 255.0f);
            } else if (this.n == go.bl) {
                a2 = (int) ((this.f.m2956a(gzj.m11685a(j, this.m, 64.0f)) * -255.0f) + 255.0f);
            } else if (this.n == go.bh) {
                a2 = 0;
            } else {
                a2 = Illuminant.kOther;
            }
            this.c.setAlpha(a2);
            canvas.drawCircle((float) this.f17523i, (float) this.f17524j, a, this.c);
        }
    }
}
