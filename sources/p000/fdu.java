package p000;

import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.params.MeteringRectangle;

/* compiled from: PG */
/* renamed from: fdu */
public final class fdu {
    /* renamed from: a */
    private final fdw f4491a;

    public fdu(fdw fdw) {
        this.f4491a = fdw;
    }

    /* renamed from: a */
    public final PointF m2263a(MeteringRectangle meteringRectangle, Rect rect) {
        PointF pointF = new PointF(meteringRectangle.getRect().exactCenterX(), meteringRectangle.getRect().exactCenterY());
        return this.f4491a.m2265b(new PointF((pointF.x - ((float) rect.left)) / ((float) rect.width()), (pointF.y - ((float) rect.top)) / ((float) rect.height())));
    }
}
