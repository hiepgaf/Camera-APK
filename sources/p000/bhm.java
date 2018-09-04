package p000;

import android.annotation.TargetApi;
import android.view.Surface;

@TargetApi(23)
/* compiled from: PG */
/* renamed from: bhm */
public final class bhm implements bhl {
    /* renamed from: a */
    public static final String f10882a = bli.m862a("CamCapSesCreatorHfr");
    /* renamed from: b */
    public final iwl f10883b;
    /* renamed from: c */
    private final ijx f10884c;

    public bhm(iwl iwl, ijx ijx) {
        this.f10883b = iwl;
        this.f10884c = ijx;
    }

    /* renamed from: a */
    public final kpk mo448a(Surface surface, Surface surface2, kbg kbg, kbg kbg2) {
        jri.m13143a(kbg.mo2084b() ^ 1);
        kpk d = kpw.m18056d();
        this.f10884c.execute(new bhn(this, surface, surface2, d));
        return d;
    }
}
