package p000;

import android.widget.ImageButton;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.ui.gridlines.GridLinesUi;
import com.google.android.apps.camera.ui.toyboxmenu.ToyboxMenuButton;
import com.google.android.apps.camera.ui.wirers.PreviewOverlay;

/* compiled from: PG */
/* renamed from: edo */
public class edo extends edn {
    /* renamed from: a */
    public static final String f23070a = bli.m862a("DualCamChart");
    /* renamed from: b */
    public hdm f23071b;
    /* renamed from: c */
    public ToyboxMenuButton f23072c;
    /* renamed from: d */
    public ImageButton f23073d;
    /* renamed from: e */
    public PreviewOverlay f23074e;
    /* renamed from: f */
    public GridLinesUi f23075f;
    /* renamed from: g */
    public fbr f23076g;
    /* renamed from: h */
    public BottomBarController f23077h;
    /* renamed from: i */
    public hcd f23078i;
    /* renamed from: j */
    public gju f23079j;
    /* renamed from: k */
    public how f23080k;
    /* renamed from: l */
    public kbg f23081l;
    /* renamed from: m */
    public bsn f23082m;
    /* renamed from: n */
    public gwp f23083n;
    /* renamed from: o */
    private final ilp f23084o;

    public edo(ilp ilp) {
        this.f23084o = ilp;
    }

    /* renamed from: a */
    public void mo3560a(kwk kwk, hdm hdm, fbr fbr, BottomBarController bottomBarController, hcd hcd, gju gju, how how, kbg kbg, bsn bsn, gwp gwp) {
        hkg hkg = ((hes) kwk.mo345a()).f6120j;
        this.f23071b = hdm;
        this.f23074e = (PreviewOverlay) hkg.m3223a((int) R.id.preview_overlay);
        this.f23075f = (GridLinesUi) hkg.m3223a((int) R.id.grid_lines);
        this.f23076g = fbr;
        this.f23077h = bottomBarController;
        this.f23078i = hcd;
        this.f23079j = gju;
        this.f23080k = how;
        this.f23073d = (ImageButton) hkg.m3223a((int) R.id.closeButton);
        this.f23072c = (ToyboxMenuButton) hkg.m3223a((int) R.id.toybox_menu_button);
        this.f23081l = kbg;
        this.f23082m = bsn;
        this.f23083n = gwp;
    }
}
