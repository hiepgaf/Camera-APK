package p000;

import android.hardware.camera2.CaptureFailure;

/* compiled from: PG */
/* renamed from: itp */
public final class itp implements iwm {
    /* renamed from: a */
    private final CaptureFailure f18577a;

    itp(CaptureFailure captureFailure) {
        this.f18577a = captureFailure;
    }

    /* renamed from: a */
    public final int mo1909a() {
        return this.f18577a.getReason();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("frame number=");
        stringBuilder.append(this.f18577a.getFrameNumber());
        stringBuilder.append(", reason=");
        stringBuilder.append(this.f18577a.getReason());
        stringBuilder.append(", wasImageCaptured=");
        stringBuilder.append(this.f18577a.wasImageCaptured());
        stringBuilder.append(", sequenceId=");
        stringBuilder.append(this.f18577a.getSequenceId());
        return stringBuilder.toString();
    }
}
