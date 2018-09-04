package p000;

import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.google.android.apps.camera.bottombar.BottomBarController;

/* compiled from: PG */
/* renamed from: ehj */
public class ehj extends gqj {
    /* renamed from: a */
    private final ilp f21270a;
    /* renamed from: b */
    private how f21271b;
    /* renamed from: d */
    public BottomBarController f21272d;
    /* renamed from: e */
    public hcd f21273e;
    /* renamed from: f */
    public gwp f21274f;
    /* renamed from: g */
    public gal f21275g;

    public ehj(ilp ilp) {
        super(null);
        this.f21270a = ilp;
    }

    /* renamed from: a */
    public void mo1562a() {
        this.f21271b.mo1757c();
        this.f21271b.mo1764i();
        this.f21272d.disablePhotoVideoSwitch();
    }

    /* renamed from: b */
    public void mo1563b() {
        this.f21271b.mo1750a();
        this.f21271b.mo1764i();
        this.f21272d.enablePhotoVideoSwitch();
    }

    /* renamed from: a */
    public void mo3429a(BottomBarController bottomBarController, hcd hcd, how how, Window window, gwp gwp, bcn bcn, gal gal) {
        this.f21272d = bottomBarController;
        this.f21273e = hcd;
        this.f21274f = gwp;
        this.f21272d.switchToPhotoIntent();
        hcd hcd2 = this.f21273e;
        hcd2.m3025a(hbf.PHOTO_IDLE);
        hcd2.f5955a.setVisibility(0);
        this.f21271b = how;
        this.f21275g = gal;
        bcn.m791a();
        this.f21270a.mo348a(hhx.IMAGE_INTENT);
        LayoutParams attributes = window.getAttributes();
        attributes.rotationAnimation = 3;
        window.setAttributes(attributes);
    }
}
