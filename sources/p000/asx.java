package p000;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;

/* compiled from: PG */
/* renamed from: asx */
public final class asx {
    /* renamed from: a */
    public final ilp f950a;
    /* renamed from: b */
    public final irs f951b;
    /* renamed from: c */
    private final hig f952c;
    /* renamed from: d */
    private final hik f953d;
    /* renamed from: e */
    private final asn f954e;

    public asx(hig hig, hik hik, ilp ilp, irs irs, asn asn) {
        this.f952c = hig;
        this.f953d = hik;
        this.f950a = ilp;
        this.f951b = irs;
        this.f954e = asn;
    }

    /* renamed from: a */
    public final aub m687a(iut iut, PointF pointF, atc atc) {
        RectF a = this.f953d.mo1696a();
        hig hig = this.f952c;
        if (pointF.x < 0.0f || pointF.y < 0.0f) {
            String str = hig.f6226a;
            String valueOf = String.valueOf(pointF);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 22);
            stringBuilder.append("Negative focus point: ");
            stringBuilder.append(valueOf);
            bli.m873e(str, stringBuilder.toString());
        }
        float[] fArr = new float[]{hig.m3171a((pointF.x - a.left) / a.width()), hig.m3171a((pointF.y - a.top) / a.height())};
        int a2 = hig.f6227b.mo1448f().m4041a();
        Matrix matrix = new Matrix();
        matrix.setRotate((float) a2, 0.5f, 0.5f);
        matrix.mapPoints(fArr);
        if (iut == iut.FRONT) {
            fArr[0] = 1.0f - fArr[0];
        }
        aub a3 = this.f954e.mo363a(new asw(new PointF(fArr[0], fArr[1])));
        kow.m13622a(atc.mo351a(), new asz(this, pointF, a), kpq.f8410a);
        return a3;
    }
}
