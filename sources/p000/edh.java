package p000;

import android.view.WindowManager.LayoutParams;

/* compiled from: PG */
/* renamed from: edh */
class edh extends gqj {
    /* renamed from: a */
    private final /* synthetic */ edf f21249a;

    edh(edf edf) {
        this.f21249a = edf;
        super(null);
    }

    /* renamed from: a */
    public final void mo1562a() {
        bli.m863a(edf.f21234a, "enter Panorama state");
        edf edf = this.f21249a;
        if (edf.f21244k) {
            edf.f21247n.mo348a(hhx.IMAX);
            this.f21249a.f21240g.m3024a();
            this.f21249a.f21239f.switchToImax();
        }
    }

    /* renamed from: b */
    public final void mo1563b() {
        bli.m863a(edf.f21234a, "exit Panorama state");
        this.f21249a.f21236c.f2449d = true;
        bli.m871d(edf.f21234a, "Set rotation animation to seamless");
        edf edf = this.f21249a;
        int i = edf.f21241h;
        LayoutParams attributes = edf.f21238e.getAttributes();
        attributes.rotationAnimation = i;
        edf.f21238e.setAttributes(attributes);
    }

    /* renamed from: s */
    public void mo3002s() {
    }
}
