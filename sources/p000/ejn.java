package p000;

import android.opengl.Matrix;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.Vector;

/* compiled from: PG */
/* renamed from: ejn */
public abstract class ejn {
    /* renamed from: a */
    public FloatBuffer f3681a = null;
    /* renamed from: b */
    public FloatBuffer f3682b = null;
    /* renamed from: c */
    public ShortBuffer f3683c = null;
    /* renamed from: d */
    public Vector f3684d = new Vector();
    /* renamed from: e */
    public ejq f3685e = null;
    /* renamed from: f */
    private float[] f3686f = new float[16];
    /* renamed from: g */
    private float[] f3687g = new float[16];

    public ejn() {
        Matrix.setIdentityM(this.f3686f, 0);
    }

    /* renamed from: b */
    public abstract void mo1228b(float[] fArr);

    /* renamed from: a */
    public void mo3019a(float[] fArr) {
        Matrix.multiplyMM(this.f3687g, 0, fArr, 0, this.f3686f, 0);
        mo1228b(this.f3687g);
    }

    /* renamed from: a */
    public void mo1227a() {
    }

    /* renamed from: a */
    public final void m1794a(int i, float f, float f2) {
        int i2 = i * 3;
        int i3 = i2 + 1;
        this.f3681a.put(i2, f);
        this.f3681a.put(i3, -1.7f);
        this.f3681a.put(i3 + 1, f2);
    }
}
