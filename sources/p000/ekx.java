package p000;

import android.graphics.PointF;
import android.opengl.GLES20;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: ekx */
public final class ekx implements eky {
    /* renamed from: a */
    private ArrayList f15261a = new ArrayList();
    /* renamed from: b */
    private final float[] f15262b = new float[]{-0.893333f, -0.86f, -0.86f, -0.726667f, -0.706667f, -0.706667f, -0.66f, -0.66f, -0.403333f, -0.396667f, -0.396667f, -0.383333f, -0.383333f, -0.37f, -0.37f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.37f, 0.37f, 0.383333f, 0.383333f, 0.396667f, 0.396667f, 0.403333f, 0.66f, 0.66f, 0.706667f, 0.706667f, 0.726667f, 0.86f, 0.86f, 0.893333f, -0.893333f};
    /* renamed from: c */
    private final float[] f15263c = new float[]{0.0f, -0.366667f, 0.366667f, 0.0f, -0.38f, 0.38f, -0.663333f, 0.663333f, 0.0f, -0.393333f, 0.393333f, -0.71f, 0.71f, -0.863333f, 0.863333f, -0.943333f, -0.726667f, -0.403333f, 0.0f, 0.403333f, 0.726667f, 0.943333f, -0.863333f, 0.863333f, -0.71f, 0.71f, -0.393333f, 0.393333f, 0.0f, -0.663333f, 0.663333f, -0.38f, 0.38f, 0.0f, -0.366667f, 0.366667f, 0.0f, 0.0f};
    /* renamed from: d */
    private final float[] f15264d = new float[]{0.5f, 0.5f, 0.5f, 0.7f, 0.7f, 0.7f, 0.5f, 0.5f, 1.0f, 1.0f, 1.0f, 0.7f, 0.7f, 0.5f, 0.5f, 0.5f, 0.7f, 1.0f, 1.0f, 1.0f, 0.7f, 0.5f, 0.5f, 0.5f, 0.7f, 0.7f, 1.0f, 1.0f, 1.0f, 0.5f, 0.5f, 0.7f, 0.7f, 0.7f, 0.5f, 0.5f, 0.5f, 0.5f};

    /* renamed from: a */
    public final void mo1229a(float f, ekt ekt, float[] fArr, int i, int i2) {
        if (ekt != null) {
            int i3;
            float f2 = ((float) i) / 2.0f;
            float f3 = ((float) i2) / 2.0f;
            float min = 0.95f * Math.min(f2, f3);
            this.f15261a.clear();
            int length = this.f15262b.length;
            PointF pointF = new PointF();
            ejq ejq = ekt.f3840h;
            if (ejq == null) {
                i3 = 0;
            } else {
                GLES20.glUseProgram(ejq.f3693d);
                ekt.f3840h.m9745a(1.0f);
                i3 = 0;
            }
            while (i3 < length) {
                pointF.x = ((this.f15262b[i3] * f) * min) + f2;
                pointF.y = ((this.f15263c[i3] * f) * min) + f3;
                float f4 = this.f15264d[i3] * 0.4f;
                ejt ejt = ekt.f3837e;
                if (!(ejt == null || ekt.f3840h == null)) {
                    try {
                        ejt.m9720a(fArr, pointF.x, pointF.y, f4);
                    } catch (Throwable e) {
                        kqg.f8420a.mo2210b(e);
                    }
                }
                i3++;
            }
        }
    }
}
