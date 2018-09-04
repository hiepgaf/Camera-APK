package p000;

import android.annotation.TargetApi;
import java.util.HashMap;
import java.util.Map;

@TargetApi(19)
/* compiled from: PG */
/* renamed from: jdz */
public final class jdz {
    /* renamed from: a */
    public final int f7729a;
    /* renamed from: b */
    public final jfk f7730b;
    /* renamed from: c */
    public final jep f7731c;
    /* renamed from: d */
    public final jeq f7732d;
    /* renamed from: e */
    public final Map f7733e = new HashMap();
    /* renamed from: f */
    public final Map f7734f = new HashMap();
    /* renamed from: g */
    public final Map f7735g = new HashMap();
    /* renamed from: h */
    public boolean f7736h = true;

    jdz(int i, jfk jfk, jep jep, jeq jeq) {
        boolean z;
        if (jfk.f21839a.f23392a == jeq.f23392a) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
        if (jep == null) {
            jri.m13143a(true);
            this.f7729a = i;
            this.f7730b = jfk;
            this.f7731c = jep;
            this.f7732d = jeq;
            return;
        }
        throw new NoSuchMethodError();
    }

    /* renamed from: a */
    public final void m4427a(jdk jdk) {
        boolean z;
        if (jdk.f23392a == this.f7732d.f23392a) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
        jdk.m17631a(new jec(this)).mo1980a(izw.f18704a);
    }

    /* renamed from: a */
    public static jef m4423a(jfk jfk) {
        boolean z;
        if (jfk.f21842d >= 3) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
        return new jef(jfk);
    }

    /* renamed from: a */
    public final jdz m4425a(String str, int i) {
        boolean z;
        if (i < this.f7730b.f21840b.length) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
        this.f7734f.put(str, Integer.valueOf(i));
        return this;
    }

    /* renamed from: a */
    public final jdz m4426a(String str, float[] fArr) {
        this.f7733e.put(str, new jeb(str, fArr));
        return this;
    }

    /* renamed from: a */
    public final jdz m4424a(String str, float f, float f2) {
        this.f7733e.put(str, new jed(str, f, f2));
        return this;
    }
}
