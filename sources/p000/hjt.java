package p000;

import android.graphics.Point;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: PG */
/* renamed from: hjt */
public final class hjt {
    /* renamed from: a */
    private final MotionEvent f6278a;
    /* renamed from: b */
    private final View f6279b;

    public hjt(MotionEvent motionEvent, View view) {
        this.f6278a = motionEvent;
        this.f6279b = view;
    }

    /* renamed from: a */
    public final PointF m3210a() {
        int[] iArr = new int[2];
        this.f6279b.getLocationOnScreen(iArr);
        Point point = new Point(iArr[0], iArr[1]);
        return new PointF(this.f6278a.getRawX() - ((float) point.x), this.f6278a.getRawY() - ((float) point.y));
    }
}
