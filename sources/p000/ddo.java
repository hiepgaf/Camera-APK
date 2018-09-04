package p000;

import android.graphics.Bitmap;

/* compiled from: PG */
/* renamed from: ddo */
final class ddo implements dbw {
    /* renamed from: a */
    public final /* synthetic */ dcr f20946a;

    ddo(dcr dcr) {
        this.f20946a = dcr;
    }

    /* renamed from: a */
    public final /* synthetic */ bug mo2951a(Object obj) {
        dbb dbb = (dbb) obj;
        bug bug = this.f20946a;
        if (!bug.f20931g) {
            return null;
        }
        boolean z;
        bug.f20931g = false;
        ((dbu) bug.m991d()).mo2908G().execute(new ddp(this));
        dbx dbx = this.f20946a;
        Bitmap bitmap = dbb.f2925a;
        kbg c = kbg.m4745c(dbb.f2926b);
        if (((dbm) this.f20946a.f20928d.f10663a).mo2893c().mo2898d().f4780d.mo2860b() != fxj.OFF) {
            z = true;
        } else {
            z = false;
        }
        return new ddu(dbx, bitmap, c, z, this.f20946a.f20928d);
    }
}
