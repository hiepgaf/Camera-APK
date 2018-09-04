package p000;

import android.net.Uri;

/* compiled from: PG */
/* renamed from: cpb */
final class cpb extends izy {
    /* renamed from: a */
    private final /* synthetic */ Uri f20772a;
    /* renamed from: b */
    private final /* synthetic */ coy f20773b;

    cpb(coy coy, Uri uri) {
        this.f20773b = coy;
        this.f20772a = uri;
    }

    public final /* synthetic */ void a_(Object obj) {
        err err = (err) obj;
        ikd.m12259a();
        int a = this.f20773b.mo997a(this.f20772a);
        if (a != crb.f2579a) {
            cre a2 = this.f20773b.f12454i.m1424a(a);
            if (err == null) {
                a2.mo1065d();
                this.f20773b.f12447b.mo668b(a, a2);
                return;
            }
            this.f20773b.m8535a(a, err);
        }
    }
}
