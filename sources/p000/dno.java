package p000;

import android.content.Intent;
import android.net.Uri;

/* compiled from: PG */
/* renamed from: dno */
final class dno implements dob {
    /* renamed from: a */
    private final /* synthetic */ dnl f21137a;

    dno(dnl dnl) {
        this.f21137a = dnl;
    }

    /* renamed from: a */
    public final /* synthetic */ bug mo2951a(Object obj) {
        bug bug = this.f21137a;
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setFlags(1);
        intent.setDataAndType((Uri) bug.f21134e.mo2081a(), bug.f21133d.m814b().f7545i);
        try {
            ((doa) bug.m991d()).f13606K.mo2749b(intent);
        } catch (Throwable e) {
            bli.m867b(dnl.f21132c, "Couldn't view video", e);
        }
        return null;
    }
}
