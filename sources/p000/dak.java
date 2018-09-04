package p000;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.progressoverlay.ProgressOverlay;
import com.google.android.apps.camera.ui.views.CaptureAnimationOverlay;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: dak */
public final class dak {
    /* renamed from: a */
    public final ebd f2905a;
    /* renamed from: b */
    public final hfh f2906b;
    /* renamed from: c */
    public final Executor f2907c;
    /* renamed from: d */
    public final ImageView f2908d;
    /* renamed from: e */
    public final ProgressOverlay f2909e;
    /* renamed from: f */
    public final CaptureAnimationOverlay f2910f;
    /* renamed from: g */
    public final ham f2911g = new dam(this);
    /* renamed from: h */
    private final gyi f2912h;
    /* renamed from: i */
    private final View f2913i;

    public dak(ebd ebd, gyi gyi, View view, Executor executor) {
        this.f2905a = ebd;
        this.f2912h = gyi;
        this.f2907c = executor;
        this.f2913i = view;
        ((ViewStub) this.f2913i.findViewById(R.id.camera_intent_layout_stub)).inflate();
        this.f2908d = (ImageView) this.f2913i.findViewById(R.id.intent_review_imageview);
        this.f2906b = (hfh) hhz.m3162d(new hfh((FrameLayout) this.f2913i.findViewById(R.id.module_layout)));
        this.f2909e = (ProgressOverlay) this.f2913i.findViewById(R.id.intent_progress_bar);
        this.f2910f = (CaptureAnimationOverlay) this.f2913i.findViewById(R.id.intent_capture_animation_overlay);
    }

    /* renamed from: a */
    public final void m1569a() {
        ikd.m12259a();
        this.f2906b.m11788a();
    }

    /* renamed from: a */
    public final void m1571a(hfk hfk) {
        this.f2906b.f17744b = hfk;
    }

    /* renamed from: a */
    public final void m1572a(boolean z) {
        ikd.m12259a();
        this.f2905a.m9611c(z);
    }

    /* renamed from: b */
    public final void m1573b() {
        ikd.m12259a();
        this.f2908d.setVisibility(4);
        this.f2908d.setImageBitmap(null);
        this.f2909e.setVisibility(8);
        this.f2905a.m9611c(true);
        this.f2905a.m9622m();
        this.f2905a.m9621l();
    }

    /* renamed from: a */
    public final void m1570a(Bitmap bitmap, boolean z) {
        ikd.m12259a();
        if (z) {
            this.f2909e.setVisibility(0);
            this.f2909e.f2396a.start();
        } else {
            this.f2909e.f2396a.stop();
            this.f2909e.setVisibility(8);
        }
        this.f2911g.mo1132a(this.f2912h.mo1696a());
        this.f2908d.setImageBitmap(bitmap);
        this.f2908d.setVisibility(0);
    }
}
