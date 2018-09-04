package p000;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureRequest.Key;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: itq */
public final class itq implements iwo {
    /* renamed from: a */
    private final CaptureRequest f21771a;

    public itq(CaptureRequest captureRequest) {
        this.f21771a = captureRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return kbf.m16436b(this.f21771a, ((itq) obj).f21771a);
    }

    /* renamed from: a */
    public final Object mo3139a(Key key) {
        return this.f21771a.get(key);
    }

    /* renamed from: a */
    public final iud mo2713a() {
        return new iud(this.f21771a);
    }

    /* renamed from: b */
    public final Object mo3140b() {
        return this.f21771a.getTag();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f21771a});
    }
}
