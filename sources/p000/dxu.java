package p000;

import android.content.Context;
import com.google.android.apps.camera.logging.InstrumentationCameraEventLogger;

/* compiled from: PG */
/* renamed from: dxu */
public final class dxu implements kwk {
    /* renamed from: a */
    private final kwk f14704a;
    /* renamed from: b */
    private final kwk f14705b;

    private dxu(kwk kwk, kwk kwk2) {
        this.f14704a = kwk;
        this.f14705b = kwk2;
    }

    /* renamed from: a */
    public static dxu m9521a(kwk kwk, kwk kwk2) {
        return new dxu(kwk, kwk2);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        Object instrumentationCameraEventLogger;
        kwk kwk = this.f14704a;
        Context context = (Context) kwk.mo345a();
        bmb bmb = (bmb) this.f14705b.mo345a();
        if (bmb.f1307a.m954a(bmb.f1284g)) {
            instrumentationCameraEventLogger = new InstrumentationCameraEventLogger();
        } else {
            bsn bsn = bmb.f1307a;
            epd epd = new epd(context);
        }
        return (epc) ktm.m13963a(instrumentationCameraEventLogger, "Cannot return null from a non-@Nullable @Provides method");
    }
}
