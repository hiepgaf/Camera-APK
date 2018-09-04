package com.google.android.apps.camera.ui.toyboxmenu;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import p000.hdy;
import p000.hij;
import p000.kz;

/* compiled from: PG */
public class ToyboxDrawerLayout extends kz {
    /* renamed from: k */
    private hij f12344k = new hij(this);

    public ToyboxDrawerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        hij hij = this.f12344k;
        hij.f6231c = hdy.m3084b(hij.f6229a.getContext());
    }

    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        hij hij = this.f12344k;
        if (hij.f6231c == -1) {
            throw new RuntimeException("onAttachedToWindow not called yet; current rotation unknown.");
        }
        int rotation = hij.f6229a.getDisplay().getRotation();
        if (rotation != hij.f6231c) {
            hij.f6230b.start();
        }
        hij.f6231c = rotation;
    }
}
