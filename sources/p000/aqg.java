package p000;

import android.content.res.Resources.Theme;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.apps.refocus.processing.DepthmapTask;
import java.util.Map;

/* compiled from: PG */
/* renamed from: aqg */
public final class aqg implements Cloneable {
    /* renamed from: a */
    public static aqg f864a;
    /* renamed from: b */
    public static aqg f865b;
    /* renamed from: A */
    public boolean f866A = true;
    /* renamed from: B */
    public boolean f867B;
    /* renamed from: c */
    public int f868c;
    /* renamed from: d */
    public float f869d = 1.0f;
    /* renamed from: e */
    public afm f870e = afm.f414c;
    /* renamed from: f */
    public acg f871f = acg.NORMAL;
    /* renamed from: g */
    public Drawable f872g;
    /* renamed from: h */
    public int f873h;
    /* renamed from: i */
    public Drawable f874i;
    /* renamed from: j */
    public int f875j;
    /* renamed from: k */
    public boolean f876k = true;
    /* renamed from: l */
    public int f877l = -1;
    /* renamed from: m */
    public int f878m = -1;
    /* renamed from: n */
    public adl f879n = ard.f10168b;
    /* renamed from: o */
    public boolean f880o;
    /* renamed from: p */
    public boolean f881p = true;
    /* renamed from: q */
    public Drawable f882q;
    /* renamed from: r */
    public int f883r;
    /* renamed from: s */
    public adp f884s = new adp();
    /* renamed from: t */
    public Map f885t = new arj();
    /* renamed from: u */
    public Class f886u = Object.class;
    /* renamed from: v */
    public boolean f887v;
    /* renamed from: w */
    public Theme f888w;
    /* renamed from: x */
    public boolean f889x;
    /* renamed from: y */
    public boolean f890y;
    /* renamed from: z */
    public boolean f891z;

    /* renamed from: a */
    public final aqg m596a() {
        if (!this.f887v || this.f889x) {
            this.f889x = true;
            this.f887v = true;
            return this;
        }
        throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
    }

    /* renamed from: b */
    public final aqg m606b() {
        try {
            aqg aqg = (aqg) super.clone();
            aqg.f884s = new adp();
            aqg.f884s.m6304a(this.f884s);
            aqg.f885t = new arj();
            aqg.f885t.putAll(this.f885t);
            aqg.f887v = false;
            aqg.f889x = false;
            return aqg;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public final /* synthetic */ Object clone() {
        return m606b();
    }

    /* renamed from: a */
    public static aqg m592a(Class cls) {
        aqg aqg = new aqg();
        while (aqg.f889x) {
            aqg = aqg.m606b();
        }
        aqg.f886u = (Class) aqe.m585a((Object) cls, "Argument must not be null");
        aqg.f868c |= 4096;
        return aqg.m613g();
    }

    /* renamed from: a */
    public final aqg m601a(afm afm) {
        while (this.f889x) {
            this = m606b();
        }
        this.f870e = (afm) aqe.m585a((Object) afm, "Argument must not be null");
        this.f868c |= 4;
        return m613g();
    }

    /* renamed from: b */
    public static aqg m595b(afm afm) {
        return new aqg().m601a(afm);
    }

    /* renamed from: c */
    public final aqg m609c() {
        return m599a(aoi.f813b, Boolean.valueOf(true));
    }

    /* renamed from: d */
    public final aqg m610d() {
        while (this.f889x) {
            this = m606b();
        }
        this.f885t.clear();
        this.f868c &= -2049;
        this.f880o = false;
        this.f868c &= -131073;
        this.f881p = false;
        this.f868c |= 65536;
        this.f866A = true;
        return m613g();
    }

    /* renamed from: a */
    private final aqg m591a(amf amf) {
        return m599a(amf.f527f, (amf) aqe.m585a((Object) amf, "Argument must not be null"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aqg)) {
            return false;
        }
        aqg aqg = (aqg) obj;
        if (Float.compare(aqg.f869d, this.f869d) == 0 && this.f873h == aqg.f873h && arq.m658b(this.f872g, aqg.f872g) && this.f875j == aqg.f875j && arq.m658b(this.f874i, aqg.f874i) && this.f883r == aqg.f883r && arq.m658b(this.f882q, aqg.f882q) && this.f876k == aqg.f876k && this.f877l == aqg.f877l && this.f878m == aqg.f878m && this.f880o == aqg.f880o && this.f881p == aqg.f881p && this.f890y == aqg.f890y && this.f891z == aqg.f891z && this.f870e.equals(aqg.f870e) && this.f871f == aqg.f871f && this.f884s.equals(aqg.f884s) && this.f885t.equals(aqg.f885t) && this.f886u.equals(aqg.f886u) && arq.m658b(this.f879n, aqg.f879n) && arq.m658b(this.f888w, aqg.f888w)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final aqg m611e() {
        return m603a(amf.f522a, new amt(), true);
    }

    public final int hashCode() {
        return arq.m648a(this.f888w, arq.m648a(this.f879n, arq.m648a(this.f886u, arq.m648a(this.f885t, arq.m648a(this.f884s, arq.m648a(this.f871f, arq.m648a(this.f870e, arq.m649a(this.f891z, arq.m649a(this.f890y, arq.m649a(this.f881p, arq.m649a(this.f880o, arq.m645a(this.f878m, arq.m645a(this.f877l, arq.m649a(this.f876k, arq.m648a(this.f882q, arq.m645a(this.f883r, arq.m648a(this.f874i, arq.m645a(this.f875j, arq.m648a(this.f872g, arq.m645a(this.f873h, arq.m644a(this.f869d)))))))))))))))))))));
    }

    /* renamed from: a */
    public final boolean m605a(int i) {
        return aqg.m594a(this.f868c, i);
    }

    /* renamed from: a */
    public static boolean m594a(int i, int i2) {
        return (i & i2) != 0;
    }

    /* renamed from: f */
    public final aqg m612f() {
        return m603a(amf.f524c, new alz(), false);
    }

    /* renamed from: a */
    public final aqg m602a(amf amf, ads ads) {
        while (this.f889x) {
            this = m606b();
        }
        m591a(amf);
        return m600a(ads, false);
    }

    /* renamed from: b */
    public final aqg m608b(int i, int i2) {
        while (this.f889x) {
            this = m606b();
        }
        this.f878m = i;
        this.f877l = i2;
        this.f868c |= 512;
        return m613g();
    }

    /* renamed from: b */
    public final aqg m607b(int i) {
        while (this.f889x) {
            this = m606b();
        }
        this.f875j = i;
        this.f868c |= 128;
        return m613g();
    }

    /* renamed from: a */
    public final aqg m604a(Drawable drawable) {
        while (this.f889x) {
            this = m606b();
        }
        this.f874i = drawable;
        this.f868c |= 64;
        return m613g();
    }

    /* renamed from: a */
    public final aqg m597a(acg acg) {
        while (this.f889x) {
            this = m606b();
        }
        this.f871f = (acg) aqe.m585a((Object) acg, "Argument must not be null");
        this.f868c |= 8;
        return m613g();
    }

    /* renamed from: a */
    public final aqg m603a(amf amf, ads ads, boolean z) {
        aqg a;
        if (z) {
            while (this.f889x) {
                this = m606b();
            }
            m591a(amf);
            a = m600a(ads, true);
        } else {
            a = m602a(amf, ads);
        }
        a.f866A = true;
        return a;
    }

    /* renamed from: g */
    public final aqg m613g() {
        if (!this.f887v) {
            return this;
        }
        throw new IllegalStateException("You cannot modify locked RequestOptions, consider clone()");
    }

    /* renamed from: a */
    public final aqg m599a(adm adm, Object obj) {
        while (this.f889x) {
            this = m606b();
        }
        aqe.m585a((Object) adm, "Argument must not be null");
        aqe.m585a(obj, "Argument must not be null");
        this.f884s.m6302a(adm, obj);
        return m613g();
    }

    /* renamed from: a */
    public final aqg m598a(adl adl) {
        while (this.f889x) {
            this = m606b();
        }
        this.f879n = (adl) aqe.m585a((Object) adl, "Argument must not be null");
        this.f868c |= 1024;
        return m613g();
    }

    /* renamed from: h */
    public final aqg m614h() {
        while (this.f889x) {
            this = m606b();
        }
        this.f876k = false;
        this.f868c |= 256;
        return m613g();
    }

    /* renamed from: a */
    public final aqg m600a(ads ads, boolean z) {
        while (this.f889x) {
            this = m606b();
        }
        ads amr = new amr(ads, z);
        m593a(Bitmap.class, ads, z);
        m593a(Drawable.class, amr, z);
        m593a(BitmapDrawable.class, amr, z);
        m593a(any.class, new aoc(ads), z);
        return m613g();
    }

    /* renamed from: a */
    private final aqg m593a(Class cls, ads ads, boolean z) {
        while (this.f889x) {
            this = m606b();
        }
        aqe.m585a((Object) cls, "Argument must not be null");
        aqe.m585a((Object) ads, "Argument must not be null");
        this.f885t.put(cls, ads);
        this.f868c |= DepthmapTask.MAX_REFERENCE_SIZE_HR_PX;
        this.f881p = true;
        this.f868c |= 65536;
        this.f866A = false;
        if (z) {
            this.f868c |= 131072;
            this.f880o = true;
        }
        return m613g();
    }
}
