package p000;

import android.annotation.TargetApi;
import android.hardware.camera2.CaptureResult;

@TargetApi(23)
/* compiled from: PG */
/* renamed from: ayt */
public final class ayt extends fiw {
    /* renamed from: a */
    private final kwk f10544a;
    /* renamed from: b */
    private final ayb f10545b;
    /* renamed from: c */
    private final fff f10546c;
    /* renamed from: d */
    private long f10547d = 0;

    public ayt(ayb ayb, fff fff, kwk kwk) {
        this.f10546c = fff;
        this.f10545b = ayb;
        this.f10544a = kwk;
    }

    public final void a_(iwp iwp) {
        if (this.f10545b.mo400d()) {
            Object obj;
            long b = iwp.mo3144b();
            long j = this.f10547d;
            int c = this.f10545b.mo399c();
            if (c == 0) {
                obj = null;
            } else if (b > j + ((long) c)) {
                obj = 1;
            } else {
                obj = null;
            }
            if (obj != null) {
                obj = (Integer) iwp.mo3143a(CaptureResult.CONTROL_AF_MODE);
                if (obj != null) {
                    int intValue = ((Integer) jri.m13152b(obj)).intValue();
                    c = ((Integer) jri.m13152b((Integer) iwp.mo3143a(CaptureResult.CONTROL_AF_STATE))).intValue();
                    if (intValue == 0) {
                        c = 1;
                    } else if (c == 2) {
                        c = 1;
                    } else if (c == 4) {
                        obj = 1;
                    } else {
                        obj = null;
                    }
                } else {
                    obj = null;
                }
                if (obj != null) {
                    this.f10547d = iwp.mo3144b();
                    this.f10546c.m2273a((ffe) this.f10544a.mo345a());
                }
            }
        }
    }
}
