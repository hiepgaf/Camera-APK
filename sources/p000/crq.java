package p000;

import android.view.View.OnClickListener;
import android.widget.Button;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.legacy.app.filmstrip.widget.FilmstripView;
import com.google.android.apps.camera.legacy.app.filmstrip.widget.PeekableFilmstripLayout;

/* compiled from: PG */
/* renamed from: crq */
public final class crq {
    /* renamed from: a */
    public final FilmstripView f2594a;
    /* renamed from: b */
    public final Button f2595b;
    /* renamed from: c */
    public final Button f2596c;
    /* renamed from: d */
    private final PeekableFilmstripLayout f2597d;
    /* renamed from: e */
    private final OnClickListener f2598e = new crr(this);
    /* renamed from: f */
    private final OnClickListener f2599f = new crs(this);

    public crq(FilmstripView filmstripView, PeekableFilmstripLayout peekableFilmstripLayout) {
        this.f2594a = filmstripView;
        this.f2597d = peekableFilmstripLayout;
        hkg a = hkg.m3221a(this.f2597d);
        this.f2595b = (Button) a.m3223a((int) R.id.accessibility_last_filmstrip_item_button);
        this.f2596c = (Button) a.m3223a((int) R.id.accessibility_next_filmstrip_item_button);
        this.f2595b.setOnClickListener(this.f2598e);
        this.f2596c.setOnClickListener(this.f2599f);
    }

    /* renamed from: a */
    public final void m1437a() {
        this.f2595b.setVisibility(8);
        this.f2596c.setVisibility(8);
    }
}
