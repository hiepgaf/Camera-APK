package p000;

import android.support.v8.renderscript.RenderScript;

/* compiled from: PG */
/* renamed from: hsb */
public class hsb {
    /* renamed from: a */
    public static final int f6556a = 26;
    /* renamed from: b */
    public int f6557b;
    /* renamed from: c */
    public hsh f6558c;

    static {
        hrz.m3323a();
    }

    public hsb(int i, hrz hrz, RenderScript renderScript) {
        int i2 = 0;
        int b = hrz.m3328b(i);
        this.f6558c = new hsh(renderScript, b);
        int i3 = 0;
        while (i2 < b) {
            int a = ((int) hrz.m3326a(hrz.m3327a(i, i2))) + 1;
            this.f6558c.m11974a(i2, i3);
            this.f6558c.m11975b(i2, a);
            this.f6558c.m11976c(i2, a);
            a = (a + a) + 1;
            i3 += a * a;
            i2++;
        }
        this.f6557b = i3;
    }

    /* renamed from: a */
    public static int m3331a(float f) {
        return ((int) f) + 1;
    }
}
