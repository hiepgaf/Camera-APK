package p000;

import com.google.android.apps.camera.bottombar.RoundedThumbnailView;
import com.google.android.apps.camera.burstchip.BurstChip;

/* renamed from: cjv */
final /* synthetic */ class cjv implements ckd {
    /* renamed from: a */
    private final cjq f12102a;
    /* renamed from: b */
    private final hec f12103b;

    cjv(cjq cjq, hec hec) {
        this.f12102a = cjq;
        this.f12103b = hec;
    }

    /* renamed from: a */
    public final void mo702a(BurstChip burstChip) {
        cjq cjq = this.f12102a;
        RoundedThumbnailView roundedThumbnailView = (RoundedThumbnailView) jri.m13152b(cjq.f12097d);
        cjq.m8269a(new cjy(this.f12103b.mo1726a(burstChip.getContext().getResources())));
        roundedThumbnailView.post(new cjz(roundedThumbnailView));
    }
}
