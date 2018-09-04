package p000;

import android.hardware.camera2.CaptureResult;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: fuj */
final class fuj implements kaw {
    fuj(fuh fuh) {
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo370a(Object obj) {
        List<iwp> list = (List) obj;
        List arrayList = new ArrayList();
        for (iwp iwp : list) {
            arrayList.add(jqk.m13099b("Metadata").m4742a("timestamp", iwp.mo3143a(CaptureResult.SENSOR_TIMESTAMP)).m4742a("NR", iwp.mo3143a(CaptureResult.NOISE_REDUCTION_MODE)).m4742a("EDGE", iwp.mo3143a(CaptureResult.EDGE_MODE)).m4742a("REEF", iwp.mo3143a(CaptureResult.REPROCESS_EFFECTIVE_EXPOSURE_FACTOR)).m4742a("Jpeg Qual", iwp.mo3143a(CaptureResult.JPEG_QUALITY)).toString());
        }
        return arrayList.toString();
    }
}
