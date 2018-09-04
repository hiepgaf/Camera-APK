package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: PG */
/* renamed from: abo */
public abstract class abo {
    /* renamed from: a */
    private static final aby f135a = new aby("CamSet");
    /* renamed from: b */
    private final Map f136b = new TreeMap();
    /* renamed from: c */
    private abw f137c;
    /* renamed from: d */
    public final List f138d = new ArrayList();
    /* renamed from: e */
    public final List f139e = new ArrayList();
    /* renamed from: f */
    public boolean f140f;
    /* renamed from: g */
    public int f141g;
    /* renamed from: h */
    public int f142h;
    /* renamed from: i */
    public int f143i;
    /* renamed from: j */
    public abw f144j;
    /* renamed from: k */
    public int f145k;
    /* renamed from: l */
    public byte f146l;
    /* renamed from: m */
    public int f147m;
    /* renamed from: n */
    public float f148n;
    /* renamed from: o */
    public int f149o;
    /* renamed from: p */
    public abb f150p;
    /* renamed from: q */
    public abc f151q;
    /* renamed from: r */
    public abd f152r;
    /* renamed from: s */
    public abf f153s;
    /* renamed from: t */
    public boolean f154t;
    /* renamed from: u */
    public boolean f155u;
    /* renamed from: v */
    public boolean f156v;
    /* renamed from: w */
    public boolean f157w;
    /* renamed from: x */
    public abp f158x;
    /* renamed from: y */
    public abw f159y;

    /* renamed from: a */
    public abstract abo mo2576a();

    protected abo() {
    }

    protected abo(abo abo) {
        abw abw;
        abw abw2 = null;
        this.f136b.putAll(abo.f136b);
        this.f138d.addAll(abo.f138d);
        this.f139e.addAll(abo.f139e);
        this.f140f = abo.f140f;
        this.f141g = abo.f141g;
        this.f142h = abo.f142h;
        this.f143i = abo.f143i;
        abw abw3 = abo.f144j;
        if (abw3 != null) {
            abw = new abw(abw3);
        } else {
            abw = null;
        }
        this.f144j = abw;
        this.f145k = abo.f145k;
        abw = abo.f137c;
        if (abw != null) {
            abw2 = new abw(abw);
        }
        this.f137c = abw2;
        this.f146l = abo.f146l;
        this.f147m = abo.f147m;
        this.f148n = abo.f148n;
        this.f149o = abo.f149o;
        this.f150p = abo.f150p;
        this.f151q = abo.f151q;
        this.f152r = abo.f152r;
        this.f153s = abo.f153s;
        this.f154t = abo.f154t;
        this.f155u = abo.f155u;
        this.f156v = abo.f156v;
        this.f157w = abo.f157w;
        this.f158x = abo.f158x;
        this.f159y = abo.f159y;
    }

    /* renamed from: b */
    public final abw m68b() {
        return new abw(this.f137c);
    }

    /* renamed from: c */
    public final abw m70c() {
        return new abw(this.f144j);
    }

    /* renamed from: d */
    public final List m71d() {
        return new ArrayList(this.f139e);
    }

    /* renamed from: e */
    public final List m72e() {
        return new ArrayList(this.f138d);
    }

    /* renamed from: a */
    public final void m65a(int i) {
        if (i <= 0 || i > 100) {
            abx.m91e(f135a, "Ignoring JPEG quality that falls outside the expected range");
        } else {
            this.f146l = (byte) i;
        }
    }

    /* renamed from: a */
    public final boolean m67a(abw abw) {
        if (this.f140f) {
            abx.m91e(f135a, "Attempt to change photo size while locked");
            return false;
        }
        this.f137c = new abw(abw);
        return true;
    }

    /* renamed from: a */
    public final void m66a(int i, int i2) {
        int i3;
        if (i > i2) {
            i3 = i;
        } else {
            i3 = i2;
        }
        if (i <= i2) {
            i2 = i;
        }
        this.f142h = i3;
        this.f141g = i2;
        this.f143i = -1;
    }

    /* renamed from: b */
    public final boolean m69b(abw abw) {
        if (this.f140f) {
            abx.m91e(f135a, "Attempt to change preview size while locked");
            return false;
        }
        this.f144j = new abw(abw);
        return true;
    }

    /* renamed from: a */
    public void mo2577a(float f) {
        this.f148n = f;
    }
}
