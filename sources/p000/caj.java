package p000;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: caj */
public final class caj implements iqt {
    /* renamed from: a */
    private final Object f11559a = new Object();
    /* renamed from: b */
    private List f11560b = new ArrayList();
    /* renamed from: c */
    private iwp f11561c;
    /* renamed from: d */
    private MeteringRectangle f11562d;
    /* renamed from: e */
    private boolean f11563e = true;
    /* renamed from: f */
    private final Rect f11564f;

    static {
        bli.m862a("TouchListener");
    }

    public caj(ffc ffc) {
        this.f11564f = (Rect) jri.m13152b((Rect) ffc.mo1913a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE));
        Rect rect = this.f11564f;
        rect.bottom -= rect.top;
        rect.top = 0;
        rect.right -= rect.left;
        rect.left = 0;
    }

    /* renamed from: a */
    public final List m7926a() {
        List arrayList;
        synchronized (this.f11559a) {
            arrayList = new ArrayList(this.f11560b);
            if (!this.f11563e) {
                arrayList.add(this.f11561c);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private final boolean m7925a(MeteringRectangle meteringRectangle) {
        boolean equals;
        synchronized (this.f11559a) {
            equals = meteringRectangle.getRect().equals(this.f11562d.getRect()) ^ 1;
        }
        return equals;
    }

    /* renamed from: a */
    private final synchronized void m7924a(iwp iwp) {
        MeteringRectangle meteringRectangle = ((MeteringRectangle[]) jri.m13152b((MeteringRectangle[]) iwp.mo3143a(CaptureResult.CONTROL_AE_REGIONS)))[0];
        synchronized (this.f11559a) {
            if (this.f11563e) {
                this.f11563e = false;
            } else if (m7925a(meteringRectangle)) {
                iwp iwp2 = this.f11561c;
                if (meteringRectangle.getRect().equals(this.f11564f)) {
                    this.f11560b.clear();
                } else if (this.f11560b.size() < 5) {
                    this.f11560b.add(iwp2);
                } else {
                    this.f11560b.remove(0);
                    this.f11560b.add(iwp2);
                }
            }
            this.f11561c = iwp;
            this.f11562d = meteringRectangle;
        }
    }
}
