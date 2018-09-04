package com.google.android.apps.camera.legacy.app.filmstrip.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.GoogleCamera.R;
import p000.hkg;

/* compiled from: PG */
public class FilmstripShortTallBottomBarBackground extends FrameLayout {
    /* renamed from: a */
    private View f2336a;
    /* renamed from: b */
    private View f2337b;

    public FilmstripShortTallBottomBarBackground(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        switch (configuration.orientation) {
            case 1:
                m1252a();
                return;
            case 2:
                this.f2336a.setVisibility(0);
                this.f2337b.setVisibility(8);
                return;
            default:
                m1252a();
                return;
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        hkg a = hkg.m3221a((View) this);
        this.f2336a = (View) a.m3223a((int) R.id.filmstrip_short_bottom_bar_gradient);
        this.f2337b = (View) a.m3223a((int) R.id.filmstrip_tall_bottom_bar_gradient);
    }

    /* renamed from: a */
    private final void m1252a() {
        this.f2336a.setVisibility(8);
        this.f2337b.setVisibility(0);
    }
}
