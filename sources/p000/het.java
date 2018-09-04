package p000;

import android.view.ViewStub;
import android.widget.FrameLayout;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.bottombar.BottomBar;
import com.google.android.apps.camera.bottombar.RoundedThumbnailView;
import com.google.android.apps.camera.ui.views.MainActivityLayout;

/* compiled from: PG */
/* renamed from: het */
public final class het {
    /* renamed from: a */
    public final ViewStub f6121a;
    /* renamed from: b */
    public final ViewStub f6122b;
    /* renamed from: c */
    public final MainActivityLayout f6123c;
    /* renamed from: d */
    public final FrameLayout f6124d;
    /* renamed from: e */
    public final FrameLayout f6125e;
    /* renamed from: f */
    public final BottomBar f6126f;
    /* renamed from: g */
    public final RoundedThumbnailView f6127g = this.f6126f.getThumbnailButton();
    /* renamed from: h */
    public final hkg f6128h;

    public het(hkg hkg) {
        ikd.m12259a();
        this.f6128h = (hkg) jri.m13152b((Object) hkg);
        this.f6123c = (MainActivityLayout) hkg.m3223a((int) R.id.activity_root_view);
        this.f6121a = (ViewStub) hkg.m3223a((int) R.id.camera_frame_bottom_layout_stub);
        this.f6122b = (ViewStub) hkg.m3223a((int) R.id.camera_frame_overlay_layout_stub);
        this.f6124d = (FrameLayout) hkg.m3223a((int) R.id.viewfinder_frame);
        this.f6125e = (FrameLayout) hkg.m3223a((int) R.id.viewfinder_cover);
        hkg.m3223a((int) R.id.mode_switcher_ui_hold);
        this.f6126f = (BottomBar) hkg.m3223a((int) R.id.bottom_bar);
    }
}
