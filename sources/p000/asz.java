package p000;

import android.graphics.PointF;
import android.graphics.RectF;

/* compiled from: PG */
/* renamed from: asz */
final class asz implements kov {
    /* renamed from: a */
    private final /* synthetic */ PointF f10193a;
    /* renamed from: b */
    private final /* synthetic */ RectF f10194b;
    /* renamed from: c */
    private final /* synthetic */ asx f10195c;

    asz(asx asx, PointF pointF, RectF rectF) {
        this.f10195c = asx;
        this.f10193a = pointF;
        this.f10194b = rectF;
    }

    /* renamed from: a */
    public final void mo349a(Throwable th) {
    }

    public final /* synthetic */ void b_(Object obj) {
        Boolean bool = (Boolean) obj;
        if (((Float) this.f10195c.f950a.mo2860b()).floatValue() == 1.0f) {
            PointF pointF = this.f10193a;
            float f = pointF.x;
            RectF rectF = this.f10194b;
            this.f10195c.f951b.mo1582a(new hin(f - rectF.left, pointF.y - rectF.top, rectF.width(), this.f10194b.height()), null, bool.booleanValue());
        }
    }
}
