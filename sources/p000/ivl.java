package p000;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Handler;
import android.view.Surface;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: ivl */
public final class ivl implements ijk {
    /* renamed from: a */
    public final iqz f18611a;
    /* renamed from: b */
    public final ikb f18612b;
    /* renamed from: c */
    public final isq f18613c;
    /* renamed from: d */
    public final kpw f18614d = kpw.m18056d();
    /* renamed from: e */
    public final kpw f18615e = kpw.m18056d();
    /* renamed from: f */
    private final kpk f18616f;
    /* renamed from: g */
    private final List f18617g;
    /* renamed from: h */
    private final ivr f18618h;
    /* renamed from: i */
    private final kbg f18619i;
    /* renamed from: j */
    private final ivx f18620j;
    /* renamed from: k */
    private final ird f18621k;
    /* renamed from: l */
    private final Executor f18622l;
    /* renamed from: m */
    private final Object f18623m = new Object();
    /* renamed from: n */
    private boolean f18624n = false;

    public ivl(ikb ikb, kpk kpk, Set set, ivr ivr, ira ira, isq isq, kbg kbg, ivx ivx, ird ird, Executor executor) {
        this.f18612b = ikb;
        this.f18616f = kpk;
        this.f18617g = ken.m13458a((Collection) set);
        this.f18618h = ivr;
        this.f18613c = isq;
        this.f18619i = kbg;
        this.f18620j = ivx;
        this.f18621k = ird;
        this.f18622l = executor;
        this.f18611a = ira.mo511a("CmrCptrSssnCrtr");
    }

    /* renamed from: a */
    final /* synthetic */ kpk m12553a(iwl iwl, List list) {
        Handler a = ijy.m3789a(this.f18612b, "CameraCaptureSession.StateCallback");
        try {
            iqz iqz = this.f18611a;
            String valueOf = String.valueOf(list);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 38);
            stringBuilder.append("Creating capture session for outputs: ");
            stringBuilder.append(valueOf);
            iqz.mo518d(stringBuilder.toString());
            this.f18621k.mo1903a("CaptureSessionCreator#ValidateConfigs");
            for (iwt iwt : list) {
                boolean z = iwt.mo3161b() != null ? ((Surface) jri.m13152b(iwt.mo3161b())).isValid() : true;
                jri.m13144a(z, String.format("Configuration %s is not valid", new Object[]{iwt.toString()}));
            }
            ivr ivr = this.f18618h;
            Collection b = khb.m4885b();
            for (iwt iwt2 : list) {
                Surface b2 = iwt2.mo3161b();
                if (b2 != null) {
                    b.add(b2);
                }
            }
            ivr.m4259a(b);
            if (this.f18619i.mo2084b()) {
                if (this.f18620j.f7501b) {
                    this.f18611a.mo518d("Creating reprocessable capture session from output configurations.");
                    this.f18621k.mo1903a("CameraDevice#reprocessableSessionByConfig");
                    iwl.mo2992b((InputConfiguration) this.f18619i.mo2081a(), list, new ivp(this), a);
                } else {
                    this.f18611a.mo518d("Creating reprocessable capture session.");
                    this.f18621k.mo1903a("CameraDevice#reprocessableSession");
                    iwl.mo2988a((InputConfiguration) this.f18619i.mo2081a(), ivl.m12550a(list), new ivp(this), a);
                }
            } else if (this.f18620j.f7501b) {
                this.f18611a.mo518d("Creating regular capture session from output configurations.");
                this.f18621k.mo1903a("CameraDevice#captureSessionByConfig");
                iwl.mo2993b(list, new ivp(this), a);
            } else {
                this.f18611a.mo518d("Creating regular capture session.");
                this.f18621k.mo1903a("CameraDevice#captureSession");
                iwl.mo2990a(ivl.m12550a(list), new ivp(this), a);
            }
            this.f18621k.mo1904b();
        } catch (Throwable e) {
            this.f18614d.m17780a(e);
        } finally {
            this.f18621k.mo1904b();
        }
        return this.f18614d;
    }

    /* renamed from: a */
    final /* synthetic */ iwg m12551a(iwg iwg, List list) {
        Exception e;
        iqz iqz;
        String valueOf;
        String str;
        this.f18611a.mo518d("Deferred futures complete.");
        if (!(list.size() == 0 || this.f18612b.mo3049a())) {
            try {
                this.f18611a.mo518d("Finishing deferred output configuration.");
                iwg.mo2981a(list);
            } catch (IllegalArgumentException e2) {
                e = e2;
                iqz = this.f18611a;
                valueOf = String.valueOf(e.getMessage());
                str = "WARNING: Failed to complete deferred future! ";
                if (valueOf.length() != 0) {
                    valueOf = new String(str);
                } else {
                    valueOf = str.concat(valueOf);
                }
                iqz.mo520f(valueOf);
                this.f18618h.m4259a(ivl.m12550a(list));
                this.f18615e.mo3557a((Object) iwg);
                return iwg;
            } catch (CameraAccessException e3) {
                e = e3;
                iqz = this.f18611a;
                valueOf = String.valueOf(e.getMessage());
                str = "WARNING: Failed to complete deferred future! ";
                if (valueOf.length() != 0) {
                    valueOf = str.concat(valueOf);
                } else {
                    valueOf = new String(str);
                }
                iqz.mo520f(valueOf);
                this.f18618h.m4259a(ivl.m12550a(list));
                this.f18615e.mo3557a((Object) iwg);
                return iwg;
            }
            this.f18618h.m4259a(ivl.m12550a(list));
        }
        this.f18615e.mo3557a((Object) iwg);
        return iwg;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final p000.kpk mo385a() {
        /*
        r5 = this;
        r1 = r5.f18623m;
        monitor-enter(r1);
        r0 = r5.f18624n;	 Catch:{ all -> 0x007b }
        if (r0 != 0) goto L_0x0077;
    L_0x0007:
        r0 = 1;
        r5.f18624n = r0;	 Catch:{ all -> 0x007b }
        monitor-exit(r1);	 Catch:{ all -> 0x007b }
        r1 = new java.util.ArrayList;
        r1.<init>();
        r0 = r5.f18617g;
        r2 = r0.iterator();
    L_0x0016:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x0028;
    L_0x001c:
        r0 = r2.next();
        r0 = (p000.ivs) r0;
        r0 = r0.f7498a;
        r1.add(r0);
        goto L_0x0016;
    L_0x0028:
        r1 = p000.kow.m13616a(r1);
        r2 = new java.util.ArrayList;
        r2.<init>();
        r0 = r5.f18617g;
        r3 = r0.iterator();
    L_0x0037:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x0051;
    L_0x003d:
        r0 = r3.next();
        r0 = (p000.ivs) r0;
        r4 = r0.m4264b();
        if (r4 == 0) goto L_0x0037;
    L_0x0049:
        r0 = r0.m4263a();
        r2.add(r0);
        goto L_0x0037;
    L_0x0051:
        r0 = p000.kow.m13616a(r2);
        r2 = r5.f18616f;
        r3 = new ivm;
        r3.<init>(r5);
        r4 = r5.f18622l;
        r1 = p000.iel.m3717a(r2, r1, r3, r4);
        r2 = new ivn;
        r2.<init>(r5);
        p000.iel.m3718a(r1, r0, r2);
        r0 = new ivo;
        r0.<init>(r5);
        r2 = p000.kpq.f8410a;
        p000.kow.m13622a(r1, r0, r2);
        r0 = r5.f18614d;
    L_0x0076:
        return r0;
    L_0x0077:
        r0 = r5.f18614d;	 Catch:{ all -> 0x007b }
        monitor-exit(r1);	 Catch:{ all -> 0x007b }
        goto L_0x0076;
    L_0x007b:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x007b }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: ivl.a():kpk");
    }

    /* renamed from: a */
    private static List m12550a(List list) {
        List b = khb.m4885b();
        for (iwt b2 : list) {
            Object b3 = b2.mo3161b();
            jri.m13139a(b3, (Object) "Surface must not be null when adding to surface list.");
            b.add(b3);
        }
        return b;
    }
}
