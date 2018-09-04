package p000;

import android.app.ActionBar;
import android.content.res.Resources;
import android.view.Window;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: cub */
public class cub extends gqj {
    /* renamed from: a */
    public static final String f20790a = bli.m862a("FilmstripUiState");
    /* renamed from: b */
    public crw f20791b;
    /* renamed from: c */
    public crt f20792c;
    /* renamed from: d */
    public ctw f20793d;
    /* renamed from: e */
    public ActionBar f20794e;
    /* renamed from: f */
    public gui f20795f;
    /* renamed from: g */
    private csl f20796g;
    /* renamed from: h */
    private Resources f20797h;
    /* renamed from: i */
    private Window f20798i;

    public cub() {
        super(0);
    }

    /* renamed from: a */
    public void mo1562a() {
        bli.m869c(f20790a, "Filmstrip Ui Enter");
        this.f20793d.f2737i.setVisibility(0);
        this.f20798i.setNavigationBarColor(this.f20797h.getColor(R.color.filmstrip_system_ui_background));
        this.f20798i.setStatusBarColor(this.f20797h.getColor(R.color.filmstrip_system_ui_background));
        this.f20798i.clearFlags(1024);
    }

    /* renamed from: b */
    public void mo1563b() {
        bli.m869c(f20790a, "Filmstrip Ui Exit");
        this.f20795f.mo1651a(1797);
        this.f20793d.f2737i.setVisibility(4);
        csl csl = this.f20796g;
        if (csl.f12610c.getVisibility() == 0) {
            csl.m8709a(false);
            csl.m8711b(false);
        }
        this.f20798i.setNavigationBarColor(this.f20797h.getColor(R.color.default_system_ui_background));
        this.f20798i.setStatusBarColor(this.f20797h.getColor(R.color.default_system_ui_background));
        this.f20798i.addFlags(1024);
    }

    /* renamed from: a */
    public void mo3401a(csh csh, crw crw, crt crt, csl csl, csp csp, ctw ctw, ActionBar actionBar, Resources resources, Window window, gui gui) {
        this.f20791b = crw;
        this.f20792c = crt;
        this.f20796g = csl;
        this.f20793d = ctw;
        this.f20794e = actionBar;
        this.f20797h = resources;
        this.f20798i = window;
        this.f20795f = gui;
    }
}
