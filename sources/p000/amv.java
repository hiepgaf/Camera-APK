package p000;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* compiled from: PG */
/* renamed from: amv */
public final class amv implements agi, agn {
    /* renamed from: a */
    private final Resources f9893a;
    /* renamed from: b */
    private final agn f9894b;

    private amv(Resources resources, agn agn) {
        this.f9893a = (Resources) aqe.m585a((Object) resources, "Argument must not be null");
        this.f9894b = (agn) aqe.m585a((Object) agn, "Argument must not be null");
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo55b() {
        return new BitmapDrawable(this.f9893a, (Bitmap) this.f9894b.mo55b());
    }

    /* renamed from: c */
    public final Class mo56c() {
        return BitmapDrawable.class;
    }

    /* renamed from: d */
    public final int mo57d() {
        return this.f9894b.mo57d();
    }

    /* renamed from: a */
    public final void mo103a() {
        agn agn = this.f9894b;
        if (agn instanceof agi) {
            ((agi) agn).mo103a();
        }
    }

    /* renamed from: a */
    public static agn m6657a(Resources resources, agn agn) {
        if (agn == null) {
            return null;
        }
        return new amv(resources, agn);
    }

    /* renamed from: e */
    public final void mo58e() {
        this.f9894b.mo58e();
    }
}
