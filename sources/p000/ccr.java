package p000;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.util.SizeF;
import java.util.List;

/* compiled from: PG */
/* renamed from: ccr */
public final class ccr implements bwq, kwk {
    /* renamed from: a */
    public final boolean f11661a;
    /* renamed from: b */
    public volatile bwy f11662b;
    /* renamed from: c */
    public volatile int f11663c;
    /* renamed from: d */
    public volatile iqp f11664d;
    /* renamed from: e */
    private final bwo f11665e;
    /* renamed from: f */
    private final cde f11666f;
    /* renamed from: g */
    private final cdk f11667g;
    /* renamed from: h */
    private final ffc f11668h;
    /* renamed from: i */
    private final SizeF f11669i;
    /* renamed from: j */
    private final iqp f11670j;
    /* renamed from: k */
    private volatile bwp f11671k;
    /* renamed from: l */
    private boolean f11672l;

    public ccr(bwo bwo, cde cde, cdk cdk, ffc ffc, fyy fyy) {
        boolean z;
        Object obj = (SizeF) ffc.mo1913a(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
        jri.m13139a(obj, (Object) "Camera sensor size cannot be null");
        this.f11665e = bwo;
        this.f11666f = cde;
        this.f11667g = cdk;
        this.f11668h = ffc;
        this.f11669i = obj;
        if (ffc.mo1921c() == iut.BACK) {
            z = true;
        } else {
            z = false;
        }
        this.f11661a = z;
        this.f11670j = fyy.f4831b.f7495b;
        this.f11662b = null;
        this.f11672l = false;
        this.f11663c = 0;
        this.f11664d = new iqp(0, 0);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        throw new NoSuchMethodError();
    }

    /* renamed from: b */
    public final synchronized boolean m8017b() {
        return this.f11672l;
    }

    /* renamed from: c */
    public final boolean m8018c() {
        Integer num = (Integer) this.f11668h.mo1913a(CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE);
        if (num == null) {
            return false;
        }
        return num.intValue() == 1;
    }

    /* renamed from: a */
    public final void mo549a(List list) {
        for (bwr bwr : list) {
            if (this.f11661a) {
                this.f11666f.mo641a(bwr.f1662f, bwr.f1663g, bwr.f1664h, bwr.f1661e);
            } else {
                this.f11666f.mo641a(bwr.f1662f, -bwr.f1663g, -bwr.f1664h, bwr.f1661e);
            }
        }
    }

    /* renamed from: a */
    public static Context m8012a(ccp ccp) {
        return (Context) ktm.m13963a(ccp.f1842b, "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: a */
    public final synchronized void m8015a(iqp iqp) {
        this.f11672l = true;
        this.f11664d = iqp;
        this.f11663c = 0;
        this.f11662b = new bwy(this.f11669i, iqp, this.f11670j, this.f11666f, this.f11667g);
        this.f11671k = this.f11665e.mo606b();
    }

    /* renamed from: d */
    public final synchronized void m8019d() {
        this.f11672l = false;
        if (this.f11671k != null) {
            this.f11671k.close();
        }
        this.f11662b = null;
    }

    /* renamed from: a */
    public final synchronized void m8014a(long j) {
        bwp bwp = this.f11671k;
        if (this.f11672l && bwp != null && j > this.f11666f.mo640a()) {
            bwp.mo2712a(this.f11666f.mo640a() + 1, j, this);
        }
    }
}
