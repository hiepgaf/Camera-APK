package p000;

import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.camera2.params.Face;

/* compiled from: PG */
/* renamed from: gic */
public final class gic {
    /* renamed from: a */
    public final Rect f5202a;
    /* renamed from: b */
    public final int f5203b;
    /* renamed from: c */
    public final Point f5204c;
    /* renamed from: d */
    public final Point f5205d;
    /* renamed from: e */
    public final Point f5206e;

    public gic(Rect rect, int i) {
        this(rect, i, null, null, null);
    }

    public gic(Rect rect, int i, Point point, Point point2, Point point3) {
        this.f5202a = rect;
        this.f5203b = i;
        this.f5204c = point;
        this.f5205d = point2;
        this.f5206e = point3;
    }

    /* renamed from: a */
    public static gic m2562a(Face face) {
        return new gic(face.getBounds(), face.getScore(), face.getLeftEyePosition(), face.getRightEyePosition(), face.getMouthPosition());
    }
}
