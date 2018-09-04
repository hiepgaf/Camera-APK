package p000;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.Face;

/* compiled from: PG */
/* renamed from: ixp */
public final class ixp implements ixq {
    /* renamed from: a */
    public final float mo1961a(iwp iwp) {
        Face[] faceArr = (Face[]) iwp.mo3143a(CaptureResult.STATISTICS_FACES);
        return faceArr != null ? (float) faceArr.length : Float.NaN;
    }
}
