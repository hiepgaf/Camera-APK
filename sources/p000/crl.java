package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/* renamed from: crl */
final /* synthetic */ class crl implements Runnable {
    /* renamed from: a */
    private final crj f2590a;
    /* renamed from: b */
    private final kpw f2591b;

    crl(crj crj, kpw kpw) {
        this.f2590a = crj;
        this.f2591b = kpw;
    }

    public final void run() {
        crj crj = this.f2590a;
        knk knk = this.f2591b;
        crj.f12574f.mo1903a("OnDemandLoader.loadNextBatchInBackground");
        if (!crj.f12573e.mo3049a()) {
            int i;
            List<err> a = crj.f12572d.mo1067a(crj.f12570b);
            if (a.size() < crj.f12570b) {
                bli.m869c(crj.f12569a, "All FilmstripItems loaded. No more partial loading after this.");
                crj.f12576h.set(true);
            }
            Collections.sort(a, new cqh(new Date()));
            for (err err : a) {
                crm crm = new crm();
                err.mo1039m();
            }
            for (i = 0; i < a.size(); i++) {
                crj.f12579k.m1426a((err) a.get(i));
            }
            crj.f12574f.mo1903a("OnDemandLoader.setLastItems");
            crj.f12578j.clear();
            if (!crj.f12576h.get()) {
                crb crb = crj.f12579k;
                i = crb.f2583d.f2576c;
                if (i > 0) {
                    cre a2 = crb.m1424a(i - 1);
                    crj.f12578j.add(a2);
                    cre cre = a2;
                    for (int i2 = 1; i2 < 10 && cre != cre.f2587c; i2++) {
                        cre = cre.mo1064c();
                        crj.f12578j.add(cre);
                    }
                    if (cre != cre.f2587c) {
                        String str = crj.f12569a;
                        int size = crj.f12578j.size();
                        long j = ((cre) crj.f12578j.get(0)).mo1066e().mo1033g().f4149b;
                        ArrayList arrayList = crj.f12578j;
                        long j2 = ((cre) arrayList.get(arrayList.size() - 1)).mo1066e().mo1033g().f4149b;
                        StringBuilder stringBuilder = new StringBuilder(94);
                        stringBuilder.append("setLastItems(): watching (");
                        stringBuilder.append(size);
                        stringBuilder.append(") nodes from ");
                        stringBuilder.append(j);
                        stringBuilder.append(" to ");
                        stringBuilder.append(j2);
                        bli.m863a(str, stringBuilder.toString());
                    }
                }
            }
            crj.f12574f.mo1904b();
            crj.f12575g.set(false);
            String str2 = crj.f12569a;
            i = crj.f12579k.f2583d.f2576c;
            StringBuilder stringBuilder2 = new StringBuilder(59);
            stringBuilder2.append("loadNextBatchInBackground() loaded total items: ");
            stringBuilder2.append(i);
            bli.m863a(str2, stringBuilder2.toString());
            if (knk != null) {
                knk.mo3557a(null);
            }
        }
        crj.f12574f.mo1904b();
    }
}
