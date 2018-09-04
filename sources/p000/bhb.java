package p000;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureRequest.Key;

/* compiled from: PG */
/* renamed from: bhb */
final class bhb implements kaw {
    /* renamed from: a */
    private final /* synthetic */ iwn f10849a;
    /* renamed from: b */
    private final /* synthetic */ bhj f10850b;
    /* renamed from: c */
    private final /* synthetic */ bhs f10851c;
    /* renamed from: d */
    private final /* synthetic */ kpw f10852d;
    /* renamed from: e */
    private final /* synthetic */ bgx f10853e;

    bhb(bgx bgx, iwn iwn, bhj bhj, bhs bhs, kpw kpw) {
        this.f10853e = bgx;
        this.f10849a = iwn;
        this.f10850b = bhj;
        this.f10851c = bhs;
        this.f10852d = kpw;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo370a(Object obj) {
        return m7370a();
    }

    /* renamed from: a */
    private final Void m7370a() {
        try {
            iwn iwn = this.f10849a;
            Key key = CaptureRequest.CONTROL_AE_LOCK;
            Boolean valueOf = Boolean.valueOf(true);
            iwn.m4292a(key, valueOf);
            this.f10850b.m7382a(fiv.REPEATING, this.f10849a, this.f10853e.f10836b, this.f10851c);
            this.f10853e.f10844j.mo348a(valueOf);
        } catch (Throwable e) {
            this.f10852d.m17780a(e);
        }
        return null;
    }
}
