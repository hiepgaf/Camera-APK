package p000;

import android.view.Surface;
import java.io.File;

/* compiled from: PG */
/* renamed from: beh */
final class beh implements iju {
    /* renamed from: a */
    private final /* synthetic */ bfs f10694a;
    /* renamed from: b */
    private final /* synthetic */ bea f10695b;

    beh(bea bea, bfs bfs) {
        this.f10695b = bea;
        this.f10694a = bfs;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ kpk mo368a(Object obj, Object obj2) {
        return m7286a((biw) obj2);
    }

    /* renamed from: a */
    private final kpk m7286a(biw biw) {
        kpk a;
        synchronized (this.f10695b.f19908w) {
            if (this.f10695b.f19907v.equals(bel.CLOSED)) {
                String valueOf = String.valueOf(this.f10695b.f19907v);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 34);
                stringBuilder.append("CamcorderCaptureSessionImpl state=");
                stringBuilder.append(valueOf);
                throw new IllegalStateException(stringBuilder.toString());
            }
            jri.m13143a(this.f10695b.f19907v.equals(bel.STARTING_RECORD));
            this.f10695b.f19907v = bel.RECORDING;
            long currentTimeMillis = System.currentTimeMillis();
            bea bea = this.f10695b;
            bhj bhj = bea.f19904s;
            bhs bhs = bea.f19905t;
            Surface surface = bea.f19902q;
            Surface d = biw.mo465d();
            bea bea2 = this.f10695b;
            bhc bhc = new bhc(bhj, bhs, surface, d, bea2.f19887b, bea2.f19901p);
            bic bic = this.f10695b.f19901p;
            Surface d2 = biw.mo465d();
            bea = this.f10695b;
            bib bib = new bib(bic, d2, bea.f19904s, bea.f19905t);
            kbg a2 = biw.mo460a();
            Object obj = this.f10695b;
            bfs bfs = this.f10694a;
            inp inp = obj.f19888c;
            bhj bhj2 = obj.f19904s;
            ilp ilp = obj.f19896k;
            ilp ilp2 = obj.f19897l;
            ilp ilp3 = obj.f19898m;
            kbg kbg = obj.f19899n;
            File c = biw.mo464c();
            bea bea3 = this.f10695b;
            obj.f19906u = new bft(bfs, obj, inp, bhj2, ilp, ilp2, ilp3, kbg, c, bea3.f19890e, bea3.f19891f, bea3.f19893h, bea3.f19895j, bea3.f19894i, new hke(), biw.mo463b(), currentTimeMillis, bhc, bib, a2, this.f10695b.f19905t);
            a = kow.m13617a(this.f10695b.f19906u);
        }
        return a;
    }
}
