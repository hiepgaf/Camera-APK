package p000;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: hes */
public final class hes {
    /* renamed from: a */
    public final FrameLayout f6111a;
    /* renamed from: b */
    public final FrameLayout f6112b;
    /* renamed from: c */
    public final FrameLayout f6113c;
    /* renamed from: d */
    public final FrameLayout f6114d;
    /* renamed from: e */
    public final kz f6115e;
    /* renamed from: f */
    public final ListView f6116f;
    /* renamed from: g */
    public final ImageView f6117g;
    /* renamed from: h */
    public final View f6118h;
    /* renamed from: i */
    public final View f6119i;
    /* renamed from: j */
    public final hkg f6120j;

    hes(hkg hkg) {
        ikd.m12259a();
        this.f6120j = hkg;
        this.f6111a = (FrameLayout) hkg.m3223a((int) R.id.camera_app_root);
        this.f6112b = (FrameLayout) hkg.m3223a((int) R.id.camera_app_root_overlay);
        this.f6113c = (FrameLayout) hkg.m3223a((int) R.id.camera_filmstrip_content_layout);
        this.f6119i = (View) hkg.m3223a((int) R.id.accessibility_affordances);
        this.f6114d = (FrameLayout) hkg.m3223a((int) R.id.optionsbar2);
        this.f6115e = (kz) hkg.m3223a((int) R.id.toybox_drawer);
        this.f6116f = (ListView) hkg.m3223a((int) R.id.toybox_drawer_list);
        this.f6117g = (ImageView) hkg.m3223a((int) R.id.toybox_menu_button);
        this.f6118h = (View) hkg.m3223a((int) R.id.preview_scrim);
    }
}
