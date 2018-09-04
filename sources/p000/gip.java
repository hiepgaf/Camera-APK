package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;

/* compiled from: PG */
/* renamed from: gip */
public final class gip implements emi, enz, eoc, eoj, eok, eol {
    /* renamed from: a */
    public final awi f16943a;
    /* renamed from: b */
    public final iqz f16944b;
    /* renamed from: c */
    public boolean f16945c = false;
    /* renamed from: d */
    private final Context f16946d;
    /* renamed from: e */
    private boolean f16947e;
    /* renamed from: f */
    private final BroadcastReceiver f16948f = new giq(this);
    /* renamed from: g */
    private final BroadcastReceiver f16949g = new gir(this);

    public gip(Context context, awi awi, ira ira) {
        this.f16946d = context;
        this.f16943a = awi;
        this.f16944b = ira.mo511a("ActivityCloseSec");
        this.f16947e = false;
    }

    /* renamed from: b */
    final void m11104b() {
        if (this.f16947e) {
            this.f16944b.mo514b("Detaching secure activity shutdown receivers.");
            this.f16946d.unregisterReceiver(this.f16948f);
            this.f16946d.unregisterReceiver(this.f16949g);
            this.f16947e = false;
        }
    }

    /* renamed from: a */
    public final void mo1491a() {
        m11104b();
    }

    /* renamed from: K */
    public final void mo1490K() {
        if (!this.f16947e) {
            this.f16944b.mo518d("Attaching secure activity shutdown receivers.");
            this.f16946d.registerReceiver(this.f16948f, new IntentFilter("android.intent.action.SCREEN_OFF"));
            this.f16946d.registerReceiver(this.f16949g, new IntentFilter("android.intent.action.USER_PRESENT"));
            this.f16947e = true;
        }
    }

    /* renamed from: f */
    public final void mo378f() {
        m11104b();
    }

    /* renamed from: i */
    public final void mo381i() {
        this.f16945c = true;
    }

    /* renamed from: j */
    public final void mo382j() {
        this.f16945c = false;
    }
}
