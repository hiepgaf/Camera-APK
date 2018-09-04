package p000;

import android.util.Size;
import android.view.Surface;

/* compiled from: PG */
/* renamed from: hmj */
final class hmj implements hmx {
    /* renamed from: a */
    private final Surface f21592a;

    public hmj(Surface surface) {
        this.f21592a = surface;
    }

    public final void close() {
        this.f21592a.release();
    }

    /* renamed from: a */
    public final kpk mo3091a() {
        return kow.m13617a(this.f21592a);
    }

    /* renamed from: a */
    public final void mo3092a(Size size) {
    }

    /* renamed from: a */
    public final void mo3093a(iqm iqm) {
    }
}
