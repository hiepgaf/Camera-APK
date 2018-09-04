package p000;

import android.content.res.Resources;
import android.view.View;
import android.view.Window;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.bottombar.C0042R;

/* compiled from: PG */
/* renamed from: gkd */
public final class gkd {
    /* renamed from: a */
    public final int f5281a;
    /* renamed from: b */
    public final int f5282b;
    /* renamed from: c */
    public final int f5283c;
    /* renamed from: d */
    public final int f5284d;
    /* renamed from: e */
    public final int f5285e;
    /* renamed from: f */
    public final int f5286f;
    /* renamed from: g */
    public final int f5287g;
    /* renamed from: h */
    public final int f5288h;
    /* renamed from: i */
    public final int f5289i;
    /* renamed from: j */
    public final int f5290j;
    /* renamed from: k */
    public final hif f5291k;
    /* renamed from: l */
    public final hif f5292l;
    /* renamed from: m */
    public final hif f5293m;
    /* renamed from: n */
    public final View f5294n;
    /* renamed from: o */
    public final Window f5295o;

    public gkd(gal gal, BottomBarController bottomBarController, hes hes, Window window) {
        this.f5295o = window;
        this.f5294n = (View) hes.f6120j.m3223a((int) R.id.activity_root_view);
        Resources resources = this.f5294n.getResources();
        this.f5281a = resources.getColor(R.color.main_layout_selfie_flash_color, null);
        this.f5282b = resources.getColor(R.color.main_layout_background_color, null);
        this.f5283c = resources.getColor(R.color.bottom_bar_selfie_flash_color, null);
        this.f5284d = resources.getColor(R.color.optionsbar_background_closed, null);
        this.f5285e = resources.getColor(C0042R.color.bottom_bar_selfie_flash_color, null);
        this.f5286f = resources.getColor(C0042R.color.bottom_bar_background_color, null);
        this.f5287g = resources.getColor(C0042R.color.front_back_switch_button_color_dark, null);
        this.f5288h = resources.getColor(C0042R.color.front_back_switch_button_color, null);
        this.f5289i = window.getNavigationBarColor();
        this.f5290j = resources.getColor(R.color.navigation_bar_selfie_flash_color, null);
        this.f5292l = bottomBarController.getBackgroundColorProperty();
        this.f5293m = bottomBarController.getCameraSwitchColorProperty();
        this.f5291k = new gbq(gal.f4984b);
    }

    /* renamed from: a */
    public final void m2583a() {
        this.f5292l.setColor(this.f5286f);
        this.f5294n.setBackgroundColor(this.f5282b);
        this.f5291k.setColor(this.f5284d);
        this.f5293m.setColor(this.f5288h);
        this.f5295o.setNavigationBarColor(this.f5289i);
    }
}
