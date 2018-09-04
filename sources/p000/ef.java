package p000;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;

/* compiled from: PG */
/* renamed from: ef */
final class ef extends Property {
    /* renamed from: a */
    private Rect f3572a = new Rect();

    ef(Class cls, String str) {
        super(cls, str);
    }

    public final /* synthetic */ Object get(Object obj) {
        ((Drawable) obj).copyBounds(this.f3572a);
        Rect rect = this.f3572a;
        return new PointF((float) rect.left, (float) rect.top);
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        Drawable drawable = (Drawable) obj;
        PointF pointF = (PointF) obj2;
        drawable.copyBounds(this.f3572a);
        this.f3572a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
        drawable.setBounds(this.f3572a);
    }
}
