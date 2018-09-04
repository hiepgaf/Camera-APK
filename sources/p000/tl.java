package p000;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;

/* compiled from: PG */
/* renamed from: tl */
final class tl implements OnScrollListener {
    /* renamed from: a */
    private final /* synthetic */ tg f9281a;

    tl(tg tgVar) {
        this.f9281a = tgVar;
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 1 && !this.f9281a.m14422h() && this.f9281a.f19629r.getContentView() != null) {
            tg tgVar = this.f9281a;
            tgVar.f19626o.removeCallbacks(tgVar.f19625n);
            this.f9281a.f19625n.run();
        }
    }
}
