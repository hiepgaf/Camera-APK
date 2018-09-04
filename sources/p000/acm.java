package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;

/* compiled from: PG */
/* renamed from: acm */
public final class acm implements apb {
    /* renamed from: f */
    private static final aqg f9604f;
    /* renamed from: a */
    public final acc f9605a;
    /* renamed from: b */
    public final apa f9606b;
    /* renamed from: c */
    public final api f9607c;
    /* renamed from: d */
    public final apl f9608d;
    /* renamed from: e */
    public aqg f9609e;
    /* renamed from: g */
    private final Context f9610g;
    /* renamed from: h */
    private final aph f9611h;
    /* renamed from: i */
    private final Runnable f9612i;
    /* renamed from: j */
    private final Handler f9613j;
    /* renamed from: k */
    private final aou f9614k;

    static {
        aqg a = aqg.m592a(Bitmap.class);
        a.f887v = true;
        f9604f = a;
        aqg.m592a(any.class).f887v = true;
        aqg.m595b(afm.f413b).m597a(acg.LOW).m614h();
    }

    public acm(acc acc, apa apa, aph aph, Context context) {
        this(acc, apa, aph, new api(), context);
    }

    private acm(acc acc, apa apa, aph aph, api api, Context context) {
        aou apc;
        this.f9608d = new apl();
        this.f9612i = new acn(this);
        this.f9613j = new Handler(Looper.getMainLooper());
        this.f9605a = acc;
        this.f9606b = apa;
        this.f9611h = aph;
        this.f9607c = api;
        this.f9610g = context;
        Context applicationContext = context.getApplicationContext();
        aov aov = new aov(api);
        int checkSelfPermission = ge.checkSelfPermission(applicationContext, "android.permission.ACCESS_NETWORK_STATE");
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            String str;
            if (checkSelfPermission == 0) {
                str = "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor";
            } else {
                str = "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor";
            }
            Log.d("ConnectivityMonitor", str);
        }
        if (checkSelfPermission != 0) {
            apc = new apc();
        } else {
            apc = new aox(applicationContext, aov);
        }
        this.f9614k = apc;
        if ((arq.m655b() ^ 1) != 0) {
            this.f9613j.post(this.f9612i);
        } else {
            apa.mo316a(this);
        }
        apa.mo316a(this.f9614k);
        this.f9609e = acc.f189c.f212e.m606b().m596a();
        synchronized (acc.f194h) {
            if (acc.f194h.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            acc.f194h.add(this);
        }
    }

    /* renamed from: a */
    public final acj m6281a(Class cls) {
        return new acj(this.f9605a, this, cls, this.f9610g);
    }

    /* renamed from: a */
    public final acj m6280a() {
        return m6281a(Bitmap.class).m119a(f9604f);
    }

    /* renamed from: a */
    public final void m6282a(View view) {
        m6283a(new acp(view));
    }

    /* renamed from: a */
    public final void m6283a(aqs aqs) {
        if (aqs != null) {
            if (!arq.m655b()) {
                this.f9613j.post(new aco(this, aqs));
            } else if (!m6285b(aqs) && !this.f9605a.m101a(aqs) && aqs.mo2628a() != null) {
                aqb a = aqs.mo2628a();
                aqs.mo2630a(null);
                a.mo325c();
            }
        }
    }

    /* renamed from: b */
    public final void mo8b() {
        this.f9608d.mo8b();
        for (aqs a : arq.m651a(this.f9608d.f10128a)) {
            m6283a(a);
        }
        this.f9608d.f10128a.clear();
        api api = this.f9607c;
        for (aqb a2 : arq.m651a(api.f831a)) {
            api.m543a(a2, false);
        }
        api.f832b.clear();
        this.f9606b.mo317b(this);
        this.f9606b.mo317b(this.f9614k);
        this.f9613j.removeCallbacks(this.f9612i);
        acc acc = this.f9605a;
        synchronized (acc.f194h) {
            if (acc.f194h.contains(this)) {
                acc.f194h.remove(this);
            } else {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
        }
    }

    /* renamed from: c */
    public final void mo9c() {
        m6288e();
        this.f9608d.mo9c();
    }

    /* renamed from: d */
    public final void mo10d() {
        arq.m653a();
        api api = this.f9607c;
        api.f833c = true;
        for (aqb aqb : arq.m651a(api.f831a)) {
            if (aqb.mo329g()) {
                aqb.mo330h();
                api.f832b.add(aqb);
            }
        }
        this.f9608d.mo10d();
    }

    /* renamed from: e */
    public final void m6288e() {
        arq.m653a();
        api api = this.f9607c;
        api.f833c = false;
        for (aqb aqb : arq.m651a(api.f831a)) {
            if (!(aqb.mo327e() || aqb.mo326d() || aqb.mo329g())) {
                aqb.mo324b();
            }
        }
        api.f832b.clear();
    }

    public final String toString() {
        String obj = super.toString();
        String valueOf = String.valueOf(this.f9607c);
        String valueOf2 = String.valueOf(this.f9611h);
        int length = String.valueOf(obj).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 21) + String.valueOf(valueOf).length()) + String.valueOf(valueOf2).length());
        stringBuilder.append(obj);
        stringBuilder.append("{tracker=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", treeNode=");
        stringBuilder.append(valueOf2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* renamed from: b */
    final boolean m6285b(aqs aqs) {
        aqb a = aqs.mo2628a();
        if (a == null) {
            return true;
        }
        if (!this.f9607c.m543a(a, true)) {
            return false;
        }
        this.f9608d.f10128a.remove(aqs);
        aqs.mo2630a(null);
        return true;
    }
}
