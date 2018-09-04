package p000;

import android.view.Window;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.ui.gridlines.GridLinesUi;
import com.google.android.apps.camera.ui.wirers.PreviewOverlay;

/* compiled from: PG */
/* renamed from: edf */
public class edf extends gqj {
    /* renamed from: a */
    public static final String f21234a = bli.m862a("CaptureStatechart");
    /* renamed from: b */
    public final eih f21235b;
    /* renamed from: c */
    public PreviewOverlay f21236c;
    /* renamed from: d */
    public GridLinesUi f21237d;
    /* renamed from: e */
    public Window f21238e;
    /* renamed from: f */
    public BottomBarController f21239f;
    /* renamed from: g */
    public hcd f21240g;
    /* renamed from: h */
    public int f21241h;
    /* renamed from: i */
    public how f21242i;
    /* renamed from: j */
    public gwp f21243j;
    /* renamed from: k */
    public final boolean f21244k;
    /* renamed from: l */
    public boolean f21245l;
    /* renamed from: m */
    public bxj f21246m;
    /* renamed from: n */
    private final ilp f21247n;

    public edf(eih eih, ilp ilp, boolean z) {
        super(null);
        this.f21235b = eih;
        this.f21247n = ilp;
        this.f21244k = z;
    }

    /* renamed from: a */
    public void mo3426a(kwk kwk, Window window, BottomBarController bottomBarController, hcd hcd, how how, gwp gwp, fbr fbr, bxj bxj) {
        hkg hkg = ((hes) kwk.mo345a()).f6120j;
        this.f21236c = (PreviewOverlay) hkg.m3223a((int) R.id.preview_overlay);
        this.f21237d = (GridLinesUi) hkg.m3223a((int) R.id.grid_lines);
        this.f21238e = window;
        this.f21239f = bottomBarController;
        this.f21240g = hcd;
        this.f21241h = window.getAttributes().rotationAnimation;
        this.f21242i = how;
        this.f21243j = gwp;
        this.f21246m = bxj;
    }
}
