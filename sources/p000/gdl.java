package p000;

import android.content.Context;
import com.google.android.GoogleCamera.R;
import java.util.Timer;

/* compiled from: PG */
/* renamed from: gdl */
public final class gdl implements iqo {
    /* renamed from: a */
    public final fbg f16823a;
    /* renamed from: b */
    public final fbe f16824b;
    /* renamed from: c */
    public final gds f16825c;
    /* renamed from: d */
    public final ikd f16826d;
    /* renamed from: e */
    public final Object f16827e = new Object();
    /* renamed from: f */
    public Boolean f16828f = Boolean.valueOf(false);
    /* renamed from: g */
    public boolean f16829g = true;
    /* renamed from: h */
    public int f16830h = go.aH;
    /* renamed from: i */
    private final Timer f16831i;

    public gdl(fbg fbg, gds gds, ikd ikd, ilb ilb, Context context, Timer timer) {
        this.f16823a = fbg;
        this.f16825c = gds;
        this.f16826d = ikd;
        this.f16831i = timer;
        fbf a = fbg.mo1334a();
        a.f4441d = context.getResources().getString(R.string.gouda_notification_tap_to_focus);
        a.f4438a = true;
        this.f16824b = a.m2217a();
        if (gds != null) {
            gds.mo1452a(new gdt(this, ilb));
        }
    }

    public final void close() {
        synchronized (this.f16827e) {
            this.f16831i.cancel();
            this.f16829g = false;
            m10992a();
            m10995c();
            this.f16825c.mo1452a(null);
        }
    }

    /* renamed from: a */
    public final void m10992a() {
        if (this.f16830h != go.aH) {
            this.f16830h = go.aH;
            m10994b();
            m10995c();
        }
    }

    /* renamed from: b */
    public final void m10994b() {
        this.f16823a.mo1336a(this.f16824b);
    }

    /* renamed from: c */
    public final void m10995c() {
        this.f16826d.execute(new gdm(this));
    }

    /* renamed from: d */
    public final void m10996d() {
        synchronized (this.f16827e) {
            this.f16830h = go.aH;
            this.f16829g = true;
            this.f16828f = Boolean.valueOf(false);
        }
    }

    /* renamed from: a */
    public final void m10993a(long j) {
        synchronized (this.f16827e) {
            if (this.f16829g) {
                this.f16831i.schedule(new gdn(this), j);
            }
        }
    }
}
