package com.google.android.apps.camera.ui.modeswitch;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.ui.layout.GcaLayout;
import p000.go;
import p000.gzc;
import p000.hhx;

/* compiled from: PG */
public class ViewfinderCover extends GcaLayout {
    /* renamed from: b */
    public ImageView f12341b;
    /* renamed from: c */
    public AnimatedVectorDrawable f12342c;
    /* renamed from: d */
    public final ObjectAnimator f12343d = ObjectAnimator.ofFloat(this, View.ALPHA, new float[]{1.0f, 0.0f});

    public ViewfinderCover(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12343d.setDuration(250);
        this.f12343d.addListener(new gzc(this));
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f12341b = (ImageView) findViewById(R.id.viewfinder_cover_icon);
        this.f12341b.setImageDrawable(hhx.PHOTO.m3151a(getResources()));
    }

    @Deprecated
    /* renamed from: a */
    public final void m8432a(int i, hhx hhx, int i2) {
        m8433a(hhx);
        if (i2 == go.bo) {
            i = -i;
        }
        this.f12341b.setTranslationX((float) i);
    }

    /* renamed from: a */
    public final void m8431a() {
        this.f12341b.setTranslationX(0.0f);
        this.f12343d.cancel();
        setAlpha(1.0f);
        setVisibility(0);
    }

    /* renamed from: a */
    public final void m8433a(hhx hhx) {
        this.f12341b.setImageDrawable(hhx.m3151a(getResources()));
        this.f12341b.setVisibility(0);
    }
}
