package p000;

import android.annotation.TargetApi;
import android.hardware.camera2.CaptureResult;

@TargetApi(21)
/* compiled from: PG */
/* renamed from: bzd */
public final class bzd implements iqt {
    /* renamed from: b */
    private static final String f11522b = bli.m862a("HdrPVFMetaDataSaver");
    /* renamed from: a */
    public volatile iwp f11523a;
    /* renamed from: c */
    private ilb f11524c = new ilb(Boolean.valueOf(false));

    public bzd(fxq fxq) {
    }

    /* renamed from: a */
    public final /* synthetic */ void mo348a(Object obj) {
        iwp iwp = (iwp) obj;
        if (iwp.mo3143a(CaptureResult.COLOR_CORRECTION_GAINS) == null) {
            bli.m871d(f11522b, "skipping frame since cc gains were missing");
        } else if (iwp.mo3143a(CaptureResult.COLOR_CORRECTION_TRANSFORM) == null) {
            bli.m871d(f11522b, "skipping frame since cc transforms were missing");
        } else if (iwp.mo3143a(CaptureResult.CONTROL_AE_REGIONS) == null) {
            bli.m871d(f11522b, "skipping frame since aeRegions were missing");
        } else if (fxq.m2413a(iwp)) {
            this.f11523a = iwp;
            this.f11524c.mo348a(Boolean.valueOf(true));
        } else {
            bli.m871d(f11522b, "skipping frame due to touch to expose / focus");
        }
    }
}
