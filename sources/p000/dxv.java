package p000;

import android.content.res.Resources;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: dxv */
public final class dxv implements kwk {
    /* renamed from: a */
    private final kwk f14706a;
    /* renamed from: b */
    private final kwk f14707b;

    public dxv(kwk kwk, kwk kwk2) {
        this.f14706a = kwk;
        this.f14707b = kwk2;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        return (ilp) ktm.m13963a(((gor) this.f14706a.mo345a()).m2668b("pref_camera_pano_orientation", ((Resources) this.f14707b.mo345a()).getString(R.string.pano_orientation_horizontal)), "Cannot return null from a non-@Nullable @Provides method");
    }
}
