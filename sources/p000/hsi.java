package p000;

import android.support.v8.renderscript.Allocation;
import android.support.v8.renderscript.Element;
import android.support.v8.renderscript.RenderScript;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: hsi */
public final class hsi extends hsb {
    /* renamed from: d */
    public float f18102d;
    /* renamed from: e */
    public Allocation f18103e;
    /* renamed from: f */
    private float[] f18104f = new float[this.b];

    public hsi(int i, hrz hrz, RenderScript renderScript) {
        super(i, hrz, renderScript);
        int b = hrz.m3328b(i);
        this.f18102d = hrz.m3323a();
        for (int i2 = 0; i2 < b; i2++) {
            float a = hrz.m3326a(hrz.m3327a(i, i2));
            int i3 = ((int) a) + 1;
            int i4 = (i3 + i3) + 1;
            int i5 = i4 * i4;
            Object obj = new float[i5];
            Arrays.fill(obj, 0.0f);
            float f = a * a;
            float f2 = 0.0f;
            for (int i6 = 0; i6 < 5; i6++) {
                float f3 = (((float) i6) / 5.0f) - 11.2f;
                for (int i7 = 0; i7 < 5; i7++) {
                    float f4 = (((float) i7) / 5.0f) - 11.2f;
                    int i8 = 0;
                    while (i8 < i4) {
                        float f5 = ((float) (i8 - i3)) + f3;
                        float f6 = f2;
                        for (int i9 = 0; i9 < i4; i9++) {
                            float f7 = ((float) (i9 - i3)) + f4;
                            if ((f7 * f7) + (f5 * f5) <= f) {
                                int i10 = (i8 * i4) + i9;
                                obj[i10] = obj[i10] + 1.0f;
                                f6 += 1.0f;
                            }
                        }
                        i8++;
                        f2 = f6;
                    }
                }
            }
            for (int i11 = 0; i11 < i5; i11++) {
                obj[i11] = obj[i11] / f2;
            }
            System.arraycopy(obj, 0, this.f18104f, this.c.m11973a(i2), obj.length);
            this.f18102d = Math.min(this.f18102d, a);
        }
        this.f18103e = Allocation.createSized(renderScript, Element.F32(renderScript), this.f18104f.length);
        this.f18103e.copyFrom(this.f18104f);
    }
}
