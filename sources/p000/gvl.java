package p000;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;

/* renamed from: gvl */
final /* synthetic */ class gvl implements iqt {
    /* renamed from: a */
    private final gvj f17428a;

    gvl(gvj gvj) {
        this.f17428a = gvj;
    }

    /* renamed from: a */
    public final void mo348a(Object obj) {
        gvj gvj = this.f17428a;
        PointF pointF = (PointF) obj;
        RectF a = gvj.f17417c.mo1696a();
        hig hig = gvj.f17416b;
        float[] fArr = new float[]{pointF.x, pointF.y};
        if (gvj.f17418d == iut.FRONT) {
            fArr[0] = 1.0f - fArr[0];
        }
        int a2 = hig.f6227b.mo1448f().m4041a();
        Matrix matrix = new Matrix();
        matrix.setRotate((float) (-a2), 0.5f, 0.5f);
        matrix.mapPoints(fArr);
        gvj.f17415a.mo2793b(new PointF(fArr[0] * a.width(), a.height() * fArr[1]));
    }
}
