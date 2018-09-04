package p000;

import android.net.Uri;
import com.google.android.GoogleCamera.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: gkn */
final class gkn implements kov {
    /* renamed from: a */
    private final /* synthetic */ List f16988a;
    /* renamed from: b */
    private final /* synthetic */ gkk f16989b;

    gkn(gkk gkk, List list) {
        this.f16989b = gkk;
        this.f16988a = list;
    }

    /* renamed from: a */
    public final void mo349a(Throwable th) {
        this.f16989b.mo1481a(hci.m11747a(), true, th.getMessage());
    }

    public final /* synthetic */ void b_(Object obj) {
        Uri uri = (Uri) obj;
        List arrayList = new ArrayList(this.f16988a);
        arrayList.add(uri);
        gkt gkt = this.f16989b;
        Uri uri2 = gkt.f21506s;
        gkt.f21504q.mo1637a(uri, uri2);
        gkt = this.f16989b;
        gkt.f21507t.onCapturePersisted(gkt.C, gkt.D);
        this.f16989b.f21511x.mo1524c();
        this.f16989b.mo2871a(hci.m11749a((int) R.string.burst_process_done, new Object[0]));
        this.f16989b.m15769a(uri2, arrayList);
        this.f16989b.h.m2608a(go.ba, go.bb, this.f16989b.mo3449s());
        this.f16989b.f21497j.m793a(uri);
        this.f16989b.f23259e.m8410b();
    }
}
