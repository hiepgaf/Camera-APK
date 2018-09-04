package com.google.android.apps.camera.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.google.android.GoogleCamera.R;
import p000.bli;

/* compiled from: PG */
public class BurstItemView extends FrameLayout {
    /* renamed from: a */
    public ImageView f2437a;
    /* renamed from: b */
    public ImageView f2438b;

    static {
        bli.m862a("BurstItemView");
    }

    public BurstItemView(Context context) {
        super(context);
    }

    public BurstItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BurstItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public BurstItemView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f2437a = (ImageView) findViewById(R.id.burst_view);
        this.f2437a.setScaleType(ScaleType.CENTER_CROP);
        this.f2438b = (ImageView) findViewById(R.id.burst_center_badge);
    }
}
