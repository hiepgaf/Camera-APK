package p000;

import android.media.MediaCodec;

/* renamed from: jfv */
public final class jfv implements kaw, kov {
    /* renamed from: a */
    private final /* synthetic */ kpw f18760a;

    public jfv(kpw kpw) {
        this.f18760a = kpw;
    }

    /* renamed from: a */
    public final Object mo370a(Object obj) {
        ((MediaCodec) obj).setInputSurface(null);
        return null;
    }

    /* renamed from: a */
    public final void mo349a(Throwable th) {
        this.f18760a.mo3557a(Boolean.valueOf(false));
    }

    public final void b_(Object obj) {
        this.f18760a.mo3557a(Boolean.valueOf(true));
    }
}
