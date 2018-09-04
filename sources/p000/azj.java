package p000;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import android.os.Looper;
import com.google.android.GoogleCamera.R;

@TargetApi(23)
/* compiled from: PG */
/* renamed from: azj */
public final class azj implements ays {
    /* renamed from: a */
    public final ayp f19836a;
    /* renamed from: b */
    public boolean f19837b;
    /* renamed from: c */
    public ayv f19838c;
    /* renamed from: d */
    private final azr f19839d;
    /* renamed from: e */
    private final ilp f19840e;
    /* renamed from: f */
    private final Handler f19841f;
    /* renamed from: g */
    private final Runnable f19842g;
    /* renamed from: h */
    private final irs f19843h;
    /* renamed from: i */
    private final ivw f19844i;
    /* renamed from: j */
    private final axs f19845j = new azm(this);
    /* renamed from: k */
    private final axp f19846k;
    /* renamed from: l */
    private int f19847l;
    /* renamed from: m */
    private ilp f19848m;
    /* renamed from: n */
    private int f19849n;
    /* renamed from: o */
    private long f19850o;
    /* renamed from: p */
    private ayx f19851p;

    static {
        bli.m862a("DirtyLensPlugin");
    }

    public azj(azh azh, ayp ayp, azr azr, azb azb, Resources resources, ilp ilp, irs irs, bsn bsn, ivw ivw, CameraManager cameraManager) {
        jri.m13152b((Object) azh);
        this.f19839d = (azr) jri.m13152b((Object) azr);
        this.f19836a = (ayp) jri.m13152b((Object) ayp);
        jri.m13152b((Object) azb);
        this.f19840e = ilp;
        this.f19843h = irs;
        this.f19844i = ivw;
        this.f19850o = 5000;
        this.f19841f = new Handler(Looper.getMainLooper());
        this.f19842g = new azk(this, ayp);
        this.f19847l = go.f5584v;
        this.f19848m = ayp.f1030a;
        this.f19849n = 0;
        ivw.mo414b().mo1879a(this.f19840e.mo2859a(new azn(cameraManager, ayp, azr), kpq.f8410a));
        axq axq = new axq();
        axq.f1020a = resources.getString(R.string.advice_dirty_lens);
        axq.f1021b = resources.getString(R.string.advice_dirty_lens_popup_text);
        axq.f1023d = 7000;
        axq.f1024e = 268435455;
        axq.f1022c = this.f19845j;
        jri.m13152b(axq.f1020a);
        jri.m13152b(axq.f1021b);
        jri.m13152b(axq.f1022c);
        String str = axq.f1020a;
        String str2 = axq.f1021b;
        this.f19846k = new axp(str, axq.f1022c, axq.f1023d, axq.f1024e);
    }

    /* renamed from: d */
    final void m14717d() {
        this.f19837b = false;
        this.f19841f.removeCallbacks(this.f19842g);
        ayp ayp = this.f19836a;
        ayp.f1031b.mo348a(Boolean.valueOf(false));
        ayp.f1030a.mo348a(Integer.valueOf(0));
    }

    /* renamed from: a */
    public final void mo2643a() {
        if (m14710f()) {
            m14717d();
            ayv ayv = this.f19838c;
            if (ayv != null) {
                ayv.mo388a();
            }
        }
    }

    /* renamed from: e */
    public final void m14718e() {
        this.f19841f.removeCallbacks(this.f19842g);
        this.f19841f.postDelayed(this.f19842g, this.f19850o);
    }

    /* renamed from: b */
    public final ayp mo2647b() {
        return this.f19836a;
    }

    /* renamed from: f */
    private final boolean m14710f() {
        boolean z = false;
        ayv ayv = this.f19838c;
        if (ayv != null) {
            if (ayv.mo389b() == go.f5579q) {
                z = true;
            } else if (this.f19838c.mo389b() == go.f5580r) {
                return true;
            }
        }
        return z;
    }

    /* renamed from: a */
    public final void mo2645a(iur iur) {
        azx azx;
        azr azr = this.f19839d;
        azr.f1039c = this.f19836a.m753a(iur);
        azv azv = azr.f1037a;
        azw azw = (azw) azr.f1039c.mo2860b();
        if (azw instanceof azx) {
            azx = (azx) azw;
        } else {
            azx azx2 = new azx();
            for (int i = 0; ((long) i) < azw.mo409a(); i++) {
                azx2.mo410a(azw.mo408a(i));
            }
            azx = azx2;
        }
        azv.f1040a.setRaw_score_history_(azx.f10587a);
        bsn bsn = azr.f1038b;
        this.f19847l = go.f5584v;
        this.f19849n = 0;
        this.f19848m.mo348a(Integer.valueOf(15));
        m14718e();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final boolean mo2646a(p000.gfw r20) {
        /*
        r19 = this;
        r0 = r19;
        r2 = r0.f19840e;
        r2 = r2.mo2860b();
        r2 = (java.lang.Boolean) r2;
        r2 = r2.booleanValue();
        if (r2 != 0) goto L_0x0019;
    L_0x0010:
        r0 = r20;
        r2 = r0.f5149b;
        r2.close();
        r2 = 0;
    L_0x0018:
        return r2;
    L_0x0019:
        r0 = r20;
        r0 = r0.f5149b;
        r16 = r0;
        r0 = r19;
        r2 = r0.f19849n;	 Catch:{ all -> 0x01c8 }
        r2 = r2 + 1;
        r0 = r19;
        r0.f19849n = r2;	 Catch:{ all -> 0x01c8 }
        r2 = r16.mo2716c();	 Catch:{ all -> 0x01c8 }
        r3 = 35;
        if (r2 != r3) goto L_0x020e;
    L_0x0031:
        r17 = r16.mo2720g();	 Catch:{ all -> 0x01c8 }
        r18 = r16.mo2717d();	 Catch:{ all -> 0x01c8 }
        r0 = r17;
        r2 = r0 / 640;
        r0 = r18;
        r3 = r0 / 480;
        r15 = java.lang.Math.min(r2, r3);	 Catch:{ all -> 0x01c8 }
        if (r15 <= 0) goto L_0x0057;
    L_0x0047:
        r2 = 1;
        if (r15 <= r2) goto L_0x0058;
    L_0x004a:
        r0 = r17;
        r1 = r18;
        r2 = p000.azb.m759a(r0, r1, r15);	 Catch:{ all -> 0x01c8 }
        if (r2 != 0) goto L_0x0058;
    L_0x0054:
        r15 = r15 + -1;
        goto L_0x0047;
    L_0x0057:
        r15 = -1;
    L_0x0058:
        if (r15 > 0) goto L_0x0062;
    L_0x005a:
        r2 = r17 * r18;
        r3 = 307200; // 0x4b000 float:4.30479E-40 double:1.51777E-318;
        if (r2 < r3) goto L_0x0062;
    L_0x0061:
        r15 = 1;
    L_0x0062:
        if (r15 > 0) goto L_0x006b;
    L_0x0064:
        if (r16 == 0) goto L_0x0069;
    L_0x0066:
        r16.close();
    L_0x0069:
        r2 = 0;
        goto L_0x0018;
    L_0x006b:
        p000.jri.m13152b(r16);	 Catch:{ all -> 0x01c8 }
        r2 = r16.mo2716c();	 Catch:{ all -> 0x01c8 }
        r3 = 35;
        if (r2 != r3) goto L_0x020b;
    L_0x0076:
        r2 = r16.mo2720g();	 Catch:{ all -> 0x01c8 }
        r3 = r16.mo2717d();	 Catch:{ all -> 0x01c8 }
        if (r15 <= 0) goto L_0x0208;
    L_0x0080:
        r4 = p000.azb.m759a(r2, r3, r15);	 Catch:{ all -> 0x01c8 }
        if (r4 == 0) goto L_0x0205;
    L_0x0086:
        r4 = r2 / r15;
        r5 = 640; // 0x280 float:8.97E-43 double:3.16E-321;
        if (r4 < r5) goto L_0x0202;
    L_0x008c:
        r4 = r3 / r15;
        r5 = 480; // 0x1e0 float:6.73E-43 double:2.37E-321;
        if (r4 < r5) goto L_0x01ff;
    L_0x0092:
        r4 = 1;
    L_0x0093:
        if (r4 == 0) goto L_0x01fc;
    L_0x0095:
        r5 = r16.mo2718e();	 Catch:{ all -> 0x01c8 }
        r4 = 0;
        r4 = r5.get(r4);	 Catch:{ all -> 0x01c8 }
        r0 = r4;
        r0 = (p000.ixa) r0;	 Catch:{ all -> 0x01c8 }
        r6 = r0;
        r4 = 1;
        r4 = r5.get(r4);	 Catch:{ all -> 0x01c8 }
        r0 = r4;
        r0 = (p000.ixa) r0;	 Catch:{ all -> 0x01c8 }
        r9 = r0;
        r4 = 2;
        r4 = r5.get(r4);	 Catch:{ all -> 0x01c8 }
        r0 = r4;
        r0 = (p000.ixa) r0;	 Catch:{ all -> 0x01c8 }
        r12 = r0;
        r4 = r2 * r3;
        r5 = r15 * r15;
        r4 = r4 / r5;
        r13 = java.nio.ByteBuffer.allocateDirect(r4);	 Catch:{ all -> 0x01c8 }
        r4 = r4 / 2;
        r14 = java.nio.ByteBuffer.allocateDirect(r4);	 Catch:{ all -> 0x01c8 }
        r4 = r6.mo637a();	 Catch:{ all -> 0x01c8 }
        r5 = r6.mo638b();	 Catch:{ all -> 0x01c8 }
        r6 = r6.mo639c();	 Catch:{ all -> 0x01c8 }
        r7 = r9.mo637a();	 Catch:{ all -> 0x01c8 }
        r8 = r9.mo638b();	 Catch:{ all -> 0x01c8 }
        r9 = r9.mo639c();	 Catch:{ all -> 0x01c8 }
        r10 = r12.mo637a();	 Catch:{ all -> 0x01c8 }
        r11 = r12.mo638b();	 Catch:{ all -> 0x01c8 }
        r12 = r12.mo639c();	 Catch:{ all -> 0x01c8 }
        r2 = com.google.android.libraries.camera.jni.yuv.YuvUtilNative.downsampleYUV_420_888toNV21Native(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15);	 Catch:{ all -> 0x01c8 }
        if (r2 == 0) goto L_0x01f9;
    L_0x00ed:
        r2 = 2;
        r2 = new java.nio.ByteBuffer[r2];	 Catch:{ all -> 0x01c8 }
        r3 = 0;
        r2[r3] = r13;	 Catch:{ all -> 0x01c8 }
        r3 = 1;
        r2[r3] = r14;	 Catch:{ all -> 0x01c8 }
    L_0x00f6:
        if (r2 != 0) goto L_0x0100;
    L_0x00f8:
        if (r16 == 0) goto L_0x00fd;
    L_0x00fa:
        r16.close();
    L_0x00fd:
        r2 = 0;
        goto L_0x0018;
    L_0x0100:
        r3 = r17 / r15;
        r4 = r18 / r15;
        p000.jri.m13152b(r2);	 Catch:{ all -> 0x01c8 }
        r5 = 0;
        r5 = r2[r5];	 Catch:{ all -> 0x01c8 }
        p000.jri.m13152b(r5);	 Catch:{ all -> 0x01c8 }
        r5 = 1;
        r5 = r2[r5];	 Catch:{ all -> 0x01c8 }
        p000.jri.m13152b(r5);	 Catch:{ all -> 0x01c8 }
        r5 = 0;
        r5 = r2[r5];	 Catch:{ all -> 0x01c8 }
        r6 = 1;
        r2 = r2[r6];	 Catch:{ all -> 0x01c8 }
        p000.jri.m13152b(r5);	 Catch:{ all -> 0x01c8 }
        p000.jri.m13152b(r2);	 Catch:{ all -> 0x01c8 }
        r6 = com.google.googlex.gcam.BufferUtils.getDirectBufferAddress(r5);	 Catch:{ all -> 0x01c8 }
        r8 = com.google.googlex.gcam.BufferUtils.getDirectBufferAddress(r2);	 Catch:{ all -> 0x01c8 }
        r6 = com.google.googlex.gcam.BufferUtils.wrapNativePointerWithSwigUnsignedChar(r6);	 Catch:{ all -> 0x01c8 }
        r10 = com.google.googlex.gcam.BufferUtils.wrapNativePointerWithSwigUnsignedChar(r8);	 Catch:{ all -> 0x01c8 }
        r2 = new com.google.googlex.gcam.YuvReadView;	 Catch:{ all -> 0x01c8 }
        r7 = r3 / 2;
        r8 = r4 / 2;
        r11 = 2;
        r5 = r3;
        r9 = r3;
        r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11);	 Catch:{ all -> 0x01c8 }
        p000.jri.m13152b(r2);	 Catch:{ all -> 0x01c8 }
        r3 = 1;
        r3 = new float[r3];	 Catch:{ all -> 0x01c8 }
        r4 = 0;
        r5 = 0;
        r3[r4] = r5;	 Catch:{ all -> 0x01c8 }
        r2 = com.google.googlex.gcam.GcamModule.GetDirtyLensRawScore(r2, r3);	 Catch:{ all -> 0x01c8 }
        if (r2 == 0) goto L_0x01f5;
    L_0x014b:
        r2 = 0;
        r2 = r3[r2];	 Catch:{ all -> 0x01c8 }
    L_0x014e:
        r0 = r19;
        r3 = r0.f19839d;	 Catch:{ all -> 0x01c8 }
        r4 = r3.f1039c;	 Catch:{ all -> 0x01c8 }
        if (r4 != 0) goto L_0x01e0;
    L_0x0156:
        r2 = 0;
    L_0x0157:
        if (r2 == 0) goto L_0x01db;
    L_0x0159:
        r2 = p000.go.f5583u;	 Catch:{ all -> 0x01c8 }
        r3 = r2;
    L_0x015c:
        r0 = r19;
        r2 = r0.f19837b;	 Catch:{ all -> 0x01c8 }
        if (r2 == 0) goto L_0x01d9;
    L_0x0162:
        r0 = r19;
        r2 = r0.f19847l;	 Catch:{ all -> 0x01c8 }
        if (r3 == r2) goto L_0x01d7;
    L_0x0168:
        r2 = r3 + -1;
        switch(r2) {
            case 0: goto L_0x0182;
            default: goto L_0x016d;
        };	 Catch:{ all -> 0x01c8 }
    L_0x016d:
        r2 = 0;
    L_0x016e:
        r0 = r19;
        r0.f19847l = r3;	 Catch:{ all -> 0x01c8 }
    L_0x0172:
        r0 = r19;
        r3 = r0.f19849n;	 Catch:{ all -> 0x01c8 }
        if (r3 <= 0) goto L_0x017b;
    L_0x0178:
        r19.m14717d();	 Catch:{ all -> 0x01c8 }
    L_0x017b:
        if (r16 == 0) goto L_0x0018;
    L_0x017d:
        r16.close();
        goto L_0x0018;
    L_0x0182:
        r0 = r19;
        r2 = r0.f19840e;	 Catch:{ all -> 0x01c8 }
        r2 = r2.mo2860b();	 Catch:{ all -> 0x01c8 }
        r2 = (java.lang.Boolean) r2;	 Catch:{ all -> 0x01c8 }
        r2 = r2.booleanValue();	 Catch:{ all -> 0x01c8 }
        if (r2 == 0) goto L_0x01d5;
    L_0x0192:
        r2 = r19.m14710f();	 Catch:{ all -> 0x01c8 }
        if (r2 != 0) goto L_0x01d3;
    L_0x0198:
        r0 = r19;
        r2 = r0.f19851p;	 Catch:{ all -> 0x01c8 }
        if (r2 == 0) goto L_0x01d1;
    L_0x019e:
        r0 = r19;
        r4 = r0.f19846k;	 Catch:{ all -> 0x01c8 }
        r2 = r2.mo403a(r4);	 Catch:{ all -> 0x01c8 }
        r0 = r19;
        r0.f19838c = r2;	 Catch:{ all -> 0x01c8 }
        r0 = r19;
        r2 = r0.f19843h;	 Catch:{ all -> 0x01c8 }
        r2.mo1605f();	 Catch:{ all -> 0x01c8 }
        r0 = r19;
        r2 = r0.f19844i;	 Catch:{ all -> 0x01c8 }
        r2 = r2.mo416c();	 Catch:{ all -> 0x01c8 }
        r4 = new azl;	 Catch:{ all -> 0x01c8 }
        r0 = r19;
        r4.<init>(r0);	 Catch:{ all -> 0x01c8 }
        r2.mo1879a(r4);	 Catch:{ all -> 0x01c8 }
        r2 = 1;
    L_0x01c4:
        r19.m14717d();	 Catch:{ all -> 0x01c8 }
        goto L_0x016e;
    L_0x01c8:
        r2 = move-exception;
        throw r2;	 Catch:{ all -> 0x01ca }
    L_0x01ca:
        r3 = move-exception;
        if (r16 == 0) goto L_0x01d0;
    L_0x01cd:
        r16.close();	 Catch:{ all -> 0x0216 }
    L_0x01d0:
        throw r3;
    L_0x01d1:
        r2 = 0;
        goto L_0x01c4;
    L_0x01d3:
        r2 = 0;
        goto L_0x01c4;
    L_0x01d5:
        r2 = 0;
        goto L_0x01c4;
    L_0x01d7:
        r2 = 0;
        goto L_0x0172;
    L_0x01d9:
        r2 = 0;
        goto L_0x0172;
    L_0x01db:
        r2 = p000.go.f5584v;	 Catch:{ all -> 0x01c8 }
        r3 = r2;
        goto L_0x015c;
    L_0x01e0:
        r5 = r3.f1037a;	 Catch:{ all -> 0x01c8 }
        r5 = r5.f1040a;	 Catch:{ all -> 0x01c8 }
        r2 = r5.AddRawScore(r2);	 Catch:{ all -> 0x01c8 }
        r5 = r3.f1037a;	 Catch:{ all -> 0x01c8 }
        r5 = r5.m760a();	 Catch:{ all -> 0x01c8 }
        r4.mo348a(r5);	 Catch:{ all -> 0x01c8 }
        r3 = r3.f1038b;	 Catch:{ all -> 0x01c8 }
        goto L_0x0157;
    L_0x01f5:
        r2 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        goto L_0x014e;
    L_0x01f9:
        r2 = 0;
        goto L_0x00f6;
    L_0x01fc:
        r2 = 0;
        goto L_0x00f6;
    L_0x01ff:
        r4 = 0;
        goto L_0x0093;
    L_0x0202:
        r4 = 0;
        goto L_0x0093;
    L_0x0205:
        r2 = 0;
        goto L_0x00f6;
    L_0x0208:
        r2 = 0;
        goto L_0x00f6;
    L_0x020b:
        r2 = 0;
        goto L_0x00f6;
    L_0x020e:
        if (r16 == 0) goto L_0x0213;
    L_0x0210:
        r16.close();
    L_0x0213:
        r2 = 0;
        goto L_0x0018;
    L_0x0216:
        r4 = move-exception;
        p000.kqg.m5044a(r2, r4);
        goto L_0x01d0;
        */
        throw new UnsupportedOperationException("Method not decompiled: azj.a(gfw):boolean");
    }

    /* renamed from: a */
    public final void mo2644a(ayx ayx) {
        this.f19851p = ayx;
    }

    /* renamed from: c */
    public final void mo2648c() {
    }
}
