package p000;

import android.net.Uri;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: gmk */
final class gmk implements kov {
    /* renamed from: a */
    private final /* synthetic */ kpw f17059a;
    /* renamed from: b */
    private final /* synthetic */ gmi f17060b;

    gmk(gmi gmi, kpw kpw) {
        this.f17060b = gmi;
        this.f17059a = kpw;
    }

    /* renamed from: a */
    public final void mo349a(Throwable th) {
        this.f17060b.m17436q();
        this.f17060b.m15777a("captureFailed");
        this.f17060b.mo1481a(hci.m11747a(), true, th.getMessage());
        m11195a();
        this.f17059a.m17780a(th);
    }

    public final /* synthetic */ void b_(Object obj) {
        Uri uri = (Uri) obj;
        Uri uri2 = this.f17060b.f21506s;
        jri.m13152b((Object) uri2);
        this.f17060b.f21504q.mo1637a(uri, uri2);
        gkt gkt = this.f17060b;
        gkt.f21507t.onCapturePersisted(gkt.C, gkt.D);
        this.f17060b.f21511x.mo1524c();
        this.f17060b.m15769a(uri2, new ArrayList());
        this.f17060b.m15777a("capturePersisted");
        this.f17060b.f21497j.m793a(uri);
        m11195a();
        this.f17059a.mo3557a(kbg.m4744b(uri2));
    }

    /* renamed from: a */
    private final void m11195a() {
        gmi gmi = this.f17060b;
        if (gmi.E != null) {
            gmi.E.mo3058a();
            String str = gmi.f23266a;
            String valueOf = String.valueOf(this.f17060b.E);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 27);
            stringBuilder.append("Unblocked file saving task ");
            stringBuilder.append(valueOf);
            bli.m869c(str, stringBuilder.toString());
        }
    }
}
