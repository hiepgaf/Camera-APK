package p000;

import android.net.Uri;

/* compiled from: PG */
/* renamed from: dnq */
final class dnq implements dob {
    /* renamed from: a */
    public final /* synthetic */ dnl f21139a;

    dnq(dnl dnl) {
        this.f21139a = dnl;
    }

    /* renamed from: a */
    public final /* synthetic */ bug mo2951a(Object obj) {
        ((doa) this.f21139a.m991d()).f13609b.f3124c.f21086a.setVisibility(8);
        bug bug = this.f21139a;
        bgl bgl = bug.f21133d;
        if (bgl != null) {
            bgl.f1133a.delete();
            if (((doa) bug.m991d()).f13604I.mo2084b()) {
                ((doa) bug.m991d()).f13622o.delete((Uri) ((doa) bug.m991d()).f13604I.mo2081a(), null, null);
            }
        }
        ((doa) bug.m991d()).m9188a(null);
        ((doa) this.f21139a.m991d()).f13633z.m2231a();
        ((doa) this.f21139a.m991d()).f13609b.m1655a();
        ((doa) this.f21139a.m991d()).f13610c.execute(new dnr(this));
        return new dmd(this.f21139a);
    }
}
