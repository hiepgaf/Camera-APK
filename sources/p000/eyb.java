package p000;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: eyb */
public class eyb extends fiw {
    /* renamed from: a */
    public final exd f15744a;
    /* renamed from: b */
    public final ccr f15745b;
    /* renamed from: c */
    public final Rect f15746c;
    /* renamed from: d */
    public volatile long f15747d;
    /* renamed from: e */
    private final axm f15748e;
    /* renamed from: f */
    private final Executor f15749f;
    /* renamed from: g */
    private volatile boolean f15750g = true;

    static {
        eyb.class.getSimpleName();
    }

    public eyb(exd exd, ccr ccr, axm axm, ffc ffc, Executor executor) {
        this.f15744a = exd;
        this.f15745b = ccr;
        this.f15748e = axm;
        this.f15749f = executor;
        this.f15746c = (Rect) ffc.mo1913a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
    }

    public final void a_(iwp iwp) {
        super.a_(iwp);
        if (this.f15750g) {
            this.f15749f.execute(new eyc(this, iwp, this.f15748e.m735a()));
        }
    }

    /* renamed from: a */
    public final void m10073a(boolean z) {
        this.f15750g = z;
        if (!z) {
            this.f15744a.m2182a();
        }
    }
}
