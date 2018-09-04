package p000;

import android.graphics.Rect;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: ggr */
public abstract class ggr implements Runnable {
    /* renamed from: c */
    public final gfv f5163c;
    /* renamed from: d */
    public final Executor f5164d;
    /* renamed from: e */
    public final long f5165e;
    /* renamed from: f */
    public final int f5166f;
    /* renamed from: g */
    public final gfw f5167g;
    /* renamed from: h */
    public final get f5168h;

    static {
        bli.m862a("TaskImgContain");
    }

    public ggr(gfw gfw, Executor executor, gfv gfv, int i, get get) {
        this.f5167g = gfw;
        this.f5165e = this.f5167g.f5149b.mo2719f();
        this.f5164d = executor;
        this.f5163c = gfv;
        this.f5166f = i;
        this.f5168h = get;
    }

    public ggr(ggr ggr, int i) {
        this.f5165e = ggr.f5165e;
        this.f5164d = ggr.f5164d;
        this.f5163c = ggr.f5163c;
        this.f5166f = i;
        this.f5168h = ggr.f5168h;
        this.f5167g = null;
    }

    /* renamed from: a */
    public static Rect m2543a(int i, int i2, Rect rect) {
        if (rect == null) {
            return new Rect(0, 0, i, i2);
        }
        Rect rect2 = new Rect(rect);
        if (rect.top > rect.bottom || rect.left > rect.right || rect.width() <= 0 || rect.height() <= 0) {
            return new Rect(0, 0, 0, 0);
        }
        rect2.left = Math.max(rect2.left, 0);
        rect2.top = Math.max(rect2.top, 0);
        rect2.right = Math.max(Math.min(rect2.right, i), rect2.left);
        rect2.bottom = Math.max(Math.min(rect2.bottom, i2), rect2.top);
        if (rect2.width() <= 0 || rect2.height() <= 0) {
            return new Rect(0, 0, 0, 0);
        }
        return rect2;
    }

    /* renamed from: a */
    public static Rect m2545a(iwz iwz, Rect rect) {
        return ggr.m2543a(iwz.mo2720g(), iwz.mo2717d(), rect);
    }

    /* renamed from: a */
    public final void m2546a(long j, ggt ggt, int i) {
        this.f5163c.mo1477b().mo1415a(new ggu(j, ggt, i));
    }

    /* renamed from: a */
    protected static Rect m2544a(Rect rect, iqm iqm) {
        if (iqm == iqm.CLOCKWISE_0 || iqm == iqm.CLOCKWISE_180) {
            return new Rect(rect);
        }
        return new Rect(rect.top, rect.left, rect.bottom, rect.right);
    }
}
