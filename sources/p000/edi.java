package p000;

import android.view.WindowManager.LayoutParams;

/* compiled from: PG */
/* renamed from: edi */
class edi extends gqj {
    /* renamed from: a */
    private final /* synthetic */ edf f21250a;

    edi(edf edf) {
        this.f21250a = edf;
        super(null);
    }

    /* renamed from: a */
    public final void mo1562a() {
        bli.m863a(edf.f21234a, "enter PhotoSphere state");
        this.f21250a.f21239f.switchToPhotoSphere();
        hcd hcd = this.f21250a.f21240g;
        hcd.m3025a(hbf.PHOTO_IDLE);
        hcd.f5955a.setVisibility(0);
        this.f21250a.f21237d.setVisibility(4);
        edf edf = this.f21250a;
        if (edf.f21245l) {
            edf.f21247n.mo348a(hhx.PANORAMA);
        } else {
            edf.f21247n.mo348a(hhx.PHOTO_SPHERE);
        }
        this.f21250a.f21236c.f2449d = false;
        bli.m871d(edf.f21234a, "Set rotation to crossfade");
        edf = this.f21250a;
        LayoutParams attributes = edf.f21238e.getAttributes();
        attributes.rotationAnimation = 1;
        edf.f21238e.setAttributes(attributes);
    }

    /* renamed from: b */
    public final void mo1563b() {
        bli.m863a(edf.f21234a, "exit PhotoSphere state");
        this.f21250a.f21236c.f2449d = true;
        bli.m871d(edf.f21234a, "Set rotation animation to seamless");
        edf edf = this.f21250a;
        int i = edf.f21241h;
        LayoutParams attributes = edf.f21238e.getAttributes();
        attributes.rotationAnimation = i;
        edf.f21238e.setAttributes(attributes);
    }

    /* renamed from: s */
    public void mo3002s() {
    }
}
