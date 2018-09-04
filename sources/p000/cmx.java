package p000;

import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;

/* compiled from: PG */
/* renamed from: cmx */
final class cmx implements OnClickListener {
    /* renamed from: a */
    private final /* synthetic */ Uri f2185a;
    /* renamed from: b */
    private final /* synthetic */ cmp f2186b;

    cmx(cmp cmp, Uri uri) {
        this.f2186b = cmp;
        this.f2185a = uri;
    }

    public final void onClick(View view) {
        cmy cmy = this.f2186b.f2160a;
        Uri uri = this.f2185a;
        if (cmy.f2187a.m8339c().m15146d() == 1) {
            cmy.f2187a.m8341e();
        } else {
            cmy.f2187a.m8336a(khb.m4864a(uri));
            cmy.f2187a.f12162f.mo709b();
        }
        cmy.f2187a.f12160d.m2745a();
        this.f2186b.m1192a();
    }
}
