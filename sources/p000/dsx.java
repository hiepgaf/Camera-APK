package p000;

import android.hardware.camera2.CaptureResult;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: dsx */
final class dsx implements ilp, iqt {
    /* renamed from: a */
    private final iqz f21173a;
    /* renamed from: b */
    private final long f21174b;
    /* renamed from: c */
    private final ilb f21175c;
    /* renamed from: d */
    private final ffc f21176d;
    /* renamed from: e */
    private long f21177e;

    static {
        bli.m862a("AutoFlashIndicator");
    }

    private dsx(ira ira, ffc ffc) {
        this.f21173a = ira.mo511a("AutoFlashIndicator");
        this.f21174b = 30;
        this.f21176d = ffc;
        this.f21175c = new ilb(Boolean.valueOf(ffc.mo1939u()));
    }

    dsx(ira ira, ffc ffc, byte b) {
        this(ira, ffc);
    }

    /* renamed from: a */
    public final iqo mo2859a(iqt iqt, Executor executor) {
        return this.f21175c.mo2859a(iqt, executor);
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo2860b() {
        return (Boolean) this.f21175c.mo2860b();
    }

    /* renamed from: a */
    public final /* synthetic */ void mo348a(Object obj) {
        iwp iwp = (iwp) obj;
        if (this.f21176d.mo1939u()) {
            Integer num = (Integer) iwp.mo3143a(CaptureResult.CONTROL_AE_STATE);
            if (num == null) {
                return;
            }
            if (kbf.m16436b(num, Integer.valueOf(4))) {
                if (!((Boolean) this.f21175c.mo2860b()).booleanValue()) {
                    this.f21173a.mo514b("Flash required");
                }
                this.f21177e = iwp.mo3144b();
                this.f21175c.mo348a(Boolean.valueOf(true));
            } else if (kbf.m16436b(num, Integer.valueOf(2))) {
                if (((Boolean) this.f21175c.mo2860b()).booleanValue()) {
                    this.f21173a.mo514b("Flash not required");
                }
                this.f21177e = iwp.mo3144b();
                this.f21175c.mo348a(Boolean.valueOf(false));
            } else if (this.f21177e + this.f21174b < iwp.mo3144b()) {
                if (!((Boolean) this.f21175c.mo2860b()).booleanValue()) {
                    this.f21173a.mo520f(String.format(null, "No converged AE result for %d frames, falling back to single-image auto-flash photo", new Object[]{Long.valueOf(this.f21174b)}));
                }
                this.f21175c.mo348a(Boolean.valueOf(true));
            }
        }
    }
}
