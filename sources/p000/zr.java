package p000;

import android.hardware.Camera.Parameters;
import android.hardware.Camera.Size;

/* compiled from: PG */
/* renamed from: zr */
public final class zr extends abo {
    /* renamed from: a */
    private static final aby f19775a = new aby("AndCamSet");

    private zr(zr zrVar) {
        super(zrVar);
    }

    public zr(aaz aaz, Parameters parameters) {
        if (parameters == null) {
            abx.m91e(f19775a, "Settings ctor requires a non-null Camera.Parameters.");
            return;
        }
        abe abe = aaz.f69w;
        this.f140f = false;
        Size previewSize = parameters.getPreviewSize();
        m69b(new abw(previewSize.width, previewSize.height));
        int previewFrameRate = parameters.getPreviewFrameRate();
        if (previewFrameRate > 0) {
            this.f143i = previewFrameRate;
            this.f142h = previewFrameRate;
            this.f141g = previewFrameRate;
        }
        int[] iArr = new int[2];
        parameters.getPreviewFpsRange(iArr);
        m66a(iArr[0], iArr[1]);
        this.f145k = parameters.getPreviewFormat();
        if (aaz.m32a(aba.ZOOM)) {
            mo2577a(((float) ((Integer) parameters.getZoomRatios().get(parameters.getZoom())).intValue()) / 100.0f);
        } else {
            mo2577a(1.0f);
        }
        this.f149o = parameters.getExposureCompensation();
        this.f150p = abe.m46a(parameters.getFlashMode());
        this.f151q = abe.m47b(parameters.getFocusMode());
        this.f152r = abe.m48c(parameters.getSceneMode());
        aaz.m32a(aba.VIDEO_STABILIZATION);
        this.f157w = "true".equals(parameters.get("recording-hint"));
        m65a(parameters.getJpegQuality());
        previewSize = parameters.getPictureSize();
        m67a(new abw(previewSize.width, previewSize.height));
        this.f147m = parameters.getPictureFormat();
    }

    /* renamed from: a */
    public final abo mo2576a() {
        return new zr(this);
    }
}
