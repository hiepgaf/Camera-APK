package p000;

/* compiled from: PG */
/* renamed from: flk */
final class flk implements fjw {
    /* renamed from: a */
    private final int f16138a;
    /* renamed from: b */
    private final /* synthetic */ fli f16139b;

    /* renamed from: a */
    private static /* synthetic */ void m10487a(Throwable th, iqo iqo) {
        if (th != null) {
            try {
                iqo.close();
                return;
            } catch (Throwable th2) {
                kqg.m5044a(th, th2);
                return;
            }
        }
        iqo.close();
    }

    flk(fli fli, int i) {
        this.f16139b = fli;
        this.f16138a = i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    private final p000.kpk m10488b(p000.fkp r12) {
        /*
        r11 = this;
        r2 = 1;
        r3 = 0;
        r4 = 0;
        r0 = p000.fkr.f4602b;
        r0 = r12.m17317a(r0);
        r0 = (p000.fhq) r0;
        r1 = r11.f16139b;
        r1 = r1.f16129a;
        r7 = r1.mo1429a();
        r1 = r11.f16139b;	 Catch:{ all -> 0x00bd }
        r1 = r1.f16133e;	 Catch:{ all -> 0x00bd }
        r8 = r1.m16090a();	 Catch:{ all -> 0x00bd }
        r1 = r11.f16139b;	 Catch:{ all -> 0x00b6 }
        r9 = r1.f16134f;	 Catch:{ all -> 0x00b6 }
        monitor-enter(r9);	 Catch:{ all -> 0x00b6 }
        r1 = r11.f16139b;	 Catch:{ all -> 0x0112 }
        r1 = r1.f16136h;	 Catch:{ all -> 0x0112 }
        r1 = r1.containsKey(r0);	 Catch:{ all -> 0x0112 }
        if (r1 != 0) goto L_0x00fc;
    L_0x002a:
        r1 = r11.f16139b;	 Catch:{ all -> 0x0112 }
        r1 = r1.m10484a(r0);	 Catch:{ all -> 0x0112 }
        if (r1 != 0) goto L_0x00f2;
    L_0x0032:
        r1 = new flj;	 Catch:{ all -> 0x0112 }
        r5 = r11.f16139b;	 Catch:{ all -> 0x0112 }
        r5 = r5.f16131c;	 Catch:{ all -> 0x0112 }
        r1.<init>(r5, r0);	 Catch:{ all -> 0x0112 }
        r5 = r11.f16138a;	 Catch:{ all -> 0x0112 }
        r1.m2334a(r5, r12);	 Catch:{ all -> 0x0112 }
        r5 = r11.f16139b;	 Catch:{ all -> 0x0112 }
        r5 = r5.f16136h;	 Catch:{ all -> 0x0112 }
        r5.put(r0, r1);	 Catch:{ all -> 0x0112 }
        r5 = r11.f16139b;	 Catch:{ all -> 0x0112 }
        r5 = r5.f16136h;	 Catch:{ all -> 0x0112 }
        r5 = r5.size();	 Catch:{ all -> 0x0112 }
        r6 = r11.f16139b;	 Catch:{ all -> 0x0112 }
        r6 = r6.f16132d;	 Catch:{ all -> 0x0112 }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ all -> 0x0112 }
        r6.f21744b = r5;	 Catch:{ all -> 0x0112 }
        r1 = r1.f4614e;	 Catch:{ all -> 0x0112 }
        r12 = r4;
        r5 = r2;
        r6 = r1;
    L_0x005e:
        r1 = r11.f16139b;	 Catch:{ all -> 0x0112 }
        r1 = r1.f16135g;	 Catch:{ all -> 0x0112 }
        r10 = r11.f16138a;	 Catch:{ all -> 0x0112 }
        r1 = r1.get(r10);	 Catch:{ all -> 0x0112 }
        r1 = (p000.fll) r1;	 Catch:{ all -> 0x0112 }
        r1 = r1.f4615a;	 Catch:{ all -> 0x0112 }
        r1.add(r0);	 Catch:{ all -> 0x0112 }
        monitor-exit(r9);	 Catch:{ all -> 0x0112 }
        r1 = r11.f16139b;	 Catch:{ all -> 0x00b6 }
        r1 = r1.f16132d;	 Catch:{ all -> 0x00b6 }
        r1 = r1.f21743a;	 Catch:{ all -> 0x00b6 }
        r1.m16083a();	 Catch:{ all -> 0x00b6 }
        if (r12 == 0) goto L_0x007e;
    L_0x007b:
        r12.close();	 Catch:{ all -> 0x00b6 }
    L_0x007e:
        if (r5 != 0) goto L_0x008a;
    L_0x0080:
        r0 = 0;
        p000.flk.m10487a(r0, r8);	 Catch:{ all -> 0x00bd }
        if (r7 == 0) goto L_0x0089;
    L_0x0086:
        p000.flk.m10487a(r4, r7);
    L_0x0089:
        return r6;
    L_0x008a:
        r1 = r11.f16139b;	 Catch:{ all -> 0x00b6 }
        r1 = r1.f16129a;	 Catch:{ all -> 0x00b6 }
        r5 = r1.mo1431d();	 Catch:{ all -> 0x00b6 }
        r1 = r11.f16139b;	 Catch:{ all -> 0x00b6 }
        r9 = r1.f16134f;	 Catch:{ all -> 0x00b6 }
        monitor-enter(r9);	 Catch:{ all -> 0x00b6 }
        if (r5 == 0) goto L_0x00dd;
    L_0x0099:
        r1 = r11.f16139b;	 Catch:{ all -> 0x0115 }
        r1 = r1.f16136h;	 Catch:{ all -> 0x0115 }
        r0 = r1.get(r0);	 Catch:{ all -> 0x0115 }
        r0 = (p000.flj) r0;	 Catch:{ all -> 0x0115 }
        if (r0 != 0) goto L_0x00ce;
    L_0x00a5:
        r0 = r4;
        r1 = r5;
        r2 = r4;
    L_0x00a8:
        monitor-exit(r9);	 Catch:{ all -> 0x0115 }
        if (r0 != 0) goto L_0x00c6;
    L_0x00ab:
        if (r2 == 0) goto L_0x00b0;
    L_0x00ad:
        r2.m2333a();	 Catch:{ all -> 0x00b6 }
    L_0x00b0:
        if (r1 == 0) goto L_0x0080;
    L_0x00b2:
        r1.close();	 Catch:{ all -> 0x00b6 }
        goto L_0x0080;
    L_0x00b6:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00b8 }
    L_0x00b8:
        r1 = move-exception;
        p000.flk.m10487a(r0, r8);	 Catch:{ all -> 0x00bd }
        throw r1;	 Catch:{ all -> 0x00bd }
    L_0x00bd:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00bf }
    L_0x00bf:
        r1 = move-exception;
        if (r7 == 0) goto L_0x00c5;
    L_0x00c2:
        p000.flk.m10487a(r0, r7);
    L_0x00c5:
        throw r1;
    L_0x00c6:
        r0 = r0.f4614e;	 Catch:{ all -> 0x00b6 }
        r3 = java.lang.Boolean.TRUE;	 Catch:{ all -> 0x00b6 }
        r0.mo3557a(r3);	 Catch:{ all -> 0x00b6 }
        goto L_0x00ab;
    L_0x00ce:
        r1 = r0.f4613d;	 Catch:{ all -> 0x0115 }
        if (r1 != 0) goto L_0x00db;
    L_0x00d2:
        r1 = r2;
    L_0x00d3:
        p000.jri.m13153b(r1);	 Catch:{ all -> 0x0115 }
        r0.f4613d = r5;	 Catch:{ all -> 0x0115 }
        r1 = r4;
        r2 = r4;
        goto L_0x00a8;
    L_0x00db:
        r1 = r3;
        goto L_0x00d3;
    L_0x00dd:
        r1 = r11.f16139b;	 Catch:{ all -> 0x0115 }
        r1 = r1.f16136h;	 Catch:{ all -> 0x0115 }
        r1 = r1.get(r0);	 Catch:{ all -> 0x0115 }
        r1 = (p000.flj) r1;	 Catch:{ all -> 0x0115 }
        r2 = r11.f16139b;	 Catch:{ all -> 0x0115 }
        r2 = r2.f16136h;	 Catch:{ all -> 0x0115 }
        r2.remove(r0);	 Catch:{ all -> 0x0115 }
        r0 = r4;
        r2 = r1;
        r1 = r5;
        goto L_0x00a8;
    L_0x00f2:
        r1 = java.lang.Boolean.FALSE;	 Catch:{ all -> 0x0112 }
        r1 = p000.kow.m13617a(r1);	 Catch:{ all -> 0x0112 }
        r5 = r3;
        r6 = r1;
        goto L_0x005e;
    L_0x00fc:
        r1 = r11.f16139b;	 Catch:{ all -> 0x0112 }
        r1 = r1.f16136h;	 Catch:{ all -> 0x0112 }
        r1 = r1.get(r0);	 Catch:{ all -> 0x0112 }
        r1 = (p000.flj) r1;	 Catch:{ all -> 0x0112 }
        r5 = r11.f16138a;	 Catch:{ all -> 0x0112 }
        r1.m2334a(r5, r12);	 Catch:{ all -> 0x0112 }
        r1 = r1.f4614e;	 Catch:{ all -> 0x0112 }
        r12 = r4;
        r5 = r3;
        r6 = r1;
        goto L_0x005e;
    L_0x0112:
        r0 = move-exception;
        monitor-exit(r9);	 Catch:{ all -> 0x0112 }
        throw r0;	 Catch:{ all -> 0x00b6 }
    L_0x0115:
        r0 = move-exception;
        monitor-exit(r9);	 Catch:{ all -> 0x0115 }
        throw r0;	 Catch:{ all -> 0x00b6 }
        */
        throw new UnsupportedOperationException("Method not decompiled: flk.b(fkp):kpk");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final p000.kpk mo1394a(p000.fkp r13) {
        /*
        r12 = this;
        r0 = r12.f16139b;
        r1 = r0.f16134f;
        monitor-enter(r1);
        r0 = r12.f16139b;	 Catch:{ all -> 0x0179 }
        r0 = r0.f16137i;	 Catch:{ all -> 0x0179 }
        if (r0 == 0) goto L_0x0016;
    L_0x000b:
        r13.close();	 Catch:{ all -> 0x0179 }
        r0 = java.lang.Boolean.FALSE;	 Catch:{ all -> 0x0179 }
        r0 = p000.kow.m13617a(r0);	 Catch:{ all -> 0x0179 }
        monitor-exit(r1);	 Catch:{ all -> 0x0179 }
    L_0x0015:
        return r0;
    L_0x0016:
        monitor-exit(r1);	 Catch:{ all -> 0x0179 }
        r2 = r12.m10488b(r13);
        r0 = p000.fkr.f4602b;
        r0 = r13.m17317a(r0);
        r0 = (p000.fhq) r0;
        r1 = r12.f16139b;
        r5 = r1.f16134f;
        monitor-enter(r5);
        r1 = r12.f16139b;	 Catch:{ all -> 0x013d }
        r1 = r1.f16136h;	 Catch:{ all -> 0x013d }
        r1 = r1.containsKey(r0);	 Catch:{ all -> 0x013d }
        if (r1 != 0) goto L_0x00c3;
    L_0x0032:
        r0 = 0;
    L_0x0033:
        monitor-exit(r5);	 Catch:{ all -> 0x013d }
        if (r0 == 0) goto L_0x0067;
    L_0x0036:
        r1 = r12.f16139b;
        r1 = r1.f16129a;
        r1 = r1.mo1429a();
        r3 = r12.f16139b;	 Catch:{ all -> 0x017c }
        r3 = r3.f16133e;	 Catch:{ all -> 0x017c }
        r3 = r3.m16090a();	 Catch:{ all -> 0x017c }
        r4 = r12.f16139b;	 Catch:{ all -> 0x0185 }
        r5 = r4.f16132d;	 Catch:{ all -> 0x0185 }
        r4 = r4.f16136h;	 Catch:{ all -> 0x0185 }
        r4 = r4.size();	 Catch:{ all -> 0x0185 }
        r4 = java.lang.Integer.valueOf(r4);	 Catch:{ all -> 0x0185 }
        r5.f21744b = r4;	 Catch:{ all -> 0x0185 }
        r4 = r12.f16139b;	 Catch:{ all -> 0x0185 }
        r4 = r4.f16130b;	 Catch:{ all -> 0x0185 }
        r4.mo348a(r0);	 Catch:{ all -> 0x0185 }
        r0 = 0;
        p000.flk.m10487a(r0, r3);	 Catch:{ all -> 0x017c }
        if (r1 == 0) goto L_0x0067;
    L_0x0063:
        r0 = 0;
        p000.flk.m10487a(r0, r1);
    L_0x0067:
        r0 = r12.f16139b;
        r0 = r0.f16132d;
        r0 = r0.f21743a;
        r0.m16083a();
        r1 = r12.f16139b;
        r4 = r1.f16134f;
        monitor-enter(r4);
        r0 = r1.f16135g;	 Catch:{ all -> 0x018c }
        r5 = r0.iterator();	 Catch:{ all -> 0x018c }
        r0 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r3 = r0;
    L_0x007f:
        r0 = r5.hasNext();	 Catch:{ all -> 0x018c }
        if (r0 == 0) goto L_0x0097;
    L_0x0085:
        r0 = r5.next();	 Catch:{ all -> 0x018c }
        r0 = (p000.fll) r0;	 Catch:{ all -> 0x018c }
        r0 = r0.f4615a;	 Catch:{ all -> 0x018c }
        r0 = r0.size();	 Catch:{ all -> 0x018c }
        r0 = java.lang.Math.min(r3, r0);	 Catch:{ all -> 0x018c }
        r3 = r0;
        goto L_0x007f;
    L_0x0097:
        r0 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        if (r3 == r0) goto L_0x00c1;
    L_0x009c:
        r0 = 1;
    L_0x009d:
        p000.jri.m13153b(r0);	 Catch:{ all -> 0x018c }
        r0 = r1.f16135g;	 Catch:{ all -> 0x018c }
        r5 = r0.iterator();	 Catch:{ all -> 0x018c }
    L_0x00a6:
        r0 = r5.hasNext();	 Catch:{ all -> 0x018c }
        if (r0 == 0) goto L_0x00bd;
    L_0x00ac:
        r0 = r5.next();	 Catch:{ all -> 0x018c }
        r0 = (p000.fll) r0;	 Catch:{ all -> 0x018c }
        r1 = 0;
    L_0x00b3:
        if (r1 >= r3) goto L_0x00a6;
    L_0x00b5:
        r6 = r0.f4615a;	 Catch:{ all -> 0x018c }
        r6.pollFirst();	 Catch:{ all -> 0x018c }
        r1 = r1 + 1;
        goto L_0x00b3;
    L_0x00bd:
        monitor-exit(r4);	 Catch:{ all -> 0x018c }
        r0 = r2;
        goto L_0x0015;
    L_0x00c1:
        r0 = 0;
        goto L_0x009d;
    L_0x00c3:
        r1 = r12.f16139b;	 Catch:{ all -> 0x013d }
        r1 = r1.f16136h;	 Catch:{ all -> 0x013d }
        r1 = r1.get(r0);	 Catch:{ all -> 0x013d }
        r1 = (p000.flj) r1;	 Catch:{ all -> 0x013d }
        r4 = 1;
        r3 = 0;
    L_0x00cf:
        r6 = r1.f4610a;	 Catch:{ all -> 0x013d }
        if (r3 >= r6) goto L_0x00e1;
    L_0x00d3:
        r6 = r1.f4612c;	 Catch:{ all -> 0x013d }
        r7 = java.lang.Integer.valueOf(r3);	 Catch:{ all -> 0x013d }
        r6 = r6.containsKey(r7);	 Catch:{ all -> 0x013d }
        r4 = r4 & r6;
        r3 = r3 + 1;
        goto L_0x00cf;
    L_0x00e1:
        r3 = r1.f4613d;	 Catch:{ all -> 0x013d }
        if (r3 == 0) goto L_0x0176;
    L_0x00e5:
        r3 = 1;
    L_0x00e6:
        r3 = r3 & r4;
        if (r3 != 0) goto L_0x00ec;
    L_0x00e9:
        r0 = 0;
        goto L_0x0033;
    L_0x00ec:
        r3 = r12.f16139b;	 Catch:{ all -> 0x013d }
        r3 = r3.f16136h;	 Catch:{ all -> 0x013d }
        r3.remove(r0);	 Catch:{ all -> 0x013d }
        r6 = new java.util.ArrayList;	 Catch:{ all -> 0x013d }
        r6.<init>();	 Catch:{ all -> 0x013d }
        r0 = 0;
        r3 = r0;
    L_0x00fa:
        r0 = r1.f4610a;	 Catch:{ all -> 0x013d }
        if (r3 >= r0) goto L_0x0142;
    L_0x00fe:
        r0 = r1.f4612c;	 Catch:{ all -> 0x013d }
        r4 = java.lang.Integer.valueOf(r3);	 Catch:{ all -> 0x013d }
        r0 = r0.get(r4);	 Catch:{ all -> 0x013d }
        r0 = (p000.fkp) r0;	 Catch:{ all -> 0x013d }
        p000.jri.m13152b(r0);	 Catch:{ all -> 0x013d }
        r4 = r1.f4611b;	 Catch:{ all -> 0x013d }
        r7 = p000.fkr.f4602b;	 Catch:{ all -> 0x013d }
        r7 = r0.m17317a(r7);	 Catch:{ all -> 0x013d }
        r4 = r4.equals(r7);	 Catch:{ all -> 0x013d }
        p000.jri.m13153b(r4);	 Catch:{ all -> 0x013d }
        r4 = r1.f4611b;	 Catch:{ all -> 0x013d }
        r8 = r4.f4562a;	 Catch:{ all -> 0x013d }
        r10 = r0.mo2719f();	 Catch:{ all -> 0x013d }
        r4 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));
        if (r4 != 0) goto L_0x0140;
    L_0x0128:
        r4 = 1;
    L_0x0129:
        p000.jri.m13153b(r4);	 Catch:{ all -> 0x013d }
        r4 = r0.m17319i();	 Catch:{ all -> 0x013d }
        if (r4 == 0) goto L_0x0139;
    L_0x0132:
        r6.add(r0);	 Catch:{ all -> 0x013d }
    L_0x0135:
        r0 = r3 + 1;
        r3 = r0;
        goto L_0x00fa;
    L_0x0139:
        r0.close();	 Catch:{ all -> 0x013d }
        goto L_0x0135;
    L_0x013d:
        r0 = move-exception;
        monitor-exit(r5);	 Catch:{ all -> 0x013d }
        throw r0;
    L_0x0140:
        r4 = 0;
        goto L_0x0129;
    L_0x0142:
        r3 = new fld;	 Catch:{ all -> 0x013d }
        r0 = r1.f4611b;	 Catch:{ all -> 0x013d }
        r8 = r0.f4562a;	 Catch:{ all -> 0x013d }
        r0 = r1.f4612c;	 Catch:{ all -> 0x013d }
        r4 = 0;
        r4 = java.lang.Integer.valueOf(r4);	 Catch:{ all -> 0x013d }
        r0 = r0.get(r4);	 Catch:{ all -> 0x013d }
        r0 = (p000.fkp) r0;	 Catch:{ all -> 0x013d }
        r0 = p000.jri.m13152b(r0);	 Catch:{ all -> 0x013d }
        r0 = (p000.fkp) r0;	 Catch:{ all -> 0x013d }
        r0 = r0.m17318h();	 Catch:{ all -> 0x013d }
        r0 = p000.jri.m13152b(r0);	 Catch:{ all -> 0x013d }
        r0 = (p000.kpk) r0;	 Catch:{ all -> 0x013d }
        r3.<init>(r8, r0, r6);	 Catch:{ all -> 0x013d }
        r0 = r1.f4613d;	 Catch:{ all -> 0x013d }
        r0 = p000.jri.m13152b(r0);	 Catch:{ all -> 0x013d }
        r0 = (p000.fyr) r0;	 Catch:{ all -> 0x013d }
        r0 = p000.fma.m17345a(r3, r0);	 Catch:{ all -> 0x013d }
        goto L_0x0033;
    L_0x0176:
        r3 = 0;
        goto L_0x00e6;
    L_0x0179:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0179 }
        throw r0;
    L_0x017c:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x017e }
    L_0x017e:
        r2 = move-exception;
        if (r1 == 0) goto L_0x0184;
    L_0x0181:
        p000.flk.m10487a(r0, r1);
    L_0x0184:
        throw r2;
    L_0x0185:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0187 }
    L_0x0187:
        r2 = move-exception;
        p000.flk.m10487a(r0, r3);	 Catch:{ all -> 0x017c }
        throw r2;	 Catch:{ all -> 0x017c }
    L_0x018c:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x018c }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: flk.a(fkp):kpk");
    }

    /* renamed from: a */
    public final boolean mo1395a() {
        return this.f16139b.f16130b.mo2650b();
    }
}
