package p000;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.legacy.app.filmstrip.widget.ExternalViewerButton;
import com.google.android.apps.camera.ui.widget.Cling;
import java.lang.ref.WeakReference;

@TargetApi(23)
/* compiled from: PG */
/* renamed from: crw */
public final class crw {
    /* renamed from: a */
    public final WeakReference f2612a;
    /* renamed from: b */
    public final ViewGroup f2613b;
    /* renamed from: c */
    public crx f2614c;
    /* renamed from: d */
    public final View f2615d;
    /* renamed from: e */
    public ExternalViewerButton f2616e;
    /* renamed from: f */
    public FrameLayout f2617f;
    /* renamed from: g */
    public View f2618g;
    /* renamed from: h */
    public TextView f2619h;
    /* renamed from: i */
    public boolean f2620i;
    /* renamed from: j */
    private final ViewGroup f2621j;
    /* renamed from: k */
    private ImageButton f2622k;
    /* renamed from: l */
    private ImageButton f2623l;
    /* renamed from: m */
    private ImageButton f2624m;
    /* renamed from: n */
    private ImageButton f2625n;
    /* renamed from: o */
    private FrameLayout f2626o;
    /* renamed from: p */
    private FrameLayout f2627p;
    /* renamed from: q */
    private FrameLayout f2628q;
    /* renamed from: r */
    private FrameLayout f2629r;
    /* renamed from: s */
    private View f2630s;

    crw(Activity activity, LayoutInflater layoutInflater, Resources resources, ctw ctw, gos gos) {
        this.f2612a = new WeakReference(activity);
        this.f2621j = ctw.f2730b;
        this.f2613b = ctw.f2729a;
        hkg a = hkg.m3221a(this.f2621j);
        this.f2615d = (View) a.m3223a((int) R.id.bottom_control_panel);
        this.f2622k = (ImageButton) a.m3223a((int) R.id.filmstrip_bottom_control_edit);
        this.f2622k.setOnClickListener(new cry(this));
        activity.registerForContextMenu(this.f2622k);
        this.f2622k.setLongClickable(false);
        this.f2627p = (FrameLayout) a.m3223a((int) R.id.filmstrip_bottom_control_edit_frame);
        this.f2616e = (ExternalViewerButton) a.m3223a((int) R.id.filmstrip_bottom_control_view);
        this.f2616e.setOnClickListener(new crz(this));
        this.f2617f = (FrameLayout) a.m3223a((int) R.id.filmstrip_bottom_control_view_frame);
        this.f2625n = (ImageButton) a.m3223a((int) R.id.filmstrip_bottom_control_details);
        this.f2625n.setOnClickListener(new csa(this));
        this.f2628q = (FrameLayout) a.m3223a((int) R.id.filmstrip_bottom_control_details_frame);
        this.f2623l = (ImageButton) a.m3223a((int) R.id.filmstrip_bottom_control_delete);
        this.f2623l.setOnClickListener(new csb(this));
        this.f2629r = (FrameLayout) a.m3223a((int) R.id.filmstrip_bottom_control_delete_frame);
        this.f2624m = (ImageButton) a.m3223a((int) R.id.filmstrip_bottom_control_share);
        this.f2624m.setOnClickListener(new csc(this));
        this.f2626o = (FrameLayout) a.m3223a((int) R.id.filmstrip_bottom_control_share_frame);
        this.f2630s = (View) a.m3223a((int) R.id.bottom_progress_panel);
        a.m3223a((int) R.id.bottom_session_progress_text);
        this.f2630s.setVisibility(4);
        this.f2619h = (TextView) a.m3223a((int) R.id.bottom_progress_error_text);
        this.f2618g = (View) a.m3223a((int) R.id.bottom_progress_error_panel);
        this.f2618g.setOnClickListener(new csd(this));
        if (gos.mo1535a("default_scope", "pref_should_show_refocus_viewer_cling")) {
            Cling cling = (Cling) layoutInflater.inflate(R.layout.cling_widget, null, false);
            cling.setText(resources.getString(R.string.cling_text_for_refocus_editor_button));
            this.f2613b.addView(cling, resources.getDimensionPixelSize(R.dimen.default_cling_width), -2);
            View view = this.f2616e;
            cum cum = cum.REFOCUS;
            if (cling == null) {
                bli.m873e(ExternalViewerButton.f2333a, "Cannot set a null cling for viewer");
                return;
            }
            view.f2335c.put(cum, cling);
            cling.m1338a(view);
        }
    }

    /* renamed from: a */
    public final void m1442a() {
        this.f2615d.setVisibility(4);
    }

    /* renamed from: b */
    public final void m1444b() {
        this.f2618g.setVisibility(4);
    }

    /* renamed from: a */
    public final void m1443a(boolean z) {
        int i;
        ImageButton imageButton = this.f2623l;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        imageButton.setVisibility(i);
        this.f2629r.setVisibility(i);
    }

    /* renamed from: b */
    public final void m1445b(boolean z) {
        int i;
        ImageButton imageButton = this.f2625n;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        imageButton.setVisibility(i);
        this.f2628q.setVisibility(i);
    }

    /* renamed from: c */
    public final void m1446c(boolean z) {
        int i;
        ImageButton imageButton = this.f2622k;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        imageButton.setVisibility(i);
        this.f2627p.setVisibility(i);
    }

    /* renamed from: d */
    public final void m1447d(boolean z) {
        int i;
        ImageButton imageButton = this.f2624m;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        imageButton.setVisibility(i);
        this.f2626o.setVisibility(i);
    }

    /* renamed from: e */
    public final void m1448e(boolean z) {
        this.f2624m.setEnabled(z);
    }

    /* renamed from: f */
    public final void m1449f(boolean z) {
        if (z) {
            this.f2621j.setVisibility(0);
        } else {
            this.f2621j.setVisibility(4);
        }
    }
}
