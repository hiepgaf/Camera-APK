package p000;

import android.content.Context;
import com.google.android.apps.camera.legacy.lightcycle.panorama.LightCycle;
import com.google.android.apps.lightcycle.panorama.NewTarget;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: PG */
/* renamed from: ekt */
public final class ekt {
    /* renamed from: a */
    public static final float f3833a = 0.38397244f;
    /* renamed from: b */
    public static final float f3834b = 0.20943952f;
    /* renamed from: c */
    public final Context f3835c;
    /* renamed from: d */
    public final Map f3836d = Collections.synchronizedMap(new TreeMap());
    /* renamed from: e */
    public ejt f3837e;
    /* renamed from: f */
    public ejt f3838f;
    /* renamed from: g */
    public elj f3839g;
    /* renamed from: h */
    public eli f3840h;
    /* renamed from: i */
    public final float[] f3841i = new float[]{0.0f, 0.0f, -1.0f, 1.0f};
    /* renamed from: j */
    public final float[] f3842j = new float[4];
    /* renamed from: k */
    public final float[] f3843k = new float[16];
    /* renamed from: l */
    public float[] f3844l = null;
    /* renamed from: m */
    public float f3845m;
    /* renamed from: n */
    public float f3846n;
    /* renamed from: o */
    public float f3847o = 0.0f;
    /* renamed from: p */
    public boolean f3848p = false;
    /* renamed from: q */
    public eld f3849q = null;
    /* renamed from: r */
    public final eku f3850r = new eku();
    /* renamed from: s */
    public boolean f3851s = true;
    /* renamed from: t */
    public boolean f3852t = true;
    /* renamed from: u */
    public float f3853u = 0.1f;
    /* renamed from: v */
    public long f3854v = 0;
    /* renamed from: w */
    public final float[] f3855w = new float[16];
    /* renamed from: x */
    public eks f3856x;

    public ekt(Context context) {
        this.f3835c = context;
    }

    /* renamed from: a */
    public final void m1843a() {
        NewTarget[] i = LightCycle.m1310i();
        Object obj = new float[16];
        this.f3836d.clear();
        if (i != null) {
            for (NewTarget newTarget : i) {
                ekt.m1841a(newTarget.orientation, obj);
                this.f3836d.put(Integer.valueOf(newTarget.key), (float[]) obj.clone());
            }
        }
    }

    /* renamed from: a */
    public final void m1845a(float[] fArr) {
        m1846b();
        NewTarget[] b = LightCycle.m1301b(fArr);
        if (b != null) {
            int length = b.length;
            for (int i = 0; i < length; i++) {
                Object obj = new float[16];
                ekt.m1841a(b[i].orientation, obj);
                this.f3836d.put(Integer.valueOf(b[i].key), obj);
            }
        }
        this.f3851s = true;
        this.f3852t = true;
        this.f3853u = 0.1f;
        this.f3854v = 0;
    }

    /* renamed from: b */
    public static void m1842b(float[] fArr) {
        fArr[0] = fArr[0] / fArr[3];
        fArr[1] = fArr[1] / fArr[3];
        fArr[2] = fArr[2] / fArr[3];
        fArr[3] = 1.0f;
    }

    /* renamed from: b */
    public final void m1846b() {
        this.f3836d.clear();
        LightCycle.m1314m();
    }

    /* renamed from: a */
    public final void m1844a(int i) {
        boolean z = true;
        if (!(i == 3 || i == 4)) {
            z = false;
        }
        this.f3848p = z;
    }

    /* renamed from: a */
    private static void m1841a(float[] fArr, float[] fArr2) {
        fArr2[0] = fArr[0];
        fArr2[1] = fArr[1];
        fArr2[2] = fArr[2];
        fArr2[3] = 0.0f;
        fArr2[4] = fArr[3];
        fArr2[5] = fArr[4];
        fArr2[6] = fArr[5];
        fArr2[7] = 0.0f;
        fArr2[8] = fArr[6];
        fArr2[9] = fArr[7];
        fArr2[10] = fArr[8];
        fArr2[11] = 0.0f;
        fArr2[12] = 0.0f;
        fArr2[13] = 0.0f;
        fArr2[14] = 0.0f;
        fArr2[15] = 1.0f;
    }
}
