package p000;

import java.lang.reflect.Array;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: jzd */
public final class jzd {
    /* renamed from: a */
    public final int f8134a;
    /* renamed from: b */
    public final float[][] f8135b;
    /* renamed from: c */
    public final int[][] f8136c;
    /* renamed from: d */
    public float[][] f8137d;
    /* renamed from: e */
    private final int f8138e;
    /* renamed from: f */
    private final jze f8139f = new jze(this.f8134a);
    /* renamed from: g */
    private final jze f8140g;
    /* renamed from: h */
    private final boolean[] f8141h;
    /* renamed from: i */
    private final int[] f8142i;

    public jzd(int i) {
        this.f8134a = i;
        int i2 = this.f8134a;
        this.f8138e = i2 - 1;
        this.f8135b = (float[][]) Array.newInstance(Float.TYPE, new int[]{i2, i2});
        this.f8140g = new jze(i2 * i2);
        i2 = this.f8134a;
        this.f8136c = (int[][]) Array.newInstance(Integer.TYPE, new int[]{i2, i2});
        this.f8141h = new boolean[i2];
        this.f8142i = new int[i2];
    }

    /* renamed from: a */
    public final boolean m4709a(boolean z) {
        int i;
        int i2;
        int i3;
        Arrays.fill(this.f8141h, false);
        this.f8139f.f8144b = 0;
        jze jze = this.f8140g;
        jze.f8144b = 0;
        jze.m4710a(0);
        loop0:
        while (true) {
            jze = this.f8140g;
            i = jze.f8144b;
            if (i == 0) {
                return false;
            }
            jze.f8144b = i - 1;
            i = jze.f8143a[jze.f8144b];
            for (i2 = 0; i2 < this.f8134a; i2++) {
                i3 = this.f8136c[i][i2];
                if (i3 == 0) {
                    continue;
                    break;
                }
                if (!this.f8141h[i3]) {
                    boolean z2;
                    float f = this.f8137d[i][i3];
                    if (f - this.f8135b[i][i3] > 0.0f) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z) {
                        if (f <= 0.0f) {
                            z2 = false;
                        } else if (z2) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    }
                    if (!z2) {
                        continue;
                    } else if (i3 == this.f8138e) {
                        break loop0;
                    } else {
                        this.f8142i[i3] = i;
                        this.f8140g.m4710a(i3);
                    }
                }
            }
            this.f8141h[i] = true;
        }
        this.f8139f.m4710a(i3);
        i2 = i;
        while (true) {
            this.f8139f.m4710a(i2);
            if (i2 == 0) {
                return true;
            }
            i2 = this.f8142i[i2];
        }
    }

    /* renamed from: a */
    public final float m4708a() {
        int i = 1;
        float f = Float.MAX_VALUE;
        int i2 = 1;
        while (true) {
            jze jze = this.f8139f;
            if (i2 >= jze.f8144b) {
                break;
            }
            int[] iArr = jze.f8143a;
            int i3 = iArr[i2];
            int i4 = iArr[i2 - 1];
            f = Math.min(f, this.f8137d[i3][i4] - this.f8135b[i3][i4]);
            i2++;
        }
        while (true) {
            jze jze2 = this.f8139f;
            if (i >= jze2.f8144b) {
                return f;
            }
            int[] iArr2 = jze2.f8143a;
            i4 = iArr2[i];
            i2 = iArr2[i - 1];
            float[][] fArr = this.f8135b;
            float[] fArr2 = fArr[i4];
            fArr2[i2] = fArr2[i2] + f;
            float[] fArr3 = fArr[i2];
            fArr3[i4] = fArr3[i4] - f;
            i++;
        }
    }
}
