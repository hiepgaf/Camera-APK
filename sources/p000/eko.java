package p000;

import android.opengl.GLES20;
import android.opengl.Matrix;
import com.google.android.apps.camera.legacy.lightcycle.panorama.LightCycle;
import java.util.Vector;

/* compiled from: PG */
/* renamed from: eko */
public final class eko extends ejn {
    /* renamed from: f */
    public Vector f15239f = new Vector();
    /* renamed from: g */
    private float[] f15240g = new float[16];
    /* renamed from: h */
    private float[] f15241h = new float[16];
    /* renamed from: i */
    private float[] f15242i = new float[16];
    /* renamed from: j */
    private float[] f15243j = new float[16];
    /* renamed from: k */
    private ejj f15244k = new ejj();
    /* renamed from: l */
    private ekn f15245l;
    /* renamed from: m */
    private elk f15246m;
    /* renamed from: n */
    private double f15247n = -1.0d;

    public eko(ekn ekn) {
        this.f15245l = ekn;
        try {
            this.f15246m = new elk();
            ejp.m1801a("photo collection");
        } catch (Throwable e) {
            kqg.f8420a.mo2210b(e);
        }
        Matrix.setIdentityM(this.f15242i, 0);
        Matrix.rotateM(this.f15242i, 0, 180.0f, 1.0f, 0.0f, 0.0f);
    }

    /* renamed from: c */
    public final int m9739c(float[] fArr) {
        ekp ekp = new ekp();
        ekp.f3811b = (float[]) fArr.clone();
        float[] fArr2 = ekp.f3811b;
        float[] fArr3 = ekp.f3810a;
        float[] fArr4 = this.f15241h;
        fArr4[0] = fArr2[0];
        fArr4[1] = fArr2[1];
        fArr4[2] = fArr2[2];
        fArr4[3] = 0.0f;
        fArr4[4] = fArr2[3];
        fArr4[5] = fArr2[4];
        fArr4[6] = fArr2[5];
        fArr4[7] = 0.0f;
        fArr4[8] = fArr2[6];
        fArr4[9] = fArr2[7];
        fArr4[10] = fArr2[8];
        fArr4[14] = 0.0f;
        fArr4[13] = 0.0f;
        fArr4[12] = 0.0f;
        fArr4[11] = 0.0f;
        fArr4[15] = 1.0f;
        Matrix.multiplyMM(this.f15240g, 0, this.f15242i, 0, fArr4, 0);
        Matrix.transposeM(fArr3, 0, this.f15240g, 0);
        ekp.f3814e = 0.1f;
        ekp.f3817h = new ejo(go.am);
        LightCycle.m1292a(ekp.f3817h.f3688a);
        ekp.f3818i = new ejo(go.am);
        this.f15239f.add(ekp);
        return ekp.f3818i.f3688a;
    }

    /* renamed from: b */
    public final void mo1228b(float[] fArr) {
        ejn ejn = this.f15245l;
        ejq ejq = ejn.f3685e;
        boolean z = ejn.f15237l;
        boolean z2 = ejn.f15238m;
        ejn.d.get(0);
        ejn = this.f15245l;
        ejn.f15237l = false;
        ejn.f15238m = true;
        ejn.f3685e = this.f15246m;
        double d = this.f15247n;
        if (d >= 0.0d) {
            this.f15247n = d + ((1.0d - d) * 0.05d);
            if (this.f15247n >= 0.95d) {
                this.f15247n = -1.0d;
            }
        }
        synchronized (this.f15239f) {
            for (int i = 0; i < this.f15239f.size(); i++) {
                ekp ekp = (ekp) this.f15239f.get(i);
                if (ekp.f3815f) {
                    float f;
                    float f2 = ekp.f3814e;
                    int i2 = ekp.f3816g;
                    float[] fArr2 = ekp.f3810a;
                    double d2 = this.f15247n;
                    if (d2 >= 0.0d) {
                        ejj ejj = ekp.f3812c;
                        ejj ejj2 = ekp.f3813d;
                        ejj ejj3 = this.f15244k;
                        double d3 = (ejj.f3674d * ejj2.f3674d) + (((ejj.f3671a * ejj2.f3671a) + (ejj.f3672b * ejj2.f3672b)) + (ejj.f3673c * ejj2.f3673c));
                        if (d3 > 1.0d || d3 < -1.0d) {
                            ejj3.m1783a(ejj2);
                        }
                        if (d3 < 0.0d) {
                            d3 = -d3;
                            d = -1.0d;
                        } else {
                            d = 1.0d;
                        }
                        d3 = Math.acos(d3);
                        if (d3 <= 1.0E-6d) {
                            ejj3.m1783a(ejj2);
                        } else {
                            double sin = 1.0d / Math.sin(d3);
                            double sin2 = Math.sin((1.0d - d2) * d3) * sin;
                            d = (d * Math.sin(d3 * d2)) * sin;
                            ejj3.f3671a = (ejj.f3671a * sin2) + (ejj2.f3671a * d);
                            ejj3.f3672b = (ejj.f3672b * sin2) + (ejj2.f3672b * d);
                            ejj3.f3673c = (ejj.f3673c * sin2) + (ejj2.f3673c * d);
                            ejj3.f3674d = (d * ejj2.f3674d) + (ejj.f3674d * sin2);
                        }
                        ejj ejj4 = this.f15244k;
                        fArr2 = this.f15241h;
                        float f3 = (float) ejj4.f3671a;
                        f = (float) ejj4.f3672b;
                        float f4 = (float) ejj4.f3673c;
                        float f5 = (float) ejj4.f3674d;
                        float f6 = f3 + f3;
                        float f7 = f + f;
                        float f8 = f4 + f4;
                        float f9 = f6 * f5;
                        float f10 = f7 * f5;
                        f5 *= f8;
                        f6 *= f3;
                        float f11 = f7 * f3;
                        f3 *= f8;
                        f7 *= f;
                        f *= f8;
                        f4 *= f8;
                        fArr2[0] = 1.0f - (f7 + f4);
                        fArr2[1] = f11 + f5;
                        fArr2[2] = f3 - f10;
                        fArr2[3] = 0.0f;
                        fArr2[4] = f11 - f5;
                        fArr2[5] = 1.0f - (f4 + f6);
                        fArr2[6] = f + f9;
                        fArr2[7] = 0.0f;
                        fArr2[8] = f3 + f10;
                        fArr2[9] = f - f9;
                        fArr2[10] = 1.0f - (f6 + f7);
                        fArr2[11] = 0.0f;
                        fArr2[12] = 0.0f;
                        fArr2[13] = 0.0f;
                        fArr2[14] = 0.0f;
                        fArr2[15] = 1.0f;
                    }
                    Matrix.multiplyMM(this.f15243j, 0, fArr, 0, fArr2, 0);
                    GLES20.glUseProgram(this.f15246m.f3693d);
                    int i3 = ekp.f3817h.f3688a;
                    int i4 = ekp.f3818i.f3688a;
                    if (i3 != -1) {
                        this.f15245l.m9734a(i3);
                        this.f15246m.m9747a(f2);
                        this.f15245l.mo3019a(this.f15243j);
                    } else if (i3 == -1) {
                        this.f15245l.m9734a(i4);
                        this.f15246m.m9747a(1.0f);
                        this.f15245l.mo3019a(this.f15243j);
                    } else {
                        f = (float) this.f15247n;
                        this.f15245l.m9734a(i3);
                        this.f15246m.m9747a(1.0f - f);
                        this.f15245l.mo3019a(this.f15243j);
                        GLES20.glUseProgram(this.f15246m.f3693d);
                        this.f15245l.m9734a(i4);
                        this.f15246m.m9747a(f);
                        this.f15245l.mo3019a(this.f15243j);
                    }
                    if (f2 < 1.0f) {
                        if (f2 > 0.99f) {
                            ekp.f3814e = 1.0f;
                        } else {
                            ekp.f3814e += (1.0f - f2) * 0.05f;
                        }
                    }
                    if (i2 < 500) {
                        ekp.f3816g++;
                    }
                }
            }
        }
        ejn = this.f15245l;
        ejn.f15237l = z;
        ejn.f15238m = z2;
        ejn.f3685e = ejq;
    }

    /* renamed from: a */
    public final void mo1227a() {
        for (int i = 0; i < this.f15239f.size(); i++) {
            ejo ejo = ((ekp) this.f15239f.get(i)).f3817h;
            if (ejo != null) {
                ejo.m1800d();
            }
            ejo = ((ekp) this.f15239f.get(i)).f3818i;
            if (ejo != null) {
                ejo.m1800d();
            }
        }
        this.f15239f.clear();
        ekn ekn = this.f15245l;
        if (ekn != null) {
            ekn.mo1227a();
        }
    }

    /* renamed from: a */
    public final void m9737a(int i, boolean z) {
        if (i < this.f15239f.size()) {
            ((ekp) this.f15239f.get(i)).f3815f = z;
        }
    }
}
