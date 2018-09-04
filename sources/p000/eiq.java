package p000;

import com.google.android.apps.camera.ui.shutterbutton.ShutterButton;

/* compiled from: PG */
/* renamed from: eiq */
public final class eiq implements kwk {
    /* renamed from: a */
    private final kwk f15171a;
    /* renamed from: b */
    private final kwk f15172b;

    public eiq(eio eio, kwk kwk, kwk kwk2) {
        this.f15171a = kwk;
        this.f15172b = kwk2;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        kwk kwk = this.f15171a;
        ShutterButton shutterButton = (ShutterButton) jqk.m13102c(((het) kwk.mo345a()).f6126f.getShutterButton());
        bsn bsn = ((bmb) this.f15172b.mo345a()).f1307a;
        return (hcd) ktm.m13963a(new hcd(shutterButton, false), "Cannot return null from a non-@Nullable @Provides method");
    }
}
