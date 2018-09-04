package p000;

import android.content.Intent;

/* compiled from: PG */
/* renamed from: dmd */
public final class dmd extends doc {
    static {
        bli.m862a("VidIntForegroundST");
    }

    public dmd(doc doc) {
        super((bug) doc);
    }

    /* renamed from: b */
    public final /* synthetic */ bug mo1134b() {
        return mo2971e();
    }

    /* renamed from: e */
    public final doc mo2971e() {
        iut iut;
        iur iur;
        Intent intent = ((doa) m991d()).f13608a;
        if (awl.m715c(intent) && awl.m716d(intent)) {
            iut = iut.FRONT;
        } else {
            iut = ((doa) m991d()).f13615h.m1694a();
        }
        iur b = ((doa) m991d()).f13612e.mo1346b(iut);
        if (b == null) {
            b = ((doa) m991d()).f13612e.mo1348c();
            jri.m13139a((Object) b, (Object) "No cameras on the device!!!");
            iur = b;
        } else {
            iur = b;
        }
        return new dmf(this, iut, iur, ((doa) m991d()).f13612e.m10176b(iur));
    }
}
