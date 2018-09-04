package p000;

import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* compiled from: PG */
/* renamed from: kvx */
final class kvx implements OnTouchListener {
    /* renamed from: a */
    private PointF f8717a = new PointF();
    /* renamed from: b */
    private final /* synthetic */ kvr f8718b;

    kvx(kvr kvr) {
        this.f8718b = kvr;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float f = 0.0f;
        this.f8718b.f8684k.onTouchEvent(motionEvent);
        this.f8718b.f8685l.onTouchEvent(motionEvent);
        PointF pointF = new PointF(motionEvent.getX(), motionEvent.getY());
        if (this.f8718b.f8676c == go.cf || this.f8718b.f8676c == go.cg || this.f8718b.f8676c == go.ci) {
            switch (motionEvent.getAction()) {
                case 0:
                    this.f8717a.set(pointF);
                    kvv kvv = this.f8718b.f8681h;
                    if (kvv != null) {
                        kvv.m5473a();
                    }
                    this.f8718b.f8676c = go.cg;
                    break;
                case 1:
                case 6:
                    this.f8718b.f8676c = go.cf;
                    break;
                case 2:
                    if (this.f8718b.f8676c == go.cg) {
                        float f2 = pointF.x;
                        PointF pointF2 = this.f8717a;
                        float f3 = pointF2.x;
                        float f4 = pointF.y;
                        float f5 = pointF2.y;
                        kvr kvr = this.f8718b;
                        f2 -= f3;
                        if (kvr.m5471d() <= ((float) kvr.f8682i)) {
                            f2 = 0.0f;
                        }
                        kvr kvr2 = this.f8718b;
                        f5 = f4 - f5;
                        if (kvr2.m5470c() > ((float) kvr2.f8683j)) {
                            f = f5;
                        }
                        this.f8718b.f8675b.postTranslate(f2, f);
                        this.f8718b.m5469b();
                        this.f8717a.set(pointF.x, pointF.y);
                        break;
                    }
                    break;
            }
        }
        kvr kvr3 = this.f8718b;
        kvr3.setImageMatrix(kvr3.f8675b);
        OnTouchListener onTouchListener = this.f8718b.f8686m;
        if (onTouchListener != null) {
            onTouchListener.onTouch(view, motionEvent);
        }
        return true;
    }
}
