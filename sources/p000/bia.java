package p000;

import android.view.Surface;

/* compiled from: PG */
/* renamed from: bia */
final class bia implements kov {
    /* renamed from: a */
    private final /* synthetic */ bhz f10904a;

    bia(bhz bhz) {
        this.f10904a = bhz;
    }

    /* renamed from: a */
    public final void mo349a(Throwable th) {
        bhz bhz = this.f10904a;
        Surface surface = bhz.f1176c;
        knk knk = bhz.f1174a;
        bli.m864a(bhy.f10898a, "Fails to start preview", th);
        if (surface.isValid()) {
            knk.m17780a(th);
            return;
        }
        bli.m866b(bhy.f10898a, "preview surface has became invalid");
        knk.mo3557a(null);
    }

    public final /* synthetic */ void b_(Object obj) {
        bhz bhz = this.f10904a;
        bhz.f1174a.mo3557a(bhz.f1175b);
    }
}
