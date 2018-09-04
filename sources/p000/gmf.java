package p000;

import android.net.Uri;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: gmf */
final class gmf implements kov {
    /* renamed from: a */
    private final /* synthetic */ kpw f17043a;
    /* renamed from: b */
    private final /* synthetic */ gmb f17044b;

    gmf(gmb gmb, kpw kpw) {
        this.f17044b = gmb;
        this.f17043a = kpw;
    }

    /* renamed from: a */
    public final void mo349a(Throwable th) {
        this.f17043a.m17780a(th);
        this.f17044b.mo1481a(hci.m11747a(), true, th.getMessage());
    }

    public final /* synthetic */ void b_(Object obj) {
        obj = (Uri) obj;
        Uri uri = this.f17044b.f21506s;
        jri.m13152b((Object) uri);
        this.f17044b.f21504q.mo1637a((Uri) jri.m13152b(obj), uri);
        gkt gkt = this.f17044b;
        gkt.f21507t.onCapturePersisted(gkt.C, gkt.D);
        this.f17044b.f21511x.mo1524c();
        this.f17044b.m15769a(uri, new ArrayList());
        this.f17044b.m15777a("capturePersisted");
        this.f17043a.mo3557a(kbg.m4745c(uri));
        this.f17044b.f21497j.m793a(obj);
        this.f17044b.m15759B().mo565c(this.f17044b.f21496i);
    }
}
