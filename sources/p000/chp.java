package p000;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.google.android.libraries.smartburst.buffers.FeatureTable;
import com.google.android.libraries.smartburst.filterfw.decoder.MediaDecoder;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* renamed from: chp */
final class chp extends izx {
    /* renamed from: a */
    private final /* synthetic */ ExecutorService f22703a;
    /* renamed from: b */
    private final /* synthetic */ chj f22704b;

    chp(chj chj, ExecutorService executorService) {
        this.f22704b = chj;
        this.f22703a = executorService;
    }

    /* renamed from: b */
    public final /* synthetic */ void mo3396b(Object obj, Object obj2) {
        chr chr = (chr) obj;
        FeatureTable featureTable = (FeatureTable) obj2;
        bli.m863a(chj.f11961a, "startAnalysis : start postprocessing");
        chj chj = this.f22704b;
        if (chj.f11991t) {
            chj.f11983l.mo1903a("BurstControllerImpl#startAnalysis_startPostProcessing");
            try {
                chj chj2 = this.f22704b;
                jrg jrg = chr.f1992a;
                jrg jrg2 = chr.f1993b;
                ExecutorService executorService = this.f22703a;
                chj2.f11983l.mo1903a("BurstControllerImpl#filterAndPostProcess");
                try {
                    AutoCloseable[] autoCloseableArr = new AutoCloseable[]{jrg, jrg2};
                    kaf kaf = new kaf();
                    for (int i = 0; i < 2; i++) {
                        kaf.m4724a(autoCloseableArr[i]);
                    }
                    try {
                        AutoCloseable autoCloseable = (jrg) chj2.f11992u.getAndSet(null);
                        if (autoCloseable == null) {
                            throw new IllegalStateException("Null captured images.");
                        }
                        AutoCloseable autoCloseable2;
                        kaf.m4724a(autoCloseable);
                        Set<Long> e = autoCloseable.m13135e();
                        jrg a;
                        if (jrg.m13136f() > 0) {
                            a = jqk.m13086a((Set) e, jrg);
                            a.m13128a(autoCloseable.f18973c);
                            jrg = autoCloseable.m13131b((Set) e);
                            jrg.m13128a(autoCloseable.f18973c);
                            autoCloseable = jrg;
                            autoCloseable2 = a;
                        } else {
                            chi chi = chj2.f11986o;
                            int i2 = chi.f1989c;
                            int i3 = chi.f1987a;
                            int i4 = chi.f1988b;
                            int i5 = i2 % MediaDecoder.ROTATE_180;
                            if (i5 == 90) {
                                i2 = i3;
                            } else {
                                i2 = i4;
                            }
                            if (i5 != 90) {
                                i4 = i3;
                            }
                            iqp iqp = new iqp(i4, i2);
                            jqr a2 = chj2.f11988q.mo2041a("placeholder", iqp.f7329a, iqp.f7330b, Config.ARGB_8888);
                            ((Bitmap) a2.mo3191e()).eraseColor(-12303292);
                            kah kah = (kah) kaf.m4725a(jqk.m13089a(new kab(jqk.m13097b(new jqx(a2)))));
                            jrj jrj = new jrj();
                            for (Long longValue : e) {
                                jrj.m4623a(longValue.longValue(), kah.D_(), false);
                            }
                            a = jrj.m4620a();
                            a.m13128a(autoCloseable.f18973c);
                            jrg = autoCloseable.m13131b((Set) e);
                            jrg.m13128a(autoCloseable.f18973c);
                            Object obj3 = jrg;
                            Object obj4 = a;
                        }
                        kae a3 = kaf.m4724a(autoCloseable2);
                        kae a4 = kaf.m4724a(autoCloseable);
                        Set hashSet = new HashSet(((jrg) a3.mo3191e()).m13135e());
                        hashSet.addAll(jrg2.m13135e());
                        kae a5 = kaf.m4724a(jqk.m13086a(hashSet, jrg2));
                        chj2.f11974c.f2077a.f2046m.mo3557a(null);
                        autoCloseable = (jrg) a3.mo3190d();
                        autoCloseable2 = (jrg) a5.mo3190d();
                        AutoCloseable autoCloseable3 = (jrg) a4.mo3190d();
                        kae jzy = new jzy(jqk.m13097b(autoCloseable));
                        try {
                            jzy = new jzy(jqk.m13097b(autoCloseable2));
                            try {
                                jzy = new jzy(jqk.m13097b(autoCloseable3));
                                try {
                                    boolean z;
                                    jrg jrg3 = (jrg) jzy.mo3191e();
                                    if (jrg3.m13136f() > 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    jri.m13143a(z);
                                    jrg3.m13130b(((Long) jrg3.m13135e().iterator().next()).longValue()).mo1973a(jlk.f7915a, new chq(chj2));
                                    chj2.f11977f.m2510a(ciq.m8220a(chj2.f11981j, (jrg) jzy.mo3190d(), (jrg) jzy.mo3190d(), featureTable, (jrg) jzy.mo3190d(), chj2.f11973b, chj2.f11988q, chj2.f11979h, chj2.f11990s, (dpu) chj2.f11989r.getAndSet(null), chj2.f11978g, chj2.f11975d, chj2.f11976e, chj2.f11974c, chj2.f11985n, jlo.m4541c(), chj2.f11987p, executorService, chj2.f11982k, chj2.f11993v, chj2.f11983l, chj2.f11994w, chj2.f11995x));
                                    chj.m8194a(null, jzy);
                                    chj.m8194a(null, jzy);
                                    chj.m8194a(null, jzy);
                                    chj.m8195a(null, kaf);
                                    chj2.f11983l.mo1904b();
                                    this.f22704b.f11983l.mo1904b();
                                    return;
                                } catch (Throwable th) {
                                    chj.m8194a(th, jzy);
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                chj.m8194a(th, jzy);
                                throw th2;
                            }
                        } catch (Throwable th22) {
                            chj.m8194a(th, jzy);
                            throw th22;
                        }
                    } catch (Throwable th222) {
                        chj.m8195a(th, kaf);
                        throw th222;
                    }
                } catch (Throwable th3) {
                    chj2.f11983l.mo1904b();
                    throw th3;
                }
            } catch (Throwable th32) {
                this.f22704b.f11983l.mo1904b();
                throw th32;
            }
        }
        throw new RuntimeException("Burst stopped and canceled.");
    }
}
