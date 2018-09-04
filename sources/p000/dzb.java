package p000;

import android.content.res.Resources;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: dzb */
public final class dzb implements kwk {
    /* renamed from: a */
    private final kwk f14763a;
    /* renamed from: b */
    private final kwk f14764b;

    public dzb(kwk kwk, kwk kwk2) {
        this.f14763a = kwk;
        this.f14764b = kwk2;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        return (ilp) ktm.m13963a(((gor) this.f14763a.mo345a()).m2668b("pref_camera_video_flashmode_key", ((Resources) this.f14764b.mo345a()).getString(R.string.pref_camera_video_flashmode_off)), "Cannot return null from a non-@Nullable @Provides method");
    }
}
