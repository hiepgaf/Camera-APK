package p000;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* renamed from: cod */
public final class cod extends com {
    /* renamed from: a */
    private static final String f20348a = bli.m862a("CBurstTask");

    public cod(jrg jrg, int i, cjn cjn, gkr gkr, gln gln, jrg jrg2, jrg jrg3, File file, jqo jqo, grw grw, ExecutorService executorService, dpu dpu, UUID uuid, gsp gsp) {
        super(jrg, i, cjn, gkr, gln, jrg2, jrg3, file, jqo, grw, executorService, dpu, uuid, gsp);
    }

    public final void addFinishedCallback(iqb iqb) {
        throw new RuntimeException("Not implemented yet");
    }

    /* renamed from: a */
    public final void mo2779a(Context context) {
        Object obj = this.k;
        jri.m13152b(obj);
        String str = f20348a;
        int f = obj.m13136f();
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("rasterize frame previews: ");
        stringBuilder.append(f);
        bli.m871d(str, stringBuilder.toString());
        List arrayList = new ArrayList(obj.m13136f());
        Iterable arrayList2 = new ArrayList(obj.m13136f());
        for (Long longValue : obj.m13135e()) {
            long longValue2 = longValue.longValue();
            gob c = this.e.mo2876c();
            jaq a = obj.m13130b(longValue2).mo1973a(jlk.f7915a, jkm.m12897b(this.j, context));
            arrayList.add(new coq(longValue2, 0.0f, c, a, false, false, c.f17152c, new File(this.i, jxr.m4677a(longValue2))));
            arrayList2.add(a.mo1973a(jlk.f7915a, new cos(c, go.bd)));
        }
        jaq a2 = ((coq) arrayList.get(0)).f2522d.mo1973a(jlk.f7915a, new cor(this.e));
        arrayList2.add(a2);
        a2.mo1980a(izw.f18704a);
        jli.m12951c(jli.m12937a(arrayList2));
        this.h.m1158a();
        this.n.m2768a(this.k.m13136f(), arrayList.size());
        Map map = (Map) jli.m12951c(m8497a(arrayList, this.g));
        jaq a3 = m8498a(map, arrayList, new coe(this.k.m13134d(), this.e.mo2884l()));
        jli.m12938a(new ArrayList(map.values()), this.g, ion.m3944a()).mo1980a(izw.f18704a);
        jli.m12938a(khb.m4864a(this.k, this.l), this.g, ion.m3944a()).mo1980a(izw.f18704a);
        jli.m12951c(a3);
    }

    public final void removeFinishedCallback(iqb iqb) {
        throw new RuntimeException("Not implemented yet");
    }

    public final void resume() {
    }

    public final void suspend() {
    }
}
