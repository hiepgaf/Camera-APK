package p000;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;

/* compiled from: PG */
/* renamed from: iws */
public class iws implements iwt {
    /* renamed from: a */
    private final iwt f21795a;

    public iws(OutputConfiguration outputConfiguration) {
        this(new iue(outputConfiguration));
    }

    public iws(iwt iwt) {
        this.f21795a = iwt;
    }

    /* renamed from: a */
    public void mo3160a(Surface surface) {
        this.f21795a.mo3160a(surface);
    }

    /* renamed from: a */
    public final iud mo2713a() {
        return this.f21795a.mo2713a();
    }

    /* renamed from: b */
    public Surface mo3161b() {
        return this.f21795a.mo3161b();
    }
}
