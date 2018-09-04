package p000;

import android.graphics.Bitmap;

/* compiled from: PG */
/* renamed from: ddq */
final class ddq implements dbw {
    /* renamed from: a */
    public final /* synthetic */ dcr f20947a;

    ddq(dcr dcr) {
        this.f20947a = dcr;
    }

    /* renamed from: a */
    public final /* synthetic */ bug mo2951a(Object obj) {
        dat dat = (dat) obj;
        bug bug = this.f20947a;
        if (!bug.f20930f || bug.f20931g) {
            return null;
        }
        boolean z;
        ((dbu) bug.m991d()).mo2908G().execute(new ddr(this));
        dbx dbx = this.f20947a;
        Bitmap bitmap = dat.f2914a;
        kbg kbg = kau.f19138a;
        if (((dbm) this.f20947a.f20928d.f10663a).mo2893c().mo2898d().f4780d.mo2860b() != fxj.OFF) {
            z = true;
        } else {
            z = false;
        }
        return new ddu(dbx, bitmap, kbg, z, this.f20947a.f20928d);
    }
}
