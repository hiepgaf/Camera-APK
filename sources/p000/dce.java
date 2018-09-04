package p000;

import android.content.Intent;

/* compiled from: PG */
/* renamed from: dce */
public final class dce extends dbx {
    public dce(dbx dbx) {
        super((bug) dbx);
    }

    /* renamed from: b */
    public final /* synthetic */ bug mo1134b() {
        return mo2952e();
    }

    /* renamed from: e */
    public final dbx mo2952e() {
        iut iut;
        iur iur;
        Intent E = ((dbu) m991d()).mo2906E();
        if (awl.m715c(E) && awl.m716d(E)) {
            iut = iut.FRONT;
        } else {
            iut = ((dbu) m991d()).mo2931g().m1694a();
        }
        iur b = ((dbu) m991d()).mo2910I().mo1346b(iut);
        if (b == null) {
            b = ((dbu) m991d()).mo2910I().mo1348c();
            jri.m13139a((Object) b, (Object) "No cameras on the device!!!");
            iur = b;
        } else {
            iur = b;
        }
        return new dch(this, iut, iur, ((dbu) m991d()).mo2910I().m10176b(iur));
    }
}
