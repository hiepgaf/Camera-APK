package p000;

import android.content.Context;
import android.util.Pair;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* renamed from: cnq */
public final class cnq extends com {
    /* renamed from: a */
    public static final String f20336a = bli.m862a("ArtfctGenTask");
    /* renamed from: b */
    public final gsp f20337b;
    /* renamed from: c */
    public final ird f20338c;
    /* renamed from: d */
    public final glj f20339d;
    /* renamed from: p */
    private final jsb f20340p;
    /* renamed from: q */
    private final jsw f20341q;
    /* renamed from: r */
    private final jjd f20342r;
    /* renamed from: s */
    private final boolean f20343s;
    /* renamed from: t */
    private final irs f20344t;

    public cnq(jsb jsb, jsw jsw, jjd jjd, jrg jrg, int i, cjn cjn, gkr gkr, gln gln, jrg jrg2, jrg jrg3, File file, jqo jqo, grw grw, ExecutorService executorService, dpu dpu, UUID uuid, boolean z, gsp gsp, ird ird, irs irs, glj glj) {
        super(jrg, i, cjn, gkr, gln, jrg2, jrg3, file, jqo, grw, executorService, dpu, uuid, gsp);
        this.f20340p = jsb;
        this.f20341q = jsw;
        this.f20342r = jjd;
        this.f20343s = z;
        this.f20337b = gsp;
        this.f20338c = ird;
        this.f20344t = irs;
        this.f20339d = glj;
    }

    public final void addFinishedCallback(iqb iqb) {
        throw new RuntimeException("Not implemented yet");
    }

    /* renamed from: a */
    protected final void mo2779a(Context context) {
        this.f20338c.mo1903a("ArtifactGenerationTask#doPostProcessing");
        ArrayList a = khb.m4864a(this.k, this.l);
        try {
            long longValue;
            Long valueOf;
            Object obj;
            jsw jsw = this.f20341q;
            jqo jqo = this.j;
            Executor executor = this.g;
            for (Long valueOf2 : jsw.f7954d.f18973c) {
                longValue = valueOf2.longValue();
                jxa jxa = new jxa();
                jxa.m4666a(jxa.f8044a, Long.valueOf(longValue));
                jsw.f7955e.m4673a(jxa);
            }
            jaq a2 = jli.m12947b(jsw.f7954d.m13133c(), executor, new jsy(jsw, jqo)).mo1973a(executor, new jta(jsw)).mo1973a(executor, ion.m3941a(Pair.create(jsw.f7957g, jsw.f7955e)));
            a2.mo1973a(this.g, new cnr(this)).mo1980a(izw.f18704a);
            Object obj2 = (jis) jli.m12951c(a2.mo1975a(jlk.f7915a, new cnu(this.f20340p)));
            jxm jxm = (jxm) ((Pair) jli.m12951c(a2)).second;
            grw grw = this.n;
            klt[] kltArr = new klt[obj2.f7877a.size()];
            int i = 0;
            for (jip jip : obj2.m4522b()) {
                int i2;
                klt klt = new klt();
                klt.f22400b = jip.mo3170a().size();
                String str = jip.f18840a;
                switch (str.hashCode()) {
                    case -2055687343:
                        if (!str.equals("GIF_Action")) {
                            obj = -1;
                            break;
                        } else {
                            obj = null;
                            break;
                        }
                    case 2364907:
                        if (!str.equals("GIF_Summary")) {
                            obj = -1;
                            break;
                        } else {
                            obj = 1;
                            break;
                        }
                    default:
                        obj = -1;
                        break;
                }
                switch (obj) {
                    case null:
                        i2 = 1;
                        break;
                    case 1:
                        i2 = 1;
                        break;
                    default:
                        i2 = 0;
                        break;
                }
                klt.f22399a = i2;
                i2 = i + 1;
                kltArr[i] = klt;
                i = i2;
            }
            grw.f5655a.f22420d = kltArr;
            if (obj2.m4522b().isEmpty()) {
                throw new IllegalStateException(String.format("No artifacts generated (%d images captured)", new Object[]{Integer.valueOf(this.m.m13136f())}));
            }
            List b = khb.m4885b();
            i = Integer.MIN_VALUE;
            for (jip jip2 : obj2.m4522b()) {
                if (jip2.f18841b > i) {
                    i = jip2.f18841b;
                }
            }
            for (jip jip22 : obj2.m4522b()) {
                if (jip22.f18841b == i) {
                    b.add(jip22);
                }
            }
            if (b.isEmpty()) {
                String valueOf3 = String.valueOf(obj2);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf3).length() + 25);
                stringBuilder.append("No cover artifact found: ");
                stringBuilder.append(valueOf3);
                throw new IllegalStateException(stringBuilder.toString());
            }
            kbg c;
            long longValue2;
            jip jip3 = (jip) b.get(0);
            cnv cnv = new cnv(this, context, jip3);
            coe coe = new coe(this.k.m13134d(), this.e.mo2884l());
            if (this.f20343s) {
                c = kbg.m4745c(cnv.m1203a(this.k, coe.f2227b));
            } else {
                c = kau.f19138a;
            }
            jrg jrg = this.k;
            jri.m13152b(obj2);
            jjd jjd = this.f20342r;
            Object jjb = new jjb((byte) 0);
            obj = new ArrayList();
            for (Long valueOf22 : jrg.m13133c()) {
                obj.add(Float.valueOf(jjd.f7878a.mo2049a(valueOf22.longValue()).mo2076a()));
            }
            long longValue3 = ((Long) jrg.m13133c().get(obj.indexOf(Float.valueOf(((Float) Collections.max(obj)).floatValue())))).longValue();
            Set set = jrg.f18973c;
            int i3 = 0;
            for (Long valueOf222 : jrg.m13135e()) {
                float f;
                boolean z;
                longValue2 = valueOf222.longValue();
                boolean contains = set.contains(Long.valueOf(longValue2));
                if (contains) {
                    f = Float.NEGATIVE_INFINITY;
                } else {
                    f = jjd.f7878a.mo2049a(longValue2).mo2076a();
                }
                int i4 = i3 + 1;
                if (longValue2 == longValue3) {
                    z = true;
                } else {
                    z = false;
                }
                jjb.m4521a(new jkr(longValue2, i3, f, z, contains));
                i3 = i4;
            }
            jjb jjb2 = (jjb) kow.m13625c(jli.m12948b(jjb).mo1979a());
            List arrayList = new ArrayList(jjb2.f7877a.size());
            Iterable arrayList2 = new ArrayList();
            for (jkr jkr : jjb2.m4522b()) {
                longValue2 = jkr.f18893a;
                float f2 = jkr.f18894b;
                gob c2 = this.e.mo2876c();
                jaq a3 = jrg.m13130b(longValue2).mo1973a(jlk.f7915a, jkm.m12897b(this.j, context));
                arrayList.add(new coq(longValue2, f2, c2, a3, jkr.f18895c, jkr.f18896d, c2.f17152c, new File(this.i, jxr.m4677a(longValue2))));
                arrayList2.add(a3.mo1973a(jlk.f7915a, new cos(c2, go.bd)));
            }
            Collections.sort(arrayList, new cnt());
            jaq a4 = ((coq) arrayList.get(0)).f2522d.mo1973a(jlk.f7915a, new cor(this.e));
            arrayList2.add(a4);
            a4.mo1980a(izw.f18704a);
            jli.m12951c(jli.m12937a(arrayList2));
            this.h.m1158a();
            File file = new File(gtu.m2823a().mo1623a(), this.e.mo2886n());
            if (file.mkdirs() || file.isDirectory()) {
                a2.mo1973a(this.g, new cnx(file)).mo1980a(izw.f18704a);
                this.n.m2768a(this.k.m13136f(), arrayList.size());
                Map map = (Map) jli.m12951c(m8497a(arrayList, this.g));
                jli.m12951c(m8498a(map, arrayList, coe));
                jli.m12938a(new ArrayList(map.values()), this.g, ion.m3944a()).mo1980a(izw.f18704a);
                Iterable arrayList3 = new ArrayList();
                if (c.mo2084b()) {
                    jrg a5;
                    jrg jrg2;
                    if (!jiu.m4513c(jip3.f18840a)) {
                        if (jiu.m4514d(jip3.f18840a)) {
                        }
                        a5 = jqk.m13087a(file, jxr.m4679a(jxm)).m4620a();
                        a.add(a5);
                        jrg2 = a5;
                        arrayList3.add(cnv.m1204a(jrg2, file, (gkr) c.mo2081a()).mo1981b(new ikd(), new cns(c)));
                    }
                    if (this.l.m13136f() > this.k.m13136f()) {
                        jrg2 = this.l;
                        arrayList3.add(cnv.m1204a(jrg2, file, (gkr) c.mo2081a()).mo1981b(new ikd(), new cns(c)));
                    }
                    a5 = jqk.m13087a(file, jxr.m4679a(jxm)).m4620a();
                    a.add(a5);
                    jrg2 = a5;
                    arrayList3.add(cnv.m1204a(jrg2, file, (gkr) c.mo2081a()).mo1981b(new ikd(), new cns(c)));
                }
                arrayList3.add(m8496a(file));
                if (jlo.m4541c()) {
                    File file2 = this.i;
                    Map hashMap = new HashMap();
                    for (Long valueOf2222 : this.f12430k.m13135e()) {
                        longValue = valueOf2222.longValue();
                        valueOf2222 = Long.valueOf(longValue);
                        StringBuilder stringBuilder2 = new StringBuilder(38);
                        stringBuilder2.append("low-res-frame-");
                        stringBuilder2.append(longValue);
                        stringBuilder2.append(".jpg");
                        hashMap.put(valueOf2222, stringBuilder2.toString());
                    }
                    arrayList3.add(super.m8499a(this.f12430k, file2, hashMap));
                }
                jli.m12951c(jli.m12937a(arrayList3));
                return;
            }
            throw new IllegalStateException("Unable to create burst output directory");
        } finally {
            jli.m12938a((Iterable) a, this.g, ion.m3944a()).mo1980a(izw.f18704a);
            this.f20338c.mo1904b();
        }
    }

    public final void removeFinishedCallback(iqb iqb) {
        throw new RuntimeException("Not implemented yet");
    }

    public final void resume() {
        this.f20340p.resume();
    }

    public final void suspend() {
        this.f20340p.suspend();
    }
}
