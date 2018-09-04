package p000;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: ico */
public final class ico implements hus, hut {
    /* renamed from: a */
    public final huh f18175a;
    /* renamed from: b */
    public icp f18176b;
    /* renamed from: c */
    private final boolean f18177c;

    public ico(huh huh, boolean z) {
        this.f18175a = huh;
        this.f18177c = z;
    }

    /* renamed from: a */
    private final void m12072a() {
        htl.m3432b(this.f18176b, (Object) "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
    }

    /* renamed from: a */
    public final void mo1224a(int i) {
        m12072a();
        this.f18176b.mo1224a(i);
    }

    /* renamed from: a */
    public final void mo1225a(Bundle bundle) {
        m12072a();
        this.f18176b.mo1225a(bundle);
    }

    /* renamed from: a */
    public final void mo1226a(ConnectionResult connectionResult) {
        m12072a();
        this.f18176b.mo3124a(connectionResult, this.f18175a, this.f18177c);
    }
}
