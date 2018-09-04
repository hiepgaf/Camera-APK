package p000;

import android.view.Surface;

/* compiled from: PG */
/* renamed from: beg */
final class beg implements iju {
    /* renamed from: a */
    private final /* synthetic */ bea f10693a;

    beg(bea bea) {
        this.f10693a = bea;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ kpk mo368a(Object obj, Object obj2) {
        return m7284a((biw) obj2);
    }

    /* renamed from: a */
    private final kpk m7284a(biw biw) {
        kpk a;
        synchronized (this.f10693a.f19908w) {
            if (this.f10693a.f19907v.equals(bel.CLOSED)) {
                String valueOf = String.valueOf(this.f10693a.f19907v);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 34);
                stringBuilder.append("CamcorderCaptureSessionImpl state=");
                stringBuilder.append(valueOf);
                a = kow.m13618a(new IllegalStateException(stringBuilder.toString()));
            } else {
                jri.m13143a(this.f10693a.f19907v.equals(bel.STARTING_RECORD));
                bea bea = this.f10693a;
                bjk bjk = bea.f19892g;
                bhj bhj = bea.f19904s;
                Surface d = biw.mo465d();
                iop iop = this.f10693a;
                a = bjk.mo2685a(bhj, d, iop.f19905t, iop);
            }
        }
        return a;
    }
}
