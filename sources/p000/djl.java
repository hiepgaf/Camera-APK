package p000;

import android.net.Uri;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: djl */
final class djl implements kov {
    /* renamed from: a */
    private final /* synthetic */ djm f13493a;
    /* renamed from: b */
    private final /* synthetic */ dix f13494b;

    djl(dix dix, djm djm) {
        this.f13494b = dix;
        this.f13493a = djm;
    }

    /* renamed from: a */
    public final void mo349a(Throwable th) {
        this.f13494b.f13480u.m2637a(null, hci.m11747a(), false);
    }

    public final /* synthetic */ void b_(Object obj) {
        Uri uri = (Uri) obj;
        this.f13494b.f13478s.mo1637a(uri, this.f13493a.mo1149c());
        err a = this.f13494b.f13466g.m8670a(uri);
        erk erk = this.f13494b.f13470k;
        String str = a.f12515e.f4154g;
        erj erj = new erj();
        erk.m2031a(erj, str);
        a.f12516f = erj.m2030a();
        this.f13494b.f13482w.mo1009a(a, true);
        this.f13494b.f13480u.m2638a(this.f13493a.mo1149c(), new ArrayList());
        this.f13494b.f13472m.f1076a.m2510a(new bcx(uri));
    }
}
