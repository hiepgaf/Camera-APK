package p000;

import android.net.Uri;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: gnc */
final class gnc implements kov {
    /* renamed from: a */
    private final /* synthetic */ kpw f17115a;
    /* renamed from: b */
    private final /* synthetic */ gmz f17116b;

    gnc(gmz gmz, kpw kpw) {
        this.f17116b = gmz;
        this.f17115a = kpw;
    }

    /* renamed from: a */
    public final void mo349a(Throwable th) {
        this.f17115a.m17780a(th);
        this.f17116b.mo1481a(hci.m11747a(), true, th.getMessage());
    }

    public final /* synthetic */ void b_(Object obj) {
        Uri uri = (Uri) obj;
        Uri uri2 = this.f17116b.f21506s;
        jri.m13152b((Object) uri2);
        this.f17116b.f21504q.mo1637a(uri, uri2);
        gkt gkt = this.f17116b;
        gkt.f21507t.onCapturePersisted(gkt.C, gkt.D);
        this.f17116b.f21511x.mo1524c();
        this.f17116b.m15769a(uri2, new ArrayList());
        this.f17116b.m15777a("capturePersisted");
        this.f17115a.mo3557a(kbg.m4744b(uri2));
        this.f17116b.f21497j.m793a(uri);
    }
}
