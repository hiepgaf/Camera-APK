package p000;

import android.net.Uri;

/* compiled from: PG */
/* renamed from: fsg */
final class fsg implements gfn {
    /* renamed from: a */
    private final /* synthetic */ fsf f16495a;

    fsg(fsf fsf) {
        this.f16495a = fsf;
    }

    /* renamed from: a */
    public final void mo1417a(ggu ggu, ggs ggs) {
        gfn gfn = this.f16495a.f4679c;
        if (gfn != null) {
            gfn.mo1417a(ggu, ggs);
        }
    }

    /* renamed from: a */
    public final void mo1418a(ggu ggu, ggv ggv) {
        gfn gfn = this.f16495a.f4679c;
        if (gfn != null) {
            gfn.mo1418a(ggu, ggv);
        }
        if (ggu.f5173a == go.aV) {
            this.f16495a.f4677a = true;
        } else if (ggu.f5173a == go.aW) {
            this.f16495a.f4678b = true;
        }
        fsf fsf = this.f16495a;
        if (fsf.f4677a && fsf.f4678b) {
            fsf.f4679c = null;
        }
    }

    /* renamed from: a */
    public final void mo1416a(ggu ggu, Uri uri) {
        gfn gfn = this.f16495a.f4679c;
        if (gfn != null) {
            gfn.mo1416a(ggu, uri);
        }
    }

    /* renamed from: a */
    public final void mo1415a(ggu ggu) {
    }
}
