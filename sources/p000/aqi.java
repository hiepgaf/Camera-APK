package p000;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* renamed from: aqi */
public final class aqi implements aqb, aqh, aqr, ary {
    /* renamed from: a */
    public static final iw f10129a = ars.m661a(new aqj());
    /* renamed from: r */
    private static final boolean f10130r = Log.isLoggable("Request", 2);
    /* renamed from: A */
    private int f10131A;
    /* renamed from: B */
    private int f10132B;
    /* renamed from: b */
    public aqf f10133b;
    /* renamed from: c */
    public aqc f10134c;
    /* renamed from: d */
    public Context f10135d;
    /* renamed from: e */
    public ace f10136e;
    /* renamed from: f */
    public Object f10137f;
    /* renamed from: g */
    public Class f10138g;
    /* renamed from: h */
    public aqg f10139h;
    /* renamed from: i */
    public int f10140i;
    /* renamed from: j */
    public int f10141j;
    /* renamed from: k */
    public acg f10142k;
    /* renamed from: l */
    public aqs f10143l;
    /* renamed from: m */
    public List f10144m;
    /* renamed from: n */
    public afs f10145n;
    /* renamed from: o */
    public arc f10146o;
    /* renamed from: p */
    public int f10147p;
    /* renamed from: q */
    private boolean f10148q;
    /* renamed from: s */
    private final String f10149s;
    /* renamed from: t */
    private final asa f10150t;
    /* renamed from: u */
    private agn f10151u;
    /* renamed from: v */
    private afx f10152v;
    /* renamed from: w */
    private long f10153w;
    /* renamed from: x */
    private Drawable f10154x;
    /* renamed from: y */
    private Drawable f10155y;
    /* renamed from: z */
    private Drawable f10156z;

    public aqi() {
        String valueOf;
        if (f10130r) {
            valueOf = String.valueOf(super.hashCode());
        } else {
            valueOf = null;
        }
        this.f10149s = valueOf;
        this.f10150t = asa.m667a();
    }

    /* renamed from: j */
    private final void m6898j() {
        if (this.f10148q) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    /* renamed from: b */
    public final void mo324b() {
        m6898j();
        this.f10150t.mo344b();
        this.f10153w = arm.m630a();
        if (this.f10137f == null) {
            int i;
            if (arq.m657b(this.f10140i, this.f10141j)) {
                this.f10131A = this.f10140i;
                this.f10132B = this.f10141j;
            }
            if (m6900l() == null) {
                i = 5;
            } else {
                i = 3;
            }
            m6895a(new agg("Received null model"), i);
        } else if (this.f10147p == go.f5572j) {
            throw new IllegalArgumentException("Cannot restart a running request");
        } else if (this.f10147p == go.f5574l) {
            mo322a(this.f10151u, adf.MEMORY_CACHE);
        } else {
            this.f10147p = go.f5573k;
            if (arq.m657b(this.f10140i, this.f10141j)) {
                mo320a(this.f10140i, this.f10141j);
            } else {
                this.f10143l.mo3363a((aqr) this);
            }
            if ((this.f10147p == go.f5572j || this.f10147p == go.f5573k) && m6899k()) {
                this.f10143l.mo2632c(m6901m());
            }
            if (f10130r) {
                double a = arm.m629a(this.f10153w);
                StringBuilder stringBuilder = new StringBuilder(47);
                stringBuilder.append("finished run method in ");
                stringBuilder.append(a);
                m6897a(stringBuilder.toString());
            }
        }
    }

    /* renamed from: k */
    private final boolean m6899k() {
        aqc aqc = this.f10134c;
        return aqc == null || aqc.mo334c(this);
    }

    /* renamed from: c */
    public final void mo325c() {
        boolean z = true;
        arq.m653a();
        m6898j();
        this.f10150t.mo344b();
        if (this.f10147p != go.f5577o) {
            m6898j();
            this.f10150t.mo344b();
            this.f10143l.mo3367b((aqr) this);
            this.f10147p = go.f5576n;
            afx afx = this.f10152v;
            if (afx != null) {
                afy afy = afx.f424a;
                aqh aqh = afx.f425b;
                arq.m653a();
                afy.f9713b.mo344b();
                if (afy.f9724m || afy.f9726o) {
                    if (afy.f9727p == null) {
                        afy.f9727p = new ArrayList(2);
                    }
                    if (!afy.f9727p.contains(aqh)) {
                        afy.f9727p.add(aqh);
                    }
                } else {
                    afy.f9712a.remove(aqh);
                    if (!(!afy.f9712a.isEmpty() || afy.f9726o || afy.f9724m || afy.f9730s)) {
                        afy.f9730s = true;
                        afd afd = afy.f9729r;
                        afd.f9692s = true;
                        afa afa = afd.f9691r;
                        if (afa != null) {
                            afa.mo35a();
                        }
                        afy.f9715d.mo48a(afy, afy.f9717f);
                    }
                }
                this.f10152v = null;
            }
            agn agn = this.f10151u;
            if (agn != null) {
                m6896a(agn);
            }
            aqc aqc = this.f10134c;
            if (!(aqc == null || aqc.mo333b(this))) {
                z = false;
            }
            if (z) {
                this.f10143l.mo2629a(m6901m());
            }
            this.f10147p = go.f5577o;
        }
    }

    /* renamed from: l */
    private final Drawable m6900l() {
        if (this.f10156z == null) {
            aqg aqg = this.f10139h;
            this.f10156z = aqg.f882q;
            if (this.f10156z == null) {
                int i = aqg.f883r;
                if (i > 0) {
                    this.f10156z = m6894a(i);
                }
            }
        }
        return this.f10156z;
    }

    /* renamed from: m */
    private final Drawable m6901m() {
        if (this.f10155y == null) {
            aqg aqg = this.f10139h;
            this.f10155y = aqg.f874i;
            if (this.f10155y == null) {
                int i = aqg.f875j;
                if (i > 0) {
                    this.f10155y = m6894a(i);
                }
            }
        }
        return this.f10155y;
    }

    /* renamed from: a */
    public final asa mo39a() {
        return this.f10150t;
    }

    /* renamed from: d */
    public final boolean mo326d() {
        return this.f10147p == go.f5576n || this.f10147p == go.f5577o;
    }

    /* renamed from: e */
    public final boolean mo327e() {
        return this.f10147p == go.f5574l;
    }

    /* renamed from: a */
    public final boolean mo323a(aqb aqb) {
        if (!(aqb instanceof aqi)) {
            return false;
        }
        aqi aqi = (aqi) aqb;
        if (this.f10140i == aqi.f10140i && this.f10141j == aqi.f10141j && arq.m654a(this.f10137f, aqi.f10137f) && this.f10138g.equals(aqi.f10138g) && this.f10139h.equals(aqi.f10139h) && this.f10142k == aqi.f10142k) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    private final boolean m6902n() {
        aqc aqc = this.f10134c;
        return aqc == null || !aqc.mo332a();
    }

    /* renamed from: f */
    public final boolean mo328f() {
        return mo327e();
    }

    /* renamed from: g */
    public final boolean mo329g() {
        return this.f10147p == go.f5572j || this.f10147p == go.f5573k;
    }

    /* renamed from: a */
    private final Drawable m6894a(int i) {
        Theme theme = this.f10139h.f888w;
        if (theme == null) {
            theme = this.f10135d.getTheme();
        }
        Context context = this.f10136e;
        return anp.m515a(context, context, i, theme);
    }

    /* renamed from: a */
    private final void m6897a(String str) {
        String str2 = this.f10149s;
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 7) + String.valueOf(str2).length());
        stringBuilder.append(str);
        stringBuilder.append(" this: ");
        stringBuilder.append(str2);
        Log.v("Request", stringBuilder.toString());
    }

    /* renamed from: a */
    private static int m6893a(int i, float f) {
        return i != kvl.UNSET_ENUM_VALUE ? Math.round(((float) i) * f) : i;
    }

    /* renamed from: a */
    public final void mo321a(agg agg) {
        m6895a(agg, 5);
    }

    /* renamed from: a */
    private final void m6895a(agg agg, int i) {
        this.f10150t.mo344b();
        int i2 = this.f10136e.f215h;
        if (i2 <= i) {
            String valueOf = String.valueOf(this.f10137f);
            int i3 = this.f10131A;
            int i4 = this.f10132B;
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 52);
            stringBuilder.append("Load failed for ");
            stringBuilder.append(valueOf);
            stringBuilder.append(" with size [");
            stringBuilder.append(i3);
            stringBuilder.append("x");
            stringBuilder.append(i4);
            stringBuilder.append("]");
            Log.w("Glide", stringBuilder.toString(), agg);
            if (i2 <= 4) {
                List a = agg.m236a();
                i4 = a.size();
                for (int i5 = 0; i5 < i4; i5++) {
                    StringBuilder stringBuilder2 = new StringBuilder(39);
                    stringBuilder2.append("Root cause (");
                    stringBuilder2.append(i5 + 1);
                    stringBuilder2.append(" of ");
                    stringBuilder2.append(i4);
                    stringBuilder2.append(")");
                    Log.i("Glide", stringBuilder2.toString(), (Throwable) a.get(i5));
                }
            }
        }
        this.f10152v = null;
        this.f10147p = go.f5575m;
        this.f10148q = true;
        try {
            aqf aqf = this.f10133b;
            if (aqf != null) {
                m6902n();
                aqf.mo3365a(agg);
            }
            if (m6899k()) {
                Drawable l;
                if (this.f10137f == null) {
                    l = m6900l();
                } else {
                    l = null;
                }
                if (l == null) {
                    if (this.f10154x == null) {
                        aqg aqg = this.f10139h;
                        this.f10154x = aqg.f872g;
                        if (this.f10154x == null) {
                            i2 = aqg.f873h;
                            if (i2 > 0) {
                                this.f10154x = m6894a(i2);
                            }
                        }
                    }
                    l = this.f10154x;
                }
                if (l == null) {
                    l = m6901m();
                }
                this.f10143l.mo2631b(l);
            }
            this.f10148q = false;
            aqc aqc = this.f10134c;
            if (aqc != null) {
                aqc.mo336e(this);
            }
        } catch (Throwable th) {
            this.f10148q = false;
        }
    }

    /* renamed from: a */
    public final void mo322a(agn agn, adf adf) {
        this.f10150t.mo344b();
        this.f10152v = null;
        if (agn == null) {
            String valueOf = String.valueOf(this.f10138g);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 82);
            stringBuilder.append("Expected to receive a Resource<R> with an object of ");
            stringBuilder.append(valueOf);
            stringBuilder.append(" inside, but instead got null.");
            m6895a(new agg(stringBuilder.toString()), 5);
            return;
        }
        Object b = agn.mo55b();
        Object obj;
        String simpleName;
        String valueOf2;
        StringBuilder stringBuilder2;
        if (b != null && this.f10138g.isAssignableFrom(b.getClass())) {
            aqc aqc = this.f10134c;
            obj = aqc != null ? !aqc.mo335d(this) ? null : 1 : 1;
            if (obj == null) {
                m6896a(agn);
                this.f10147p = go.f5574l;
                return;
            }
            m6902n();
            this.f10147p = go.f5574l;
            this.f10151u = agn;
            if (this.f10136e.f215h <= 3) {
                simpleName = b.getClass().getSimpleName();
                String valueOf3 = String.valueOf(adf);
                valueOf2 = String.valueOf(this.f10137f);
                int i = this.f10131A;
                int i2 = this.f10132B;
                double a = arm.m629a(this.f10153w);
                stringBuilder2 = new StringBuilder(((String.valueOf(simpleName).length() + 95) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf2).length());
                stringBuilder2.append("Finished loading ");
                stringBuilder2.append(simpleName);
                stringBuilder2.append(" from ");
                stringBuilder2.append(valueOf3);
                stringBuilder2.append(" for ");
                stringBuilder2.append(valueOf2);
                stringBuilder2.append(" with size [");
                stringBuilder2.append(i);
                stringBuilder2.append("x");
                stringBuilder2.append(i2);
                stringBuilder2.append("] in ");
                stringBuilder2.append(a);
                stringBuilder2.append(" ms");
                Log.d("Glide", stringBuilder2.toString());
            }
            this.f10148q = true;
            try {
                aqf aqf = this.f10133b;
                if (aqf != null) {
                    aqf.mo3366a(b);
                }
                this.f10143l.mo3364a(b, this.f10146o.mo338a(adf));
                aqc = this.f10134c;
                if (aqc != null) {
                    aqc.mo337f(this);
                }
            } finally {
                this.f10148q = false;
            }
        } else {
            m6896a(agn);
            valueOf2 = String.valueOf(this.f10138g);
            if (b == null) {
                obj = "";
            } else {
                obj = b.getClass();
            }
            String valueOf4 = String.valueOf(obj);
            String valueOf5 = String.valueOf(b);
            String valueOf6 = String.valueOf(agn);
            if (b == null) {
                simpleName = " To indicate failure return a null Resource object, rather than a Resource object containing null data.";
            } else {
                simpleName = "";
            }
            int length = String.valueOf(valueOf2).length();
            stringBuilder2 = new StringBuilder(((((length + 71) + String.valueOf(valueOf4).length()) + String.valueOf(valueOf5).length()) + String.valueOf(valueOf6).length()) + String.valueOf(simpleName).length());
            stringBuilder2.append("Expected to receive an object of ");
            stringBuilder2.append(valueOf2);
            stringBuilder2.append(" but instead got ");
            stringBuilder2.append(valueOf4);
            stringBuilder2.append("{");
            stringBuilder2.append(valueOf5);
            stringBuilder2.append("} inside Resource{");
            stringBuilder2.append(valueOf6);
            stringBuilder2.append("}.");
            stringBuilder2.append(simpleName);
            m6895a(new agg(stringBuilder2.toString()), 5);
        }
    }

    /* renamed from: a */
    public final void mo320a(int i, int i2) {
        this.f10150t.mo344b();
        if (f10130r) {
            double a = arm.m629a(this.f10153w);
            StringBuilder stringBuilder = new StringBuilder(43);
            stringBuilder.append("Got onSizeReady in ");
            stringBuilder.append(a);
            m6897a(stringBuilder.toString());
        }
        if (this.f10147p == go.f5573k) {
            long a2;
            agn agn;
            Object obj;
            afx afx;
            this.f10147p = go.f5572j;
            float f = this.f10139h.f869d;
            this.f10131A = aqi.m6893a(i, f);
            this.f10132B = aqi.m6893a(i2, f);
            if (f10130r) {
                a = arm.m629a(this.f10153w);
                stringBuilder = new StringBuilder(59);
                stringBuilder.append("finished setup for calling load in ");
                stringBuilder.append(a);
                m6897a(stringBuilder.toString());
            }
            afs afs = this.f10145n;
            ace ace = this.f10136e;
            Object obj2 = this.f10137f;
            aqg aqg = this.f10139h;
            adl adl = aqg.f879n;
            int i3 = this.f10131A;
            int i4 = this.f10132B;
            Class cls = aqg.f886u;
            Class cls2 = this.f10138g;
            acg acg = this.f10142k;
            afm afm = aqg.f870e;
            Map map = aqg.f885t;
            boolean z = aqg.f880o;
            boolean z2 = aqg.f866A;
            adp adp = aqg.f884s;
            boolean z3 = aqg.f876k;
            boolean z4 = aqg.f890y;
            boolean z5 = aqg.f867B;
            boolean z6 = aqg.f891z;
            arq.m653a();
            if (afs.f9700a) {
                a2 = arm.m630a();
            } else {
                a2 = 0;
            }
            adl agc = new agc(obj2, adl, i3, i4, map, cls, cls2, adp);
            if (z3) {
                aet aet = afs.f9705f;
                aex aex = (aex) aet.f356b.get(agc);
                if (aex != null) {
                    age age = (age) aex.get();
                    if (age == null) {
                        aet.m197a(aex);
                        agn = age;
                    } else {
                        obj = age;
                    }
                } else {
                    agn = null;
                }
                if (agn != null) {
                    agn.m6399a();
                }
            } else {
                agn = null;
            }
            if (agn != null) {
                mo322a(agn, adf.MEMORY_CACHE);
                if (afs.f9700a) {
                    afs.m6383a("Loaded resource from active resources", a2, agc);
                    afx = null;
                } else {
                    afx = null;
                }
            } else {
                if (z3) {
                    agn = afs.f9702c.mo82a(agc);
                    if (agn == null) {
                        agn = null;
                    } else if (agn instanceof age) {
                        agn = (age) agn;
                    } else {
                        obj = new age(agn, true, true);
                    }
                    if (agn != null) {
                        agn.m6399a();
                        afs.f9705f.m196a(agc, agn);
                    }
                } else {
                    agn = null;
                }
                if (agn != null) {
                    mo322a(agn, adf.MEMORY_CACHE);
                    if (afs.f9700a) {
                        afs.m6383a("Loaded resource from cache", a2, agc);
                        afx = null;
                    } else {
                        afx = null;
                    }
                } else {
                    afy afy = (afy) afs.f9701b.m240a(z6).get(agc);
                    if (afy != null) {
                        afy.m6395a((aqh) this);
                        if (afs.f9700a) {
                            afs.m6383a("Added to existing load", a2, agc);
                        }
                        afx = new afx(this, afy);
                    } else {
                        aie aie;
                        afy afy2 = (afy) aqe.m585a((afy) afs.f9703d.f423f.mo341a(), "Argument must not be null");
                        afy2.f9717f = agc;
                        afy2.f9718g = z3;
                        afy2.f9719h = z4;
                        afy2.f9720i = z5;
                        afy2.f9721j = z6;
                        aft aft = afs.f9704e;
                        afd afd = (afd) aqe.m585a((afd) aft.f416b.mo341a(), "Argument must not be null");
                        int i5 = aft.f417c;
                        aft.f417c = i5 + 1;
                        afc afc = afd.f9674a;
                        afg afg = afd.f9675b;
                        afc.f370c = ace;
                        afc.f371d = obj2;
                        afc.f381n = adl;
                        afc.f372e = i3;
                        afc.f373f = i4;
                        afc.f383p = afm;
                        afc.f374g = cls;
                        afc.f375h = afg;
                        afc.f378k = cls2;
                        afc.f382o = acg;
                        afc.f376i = adp;
                        afc.f377j = map;
                        afc.f384q = z;
                        afc.f385r = z2;
                        afd.f9678e = ace;
                        afd.f9679f = adl;
                        afd.f9680g = acg;
                        afd.f9681h = agc;
                        afd.f9682i = i3;
                        afd.f9683j = i4;
                        afd.f9684k = afm;
                        afd.f9689p = z6;
                        afd.f9685l = adp;
                        afd.f9686m = afy2;
                        afd.f9687n = i5;
                        afd.f9688o = afi.INITIALIZE;
                        afs.f9701b.m240a(afy2.f9721j).put(agc, afy2);
                        afy2.m6395a((aqh) this);
                        afy2.f9729r = afd;
                        afj a3 = afd.m6357a(afj.INITIALIZE);
                        if (a3 == afj.RESOURCE_CACHE) {
                            obj2 = 1;
                        } else if (a3 != afj.DATA_CACHE) {
                            obj2 = null;
                        } else {
                            obj2 = 1;
                        }
                        if (obj2 != null) {
                            aie = afy2.f9716e;
                        } else {
                            aie = afy2.m6396b();
                        }
                        aie.execute(afd);
                        if (afs.f9700a) {
                            afs.m6383a("Started new load", a2, agc);
                        }
                        afx = new afx(this, afy2);
                    }
                }
            }
            this.f10152v = afx;
            if (this.f10147p != go.f5572j) {
                this.f10152v = null;
            }
            if (f10130r) {
                a = arm.m629a(this.f10153w);
                stringBuilder = new StringBuilder(48);
                stringBuilder.append("finished onSizeReady in ");
                stringBuilder.append(a);
                m6897a(stringBuilder.toString());
            }
        }
    }

    /* renamed from: h */
    public final void mo330h() {
        mo325c();
        this.f10147p = go.f5578p;
    }

    /* renamed from: i */
    public final void mo331i() {
        m6898j();
        this.f10135d = null;
        this.f10136e = null;
        this.f10137f = null;
        this.f10138g = null;
        this.f10139h = null;
        this.f10140i = -1;
        this.f10141j = -1;
        this.f10143l = null;
        this.f10133b = null;
        this.f10134c = null;
        this.f10146o = null;
        this.f10152v = null;
        this.f10154x = null;
        this.f10155y = null;
        this.f10156z = null;
        this.f10131A = -1;
        this.f10132B = -1;
        f10129a.mo342a(this);
    }

    /* renamed from: a */
    private final void m6896a(agn agn) {
        afs.m6384b(agn);
        this.f10151u = null;
    }
}
