package p000;

import android.annotation.TargetApi;
import android.view.Surface;

@TargetApi(21)
/* compiled from: PG */
/* renamed from: bho */
public final class bho implements bhl {
    /* renamed from: a */
    public static final String f10885a = bli.m862a("CamCapSesCreator");
    /* renamed from: b */
    public final iwl f10886b;
    /* renamed from: c */
    public final ijx f10887c;

    public bho(iwl iwl, ijx ijx) {
        this.f10886b = iwl;
        this.f10887c = ijx;
    }

    /* renamed from: a */
    public final kpk mo448a(Surface surface, Surface surface2, kbg kbg, kbg kbg2) {
        kpk d = kpw.m18056d();
        this.f10887c.execute(new bhp(this, surface, surface2, kbg, d, kbg2));
        return d;
    }
}
