package p000;

/* compiled from: PG */
/* renamed from: ccy */
public final class ccy implements kwk {
    /* renamed from: a */
    public final bzo f11679a;
    /* renamed from: b */
    public final kbg f11680b;
    /* renamed from: c */
    public final kbg f11681c;
    /* renamed from: d */
    public final kbg f11682d;
    /* renamed from: e */
    public final kbg f11683e;
    /* renamed from: f */
    public final etj f11684f;
    /* renamed from: g */
    public fyy f11685g;
    /* renamed from: h */
    public final iqz f11686h;
    /* renamed from: i */
    public final kbg f11687i;
    /* renamed from: j */
    private final kbg f11688j;

    public ccy(bzo bzo, kwa kwa, kbg kbg, kbg kbg2, kbg kbg3, kbg kbg4, kbg kbg5, etj etj, fyy fyy, iqz iqz) {
        this.f11679a = bzo;
        this.f11688j = (kbg) kwa.mo345a();
        this.f11680b = kbg;
        this.f11681c = kbg2;
        this.f11682d = kbg3;
        this.f11683e = kbg4;
        this.f11687i = kbg5;
        this.f11684f = etj;
        this.f11685g = fyy;
        this.f11686h = iqz;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public static /* synthetic */ void m8024a(p000.ccy r15, p000.fwa r16, p000.kbn r17, p000.kpw r18, p000.iwz r19, com.google.googlex.gcam.ExifMetadata r20, boolean r21, int r22) {
        /*
        r1 = r18.isDone();
        r2 = "Base frame metadata not available in YUV callback";
        p000.jri.m13154b(r1, r2);
        r1 = p000.kow.m13625c(r18);
        r4 = r1;
        r4 = (p000.iwp) r4;
        r1 = r19.mo2720g();
        r2 = r19.mo2717d();
        r0 = r20;
        r6 = p000.bxe.m1032a(r1, r2, r0);
        r10 = new iuz;
        r1 = 1;
        r0 = r19;
        r10.<init>(r0, r1);
        r11 = r15.f11679a;	 Catch:{ all -> 0x00a4 }
        r0 = r16;
        r1 = r0.f4752a;	 Catch:{ all -> 0x00a4 }
        r8 = r1.f4451g;	 Catch:{ all -> 0x00a4 }
        r1 = r15.f11681c;	 Catch:{ all -> 0x00a4 }
        r2 = r10.m17593h();	 Catch:{ all -> 0x00a4 }
        r2 = p000.jri.m13152b(r2);	 Catch:{ all -> 0x00a4 }
        r2 = (p000.iwz) r2;	 Catch:{ all -> 0x00a4 }
        r3 = r1.mo2084b();	 Catch:{ all -> 0x00a4 }
        if (r3 != 0) goto L_0x0061;
    L_0x0040:
        r2.close();	 Catch:{ all -> 0x00a4 }
    L_0x0043:
        r1 = r15.f11680b;	 Catch:{ all -> 0x00a4 }
        r1 = r1.mo2084b();	 Catch:{ all -> 0x00a4 }
        if (r1 == 0) goto L_0x005d;
    L_0x004b:
        r1 = r15.f11680b;	 Catch:{ all -> 0x00a4 }
        r1 = r1.mo2081a();	 Catch:{ all -> 0x00a4 }
        r1 = (p000.faj) r1;	 Catch:{ all -> 0x00a4 }
        r2 = r10.m17593h();	 Catch:{ all -> 0x00a4 }
        p000.jri.m13152b(r2);	 Catch:{ all -> 0x00a4 }
        r1.m2214a();	 Catch:{ all -> 0x00a4 }
    L_0x005d:
        r10.close();
        return;
    L_0x0061:
        r1 = r1.mo2081a();	 Catch:{ all -> 0x00a4 }
        r0 = r1;
        r0 = (p000.fph) r0;	 Catch:{ all -> 0x00a4 }
        r9 = r0;
        r1 = new gfw;	 Catch:{ all -> 0x00a4 }
        r3 = p000.iqm.m4037a(r22);	 Catch:{ all -> 0x00a4 }
        r4 = p000.kow.m13617a(r4);	 Catch:{ all -> 0x00a4 }
        r5 = new android.graphics.Rect;	 Catch:{ all -> 0x00a4 }
        r7 = r2.mo2720g();	 Catch:{ all -> 0x00a4 }
        r12 = r2.mo2717d();	 Catch:{ all -> 0x00a4 }
        r13 = 0;
        r14 = 0;
        r5.<init>(r13, r14, r7, r12);	 Catch:{ all -> 0x00a4 }
        r0 = r16;
        r7 = r0.f4753b;	 Catch:{ all -> 0x00a4 }
        r7 = r7.mo1482h();	 Catch:{ all -> 0x00a4 }
        r1.<init>(r2, r3, r4, r5, r6, r7);	 Catch:{ all -> 0x00a4 }
        r0 = r21;
        r1 = r9.m2359a(r1, r0);	 Catch:{ all -> 0x00a4 }
        r3 = new bzp;	 Catch:{ all -> 0x00a4 }
        r4 = r11;
        r5 = r2;
        r7 = r16;
        r9 = r17;
        r3.<init>(r4, r5, r6, r7, r8, r9);	 Catch:{ all -> 0x00a4 }
        r2 = p000.kpq.f8410a;	 Catch:{ all -> 0x00a4 }
        p000.kow.m13622a(r1, r3, r2);	 Catch:{ all -> 0x00a4 }
        goto L_0x0043;
    L_0x00a4:
        r1 = move-exception;
        throw r1;	 Catch:{ all -> 0x00a6 }
    L_0x00a6:
        r2 = move-exception;
        r10.close();	 Catch:{ all -> 0x00ab }
    L_0x00aa:
        throw r2;
    L_0x00ab:
        r3 = move-exception;
        p000.kqg.m5044a(r1, r3);
        goto L_0x00aa;
        */
        throw new UnsupportedOperationException("Method not decompiled: ccy.a(ccy, fwa, kbn, kpw, iwz, com.google.googlex.gcam.ExifMetadata, boolean, int):void");
    }

    /* renamed from: a */
    public final bzx m8025a(fwa fwa, bzs bzs, bxc bxc, int i) {
        kbg b;
        caa caa = new caa((byte) 0);
        kpw d = kpw.m18056d();
        kpw d2 = kpw.m18056d();
        kpw d3 = kpw.m18056d();
        if (this.f11688j.mo2084b()) {
            b = ((eyg) this.f11688j.mo2081a()).m2192b(fwa.f4753b.mo2884l());
        } else {
            b = kau.f19138a;
        }
        if (b.mo2084b()) {
            eyh eyh = (eyh) b.mo2081a();
            synchronized (eyh.f4355g) {
                eyh.f4351c = true;
            }
        }
        bxa bxa = new bxa(this, fwa, bxc.f1681b);
        caa.f1773a = kbg.m4745c(new caf(this, fwa));
        caa.f1774b = kbg.m4745c(new bzy(this, b, fwa, i, d, d2, d3));
        if (bxc.f1683d.contains(bxh.POSTVIEW)) {
            caa.f1776d = kbg.m4745c(new bzz(b, i, fwa));
        }
        if (bxc.f1683d.contains(bxh.JPEG)) {
            caa.f1781i = kbg.m4745c(new cad(this, fwa, bxa));
        }
        kpw d4 = kpw.m18056d();
        caa.f1775c = kbg.m4745c(new cab(d4));
        if (bxc.f1683d.contains(bxh.YUV)) {
            caa.f1779g = kbg.m4745c(new cai(this, d4, d3, d2, fwa, bxa, bxc, i));
        }
        knk d5 = kpw.m18056d();
        if (bxc.f1683d.contains(bxh.MERGED_PD)) {
            caa.f1778f = kbg.m4745c(new cae(d5));
        } else {
            d5.cancel(false);
        }
        if (bxc.f1683d.contains(bxh.RGB)) {
            caa.f1780h = kbg.m4745c(new cah(this, d3, d, d2, d4, bxc, fwa, bxa, i, bzs, d5));
        }
        if (bxc.f1683d.contains(bxh.MERGED_DNG)) {
            caa.f1777e = kbg.m4745c(new cag(this, fwa, bxa, i));
        }
        caa.f1782j = kbg.m4745c(new cac(this, fwa));
        return new bwz(caa.f1773a, caa.f1774b, caa.f1775c, caa.f1776d, caa.f1777e, caa.f1778f, caa.f1779g, caa.f1780h, caa.f1781i, caa.f1782j);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        throw new NoSuchMethodError();
    }
}
