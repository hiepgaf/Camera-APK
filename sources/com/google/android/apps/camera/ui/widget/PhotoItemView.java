package com.google.android.apps.camera.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
public class PhotoItemView extends FrameLayout {
    /* renamed from: a */
    public ImageView f2443a = null;
    /* renamed from: b */
    private ImageView f2444b = null;

    public PhotoItemView(Context context) {
        super(context);
    }

    public PhotoItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PhotoItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    public final ImageView m1339a() {
        if (this.f2444b == null) {
            this.f2444b = (ImageView) findViewById(R.id.photo_view);
        }
        return this.f2444b;
    }
}
