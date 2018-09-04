package p000;

import android.graphics.SurfaceTexture;
import android.view.GestureDetector.OnGestureListener;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: dlj */
public final class dlj extends has {
    /* renamed from: b */
    private static final String f21085b = bli.m862a("VideoUI");
    /* renamed from: a */
    public ImageView f21086a;
    /* renamed from: c */
    private final cfh f21087c;
    /* renamed from: d */
    private final View f21088d;
    /* renamed from: e */
    private final OnGestureListener f21089e = new dlk();

    public dlj(cfh cfh, View view) {
        this.f21087c = cfh;
        this.f21088d = view;
        this.f21087c.mo2765t().inflate(R.layout.video_module, (ViewGroup) jri.m13152b((ViewGroup) this.f21088d.findViewById(R.id.root_module_layout)), true);
        ((ViewStub) this.f21088d.findViewById(R.id.camera_intent_layout_stub)).inflate();
        this.f21086a = (ImageView) jri.m13152b((ImageView) this.f21088d.findViewById(R.id.intent_review_imageview));
    }

    /* renamed from: a */
    public final OnGestureListener mo1119a() {
        return this.f21089e;
    }

    public final OnTouchListener k_() {
        return null;
    }

    public final void l_() {
    }

    /* renamed from: d */
    public final void mo1120d() {
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        bli.m863a(f21085b, "surfaceTexture is destroyed");
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
