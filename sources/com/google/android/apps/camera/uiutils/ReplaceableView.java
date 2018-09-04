package com.google.android.apps.camera.uiutils;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import p000.jri;

/* compiled from: PG */
public class ReplaceableView extends View {
    public ReplaceableView(Context context) {
        super(context);
    }

    public ReplaceableView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final View m1341a(View view) {
        jri.m13139a(getParent(), (Object) "can't replace a view with no parent");
        ViewGroup viewGroup = (ViewGroup) getParent();
        int indexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeView(this);
        viewGroup.addView(view, indexOfChild);
        return view;
    }
}
