package com.google.android.apps.camera.legacy.app.filmstrip.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.ui.widget.Cling;
import java.util.HashMap;
import java.util.Map;
import p000.bli;
import p000.cum;

/* compiled from: PG */
public class ExternalViewerButton extends ImageButton {
    /* renamed from: a */
    public static final String f2333a = bli.m862a("ExtViewerButton");
    /* renamed from: b */
    public cum f2334b = cum.INVISIBLE;
    /* renamed from: c */
    public final Map f2335c = new HashMap();

    public ExternalViewerButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m1251a();
    }

    /* renamed from: a */
    public static int m1250a(cum cum) {
        if (cum == cum.REFOCUS) {
            return R.drawable.ic_refocus;
        }
        if (cum == cum.PHOTO_SPHERE) {
            return R.drawable.ic_photosphere_normal;
        }
        if (cum == cum.BURST) {
            return R.drawable.ic_view_burst;
        }
        return R.drawable.ic_control_play;
    }

    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        m1251a();
    }

    /* renamed from: a */
    public final void m1251a() {
        for (Cling visibility : this.f2335c.values()) {
            Cling visibility2;
            visibility2.setVisibility(4);
        }
        if (isShown()) {
            visibility2 = (Cling) this.f2335c.get(this.f2334b);
            if (visibility2 != null) {
                visibility2.m1337a();
                visibility2.setVisibility(0);
            }
        }
    }
}
