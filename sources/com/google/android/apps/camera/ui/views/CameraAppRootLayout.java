package com.google.android.apps.camera.ui.views;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.apps.camera.ui.layout.GcaLayout;
import p000.hdy;

/* compiled from: PG */
public class CameraAppRootLayout extends GcaLayout {
    public CameraAppRootLayout(Context context) {
        super(context);
    }

    public CameraAppRootLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CameraAppRootLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int stableInsetTop;
        super.onLayout(z, i, i2, i3, i4);
        if (hdy.m3085c(getContext())) {
            stableInsetTop = getRootWindowInsets().getStableInsetTop();
        } else {
            stableInsetTop = 0;
        }
        setPadding(0, stableInsetTop, 0, 0);
    }
}
