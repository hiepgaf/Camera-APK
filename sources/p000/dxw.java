package p000;

import android.content.res.Resources;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: dxw */
public final class dxw implements kwk {
    /* renamed from: a */
    private final kwk f14708a;
    /* renamed from: b */
    private final kwk f14709b;

    public dxw(kwk kwk, kwk kwk2) {
        this.f14708a = kwk;
        this.f14709b = kwk2;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        return (ilp) ktm.m13963a(((gor) this.f14708a.mo345a()).m2668b("pref_camera_photosphere_orientation", ((Resources) this.f14709b.mo345a()).getString(R.string.pano_orientation_photosphere)), "Cannot return null from a non-@Nullable @Provides method");
    }
}
