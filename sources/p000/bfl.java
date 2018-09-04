package p000;

import android.media.AudioManager;
import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.AudioCapabilities;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* renamed from: bfl */
final class bfl implements bff, bfk {
    /* renamed from: a */
    public static final String f19939a = bli.m862a("CdrMgrImpl");
    /* renamed from: b */
    public final ExecutorService f19940b;
    /* renamed from: c */
    public final gtf f19941c;
    /* renamed from: d */
    public final bij f19942d;
    /* renamed from: e */
    public final ird f19943e;
    /* renamed from: f */
    public kpw f19944f;
    /* renamed from: g */
    public final Object f19945g = new Object();
    /* renamed from: h */
    public Map f19946h = new HashMap();
    /* renamed from: i */
    public final Handler f19947i;
    /* renamed from: j */
    public final ijx f19948j;
    /* renamed from: k */
    public final bjx f19949k;
    /* renamed from: l */
    private final bfa f19950l;
    /* renamed from: m */
    private final inn f19951m;
    /* renamed from: n */
    private final HandlerThread f19952n;
    /* renamed from: o */
    private final bir f19953o;
    /* renamed from: p */
    private final kwk f19954p;
    /* renamed from: q */
    private final fbn f19955q;
    /* renamed from: r */
    private final guf f19956r;
    /* renamed from: s */
    private final bja f19957s;
    /* renamed from: t */
    private final bkf f19958t;
    /* renamed from: u */
    private final iog f19959u;
    /* renamed from: v */
    private final ioe f19960v;
    /* renamed from: w */
    private Map f19961w = new HashMap();

    public bfl(bfa bfa, inn inn, ExecutorService executorService, gtf gtf, HandlerThread handlerThread, bir bir, kwk kwk, fbn fbn, guf guf, bij bij, bja bja, bkf bkf, ird ird, bjx bjx, iog iog, ioe ioe) {
        this.f19950l = (bfa) jri.m13152b((Object) bfa);
        this.f19951m = (inn) jri.m13152b((Object) inn);
        this.f19940b = (ExecutorService) jri.m13152b((Object) executorService);
        this.f19941c = (gtf) jri.m13152b((Object) gtf);
        this.f19952n = (HandlerThread) jri.m13152b((Object) handlerThread);
        this.f19953o = (bir) jri.m13152b((Object) bir);
        this.f19954p = (kwk) jri.m13152b((Object) kwk);
        this.f19955q = (fbn) jri.m13152b((Object) fbn);
        this.f19956r = (guf) jri.m13152b((Object) guf);
        this.f19942d = (bij) jri.m13152b((Object) bij);
        this.f19957s = (bja) jri.m13152b((Object) bja);
        this.f19958t = (bkf) jri.m13152b((Object) bkf);
        this.f19943e = (ird) jri.m13152b((Object) ird);
        this.f19949k = (bjx) jri.m13152b((Object) bjx);
        this.f19959u = iog;
        this.f19960v = ioe;
        this.f19952n.start();
        this.f19947i = new Handler(this.f19952n.getLooper());
        this.f19948j = new ijx(this.f19947i);
        this.f19944f = kpw.m18056d();
        this.f19944f.mo3557a(Boolean.valueOf(true));
    }

    /* renamed from: a */
    private final void m14788a(kpk kpk, ken ken) {
        kow.m13622a(kpk, new bfo(this, ken), kpq.f8410a);
    }

    public final void close() {
        synchronized (this.f19945g) {
            if (m14795b()) {
                bli.m866b(f19939a, "Manager has been closed");
                return;
            }
            this.f19944f.mo3557a(Boolean.valueOf(false));
            bli.m863a(f19939a, "close");
            for (bfe close : this.f19946h.values()) {
                close.close();
            }
            this.f19940b.shutdown();
            this.f19952n.quit();
        }
    }

    /* renamed from: a */
    private final inm m14785a(inc inc, ioa ioa) {
        if (inc.m3875c()) {
            return new inm(imz.m3862a(ioa.mo3128c()), ioa.mo3126a(), ioa.mo3129d(), ioa.mo3127b());
        }
        boolean z;
        inn inn = this.f19951m;
        int d = ioa.mo3129d() / inc.m3874a();
        imz a = imz.m3862a(ioa.mo3128c());
        inb inb = a.f7116b;
        MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) inn.f7168a.f7163a.get(inb.toString());
        jqk.m13102c(mediaCodecInfo);
        CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(inb.toString());
        jqk.m13102c(capabilitiesForType);
        AudioCapabilities audioCapabilities = capabilitiesForType.getAudioCapabilities();
        jqk.m13102c(audioCapabilities);
        int[] iArr = inn.f7169b;
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = iArr[i];
            if (!audioCapabilities.isSampleRateSupported(i3)) {
                i3 = i2;
            } else if (i3 >= d) {
                i2 = i3;
                break;
            }
            i++;
            i2 = i3;
        }
        if (i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        jqk.m13095a(z);
        return new inm(a, ioa.mo3126a(), i2, ioa.mo3127b());
    }

    /* renamed from: a */
    private final ioa m14787a(inc inc, boolean z, ine ine, iur iur) {
        ioa a;
        kbg c;
        ivy ivy;
        Object a2;
        if (inc.m3875c()) {
            iog iog = this.f19959u;
            a = inx.m3900a(iur, (iob) jri.m13152b(iob.m3918a(ine)));
            if (a != null) {
                ivy = iog.f7224a;
                if (ivy.f7512h || ivy.f7510f || ivy.f7511g || ivy.f7509e || ivy.f7508d) {
                    int g = a.mo3132g();
                    if (ine.equals(ine.RES_2160P)) {
                        g = 48000000;
                    }
                    if (z) {
                        a2 = ioc.m12315a(a).m3927h(5).m3929j(1).m3928i(65536).m3926g(g).m3919a();
                    } else {
                        a2 = ioc.m12315a(a).m3927h(2).m3929j(8).m3928i(32768).m3926g(g).m3919a();
                    }
                }
                c = kbg.m4745c(a2);
            } else {
                c = kau.f19138a;
            }
        } else {
            ioe ioe = this.f19960v;
            a = inx.m3899a(iur, (inz) jri.m13152b(inz.m3902a(ine)));
            if (a != null) {
                ivy = ioe.f7223a;
                if (ivy.f7512h || ivy.f7510f || ivy.f7511g || ivy.f7509e || ivy.f7508d) {
                    if (z) {
                        a2 = ioc.m12315a(a).m3927h(5).m3929j(1).m3928i(65536).m3919a();
                    } else {
                        a2 = ioc.m12315a(a).m3927h(2).m3929j(8).m3928i(32768).m3919a();
                    }
                }
                c = kbg.m4745c(a2);
            } else {
                c = kau.f19138a;
            }
        }
        if (c.mo2084b()) {
            a = (ioa) c.mo2081a();
            String str = f19939a;
            String valueOf = String.valueOf(a);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 32);
            stringBuilder.append("Selected CamcorderProfileProxy: ");
            stringBuilder.append(valueOf);
            bli.m871d(str, stringBuilder.toString());
            return a;
        }
        bli.m866b(f19939a, "immediateFailedFuture: No supported CamcorderProfile");
        throw new bdx("no supported CamcorderProfile");
    }

    /* renamed from: a */
    private final inp m14786a(inc inc, ioa ioa, ine ine) {
        int i;
        int g;
        if (inc.m3875c()) {
            jri.m13143a(inn.m3887b(ioa, inc, ine));
            int l = ioa.mo3137l();
            i = inc.f7142f;
            g = ioa.mo3132g();
            if (i == 30 && l == 60) {
                g = (int) (((double) g) / 1.5d);
            }
            return inn.m3883a(ioa, ine, g, inc);
        }
        jri.m13143a(inn.m3885a(ioa, inc, ine));
        l = ioa.mo3137l();
        i = inc.f7142f;
        g = ioa.mo3132g();
        if (i < l) {
            g = (int) (((float) g) * (((float) i) / ((float) l)));
        }
        return inn.m3883a(ioa, ine, g, inc);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    public final p000.kbg mo2670b(p000.iur r17) {
        /*
        r16 = this;
        r0 = r16;
        r4 = r0.f19945g;
        monitor-enter(r4);
        r1 = r16.m14795b();	 Catch:{ all -> 0x0034 }
        if (r1 == 0) goto L_0x0016;
    L_0x000b:
        r1 = f19939a;	 Catch:{ all -> 0x0034 }
        r2 = "Manager has been closed";
        p000.bli.m873e(r1, r2);	 Catch:{ all -> 0x0034 }
        r1 = p000.kau.f19138a;	 Catch:{ all -> 0x0034 }
        monitor-exit(r4);	 Catch:{ all -> 0x0034 }
    L_0x0015:
        return r1;
    L_0x0016:
        r0 = r16;
        r1 = r0.f19961w;	 Catch:{ all -> 0x0034 }
        r0 = r17;
        r1 = r1.containsKey(r0);	 Catch:{ all -> 0x0034 }
        if (r1 == 0) goto L_0x0037;
    L_0x0022:
        r0 = r16;
        r1 = r0.f19961w;	 Catch:{ all -> 0x0034 }
        r0 = r17;
        r1 = r1.get(r0);	 Catch:{ all -> 0x0034 }
        r1 = (p000.bez) r1;	 Catch:{ all -> 0x0034 }
        r1 = p000.kbg.m4745c(r1);	 Catch:{ all -> 0x0034 }
        monitor-exit(r4);	 Catch:{ all -> 0x0034 }
        goto L_0x0015;
    L_0x0034:
        r1 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x0034 }
        throw r1;
    L_0x0037:
        r0 = r16;
        r5 = r0.f19950l;	 Catch:{ all -> 0x0034 }
        r1 = r5.f1119d;	 Catch:{ all -> 0x0034 }
        r0 = r17;
        r6 = r1.m10176b(r0);	 Catch:{ all -> 0x0034 }
        r7 = new java.util.HashMap;	 Catch:{ all -> 0x0034 }
        r7.<init>();	 Catch:{ all -> 0x0034 }
        r1 = p000.inc.FPS_30;	 Catch:{ all -> 0x0034 }
        r2 = p000.inc.FPS_30;	 Catch:{ all -> 0x0034 }
        r0 = r17;
        r2 = p000.bfa.m806a(r0, r2);	 Catch:{ all -> 0x0034 }
        r7.put(r1, r2);	 Catch:{ all -> 0x0034 }
        r1 = p000.inc.FPS_60;	 Catch:{ all -> 0x0034 }
        r2 = p000.inc.FPS_60;	 Catch:{ all -> 0x0034 }
        r0 = r17;
        r2 = p000.bfa.m806a(r0, r2);	 Catch:{ all -> 0x0034 }
        r7.put(r1, r2);	 Catch:{ all -> 0x0034 }
        r1 = p000.inc.FPS_AUTO;	 Catch:{ all -> 0x0034 }
        r2 = p000.inc.FPS_AUTO;	 Catch:{ all -> 0x0034 }
        r0 = r17;
        r2 = p000.bfa.m806a(r0, r2);	 Catch:{ all -> 0x0034 }
        r7.put(r1, r2);	 Catch:{ all -> 0x0034 }
        r8 = new java.util.HashMap;	 Catch:{ all -> 0x0034 }
        r8.<init>();	 Catch:{ all -> 0x0034 }
        r1 = p000.inc.m3873b();	 Catch:{ all -> 0x0034 }
        r2 = r1.iterator();	 Catch:{ all -> 0x0034 }
    L_0x007c:
        r1 = r2.hasNext();	 Catch:{ all -> 0x0034 }
        if (r1 == 0) goto L_0x0091;
    L_0x0082:
        r1 = r2.next();	 Catch:{ all -> 0x0034 }
        r1 = (p000.inc) r1;	 Catch:{ all -> 0x0034 }
        r3 = new java.util.ArrayList;	 Catch:{ all -> 0x0034 }
        r3.<init>();	 Catch:{ all -> 0x0034 }
        r8.put(r1, r3);	 Catch:{ all -> 0x0034 }
        goto L_0x007c;
    L_0x0091:
        r1 = r6.mo1943y();	 Catch:{ all -> 0x0034 }
        if (r1 == 0) goto L_0x01d8;
    L_0x0097:
        r1 = r6.u_();	 Catch:{ all -> 0x0034 }
        r2 = p000.bfa.f1116a;	 Catch:{ all -> 0x0034 }
        r3 = java.lang.String.valueOf(r1);	 Catch:{ all -> 0x0034 }
        r9 = java.lang.String.valueOf(r3);	 Catch:{ all -> 0x0034 }
        r9 = r9.length();	 Catch:{ all -> 0x0034 }
        r10 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0034 }
        r9 = r9 + 46;
        r10.<init>(r9);	 Catch:{ all -> 0x0034 }
        r9 = "query CameraCharacteristics.HfrVideoSizeList: ";
        r10.append(r9);	 Catch:{ all -> 0x0034 }
        r10.append(r3);	 Catch:{ all -> 0x0034 }
        r3 = r10.toString();	 Catch:{ all -> 0x0034 }
        p000.bli.m871d(r2, r3);	 Catch:{ all -> 0x0034 }
        r9 = r1.iterator();	 Catch:{ all -> 0x0034 }
    L_0x00c3:
        r1 = r9.hasNext();	 Catch:{ all -> 0x0034 }
        if (r1 == 0) goto L_0x01a1;
    L_0x00c9:
        r1 = r9.next();	 Catch:{ all -> 0x0034 }
        r1 = (p000.ine) r1;	 Catch:{ all -> 0x0034 }
        r10 = p000.inz.m3902a(r1);	 Catch:{ all -> 0x0034 }
        if (r10 == 0) goto L_0x00c3;
    L_0x00d5:
        r2 = r5.f1118c;	 Catch:{ all -> 0x0034 }
        r0 = r17;
        r2 = p000.inx.m3901b(r0, r10);	 Catch:{ all -> 0x0034 }
        if (r2 != 0) goto L_0x0104;
    L_0x00df:
        r1 = p000.bfa.f1116a;	 Catch:{ all -> 0x0034 }
        r2 = java.lang.String.valueOf(r10);	 Catch:{ all -> 0x0034 }
        r3 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x0034 }
        r3 = r3.length();	 Catch:{ all -> 0x0034 }
        r10 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0034 }
        r3 = r3 + 42;
        r10.<init>(r3);	 Catch:{ all -> 0x0034 }
        r3 = "CamcorderProfile doesn't support quality: ";
        r10.append(r3);	 Catch:{ all -> 0x0034 }
        r10.append(r2);	 Catch:{ all -> 0x0034 }
        r2 = r10.toString();	 Catch:{ all -> 0x0034 }
        p000.bli.m871d(r1, r2);	 Catch:{ all -> 0x0034 }
        goto L_0x00c3;
    L_0x0104:
        r2 = r1.m3881c();	 Catch:{ all -> 0x0034 }
        r11 = r6.mo3034a(r2);	 Catch:{ all -> 0x0034 }
        r2 = p000.bfa.f1116a;	 Catch:{ all -> 0x0034 }
        r3 = java.lang.String.valueOf(r1);	 Catch:{ all -> 0x0034 }
        r12 = java.lang.String.valueOf(r11);	 Catch:{ all -> 0x0034 }
        r13 = java.lang.String.valueOf(r3);	 Catch:{ all -> 0x0034 }
        r13 = r13.length();	 Catch:{ all -> 0x0034 }
        r14 = java.lang.String.valueOf(r12);	 Catch:{ all -> 0x0034 }
        r14 = r14.length();	 Catch:{ all -> 0x0034 }
        r15 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0034 }
        r13 = r13 + 53;
        r13 = r13 + r14;
        r15.<init>(r13);	 Catch:{ all -> 0x0034 }
        r13 = "query CameraCharacteristics.HfrVideoFpsRangeList: [";
        r15.append(r13);	 Catch:{ all -> 0x0034 }
        r15.append(r3);	 Catch:{ all -> 0x0034 }
        r3 = "]=";
        r15.append(r3);	 Catch:{ all -> 0x0034 }
        r15.append(r12);	 Catch:{ all -> 0x0034 }
        r3 = r15.toString();	 Catch:{ all -> 0x0034 }
        p000.bli.m871d(r2, r3);	 Catch:{ all -> 0x0034 }
        r2 = p000.inc.m3873b();	 Catch:{ all -> 0x0034 }
        r12 = r2.iterator();	 Catch:{ all -> 0x0034 }
    L_0x014d:
        r2 = r12.hasNext();	 Catch:{ all -> 0x0034 }
        if (r2 == 0) goto L_0x00c3;
    L_0x0153:
        r2 = r12.next();	 Catch:{ all -> 0x0034 }
        r2 = (p000.inc) r2;	 Catch:{ all -> 0x0034 }
        r3 = r5.f1118c;	 Catch:{ all -> 0x0034 }
        r0 = r17;
        r3 = p000.inx.m3901b(r0, r10);	 Catch:{ all -> 0x0034 }
        if (r3 == 0) goto L_0x014d;
    L_0x0163:
        r3 = r5.f1118c;	 Catch:{ all -> 0x0034 }
        r0 = r17;
        r3 = p000.inx.m3899a(r0, r10);	 Catch:{ all -> 0x0034 }
        p000.jri.m13152b(r3);	 Catch:{ all -> 0x0034 }
        r13 = r5.f1117b;	 Catch:{ all -> 0x0034 }
        r3 = p000.inn.m3885a(r3, r2, r1);	 Catch:{ all -> 0x0034 }
        if (r3 == 0) goto L_0x014d;
    L_0x0176:
        r13 = r11.iterator();	 Catch:{ all -> 0x0034 }
    L_0x017a:
        r3 = r13.hasNext();	 Catch:{ all -> 0x0034 }
        if (r3 == 0) goto L_0x014d;
    L_0x0180:
        r3 = r13.next();	 Catch:{ all -> 0x0034 }
        r3 = (android.util.Range) r3;	 Catch:{ all -> 0x0034 }
        r14 = r2.f7142f;	 Catch:{ all -> 0x0034 }
        r3 = r3.getUpper();	 Catch:{ all -> 0x0034 }
        r3 = (java.lang.Integer) r3;	 Catch:{ all -> 0x0034 }
        r3 = r3.intValue();	 Catch:{ all -> 0x0034 }
        if (r14 != r3) goto L_0x017a;
    L_0x0194:
        r2 = r8.get(r2);	 Catch:{ all -> 0x0034 }
        r2 = (java.util.List) r2;	 Catch:{ all -> 0x0034 }
        p000.jri.m13152b(r2);	 Catch:{ all -> 0x0034 }
        r2.add(r1);	 Catch:{ all -> 0x0034 }
        goto L_0x014d;
    L_0x01a1:
        r2 = p000.inz.values();	 Catch:{ all -> 0x0034 }
        r3 = r2.length;	 Catch:{ all -> 0x0034 }
        r1 = 0;
    L_0x01a7:
        if (r1 >= r3) goto L_0x021f;
    L_0x01a9:
        r9 = r2[r1];	 Catch:{ all -> 0x0034 }
        r10 = r5.f1118c;	 Catch:{ all -> 0x0034 }
        r0 = r17;
        r10 = p000.inx.m3901b(r0, r9);	 Catch:{ all -> 0x0034 }
        if (r10 != 0) goto L_0x01b8;
    L_0x01b5:
        r1 = r1 + 1;
        goto L_0x01a7;
    L_0x01b8:
        r10 = r5.f1118c;	 Catch:{ all -> 0x0034 }
        r0 = r17;
        r9 = p000.inx.m3899a(r0, r9);	 Catch:{ all -> 0x0034 }
        p000.jri.m13152b(r9);	 Catch:{ all -> 0x0034 }
        r9 = r9.mo3137l();	 Catch:{ all -> 0x0034 }
        r10 = 240; // 0xf0 float:3.36E-43 double:1.186E-321;
        if (r9 != r10) goto L_0x01b5;
    L_0x01cb:
        r1 = 1;
    L_0x01cc:
        if (r1 != 0) goto L_0x01d8;
    L_0x01ce:
        r1 = p000.inc.FPS_240;	 Catch:{ all -> 0x0034 }
        r2 = new java.util.ArrayList;	 Catch:{ all -> 0x0034 }
        r2.<init>();	 Catch:{ all -> 0x0034 }
        r8.put(r1, r2);	 Catch:{ all -> 0x0034 }
    L_0x01d8:
        r7.putAll(r8);	 Catch:{ all -> 0x0034 }
        r1 = r7.keySet();	 Catch:{ all -> 0x0034 }
        r2 = r1.iterator();	 Catch:{ all -> 0x0034 }
    L_0x01e3:
        r1 = r2.hasNext();	 Catch:{ all -> 0x0034 }
        if (r1 == 0) goto L_0x01fd;
    L_0x01e9:
        r1 = r2.next();	 Catch:{ all -> 0x0034 }
        r1 = (p000.inc) r1;	 Catch:{ all -> 0x0034 }
        r1 = r7.get(r1);	 Catch:{ all -> 0x0034 }
        r1 = (java.util.List) r1;	 Catch:{ all -> 0x0034 }
        r3 = p000.ine.m3879a();	 Catch:{ all -> 0x0034 }
        java.util.Collections.sort(r1, r3);	 Catch:{ all -> 0x0034 }
        goto L_0x01e3;
    L_0x01fd:
        r1 = new bez;	 Catch:{ all -> 0x0034 }
        r1.<init>(r6, r7);	 Catch:{ all -> 0x0034 }
        r2 = p000.kbg.m4745c(r1);	 Catch:{ all -> 0x0034 }
        r1 = r2.mo2084b();	 Catch:{ all -> 0x0034 }
        if (r1 == 0) goto L_0x021b;
    L_0x020c:
        r0 = r16;
        r3 = r0.f19961w;	 Catch:{ all -> 0x0034 }
        r1 = r2.mo2081a();	 Catch:{ all -> 0x0034 }
        r1 = (p000.bez) r1;	 Catch:{ all -> 0x0034 }
        r0 = r17;
        r3.put(r0, r1);	 Catch:{ all -> 0x0034 }
    L_0x021b:
        monitor-exit(r4);	 Catch:{ all -> 0x0034 }
        r1 = r2;
        goto L_0x0015;
    L_0x021f:
        r1 = 0;
        goto L_0x01cc;
        */
        throw new UnsupportedOperationException("Method not decompiled: bfl.b(iur):kbg");
    }

    /* renamed from: a */
    public final fbn mo2666a() {
        return this.f19955q;
    }

    /* renamed from: b */
    final boolean m14795b() {
        boolean z;
        synchronized (this.f19945g) {
            z = this.f19944f.isDone() ? !((Boolean) kow.m13625c(this.f19944f)).booleanValue() : false;
        }
        return z;
    }

    /* renamed from: a */
    public final void mo2669a(iur iur) {
        synchronized (this.f19945g) {
            if (m14795b()) {
                return;
            }
            String str = f19939a;
            String valueOf = String.valueOf(iur);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 23);
            stringBuilder.append("close camcorder device ");
            stringBuilder.append(valueOf);
            bli.m869c(str, stringBuilder.toString());
            this.f19946h.remove(iur);
        }
    }

    /* renamed from: a */
    public final kpk mo2667a(inc inc, ipv ipv, ine ine, iur iur, kbg kbg, ilp ilp, ilp ilp2, kbg kbg2, boolean z, boolean z2, int i, int i2, kbg kbg3) {
        bli.m863a(f19939a, "openFastCamcorder");
        synchronized (this.f19945g) {
            if (m14789c(iur)) {
                ilp b = ilq.m3831b(ilp);
                try {
                    ioa a = m14787a(inc, false, ine, iur);
                    inp a2 = m14786a(inc, a, ine);
                    inm a3 = m14785a(inc, a);
                    ipy ipy = (ipy) this.f19954p.mo345a();
                    bir bir = this.f19953o;
                    ExecutorService executorService = this.f19940b;
                    gtf gtf = this.f19941c;
                    guf guf = this.f19956r;
                    ird ird = this.f19943e;
                    bir.m826a((inj) bir.f1194a.mo345a(), 1);
                    bir.m826a((ipw) bir.f1195b.mo345a(), 2);
                    ipy = (ipy) bir.m826a(ipy, 3);
                    Executor executor = (Executor) bir.m826a(executorService, 4);
                    a3 = (inm) bir.m826a(a3, 5);
                    inp inp = (inp) bir.m826a(a2, 6);
                    ipv ipv2 = (ipv) bir.m826a(ipv, 7);
                    bir.m826a(ipv, 8);
                    Object bis = new bis(ipy, executor, a3, inp, ipv2, (gtf) bir.m826a(gtf, 9), (guf) bir.m826a(guf, 10), (kbg) bir.m826a(kbg, 11), (ilp) bir.m826a(b, 12), (ilp) bir.m826a(ilp2, 13), (kbg) bir.m826a(kbg2, 14), z, i, i2, (kbg) bir.m826a(kbg3, 18), (ird) bir.m826a(ird, 19));
                    kpk a4 = kny.m18046a(bis.mo2682a(), new bfm(this, inc, a2, iur, bis, ilp, ilp2, kbg2), kpq.f8410a);
                    m14788a(a4, ken.m13453a(bis));
                    return a4;
                } catch (Throwable e) {
                    return kow.m13618a(e);
                }
            }
            kpk a5 = kow.m13618a(new IllegalStateException("CamcorderManager has been closed."));
            return a5;
        }
    }

    /* renamed from: a */
    public final kpk mo2668a(inc inc, ipv ipv, ine ine, iur iur, kbg kbg, ilp ilp, ilp ilp2, kbg kbg2, boolean z, boolean z2, int i, kbg kbg3) {
        kpk a;
        bli.m863a(f19939a, "openCamcorder with mediacodec");
        synchronized (this.f19945g) {
            if (m14789c(iur)) {
                try {
                    ioa a2 = m14787a(inc, false, ine, iur);
                    inp a3 = m14786a(inc, a2, ine);
                    inm a4 = m14785a(inc, a2);
                    bkf bkf = this.f19958t;
                    ExecutorService executorService = this.f19940b;
                    Handler handler = this.f19947i;
                    guf guf = this.f19956r;
                    gtf gtf = this.f19941c;
                    bja bja = this.f19957s;
                    ird ird = this.f19943e;
                    ilp ilp3 = (ilp) bkf.m845a((ilp) bkf.f1236a.mo345a(), 1);
                    AudioManager audioManager = (AudioManager) bkf.m845a((AudioManager) bkf.f1237b.mo345a(), 2);
                    bkf.m845a((inj) bkf.f1238c.mo345a(), 3);
                    iou iou = new iou(ilp3, audioManager, (bkm) bkf.m845a((bkm) bkf.f1239d.mo345a(), 4), (inm) bkf.m845a(a4, 5), (inp) bkf.m845a(a3, 6), (Executor) bkf.m845a(executorService, 7), (Handler) bkf.m845a(handler, 8), (ing) bkf.m845a(ipv, 9), (ilp) bkf.m845a(ilp2, 10), (kbg) bkf.m845a(kbg2, 11), true, (guf) bkf.m845a(guf, 13), (gtf) bkf.m845a(gtf, 14), (bja) bkf.m845a(bja, 15), i, (kbg) bkf.m845a(kbg, 17), (kbg) bkf.m845a(kbg3, 18), (ird) bkf.m845a(ird, 19));
                    a = kny.m18046a(iou.m12341a(), new bfn(this, inc, a3, iur, iou, ilp, ilp2, kbg2), kpq.f8410a);
                    m14788a(a, ken.m13464e());
                } catch (Throwable e) {
                    a = kow.m13618a(e);
                }
            } else {
                a = kow.m13618a(new IllegalStateException("CamcorderManager has been closed."));
            }
        }
        return a;
    }

    /* renamed from: c */
    private final boolean m14789c(iur iur) {
        synchronized (this.f19945g) {
            if (this.f19946h.containsKey(iur)) {
                String str = f19939a;
                String valueOf = String.valueOf(iur);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 63);
                stringBuilder.append("immediateFailedFuture: The camera was already opened. cameraId=");
                stringBuilder.append(valueOf);
                bli.m866b(str, stringBuilder.toString());
                this.f19946h.remove(iur);
            }
            try {
                boolean booleanValue = ((Boolean) this.f19944f.get()).booleanValue();
                this.f19944f = kpw.m18056d();
                return booleanValue;
            } catch (ExecutionException e) {
                bli.m866b(f19939a, "Fail to wait for the state becoming ready");
                return false;
            } catch (InterruptedException e2) {
                bli.m866b(f19939a, "Fail to wait for the state becoming ready");
                return false;
            }
        }
    }
}
