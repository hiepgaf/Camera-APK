package p000;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.legacy.app.filmstrip.widget.FilmstripShortTallBottomBarBackground;

/* compiled from: PG */
/* renamed from: ctw */
public final class ctw {
    /* renamed from: a */
    public final FrameLayout f2729a;
    /* renamed from: b */
    public final LinearLayout f2730b;
    /* renamed from: c */
    public final LinearLayout f2731c;
    /* renamed from: d */
    public final ImageView f2732d;
    /* renamed from: e */
    public final TextView f2733e;
    /* renamed from: f */
    public final ProgressBar f2734f;
    /* renamed from: g */
    public final ViewGroup f2735g;
    /* renamed from: h */
    public final View f2736h;
    /* renamed from: i */
    public final TextView f2737i;
    /* renamed from: j */
    public final View f2738j;
    /* renamed from: k */
    public final FilmstripShortTallBottomBarBackground f2739k;

    public ctw(hkg hkg) {
        hkg.m3223a((int) R.id.peekable_filmstrip_layout);
        hkg.m3223a((int) R.id.filmstrip_view);
        this.f2729a = (FrameLayout) hkg.m3223a((int) R.id.camera_filmstrip_content_layout);
        this.f2730b = (LinearLayout) hkg.m3223a((int) R.id.filmstrip_bottom_panel);
        this.f2731c = (LinearLayout) hkg.m3223a((int) R.id.filmstrip_badge);
        this.f2732d = (ImageView) hkg.m3223a((int) R.id.filmstrip_badge_icon);
        this.f2733e = (TextView) hkg.m3223a((int) R.id.filmstrip_badge_text);
        this.f2734f = (ProgressBar) hkg.m3223a((int) R.id.filmstrip_badge_progress_bar);
        this.f2735g = (ViewGroup) hkg.m3223a((int) R.id.camera_undo_deletion_bar);
        this.f2736h = (View) hkg.m3223a((int) R.id.camera_undo_deletion_button);
        this.f2737i = (TextView) hkg.m3223a((int) R.id.no_photos_text);
        this.f2738j = (View) hkg.m3223a((int) R.id.filmstrip_top_bar_gradient);
        this.f2739k = (FilmstripShortTallBottomBarBackground) hkg.m3223a((int) R.id.filmstrip_short_tall_bottom_bar_background);
    }
}
