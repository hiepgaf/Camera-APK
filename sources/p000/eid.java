package p000;

import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.google.android.apps.camera.bottombar.BottomBarController;

/* compiled from: PG */
/* renamed from: eid */
public class eid extends eic {
    /* renamed from: a */
    private how f23160a;
    /* renamed from: e */
    public BottomBarController f23161e;
    /* renamed from: f */
    public hcd f23162f;
    /* renamed from: g */
    public gwp f23163g;
    /* renamed from: h */
    public gal f23164h;

    /* renamed from: a */
    public void mo1562a() {
        this.f23160a.mo1757c();
        this.f23160a.mo1764i();
        this.f23161e.disablePhotoVideoSwitch();
    }

    /* renamed from: b */
    public void mo1563b() {
        this.f23160a.mo1750a();
        this.f23160a.mo1764i();
        this.f23161e.enablePhotoVideoSwitch();
    }

    /* renamed from: a */
    public void mo3561a(BottomBarController bottomBarController, hcd hcd, how how, Window window, gwp gwp, bcn bcn, gal gal) {
        this.f23161e = bottomBarController;
        this.f23162f = hcd;
        this.f23160a = how;
        this.f23163g = gwp;
        this.f23164h = gal;
        bcn.m791a();
        bottomBarController.switchToVideoIntent();
        hcd.m3025a(hbf.VIDEO_IDLE);
        hcd.f5955a.setVisibility(0);
        LayoutParams attributes = window.getAttributes();
        attributes.rotationAnimation = 3;
        window.setAttributes(attributes);
    }
}
