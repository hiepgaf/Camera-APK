package p000;

import android.view.Surface;

/* compiled from: PG */
/* renamed from: bkd */
final class bkd extends fiw {
    /* renamed from: a */
    private final /* synthetic */ bkc f10978a;

    bkd(bkc bkc) {
        this.f10978a = bkc;
    }

    /* renamed from: a */
    public final void mo455a(Surface surface, long j) {
        String str = bjz.f20095a;
        StringBuilder stringBuilder = new StringBuilder(47);
        stringBuilder.append("onCaptureBufferLost: frame=");
        stringBuilder.append(j);
        bli.m866b(str, stringBuilder.toString());
        this.f10978a.f1233c.m17780a(new IllegalStateException("onCaptureBufferLost"));
        this.f10978a.f1234d.m14849b();
    }

    public final void a_(iwp iwp) {
        this.f10978a.f1232b.mo3557a((Object) iwp);
    }

    /* renamed from: a */
    public final void mo456a(iwm iwm) {
        String str = bjz.f20095a;
        int a = iwm.mo1909a();
        StringBuilder stringBuilder = new StringBuilder(35);
        stringBuilder.append("onCaptureFailed: reason=");
        stringBuilder.append(a);
        bli.m866b(str, stringBuilder.toString());
        this.f10978a.f1232b.m17780a(new IllegalStateException("onCaptureFailed"));
        this.f10978a.f1234d.m14849b();
    }

    /* renamed from: a */
    public final void mo508a(fhq fhq) {
        this.f10978a.f1231a.mo3557a(null);
    }
}
