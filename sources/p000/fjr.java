package p000;

import android.hardware.camera2.CaptureResult.Key;

/* compiled from: PG */
/* renamed from: fjr */
public final class fjr implements fjs {
    /* renamed from: a */
    private final Key f16075a;
    /* renamed from: b */
    private final keu f16076b;

    public fjr(Key key, keu keu) {
        this.f16075a = key;
        this.f16076b = keu;
    }

    /* renamed from: a */
    public final boolean mo1392a(iwp iwp) {
        return this.f16076b.contains(iwp.mo3143a(this.f16075a)) ^ 1;
    }
}
