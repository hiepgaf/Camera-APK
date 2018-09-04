package com.google.android.apps.camera.legacy.lightcycle.ui;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.GoogleCamera.R;
import com.google.android.libraries.smartburst.filterfw.decoder.MediaDecoder;
import p000.elv;
import p000.elw;
import p000.emb;

/* compiled from: PG */
public class PhotoSphereMessageOverlay extends FrameLayout {
    /* renamed from: a */
    public static final int f2380a = R.string.hit_target_to_start;
    /* renamed from: b */
    public static final int f2381b = R.string.tap_to_start;
    /* renamed from: c */
    public static final int f2382c = R.string.too_fast;
    /* renamed from: d */
    public final Handler f2383d = new Handler();
    /* renamed from: e */
    public boolean f2384e = false;
    /* renamed from: f */
    public boolean f2385f = true;
    /* renamed from: g */
    private final int[] f2386g = new int[]{R.id.short_info_message, R.id.long_message_overlay, R.id.rotate_device_icon};

    public PhotoSphereMessageOverlay(Context context) {
        super(context.getApplicationContext());
    }

    public PhotoSphereMessageOverlay(Context context, AttributeSet attributeSet) {
        super(context.getApplicationContext(), attributeSet);
    }

    /* renamed from: a */
    public final void m1321a() {
        this.f2383d.post(new elw(this));
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        View findViewById = findViewById(R.id.short_info_message);
        LayoutParams layoutParams = (LayoutParams) findViewById.getLayoutParams();
        float dimension = getResources().getDimension(R.dimen.photosphere_overlay_message_short_layout_width);
        float dimension2 = getResources().getDimension(R.dimen.photosphere_overlay_message_short_layout_height);
        float dimension3 = getResources().getDimension(R.dimen.photosphere_overlay_message_short_layout_marginTop);
        layoutParams.width = (int) dimension;
        layoutParams.height = (int) dimension2;
        layoutParams.setMargins(0, (int) dimension3, 0, 0);
        findViewById.requestLayout();
    }

    /* renamed from: a */
    public final void m1322a(int i) {
        for (int findViewById : this.f2386g) {
            int i2;
            LayoutParams layoutParams = (LayoutParams) findViewById(findViewById).getLayoutParams();
            if (i == MediaDecoder.ROTATE_180) {
                i2 = 80;
            } else {
                i2 = 48;
            }
            layoutParams.gravity = i2 | 1;
        }
    }

    /* renamed from: b */
    public final void m1324b(int i) {
        this.f2383d.post(new elv(this, i));
    }

    /* renamed from: a */
    public final void m1323a(boolean z, int i) {
        this.f2383d.post(new emb(this, z, i));
    }
}
