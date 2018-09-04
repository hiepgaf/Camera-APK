package p000;

import com.google.android.apps.camera.optionsbar.OptionsBarView;

/* renamed from: gbk */
public final /* synthetic */ class gbk implements fzq {
    /* renamed from: a */
    private final OptionsBarView f16726a;
    /* renamed from: b */
    private final fzm f16727b;

    public gbk(OptionsBarView optionsBarView, fzm fzm) {
        this.f16726a = optionsBarView;
        this.f16727b = fzm;
    }

    /* renamed from: a */
    public final void mo1435a(fzp fzp) {
        OptionsBarView optionsBarView = this.f16726a;
        fzq fzq = (fzq) optionsBarView.f20396a.get(this.f16727b);
        if (fzq != null) {
            fzq.mo1435a(fzp);
        }
        optionsBarView.m15076a();
    }
}
