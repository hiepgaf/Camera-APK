package p000;

import android.graphics.PointF;
import com.google.android.libraries.smartburst.filterfw.decoder.MediaDecoder;

/* compiled from: PG */
/* renamed from: fdw */
public final class fdw {
    /* renamed from: a */
    private final int f4492a;

    public fdw(int i) {
        this.f4492a = i;
    }

    /* renamed from: a */
    public final PointF m2264a(PointF pointF) {
        switch (this.f4492a) {
            case 0:
                return pointF;
            case 90:
                return new PointF(pointF.y, 1.0f - pointF.x);
            case MediaDecoder.ROTATE_180 /*180*/:
                return new PointF(1.0f - pointF.x, 1.0f - pointF.y);
            case MediaDecoder.ROTATE_90_LEFT /*270*/:
                return new PointF(1.0f - pointF.y, pointF.x);
            default:
                throw new IllegalArgumentException("Unsupported Sensor Orientation");
        }
    }

    /* renamed from: b */
    public final PointF m2265b(PointF pointF) {
        switch (this.f4492a) {
            case 0:
                return pointF;
            case 90:
                return new PointF(1.0f - pointF.y, pointF.x);
            case MediaDecoder.ROTATE_180 /*180*/:
                return new PointF(1.0f - pointF.x, 1.0f - pointF.y);
            case MediaDecoder.ROTATE_90_LEFT /*270*/:
                return new PointF(pointF.y, 1.0f - pointF.x);
            default:
                throw new IllegalArgumentException("Unsupported Sensor Orientation");
        }
    }
}
