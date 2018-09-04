package p000;

import android.content.Context;
import android.os.Handler;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.ui.wirers.PreviewOverlay;

/* compiled from: PG */
/* renamed from: hhs */
public final class hhs implements hhj {
    /* renamed from: a */
    public static final String f17872a = bli.m862a("VgmUiWirer");
    /* renamed from: b */
    private final kwk f17873b;
    /* renamed from: c */
    private final Context f17874c;
    /* renamed from: d */
    private final hnh f17875d;
    /* renamed from: e */
    private final hnf f17876e;
    /* renamed from: f */
    private final bpt f17877f;
    /* renamed from: g */
    private final how f17878g;
    /* renamed from: h */
    private final gyz f17879h;
    /* renamed from: i */
    private final ilp f17880i;
    /* renamed from: j */
    private final BottomBarController f17881j;

    public hhs(kwk kwk, Context context, hnh hnh, hnf hnf, bpt bpt, how how, gyz gyz, ilp ilp, BottomBarController bottomBarController) {
        this.f17873b = kwk;
        this.f17874c = context;
        this.f17875d = hnh;
        this.f17876e = hnf;
        this.f17877f = bpt;
        this.f17878g = how;
        this.f17879h = gyz;
        this.f17880i = ilp;
        this.f17881j = bottomBarController;
    }

    /* renamed from: a */
    public final void mo1729a() {
        PreviewOverlay previewOverlay = (PreviewOverlay) ((hes) this.f17873b.mo345a()).f6120j.m3223a((int) R.id.preview_overlay);
        hnq hnq = new hnq(this.f17878g);
        hnp hnp = this.f17876e;
        Context context = this.f17874c;
        previewOverlay.f2448c = new hhy(new hnu(new hnx(context, new Handler(context.getMainLooper())), new hnm(this.f17879h.f5830d), new hnt(this.f17877f, this.f17879h.f5830d), hnp, new hht(this.f17875d), hnq, new hnk(this.f17878g, this.f17881j), new hnl(this.f17879h.f5830d), this.f17880i, previewOverlay.getRootView(), this.f17874c));
    }
}
