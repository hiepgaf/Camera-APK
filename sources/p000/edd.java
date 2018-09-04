package p000;

import android.view.WindowManager.LayoutParams;

/* compiled from: PG */
/* renamed from: edd */
class edd extends gqj {
    /* renamed from: a */
    private final /* synthetic */ edb f21232a;

    edd(edb edb) {
        this.f21232a = edb;
        super(null);
    }

    /* renamed from: a */
    public final void mo1562a() {
        bli.m863a(edb.f21222a, "Filmstrip state enter");
        edb edb = this.f21232a;
        LayoutParams attributes = edb.f21223b.getAttributes();
        attributes.rotationAnimation = 0;
        edb.f21223b.setAttributes(attributes);
        this.f21232a.f21225d.setImportantForAccessibility(4);
        this.f21232a.f21227f.mo1562a();
    }

    /* renamed from: b */
    public final void mo1563b() {
        bli.m863a(edb.f21222a, "Filmstrip state exit");
        edb edb = this.f21232a;
        int i = edb.f21226e;
        LayoutParams attributes = edb.f21223b.getAttributes();
        attributes.rotationAnimation = i;
        edb.f21223b.setAttributes(attributes);
        this.f21232a.f21225d.setImportantForAccessibility(1);
        this.f21232a.f21227f.mo1563b();
    }
}
