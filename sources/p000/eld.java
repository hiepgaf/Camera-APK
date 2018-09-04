package p000;

import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.os.HandlerThread;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: eld */
public final class eld {
    /* renamed from: a */
    public static final String f3900a = bli.m862a("SensorReader");
    /* renamed from: b */
    public boolean f3901b = true;
    /* renamed from: c */
    public bah f3902c;
    /* renamed from: d */
    public SensorManager f3903d = null;
    /* renamed from: e */
    public ejk f3904e = new ejk();
    /* renamed from: f */
    public ejk f3905f = new ejk();
    /* renamed from: g */
    public boolean f3906g = false;
    /* renamed from: h */
    public float f3907h = 0.15f;
    /* renamed from: i */
    public float[] f3908i = new float[3];
    /* renamed from: j */
    public long f3909j = 0;
    /* renamed from: k */
    public float[] f3910k = new float[3];
    /* renamed from: l */
    public float[] f3911l = new float[]{0.0f, 0.0f, 0.0f};
    /* renamed from: m */
    public int f3912m = 0;
    /* renamed from: n */
    public elc f3913n = new elc();
    /* renamed from: o */
    public float f3914o = 90.0f;
    /* renamed from: p */
    public emc f3915p = null;
    /* renamed from: q */
    public float f3916q = 0.0f;
    /* renamed from: r */
    public boolean f3917r = false;
    /* renamed from: s */
    public HandlerThread f3918s;
    /* renamed from: t */
    public final SensorEventListener f3919t = new elf(this);
    /* renamed from: u */
    private float[] f3920u = new float[16];
    /* renamed from: v */
    private double[] f3921v = new double[16];

    public eld(bah bah) {
        this.f3902c = bah;
    }

    /* renamed from: a */
    public static float[] m1855a(float[] fArr) {
        return new float[]{fArr[0], fArr[1], fArr[2], fArr[4], fArr[5], fArr[6], fArr[8], fArr[9], fArr[10]};
    }

    /* renamed from: a */
    public final float[] m1857a() {
        float[] fArr;
        synchronized (this) {
            fArr = (float[]) this.f3910k.clone();
            float[] fArr2 = this.f3910k;
            fArr2[0] = 0.0f;
            fArr2[1] = 0.0f;
            fArr2[2] = 0.0f;
            this.f3912m = 0;
        }
        return fArr;
    }

    /* renamed from: b */
    public final float[] m1858b() {
        int i;
        elc elc = this.f3913n;
        if (elc.f3876c != 0) {
            for (i = 0; i < 3; i++) {
                for (int i2 = 0; i2 < 3; i2++) {
                    elc.f3874a[(i2 << 2) + i] = elc.f3875b.m1774a(i, i2);
                }
            }
            double[] dArr = elc.f3874a;
            dArr[11] = 0.0d;
            dArr[7] = 0.0d;
            dArr[3] = 0.0d;
            dArr[14] = 0.0d;
            dArr[13] = 0.0d;
            dArr[12] = 0.0d;
            dArr[15] = 1.0d;
            this.f3921v = dArr;
        }
        float[] fArr = new float[16];
        for (i = 0; i < 16; i++) {
            fArr[i] = (float) this.f3921v[i];
        }
        Matrix.rotateM(fArr, 0, 90.0f, 1.0f, 0.0f, 0.0f);
        float[] fArr2 = new float[16];
        Matrix.setIdentityM(fArr2, 0);
        Matrix.rotateM(fArr2, 0, this.f3914o, 0.0f, 0.0f, 1.0f);
        Matrix.multiplyMM(this.f3920u, 0, fArr2, 0, fArr, 0);
        return this.f3920u;
    }

    /* renamed from: c */
    public final void m1859c() {
        Arrays.fill(this.f3911l, 0.0f);
    }

    /* renamed from: a */
    public final void m1856a(double d) {
        double d2;
        if (d < 0.0d) {
            d2 = d + 360.0d;
        } else {
            d2 = d;
        }
        if (d2 > 360.0d) {
            d2 -= 0.012451171875d;
        }
        this.f3913n.m1851a(d2);
    }

    /* renamed from: d */
    public final void m1860d() {
        this.f3917r = false;
        HandlerThread handlerThread = this.f3918s;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        this.f3918s = null;
        SensorManager sensorManager = this.f3903d;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this.f3919t);
        }
    }
}
