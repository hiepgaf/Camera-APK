package p000;

import android.content.res.Configuration;

/* renamed from: fzj */
public final /* synthetic */ class fzj implements emn {
    /* renamed from: a */
    private final fzh f16671a;
    /* renamed from: b */
    private final fzm f16672b;

    public fzj(fzh fzh, fzm fzm) {
        this.f16671a = fzh;
        this.f16672b = fzm;
    }

    /* renamed from: a */
    public final void mo1144a(Configuration configuration) {
        fzh fzh = this.f16671a;
        fzo fzo = this.f16672b.f4856a;
        if (fzh.f4842d.containsKey(fzo)) {
            ((emn) fzh.f4842d.get(fzo)).mo1144a(configuration);
        }
    }
}
