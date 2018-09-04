package p000;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.CaptureResult.Key;
import java.util.List;

/* compiled from: PG */
/* renamed from: itr */
public class itr implements iwp {
    /* renamed from: a */
    public final CaptureResult f21772a;

    public itr(CaptureResult captureResult) {
        this.f21772a = captureResult;
    }

    /* renamed from: a */
    public final Object mo3143a(Key key) {
        return this.f21772a.get(key);
    }

    /* renamed from: b */
    public final long mo3144b() {
        return this.f21772a.getFrameNumber();
    }

    /* renamed from: c */
    public final List mo3145c() {
        return this.f21772a.getKeys();
    }

    /* renamed from: d */
    public final iwo mo3146d() {
        return new itq(this.f21772a.getRequest());
    }
}
