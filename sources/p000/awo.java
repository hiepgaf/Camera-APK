package p000;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* renamed from: awo */
public final class awo implements awm {
    /* renamed from: a */
    public static final String f10438a = bli.m862a("IntentLauncher");
    /* renamed from: b */
    public final Context f10439b;
    /* renamed from: c */
    public final Class f10440c;
    /* renamed from: d */
    public final kwk f10441d;
    /* renamed from: e */
    private final awr f10442e;
    /* renamed from: f */
    private final boolean f10443f;
    /* renamed from: g */
    private final Activity f10444g;

    public awo(awr awr, Context context, kwk kwk, awn awn) {
        this.f10442e = (awr) jri.m13152b((Object) awr);
        this.f10439b = (Context) jri.m13152b((Object) context);
        this.f10443f = awn.f984c;
        this.f10444g = awn.f982a;
        this.f10440c = awn.f983b;
        this.f10441d = kwk;
    }

    /* renamed from: a */
    public final void mo371a(Intent intent) {
        m7096a(intent, false);
    }

    /* renamed from: a */
    private final void m7096a(Intent intent, boolean z) {
        jri.m13152b((Object) intent);
        if (this.f10443f) {
            KeyguardManager keyguardManager = (KeyguardManager) this.f10439b.getSystemService("keyguard");
            int i = ((hny) this.f10441d.mo345a()).f17952a;
            ((hny) this.f10441d.mo345a()).m11921a(go.bI);
            keyguardManager.requestDismissKeyguard(this.f10444g, new awp(this, intent, z, i));
            return;
        }
        this.f10442e.m721b(intent);
    }

    /* renamed from: b */
    public final void mo372b(Intent intent) {
        m7096a(intent, true);
    }
}
