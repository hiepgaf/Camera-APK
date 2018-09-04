package p000;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;

/* compiled from: PG */
/* renamed from: iue */
public final class iue implements iwt {
    /* renamed from: a */
    private final Object f21788a = new Object();
    /* renamed from: b */
    private final OutputConfiguration f21789b;
    /* renamed from: c */
    private boolean f21790c = false;

    public iue(OutputConfiguration outputConfiguration) {
        this.f21789b = outputConfiguration;
    }

    /* renamed from: a */
    public final void mo3160a(Surface surface) {
        jri.m13152b((Object) surface);
        synchronized (this.f21788a) {
            if (!this.f21790c) {
                this.f21790c = true;
                hsx.m3354a(this.f21789b, surface);
            }
        }
    }

    /* renamed from: a */
    public final iud mo2713a() {
        iud iud;
        synchronized (this.f21788a) {
            iud = new iud(this.f21789b);
        }
        return iud;
    }

    /* renamed from: b */
    public final Surface mo3161b() {
        Surface surface;
        synchronized (this.f21788a) {
            surface = this.f21789b.getSurface();
        }
        return surface;
    }

    public final String toString() {
        String kbd;
        synchronized (this.f21788a) {
            kbd = jqk.m13099b("AndroidOutputConfiguration").m4742a("outputConfiguration", this.f21789b).toString();
        }
        return kbd;
    }
}
