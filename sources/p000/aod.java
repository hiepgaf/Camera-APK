package p000;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.app.SharedElementCallback;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: aod */
final class aod {
    /* renamed from: a */
    public final ada f798a;
    /* renamed from: b */
    public final List f799b;
    /* renamed from: c */
    public final acm f800c;
    /* renamed from: d */
    public boolean f801d;
    /* renamed from: e */
    public aoe f802e;
    /* renamed from: f */
    public boolean f803f;
    /* renamed from: g */
    public aoe f804g;
    /* renamed from: h */
    public Bitmap f805h;
    /* renamed from: i */
    public aoe f806i;
    /* renamed from: j */
    private final Handler f807j;
    /* renamed from: k */
    private final agw f808k;
    /* renamed from: l */
    private boolean f809l;
    /* renamed from: m */
    private acj f810m;

    aod(acc acc, ada ada, int i, int i2, ads ads, Bitmap bitmap) {
        agw agw = acc.f187a;
        acm b = acc.m100b(acc.f189c.getBaseContext());
        acj a = acc.m100b(acc.f189c.getBaseContext()).m6280a();
        aqg b2 = aqg.m595b(afm.f412a);
        while (b2.f889x) {
            b2 = b2.m606b();
        }
        b2.f867B = true;
        b2.f868c |= SharedElementCallback.MAX_IMAGE_SIZE;
        this(agw, b, ada, a.m119a(b2.m613g().m614h().m608b(i, i2)), ads, bitmap);
    }

    private aod(agw agw, acm acm, ada ada, acj acj, ads ads, Bitmap bitmap) {
        this.f799b = new ArrayList();
        this.f800c = acm;
        Handler handler = new Handler(Looper.getMainLooper(), new aog(this));
        this.f808k = agw;
        this.f807j = handler;
        this.f810m = acj;
        this.f798a = ada;
        m520a(ads, bitmap);
    }

    /* renamed from: a */
    final Bitmap m519a() {
        aoe aoe = this.f802e;
        return aoe == null ? this.f805h : aoe.f23447b;
    }

    /* renamed from: b */
    final int m522b() {
        return this.f798a.mo17f();
    }

    /* renamed from: c */
    final void m523c() {
        if (this.f801d && !this.f809l) {
            aoe aoe = this.f806i;
            if (aoe != null) {
                this.f806i = null;
                m521a(aoe);
                return;
            }
            this.f809l = true;
            int g = this.f798a.mo18g();
            long uptimeMillis = SystemClock.uptimeMillis();
            this.f798a.mo11a();
            this.f804g = new aoe(this.f807j, this.f798a.mo15d(), uptimeMillis + ((long) g));
            this.f810m.m119a(new aqg().m598a(new arf(Double.valueOf(Math.random())))).m120a(this.f798a).m122a(this.f804g, null);
        }
    }

    /* renamed from: a */
    final void m521a(aoe aoe) {
        this.f809l = false;
        if (this.f803f) {
            this.f807j.obtainMessage(2, aoe).sendToTarget();
        } else if (this.f801d) {
            if (aoe.f23447b != null) {
                m524d();
                aoe aoe2 = this.f802e;
                this.f802e = aoe;
                for (int size = this.f799b.size() - 1; size >= 0; size--) {
                    ((aof) this.f799b.get(size)).mo314c();
                }
                if (aoe2 != null) {
                    this.f807j.obtainMessage(2, aoe2).sendToTarget();
                }
            }
            m523c();
        } else {
            this.f806i = aoe;
        }
    }

    /* renamed from: d */
    final void m524d() {
        Bitmap bitmap = this.f805h;
        if (bitmap != null) {
            this.f808k.mo63a(bitmap);
            this.f805h = null;
        }
    }

    /* renamed from: a */
    final void m520a(ads ads, Bitmap bitmap) {
        aqe.m585a((Object) ads, "Argument must not be null");
        this.f805h = (Bitmap) aqe.m585a((Object) bitmap, "Argument must not be null");
        this.f810m = this.f810m.m119a(new aqg().m600a(ads, true));
    }
}
