package p000;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureRequest.Key;
import android.hardware.camera2.CaptureResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: fii */
public final class fii implements fij {
    /* renamed from: a */
    private final fij f16058a;

    public fii(fij fij) {
        this.f16058a = fij;
    }

    /* renamed from: b */
    private static Map m10411b(fim fim) {
        Map hashMap = new HashMap();
        for (fin fin : fim.f4567b) {
            hashMap.put(fin.f4571a, fin);
        }
        return hashMap;
    }

    /* renamed from: a */
    public final void mo1387a(fim fim) {
        jri.m13143a(fim.f4570e.mo2084b());
        fij fij = this.f16058a;
        Map b = fii.m10411b(fim);
        ArrayList arrayList = new ArrayList();
        arrayList.add(CaptureRequest.JPEG_ORIENTATION);
        arrayList.add(CaptureRequest.JPEG_THUMBNAIL_QUALITY);
        arrayList.add(CaptureRequest.JPEG_GPS_LOCATION);
        arrayList.add(CaptureRequest.JPEG_QUALITY);
        arrayList.add(CaptureRequest.JPEG_THUMBNAIL_SIZE);
        iwo d = ((iwp) fim.f4570e.mo2081a()).mo3146d();
        fio fio = new fio(fim);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            Key key = (Key) arrayList.get(i);
            if (b.containsKey(key)) {
                i = i2;
            } else if (d.mo3139a(key) == null) {
                i = i2;
            } else {
                fio.m2306a(new fin(key, d.mo3139a(key)));
                i = i2;
            }
        }
        fim a = fio.m2301a();
        iwp iwp = (iwp) a.f4570e.mo2081a();
        b = fii.m10411b(a);
        Object a2 = iwp.mo3143a(CaptureResult.NOISE_REDUCTION_MODE);
        Integer valueOf = Integer.valueOf(2);
        boolean b2 = kbf.m16436b(a2, valueOf);
        boolean containsKey = b.containsKey(CaptureRequest.NOISE_REDUCTION_MODE);
        fio fio2 = new fio(a);
        if (!containsKey) {
            if (b2) {
                fio2.m2303a(CaptureRequest.NOISE_REDUCTION_MODE, Integer.valueOf(0));
            } else {
                fio2.m2303a(CaptureRequest.NOISE_REDUCTION_MODE, valueOf);
            }
        }
        a = fio2.m2301a();
        iwp = (iwp) a.f4570e.mo2081a();
        b = fii.m10411b(a);
        b2 = kbf.m16436b(iwp.mo3143a(CaptureResult.EDGE_MODE), valueOf);
        containsKey = b.containsKey(CaptureRequest.EDGE_MODE);
        fio2 = new fio(a);
        if (!containsKey) {
            if (b2) {
                fio2.m2303a(CaptureRequest.EDGE_MODE, Integer.valueOf(0));
            } else {
                fio2.m2303a(CaptureRequest.EDGE_MODE, valueOf);
            }
        }
        fij.mo1387a(fio2.m2301a());
    }
}
