package p000;

import android.animation.TypeEvaluator;

/* compiled from: PG */
/* renamed from: ds */
public final class ds implements TypeEvaluator {
    /* renamed from: a */
    private qt[] f3244a;

    public final /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        qt[] qtVarArr = (qt[]) obj;
        qt[] qtVarArr2 = (qt[]) obj2;
        if (qr.m5734a(qtVarArr, qtVarArr2)) {
            int i;
            qt[] qtVarArr3 = this.f3244a;
            if (qtVarArr3 == null || !qr.m5734a(qtVarArr3, qtVarArr)) {
                this.f3244a = qr.m5737a(qtVarArr);
                i = 0;
            } else {
                i = 0;
            }
            while (i < qtVarArr.length) {
                qt qtVar = this.f3244a[i];
                qt qtVar2 = qtVarArr[i];
                qt qtVar3 = qtVarArr2[i];
                int i2 = 0;
                while (true) {
                    float[] fArr = qtVar2.f9084b;
                    if (i2 >= fArr.length) {
                        break;
                    }
                    qtVar.f9084b[i2] = (fArr[i2] * (1.0f - f)) + (qtVar3.f9084b[i2] * f);
                    i2++;
                }
                i++;
            }
            return this.f3244a;
        }
        throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
    }
}
