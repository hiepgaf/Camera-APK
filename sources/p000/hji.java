package p000;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.Timer;

/* compiled from: PG */
/* renamed from: hji */
public final class hji implements hus, hut {
    /* renamed from: a */
    public final huq f17906a;
    /* renamed from: b */
    public kpw f17907b;

    public hji(huq huq) {
        this.f17906a = huq;
    }

    /* renamed from: a */
    public final kpk m11858a() {
        this.f17906a.mo1828a((hut) this);
        this.f17906a.mo1827a((hus) this);
        this.f17907b = kpw.m18056d();
        this.f17906a.mo1829b();
        new Timer().schedule(new hjj(this), 500);
        return (kpk) jri.m13152b(this.f17907b);
    }

    /* renamed from: a */
    public final void mo1225a(Bundle bundle) {
        ((kpw) jri.m13152b(this.f17907b)).mo3557a(new hjk(this));
    }

    /* renamed from: a */
    public final void mo1226a(ConnectionResult connectionResult) {
        kpw kpw = (kpw) jri.m13152b(this.f17907b);
        String valueOf = String.valueOf(connectionResult);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 16);
        stringBuilder.append("Fail to connect ");
        stringBuilder.append(valueOf);
        kpw.m17780a(new IllegalStateException(stringBuilder.toString()));
    }

    /* renamed from: a */
    public final void mo1224a(int i) {
        kpw kpw = (kpw) jri.m13152b(this.f17907b);
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Connection gets suspended ");
        stringBuilder.append(i);
        kpw.m17780a(new IllegalStateException(stringBuilder.toString()));
    }
}
