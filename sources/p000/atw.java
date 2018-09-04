package p000;

import android.hardware.camera2.CaptureRequest;
import java.util.Set;

/* compiled from: PG */
/* renamed from: atw */
public final class atw implements kwk {
    /* renamed from: a */
    private final kwk f10237a;
    /* renamed from: b */
    private final kwk f10238b;
    /* renamed from: c */
    private final kwk f10239c;

    private atw(kwk kwk, kwk kwk2, kwk kwk3) {
        this.f10237a = kwk;
        this.f10238b = kwk2;
        this.f10239c = kwk3;
    }

    /* renamed from: a */
    public static atw m7001a(kwk kwk, kwk kwk2, kwk kwk3) {
        return new atw(kwk, kwk2, kwk3);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        Object a;
        kwk kwk = this.f10237a;
        kwk kwk2 = this.f10238b;
        kwk kwk3 = this.f10239c;
        ffc ffc = (ffc) kwk.mo345a();
        kwk2.mo345a();
        ilp ilp = (fch) kwk3.mo345a();
        if (ffc.mo1937s()) {
            a = keu.m13472a(fds.m10246a(CaptureRequest.CONTROL_AF_REGIONS, ilp));
        } else {
            a = kgn.f22045a;
        }
        return (Set) ktm.m13963a(a, "Cannot return null from a non-@Nullable @Provides method");
    }
}
