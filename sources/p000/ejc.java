package p000;

import android.net.Uri;

/* compiled from: PG */
/* renamed from: ejc */
final class ejc implements kov {
    /* renamed from: a */
    private final /* synthetic */ Uri f15205a;
    /* renamed from: b */
    private final /* synthetic */ eja f15206b;

    ejc(eja eja, Uri uri) {
        this.f15206b = eja;
        this.f15205a = uri;
    }

    /* renamed from: a */
    public final void mo349a(Throwable th) {
        bli.m873e(eja.f15197a, "Fail to connect to GoogleApiClient");
    }

    public final /* synthetic */ void b_(Object obj) {
        hjk hjk = (hjk) obj;
        this.f15206b.f15203g.mo1568a(14, 1);
        Uri uri = this.f15205a;
        huq huq = hjk.f6271a.f17906a;
        huq.mo1846a(new iao(huq, uri)).mo1807a(this.f15206b);
    }
}
