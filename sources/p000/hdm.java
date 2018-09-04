package p000;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.ui.toyboxmenu.ToyboxDrawerLayout;
import com.google.android.apps.camera.ui.toyboxmenu.ToyboxMenuButton;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: hdm */
public final class hdm implements OnItemClickListener, ld {
    /* renamed from: a */
    public final kz f17673a;
    /* renamed from: b */
    public final gal f17674b;
    /* renamed from: c */
    public hdo f17675c;
    /* renamed from: d */
    public int f17676d = 0;
    /* renamed from: e */
    private final ListView f17677e;
    /* renamed from: f */
    private final View f17678f;
    /* renamed from: g */
    private final hdt f17679g;
    /* renamed from: h */
    private final ToyboxMenuButton f17680h;
    /* renamed from: i */
    private final BottomBarController f17681i;
    /* renamed from: j */
    private final bpt f17682j;
    /* renamed from: k */
    private boolean f17683k = false;
    /* renamed from: l */
    private final gzy f17684l;
    /* renamed from: m */
    private final ilp f17685m;

    public hdm(gzy gzy, ilp ilp, ToyboxDrawerLayout toyboxDrawerLayout, ListView listView, BottomBarController bottomBarController, bpt bpt, ToyboxMenuButton toyboxMenuButton, hdt hdt, View view, gal gal) {
        this.f17681i = bottomBarController;
        this.f17682j = bpt;
        this.f17677e = (ListView) jri.m13152b((Object) listView);
        this.f17679g = (hdt) jri.m13152b((Object) hdt);
        this.f17677e.setOnItemClickListener(this);
        this.f17678f = (View) jri.m13152b((Object) view);
        this.f17673a = (kz) jri.m13152b((Object) toyboxDrawerLayout);
        kz kzVar = this.f17673a;
        kzVar.f8752c = 0;
        kzVar.invalidate();
        kzVar = this.f17673a;
        if (kzVar.f8757h == null) {
            kzVar.f8757h = new ArrayList();
        }
        kzVar.f8757h.add(this);
        this.f17673a.m5501b(1);
        this.f17674b = gal;
        this.f17684l = gzy;
        this.f17685m = ilp;
        this.f17680h = (ToyboxMenuButton) jri.m13152b((Object) toyboxMenuButton);
        this.f17680h.setOnClickListener(new hdn(this));
    }

    /* renamed from: a */
    public final void m11769a() {
        if (this.f17676d == 0) {
            this.f17673a.m5494a();
        }
    }

    public final void onDrawerClosed(View view) {
        if (((Boolean) this.f17685m.mo2860b()).booleanValue()) {
            this.f17684l.af();
        }
        this.f17681i.setSwitchButtonClickEnabled(true);
        this.f17674b.f4984b.m15087c();
    }

    public final void onDrawerOpened(View view) {
        this.f17684l.mo3072S();
        this.f17681i.setSwitchButtonClickEnabled(false);
        this.f17674b.f4984b.m15085b();
    }

    public final void onDrawerSlide(View view, float f) {
        boolean z;
        BottomBarController bottomBarController = this.f17681i;
        if (f == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        bottomBarController.setSwitchButtonClickEnabled(z);
        this.f17674b.f4984b.setAlpha(1.0f - f);
        this.f17678f.setAlpha(0.6f * f);
        ToyboxMenuButton toyboxMenuButton = this.f17680h;
        hdl hdl = toyboxMenuButton.f2426a;
        if (hdl != null) {
            if (f == 0.0f) {
                hdl.m3081a(false);
                toyboxMenuButton.setContentDescription(toyboxMenuButton.getResources().getString(R.string.hamburger_menu_open));
            } else if (f == 1.0f) {
                hdl.m3081a(true);
                toyboxMenuButton.setContentDescription(toyboxMenuButton.getResources().getString(R.string.hamburger_menu_close));
            }
            hdl hdl2 = toyboxMenuButton.f2426a;
            if (hdl2.f6052a != f) {
                hdl2.f6052a = f;
                hdl2.invalidateSelf();
            }
        }
    }

    public final void onDrawerStateChanged(int i) {
        if (!this.f17683k) {
            this.f17677e.setAdapter(this.f17679g);
            this.f17683k = true;
        }
        if (i == 2) {
            if (this.f17673a.m5503c()) {
                bpt bpt = this.f17682j;
                bpt.f1421e.cancel();
                if (((Integer) bpt.f1420d.mo2860b()).intValue() != 0) {
                    bpt.f1422f.setAlpha(1.0f);
                }
            } else {
                bpt bpt2 = this.f17682j;
                bpt2.f1421e.cancel();
                bpt2.f1422f.setAlpha(0.0f);
            }
        }
        this.f17676d = i;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        if (this.f17676d == 0) {
            this.f17675c.mo1207a((hhx) adapterView.getAdapter().getItem(i));
        }
    }

    /* renamed from: a */
    public final void m11770a(boolean z) {
        if (z) {
            this.f17673a.m5501b(0);
        } else {
            this.f17673a.m5501b(1);
        }
    }
}
