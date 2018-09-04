package p000;

import com.google.googlex.gcam.BurstSpec;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* renamed from: dry */
public final class dry extends dtx {
    /* renamed from: a */
    public final bym f21163a;
    /* renamed from: e */
    private final iqz f21164e;
    /* renamed from: f */
    private final ffc f21165f;
    /* renamed from: g */
    private final cdo f21166g;
    /* renamed from: h */
    private final grk f21167h;
    /* renamed from: i */
    private final int f21168i;
    /* renamed from: j */
    private final ccy f21169j;
    /* renamed from: k */
    private final bzt f21170k;

    public dry(ira ira, ird ird, ffr ffr, dqo dqo, fwl fwl, dty dty, fgr fgr, bxg bxg, long j, Set set, ffc ffc, bym bym, cdo cdo, ccy ccy, bzt bzt, grk grk, int i) {
        boolean z;
        super(ira, ird, ffr, dqo, fwl, dty, fgr, bxg.f1692g, bxg.f1694i, j, set, null);
        this.f21169j = ccy;
        this.f21170k = bzt;
        if (bxg.f1693h >= bxg.f1692g) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
        this.f21165f = ffc;
        this.f21163a = bym;
        this.f21166g = cdo;
        this.f21167h = grk;
        this.f21168i = i;
        this.f21164e = ira.mo511a("HdrZslImgCptrCmd");
    }

    /* renamed from: c */
    protected final List mo2973c() {
        return this.c.mo3040d();
    }

    /* renamed from: d */
    protected final bbo mo2974d() {
        if (this.d != null) {
            return new bbo(new ArrayList(this.d.mo3040d()));
        }
        return new bbo();
    }

    /* renamed from: b */
    public final ilp mo1172b() {
        if (this.d != null) {
            return ilq.m3818a(fds.m10241a(fds.m10237a(this.c), fds.m10237a(this.d), fds.m10240a(khb.m4895c(this.b))));
        }
        return ilq.m3818a(fds.m10241a(fds.m10237a(this.c), fds.m10240a(khb.m4895c(this.b))));
    }

    public final String toString() {
        return "HdrPlusZslCaptureCommand";
    }

    /* renamed from: a */
    protected final boolean mo2972a(fwm fwm, fwa fwa, List list, List list2) {
        Throwable th;
        Object obj;
        try {
            boolean z;
            iwp iwp = (iwp) ((fjj) list.get(0)).mo3043d().get();
            this.f21164e.mo514b("Acquired metadata from the first frame.");
            int c = this.f21163a.mo620c(bya.m1047b(this.f21165f));
            if (c >= 0) {
                z = true;
            } else {
                z = false;
            }
            jri.m13143a(z);
            bxc b = this.f21166g.m8044b();
            bzx a = this.f21169j.m8025a(fwa, this.f21170k.m1083a(iwp, c), b, axm.m734a(fwa.f4752a.f4445a, this.f21165f));
            try {
                this.f21164e.mo518d("Starting HdrPlus#ZslShotCapture.");
                byx a2 = this.f21163a.mo609a(c, a, fwa, b.f1684e, iwp);
                if (a2 == null) {
                    this.f21164e.mo520f("Failed to initiate HDR plus shot capture.");
                    return false;
                }
                this.f21164e.mo518d("Flashing shot capture indicator and releasing image capture lock.");
                dtx.m9387a(fwa);
                fwm.close();
                int i;
                fjj fjj;
                try {
                    int i2;
                    iqz iqz;
                    this.f21163a.mo616a(a2, new BurstSpec());
                    int i3 = 0;
                    Object obj2 = null;
                    i = 0;
                    for (fjj fjj2 : list) {
                        try {
                            iwp iwp2 = (iwp) fjj2.mo3043d().get();
                            iwz a3 = fds.m10247a(fjj2, 37, 38, 32);
                            long e = fjj2.mo3044e();
                            if (a3 != null) {
                                i2 = 1;
                            } else {
                                i2 = 0;
                            }
                            int i4 = i3 | i2;
                            try {
                                iwz a4;
                                Object obj3;
                                for (fjj fjj22 : list2) {
                                    if (fjj22.mo3044e() == e) {
                                        break;
                                    }
                                }
                                fjj22 = null;
                                list2.remove(fjj22);
                                if (fjj22 != null) {
                                    iqz iqz2 = this.f21164e;
                                    StringBuilder stringBuilder = new StringBuilder(39);
                                    stringBuilder.append("PD frame found for ");
                                    stringBuilder.append(e);
                                    iqz2.mo518d(stringBuilder.toString());
                                    a4 = fds.m10247a(fjj22, this.f21168i);
                                    obj3 = 1;
                                } else {
                                    iqz = this.f21164e;
                                    StringBuilder stringBuilder2 = new StringBuilder(43);
                                    stringBuilder2.append("PD frame NOT found for ");
                                    stringBuilder2.append(e);
                                    iqz.mo518d(stringBuilder2.toString());
                                    obj3 = obj2;
                                    a4 = null;
                                }
                                try {
                                    this.f21163a.mo615a(a2, i, iwp2, a3, a4, null);
                                    if (a3 != null) {
                                        this.f21164e.mo518d(String.format(null, "Acquired frame %d of %d for shot %d at time %d.", new Object[]{Integer.valueOf(i + 1), Integer.valueOf(list.size()), Integer.valueOf(a2.f1718a), Long.valueOf(e)}));
                                    } else {
                                        this.f21164e.mo520f(String.format(null, "Ignoring missing raw frame %d of %d for shot %d at time %d.", new Object[]{Integer.valueOf(i + 1), Integer.valueOf(list.size()), Integer.valueOf(a2.f1718a), Long.valueOf(e)}));
                                    }
                                    i++;
                                    obj2 = obj3;
                                    i3 = i4;
                                } catch (Throwable th2) {
                                    i = i4;
                                    th = th2;
                                    obj = obj3;
                                }
                            } catch (Throwable th22) {
                                i = i4;
                                th = th22;
                                obj = obj2;
                            }
                        } catch (Throwable th222) {
                            i = i3;
                            th = th222;
                            obj = obj2;
                        }
                    }
                    if (i3 != 0) {
                        if (this.f21163a.mo621c(a2)) {
                            i2 = a2.f1718a;
                            if (this.f21163a.mo619b(i2)) {
                                fwa.f4753b.mo2870a(new drz(this, i2));
                                iqz = this.f21164e;
                                i = a2.f1718a;
                                StringBuilder stringBuilder3 = new StringBuilder(44);
                                stringBuilder3.append("ZSL payload for burst ");
                                stringBuilder3.append(i);
                                stringBuilder3.append(" succeeded.");
                                iqz.mo518d(stringBuilder3.toString());
                                this.f21167h.m2762a(fwa.f4753b.mo1482h());
                            }
                            if (obj2 == null) {
                                a2.f1719b.m1079a();
                            }
                            for (fjj fjj222 : list2) {
                                fjj222.close();
                            }
                            return true;
                        }
                    }
                    this.f21164e.mo516c(String.format(null, "ZSL payload for shot %d failed.", new Object[]{Integer.valueOf(a2.f1718a)}));
                    while (r3.hasNext()) {
                        fjj222.close();
                    }
                    return true;
                } catch (Throwable th2222) {
                    i = 0;
                    th = th2222;
                    obj = null;
                    if (i != 0) {
                        if (this.f21163a.mo621c(a2)) {
                            i = a2.f1718a;
                            if (this.f21163a.mo619b(i)) {
                                fwa.f4753b.mo2870a(new drz(this, i));
                                iqz iqz3 = this.f21164e;
                                int i5 = a2.f1718a;
                                StringBuilder stringBuilder4 = new StringBuilder(44);
                                stringBuilder4.append("ZSL payload for burst ");
                                stringBuilder4.append(i5);
                                stringBuilder4.append(" succeeded.");
                                iqz3.mo518d(stringBuilder4.toString());
                                this.f21167h.m2762a(fwa.f4753b.mo1482h());
                            }
                            if (obj == null) {
                                a2.f1719b.m1079a();
                            }
                            for (fjj fjj2222 : list2) {
                                fjj2222.close();
                            }
                            throw th;
                        }
                    }
                    this.f21164e.mo516c(String.format(null, "ZSL payload for shot %d failed.", new Object[]{Integer.valueOf(a2.f1718a)}));
                    while (r3.hasNext()) {
                        fjj2222.close();
                    }
                    throw th;
                }
            } catch (ExecutionException e2) {
                return false;
            } catch (isr e3) {
                return false;
            }
        } catch (ExecutionException e4) {
            this.f21164e.mo516c("Failed to acquire metadata from the first frame.");
            return false;
        }
    }
}
