package p000;

import android.opengl.GLES20;
import android.opengl.Matrix;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: ela */
public final class ela implements eky {
    /* renamed from: a */
    private boolean f15265a = true;
    /* renamed from: b */
    private ArrayList f15266b = new ArrayList();
    /* renamed from: c */
    private float[] f15267c = new float[16];

    public ela(boolean z) {
        this.f15265a = z;
        Matrix.setIdentityM(this.f15267c, 0);
    }

    /* renamed from: a */
    public final void mo1229a(float f, ekt ekt, float[] fArr, int i, int i2) {
        int i3;
        ArrayList arrayList = this.f15266b;
        if (arrayList != null) {
            float f2;
            float f3;
            arrayList.clear();
            float f4 = f * 20.0f;
            boolean z = this.f15265a;
            if (z) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            if (z) {
                f3 = 0.0f;
            } else {
                f3 = 1.0f;
            }
            i3 = 0;
            int i4 = -2;
            while (i4 <= 2) {
                int i5;
                if (i4 == 0) {
                    i5 = i3;
                } else {
                    Object obj = new float[16];
                    Matrix.setIdentityM(obj, 0);
                    Matrix.rotateM(obj, 0, ((float) i4) * f4, f3, f2, 0.0f);
                    int i6 = i3 + 1;
                    arrayList.add(i3, obj);
                    i5 = i6;
                }
                i4++;
                i3 = i5;
            }
        }
        if (ekt != null) {
            float[] fArr2 = this.f15267c;
            arrayList = this.f15266b;
            if (arrayList != null) {
                ejq ejq = ekt.f3839g;
                if (ejq != null && ekt.f3837e != null) {
                    GLES20.glUseProgram(ejq.f3693d);
                    ekt.f3839g.m9746a(1.0f);
                    i3 = 0;
                    while (i3 < arrayList.size()) {
                        try {
                            float[] fArr3 = (float[]) arrayList.get(i3);
                            ejt ejt = ekt.f3837e;
                            Matrix.multiplyMM(ekt.f3843k, 0, fArr2, 0, fArr3, 0);
                            Matrix.multiplyMV(ekt.f3842j, 0, ekt.f3843k, 0, ekt.f3841i, 0);
                            ekt.m1842b(ekt.f3842j);
                            float[] fArr4 = ekt.f3842j;
                            float f5 = fArr4[0];
                            float f6 = ekt.f3845m;
                            f5 = (f5 * f6) + f6;
                            float f7 = fArr4[1];
                            f6 = ekt.f3846n;
                            f7 = (f7 * f6) + f6;
                            if (ejt != null) {
                                ejt.m9720a(fArr, f5, f7, 0.4f);
                            }
                            i3++;
                        } catch (Throwable e) {
                            kqg.f8420a.mo2210b(e);
                            return;
                        }
                    }
                }
            }
        }
    }
}
