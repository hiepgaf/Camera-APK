package p000;

import android.graphics.PointF;
import android.opengl.GLES20;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: elb */
public final class elb implements eky {
    /* renamed from: a */
    private static final float[] f15268a = new float[]{-0.5f, 0.0f, 0.5f, -0.5f, 0.0f, 0.5f, -0.5f, 0.0f, 0.5f};
    /* renamed from: b */
    private static final float[] f15269b = new float[]{-0.5f, -0.5f, -0.5f, 0.0f, 0.0f, 0.0f, 0.5f, 0.5f, 0.5f};
    /* renamed from: c */
    private final ArrayList f15270c = new ArrayList();

    /* renamed from: a */
    public final void mo1229a(float f, ekt ekt, float[] fArr, int i, int i2) {
        float f2;
        float f3;
        int i3;
        float f4 = ((float) i) / 2.0f;
        float f5 = ((float) i2) / 2.0f;
        float min = Math.min(f4, f5) * 0.95f;
        this.f15270c.clear();
        int length = f15268a.length;
        if (i > i2) {
            f2 = 1.3333334f;
        } else {
            f2 = 1.0f;
        }
        if (i > i2) {
            f3 = 1.0f;
        } else {
            f3 = 1.3333334f;
        }
        for (i3 = 0; i3 < length; i3++) {
            this.f15270c.add(new PointF((((f15268a[i3] * f) * min) * f2) + f4, (((f15269b[i3] * f) * min) * f3) + f5));
        }
        ArrayList arrayList = this.f15270c;
        if (arrayList != null) {
            ejq ejq = ekt.f3839g;
            if (ejq != null && ekt.f3837e != null) {
                GLES20.glUseProgram(ejq.f3693d);
                ekt.f3839g.m9746a(1.0f);
                i3 = 0;
                while (i3 < arrayList.size()) {
                    try {
                        PointF pointF = (PointF) arrayList.get(i3);
                        ejt ejt = ekt.f3837e;
                        if (ejt != null) {
                            ejt.m9720a(fArr, pointF.x, pointF.y, 0.4f);
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
