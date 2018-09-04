package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.support.v4.app.SharedElementCallback;
import android.util.Log;
import android.widget.ImageView;
import com.google.android.apps.refocus.processing.DepthmapTask;
import com.google.common.io.ByteStreams;
import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: acj */
public final class acj implements Cloneable {
    /* renamed from: a */
    public aqg f236a;
    /* renamed from: b */
    public acq f237b;
    /* renamed from: c */
    public acj f238c;
    /* renamed from: d */
    public boolean f239d = true;
    /* renamed from: e */
    private final Context f240e;
    /* renamed from: f */
    private final acm f241f;
    /* renamed from: g */
    private final Class f242g;
    /* renamed from: h */
    private final aqg f243h;
    /* renamed from: i */
    private final ace f244i;
    /* renamed from: j */
    private Object f245j;
    /* renamed from: k */
    private boolean f246k;
    /* renamed from: l */
    private boolean f247l;

    static {
        new aqg().m601a(afm.f413b).m597a(acg.LOW).m614h();
    }

    protected acj(acc acc, acm acm, Class cls, Context context) {
        this.f241f = acm;
        this.f242g = cls;
        this.f243h = acm.f9609e;
        this.f240e = context;
        ace ace = acm.f9605a.f189c;
        acq acq = (acq) ace.f213f.get(cls);
        if (acq == null) {
            acq acq2 = acq;
            for (Entry entry : ace.f213f.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    acq2 = (acq) entry.getValue();
                }
            }
            acq = acq2;
        }
        if (acq == null) {
            acq = ace.f208a;
        }
        this.f237b = acq;
        this.f236a = this.f243h;
        this.f244i = acc.f189c;
    }

    /* renamed from: a */
    public final acj m119a(aqg aqg) {
        aqe.m585a((Object) aqg, "Argument must not be null");
        aqg b = m117b();
        while (b.f889x) {
            b = b.m606b();
        }
        if (aqg.m594a(aqg.f868c, 2)) {
            b.f869d = aqg.f869d;
        }
        if (aqg.m594a(aqg.f868c, 262144)) {
            b.f890y = aqg.f890y;
        }
        if (aqg.m594a(aqg.f868c, (int) SharedElementCallback.MAX_IMAGE_SIZE)) {
            b.f867B = aqg.f867B;
        }
        if (aqg.m594a(aqg.f868c, 4)) {
            b.f870e = aqg.f870e;
        }
        if (aqg.m594a(aqg.f868c, 8)) {
            b.f871f = aqg.f871f;
        }
        if (aqg.m594a(aqg.f868c, 16)) {
            b.f872g = aqg.f872g;
        }
        if (aqg.m594a(aqg.f868c, 32)) {
            b.f873h = aqg.f873h;
        }
        if (aqg.m594a(aqg.f868c, 64)) {
            b.f874i = aqg.f874i;
        }
        if (aqg.m594a(aqg.f868c, 128)) {
            b.f875j = aqg.f875j;
        }
        if (aqg.m594a(aqg.f868c, 256)) {
            b.f876k = aqg.f876k;
        }
        if (aqg.m594a(aqg.f868c, 512)) {
            b.f878m = aqg.f878m;
            b.f877l = aqg.f877l;
        }
        if (aqg.m594a(aqg.f868c, 1024)) {
            b.f879n = aqg.f879n;
        }
        if (aqg.m594a(aqg.f868c, 4096)) {
            b.f886u = aqg.f886u;
        }
        if (aqg.m594a(aqg.f868c, 8192)) {
            b.f882q = aqg.f882q;
        }
        if (aqg.m594a(aqg.f868c, 16384)) {
            b.f883r = aqg.f883r;
        }
        if (aqg.m594a(aqg.f868c, 32768)) {
            b.f888w = aqg.f888w;
        }
        if (aqg.m594a(aqg.f868c, 65536)) {
            b.f881p = aqg.f881p;
        }
        if (aqg.m594a(aqg.f868c, 131072)) {
            b.f880o = aqg.f880o;
        }
        if (aqg.m594a(aqg.f868c, (int) DepthmapTask.MAX_REFERENCE_SIZE_HR_PX)) {
            b.f885t.putAll(aqg.f885t);
            b.f866A = aqg.f866A;
        }
        if (aqg.m594a(aqg.f868c, (int) ByteStreams.ZERO_COPY_CHUNK_SIZE)) {
            b.f891z = aqg.f891z;
        }
        if (!b.f881p) {
            b.f885t.clear();
            b.f868c &= -2049;
            b.f880o = false;
            b.f868c &= -131073;
            b.f866A = true;
        }
        b.f868c |= aqg.f868c;
        b.f884s.m6304a(aqg.f884s);
        this.f236a = b.m613g();
        return this;
    }

    /* renamed from: a */
    private final aqb m114a(aqs aqs, aqf aqf, aqc aqc, acq acq, acg acg, int i, int i2, aqg aqg) {
        acj acj = this.f238c;
        if (acj == null) {
            return m115a(aqs, aqf, aqg, aqc, acq, acg, i, i2);
        }
        if (this.f247l) {
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        }
        acq acq2;
        acg acg2;
        int i3;
        int i4;
        acq acq3 = acj.f237b;
        if (acj.f239d) {
            acq2 = acq;
        } else {
            acq2 = acq3;
        }
        if (acj.f236a.m605a(8)) {
            acg2 = this.f238c.f236a.f871f;
        } else {
            switch (acg.ordinal()) {
                case 0:
                case 1:
                    acg2 = acg.IMMEDIATE;
                    break;
                case 2:
                    acg2 = acg.HIGH;
                    break;
                case 3:
                    acg2 = acg.NORMAL;
                    break;
                default:
                    String valueOf = String.valueOf(this.f236a.f871f);
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 18);
                    stringBuilder.append("unknown priority: ");
                    stringBuilder.append(valueOf);
                    throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        aqg aqg2 = this.f238c.f236a;
        int i5 = aqg2.f878m;
        int i6 = aqg2.f877l;
        if (arq.m657b(i, i2)) {
            aqg aqg3 = this.f238c.f236a;
            if (arq.m657b(aqg3.f878m, aqg3.f877l)) {
                i3 = i6;
                i4 = i5;
            } else {
                i5 = aqg.f878m;
                i3 = aqg.f877l;
                i4 = i5;
            }
        } else {
            i3 = i6;
            i4 = i5;
        }
        aqc aqk = new aqk(aqc);
        aqb a = m115a(aqs, aqf, aqg, aqk, acq, acg, i, i2);
        this.f247l = true;
        acj = this.f238c;
        aqb a2 = acj.m114a(aqs, aqf, aqk, acq2, acg2, i4, i3, acj.f236a);
        this.f247l = false;
        aqk.f10157a = a;
        aqk.f10158b = a2;
        return aqk;
    }

    /* renamed from: a */
    public final acj m118a() {
        try {
            acj acj = (acj) super.clone();
            acj.f236a = acj.f236a.m606b();
            acj.f237b = acj.f237b.m124a();
            return acj;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public final /* synthetic */ Object clone() {
        return m118a();
    }

    /* renamed from: b */
    private final aqg m117b() {
        aqg aqg = this.f243h;
        aqg aqg2 = this.f236a;
        if (aqg != aqg2) {
            return aqg2;
        }
        return aqg2.m606b();
    }

    /* renamed from: a */
    public final aqt m123a(ImageView imageView) {
        aqs aqm;
        arq.m653a();
        aqe.m585a((Object) imageView, "Argument must not be null");
        aqg aqg = this.f236a;
        if (!(aqg.m605a((int) DepthmapTask.MAX_REFERENCE_SIZE_HR_PX) || !aqg.f881p || imageView.getScaleType() == null)) {
            switch (acl.f250a[imageView.getScaleType().ordinal()]) {
                case 1:
                    aqg = aqg.m606b().m602a(amf.f523b, new aly());
                    break;
                case 2:
                    aqg = aqg.m606b().m612f();
                    break;
                case 3:
                case 4:
                case 5:
                    aqg = aqg.m606b().m603a(amf.f522a, new amt(), false);
                    break;
                case 6:
                    aqg = aqg.m606b().m612f();
                    break;
                default:
                    break;
            }
        }
        Class cls = this.f242g;
        if (Bitmap.class.equals(cls)) {
            aqm = new aqm(imageView);
        } else if (Drawable.class.isAssignableFrom(cls)) {
            aqm = new aqn(imageView);
        } else {
            String valueOf = String.valueOf(cls);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 64);
            stringBuilder.append("Unhandled class: ");
            stringBuilder.append(valueOf);
            stringBuilder.append(", try .as*(Class).transcode(ResourceTranscoder)");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        return (aqt) m116a(aqm, null, aqg);
    }

    /* renamed from: a */
    public final aqs m122a(aqs aqs, aqf aqf) {
        return m116a(aqs, aqf, m117b());
    }

    /* renamed from: a */
    private final aqs m116a(aqs aqs, aqf aqf, aqg aqg) {
        arq.m653a();
        aqe.m585a((Object) aqs, "Argument must not be null");
        if (this.f246k) {
            aqg a = aqg.m596a();
            aqb a2 = m114a(aqs, aqf, null, this.f237b, a.f871f, a.f878m, a.f877l, a);
            Object a3 = aqs.mo2628a();
            if (a2.mo323a(a3)) {
                Object obj;
                if (a.f876k) {
                    obj = null;
                } else if (a3.mo327e()) {
                    obj = 1;
                } else {
                    obj = null;
                }
                if (obj == null) {
                    a2.mo331i();
                    if (!((aqb) aqe.m585a(a3, "Argument must not be null")).mo329g()) {
                        a3.mo324b();
                    }
                    return aqs;
                }
            }
            this.f241f.m6283a(aqs);
            aqs.mo2630a(a2);
            acm acm = this.f241f;
            acm.f9608d.f10128a.add(aqs);
            api api = acm.f9607c;
            api.f831a.add(a2);
            if (api.f833c) {
                if (Log.isLoggable("RequestTracker", 2)) {
                    Log.v("RequestTracker", "Paused, delaying request");
                }
                api.f832b.add(a2);
            } else {
                a2.mo324b();
            }
            return aqs;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    /* renamed from: a */
    public final acj m120a(Object obj) {
        this.f245j = obj;
        this.f246k = true;
        return this;
    }

    /* renamed from: a */
    private final aqb m115a(aqs aqs, aqf aqf, aqg aqg, aqc aqc, acq acq, acg acg, int i, int i2) {
        Context context = this.f240e;
        ace ace = this.f244i;
        Object obj = this.f245j;
        Class cls = this.f242g;
        afs afs = ace.f214g;
        arc arc = acq.f255a;
        aqb aqb = (aqi) aqi.f10129a.mo341a();
        if (aqb == null) {
            aqb = new aqi();
        }
        aqb.f10135d = context;
        aqb.f10136e = ace;
        aqb.f10137f = obj;
        aqb.f10138g = cls;
        aqb.f10139h = aqg;
        aqb.f10140i = i;
        aqb.f10141j = i2;
        aqb.f10142k = acg;
        aqb.f10143l = aqs;
        aqb.f10133b = aqf;
        aqb.f10144m = null;
        aqb.f10134c = aqc;
        aqb.f10145n = afs;
        aqb.f10146o = arc;
        aqb.f10147p = go.f5571i;
        return aqb;
    }

    /* renamed from: a */
    public final aqa m121a(int i, int i2) {
        aqs aqd = new aqd(this.f244i.f209b, i, i2);
        if ((arq.m655b() ^ 1) != 0) {
            this.f244i.f209b.post(new ack(this, aqd));
        } else {
            m122a(aqd, (aqf) aqd);
        }
        return aqd;
    }
}
