package p000;

import android.hardware.camera2.CaptureRequest.Key;
import android.hardware.camera2.CaptureResult;
import com.google.android.camera.experimental2016.ExperimentalKeys;

/* compiled from: PG */
/* renamed from: hsy */
public final class hsy {
    /* renamed from: a */
    public static final Key f6600a;
    /* renamed from: b */
    public static final CaptureResult.Key f6601b;
    /* renamed from: c */
    private static final boolean f6602c = hsx.m3356a(hsx.f6598a, 1);
    /* renamed from: d */
    private static final boolean f6603d = hsx.m3356a(hsx.f6598a, 2);

    static {
        CaptureResult.Key key = null;
        Key key2 = f6602c ? ExperimentalKeys.EXPERIMENTAL_CONTROL_HYBRID_AE : f6603d ? com.google.android.camera.experimental2017.ExperimentalKeys.EXPERIMENTAL_CONTROL_HYBRID_AE : null;
        f6600a = key2;
        if (f6602c) {
            key = ExperimentalKeys.EXPERIMENTAL_CONTROL_AF_SCENE_CHANGE;
        } else if (f6603d) {
            key = com.google.android.camera.experimental2017.ExperimentalKeys.EXPERIMENTAL_CONTROL_AF_SCENE_CHANGE;
        }
        f6601b = key;
    }
}
