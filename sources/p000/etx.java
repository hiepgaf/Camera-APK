package p000;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: etx */
public final class etx implements euf, euz {
    /* renamed from: a */
    public static final String f15540a = bli.m862a("CcMVEnc");
    /* renamed from: b */
    public final eua f15541b;
    /* renamed from: c */
    public final Object f15542c = new Object();
    /* renamed from: d */
    private long f15543d = -1;
    /* renamed from: e */
    private jgo f15544e = null;
    /* renamed from: f */
    private final Executor f15545f;
    /* renamed from: g */
    private final Set f15546g = new HashSet();

    public etx(eua eua, Executor executor) {
        this.f15541b = eua;
        this.f15545f = executor;
    }

    /* renamed from: a */
    public final void mo1308a(long j) {
        synchronized (this.f15542c) {
            long j2 = Long.MAX_VALUE;
            for (eug eug : this.f15546g) {
                long j3;
                if (eug.f15555b.m13499a()) {
                    j3 = j2;
                } else if (eug.f15557d) {
                    j3 = j2;
                } else {
                    j3 = Math.min(j2, ((Long) eug.f15555b.f19198a.mo2123a()).longValue());
                }
                j2 = j3;
            }
            this.f15543d = Math.min(j2, Math.max(j, this.f15543d));
            m9943b();
            jgo jgo = this.f15544e;
            if (jgo != null) {
                jgo.mo3168a(this.f15543d);
            }
        }
    }

    /* renamed from: b */
    public final euy mo1309b(long j) {
        euy euy;
        synchronized (this.f15542c) {
            for (eug eug : this.f15546g) {
                if (!eug.f15557d) {
                    kge kge = eug.f15555b;
                    Comparable valueOf = Long.valueOf(j);
                    String str;
                    StringBuilder stringBuilder;
                    if (!kge.m13501b(valueOf)) {
                        if (eug.f15555b.m13499a() && kge.m13495a((Long) eug.f15555b.f19199b.mo2123a(), Long.valueOf(((Long) eug.f15555b.f19199b.mo2123a()).longValue() + 66666)).m13501b(valueOf)) {
                            euy = euy.ENCODE;
                            break;
                        } else if (((Long) eug.f15555b.f19198a.mo2123a()).longValue() >= j) {
                            str = f15540a;
                            stringBuilder = new StringBuilder(31);
                            stringBuilder.append("dropping <");
                            stringBuilder.append(j);
                            stringBuilder.append(">");
                            bli.m863a(str, stringBuilder.toString());
                            euy = euy.DROP_BUT_CONTINUE;
                            break;
                        }
                    } else {
                        str = f15540a;
                        stringBuilder = new StringBuilder(31);
                        stringBuilder.append("encoding <");
                        stringBuilder.append(j);
                        stringBuilder.append(">");
                        bli.m863a(str, stringBuilder.toString());
                        euy = euy.ENCODE;
                        break;
                    }
                }
            }
            euy = euy.ENCODE_AND_PAUSE;
        }
        return euy;
    }

    /* renamed from: a */
    public final void mo1307a() {
        synchronized (this.f15542c) {
            if (this.f15541b == null) {
                return;
            }
            for (eug eug : this.f15546g) {
                if (!eug.f15555b.m13499a()) {
                    eug.mo1291a(((Long) eug.f15555b.f19198a.mo2123a()).longValue() + 3000000);
                }
            }
            kni.m18040a(this.f15541b.m2120d(), Throwable.class, new ezq(f15540a), kpq.f8410a);
        }
    }

    /* renamed from: a */
    public final eug mo1306a(kbn kbn, long j, long j2) {
        eug eug;
        synchronized (this.f15542c) {
            if (j < this.f15543d) {
                String str = f15540a;
                long j3 = this.f15543d;
                StringBuilder stringBuilder = new StringBuilder(94);
                stringBuilder.append("Starting session at ");
                stringBuilder.append(j);
                stringBuilder.append(" which is before the last promise ");
                stringBuilder.append(j3);
                bli.m866b(str, stringBuilder.toString());
                j = this.f15543d;
            }
            eug = new eug(this, kbn, kge.m13494a(Long.valueOf(j)), j2);
            this.f15546g.add(eug);
            m9943b();
            this.f15541b.m2119c();
        }
        return eug;
    }

    /* renamed from: b */
    final void m9943b() {
        synchronized (this.f15542c) {
            long j = Long.MIN_VALUE;
            for (eug eug : this.f15546g) {
                long j2;
                if (!eug.f15555b.m13499a()) {
                    j2 = j;
                } else if (((Long) eug.f15555b.f19199b.mo2123a()).longValue() >= this.f15543d) {
                    j2 = j;
                } else {
                    j2 = Math.max(j, ((Long) eug.f15555b.f19199b.mo2123a()).longValue());
                }
                j = j2;
            }
            if (!this.f15546g.isEmpty() && this.f15544e == null) {
                jgx jgp = new jgp(this.f15545f);
                this.f15544e = jgp;
                eua eua = this.f15541b;
                jgd a = eua.f4238e.mo1312a(new etw(jgp));
                eua.f4241h = a;
                for (eux eux : eua.f4237d) {
                    eux.mo1297a(a, this, new eva(eua, eux));
                }
                eua.f4235b.m2136b(true);
                a.m4463b();
                eua.m2119c();
            }
            for (eug eug2 : this.f15546g) {
                jgo jgo = this.f15544e;
                if (jgo == null) {
                    throw new IllegalStateException("Non-empty set of sessions while muxer null");
                } else if (!(eug2.f15556c || !eug2.f15555b.m13499a() || eug2.f15557d)) {
                    String str = f15540a;
                    String valueOf = String.valueOf(eug2.f15555b.f19198a.mo2123a());
                    String valueOf2 = String.valueOf(eug2.f15555b.f19199b.mo2123a());
                    long longValue = ((Long) eug2.f15555b.f19199b.mo2123a()).longValue() - ((Long) eug2.f15555b.f19198a.mo2123a()).longValue();
                    StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 39) + String.valueOf(valueOf2).length());
                    stringBuilder.append("CUT: ");
                    stringBuilder.append(valueOf);
                    stringBuilder.append(" ");
                    stringBuilder.append(valueOf2);
                    stringBuilder.append(" DURATION: ");
                    stringBuilder.append(longValue);
                    stringBuilder.append("US");
                    bli.m863a(str, stringBuilder.toString());
                    jgp = (jgx) eug2.f15554a.mo605b();
                    jgo.mo3169a(jgp, ((Long) eug2.f15555b.f19198a.mo2123a()).longValue(), ((Long) eug2.f15555b.f19199b.mo2123a()).longValue());
                    eug2.f15556c = true;
                    eug2.f15558e.mo3616b(jgp.mo1294b());
                }
            }
        }
    }
}
