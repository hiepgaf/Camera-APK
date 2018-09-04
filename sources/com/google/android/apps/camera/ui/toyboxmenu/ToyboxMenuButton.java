package com.google.android.apps.camera.ui.toyboxmenu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import p000.hdl;
import p000.hdr;
import p000.hds;

/* compiled from: PG */
public class ToyboxMenuButton extends ImageView {
    /* renamed from: a */
    public hdl f2426a;

    public ToyboxMenuButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setLayerType(1, null);
        getResources();
        this.f2426a = new hdl(context, (byte) 0);
        setImageDrawable(this.f2426a);
    }

    /* renamed from: a */
    public final void m1332a(boolean z) {
        ViewPropertyAnimator duration = animate().alpha((float) z).setDuration(200);
        duration.withEndAction(new hdr(this, z));
        if (z) {
            duration.withStartAction(new hds(this));
        }
        setClickable(false);
        duration.start();
    }
}
