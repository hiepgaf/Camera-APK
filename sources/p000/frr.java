package p000;

/* compiled from: PG */
/* renamed from: frr */
final class frr implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ frk f4676a;

    frr(frk frk) {
        this.f4676a = frk;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
        r10 = this;
    L_0x0000:
        r0 = r10.f4676a;
        r1 = r0.f16442a;
        monitor-enter(r1);
        r0 = r10.f4676a;	 Catch:{ all -> 0x0196 }
        r2 = r0.f16456o;	 Catch:{ all -> 0x0196 }
        if (r2 != 0) goto L_0x0013;
    L_0x000b:
        r0 = r0.f16451j;	 Catch:{ all -> 0x0196 }
        r0 = r0.size();	 Catch:{ all -> 0x0196 }
        if (r0 != 0) goto L_0x001a;
    L_0x0013:
        r0 = r10.f4676a;	 Catch:{ all -> 0x0196 }
        r2 = 0;
        r0.f16454m = r2;	 Catch:{ all -> 0x0196 }
        monitor-exit(r1);	 Catch:{ all -> 0x0196 }
    L_0x0019:
        return;
    L_0x001a:
        r0 = r10.f4676a;	 Catch:{ all -> 0x0196 }
        r0 = r0.f16452k;	 Catch:{ all -> 0x0196 }
        r0 = r0.size();	 Catch:{ all -> 0x0196 }
        r2 = r10.f4676a;	 Catch:{ all -> 0x0196 }
        r2 = r2.f16453l;	 Catch:{ all -> 0x0196 }
        r2 = r2.size();	 Catch:{ all -> 0x0196 }
        r0 = r0 + r2;
        r2 = r10.f4676a;	 Catch:{ all -> 0x0196 }
        r3 = r2.f16444c;	 Catch:{ all -> 0x0196 }
        if (r0 >= r3) goto L_0x0013;
    L_0x0031:
        r0 = r2.f16452k;	 Catch:{ all -> 0x0196 }
        r0 = r0.size();	 Catch:{ all -> 0x0196 }
        r2 = r10.f4676a;	 Catch:{ all -> 0x0196 }
        r3 = r2.f16443b;	 Catch:{ all -> 0x0196 }
        if (r0 == r3) goto L_0x0013;
    L_0x003d:
        r0 = r2.f16447f;	 Catch:{ all -> 0x0196 }
        r0 = r0.mo3439d();	 Catch:{ all -> 0x0196 }
        r2 = r10.f4676a;	 Catch:{ all -> 0x0196 }
        r2 = r2.f16452k;	 Catch:{ all -> 0x0196 }
        r2 = r2.size();	 Catch:{ all -> 0x0196 }
        if (r0 == r2) goto L_0x0199;
    L_0x004d:
        r0 = r10.f4676a;	 Catch:{ all -> 0x0196 }
        r0 = r0.f16446e;	 Catch:{ all -> 0x0196 }
        r2 = 1;
        r2 = r0.mo1408a(r2);	 Catch:{ all -> 0x0196 }
        if (r2 == 0) goto L_0x018e;
    L_0x0058:
        r0 = r10.f4676a;	 Catch:{ all -> 0x0196 }
        r0 = r0.f16451j;	 Catch:{ all -> 0x0196 }
        r0 = r0.removeFirst();	 Catch:{ all -> 0x0196 }
        r0 = (p000.frp) r0;	 Catch:{ all -> 0x0196 }
        r3 = r10.f4676a;	 Catch:{ all -> 0x0196 }
        r3 = r3.f16452k;	 Catch:{ all -> 0x0196 }
        r3.add(r0);	 Catch:{ all -> 0x0196 }
        r3 = r10.f4676a;	 Catch:{ all -> 0x0196 }
        r4 = r3.f16449h;	 Catch:{ all -> 0x0196 }
        r3 = r3.f16452k;	 Catch:{ all -> 0x0196 }
        r3 = r3.size();	 Catch:{ all -> 0x0196 }
        r5 = r10.f4676a;	 Catch:{ all -> 0x0196 }
        r5 = r5.f16443b;	 Catch:{ all -> 0x0196 }
        r6 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0196 }
        r7 = 49;
        r6.<init>(r7);	 Catch:{ all -> 0x0196 }
        r7 = "Adding request to queue (";
        r6.append(r7);	 Catch:{ all -> 0x0196 }
        r6.append(r3);	 Catch:{ all -> 0x0196 }
        r3 = "/";
        r6.append(r3);	 Catch:{ all -> 0x0196 }
        r6.append(r5);	 Catch:{ all -> 0x0196 }
        r3 = ")";
        r6.append(r3);	 Catch:{ all -> 0x0196 }
        r3 = r6.toString();	 Catch:{ all -> 0x0196 }
        r4.mo518d(r3);	 Catch:{ all -> 0x0196 }
        r3 = r10.f4676a;	 Catch:{ all -> 0x0196 }
        r3 = r3.f16448g;	 Catch:{ all -> 0x0196 }
        r3.m16083a();	 Catch:{ all -> 0x0196 }
        monitor-exit(r1);	 Catch:{ all -> 0x0196 }
        r1 = r10.f4676a;
        r1 = r1.f16450i;
        r4 = r0.m2365a();
        r3 = new java.lang.StringBuilder;
        r6 = 21;
        r3.<init>(r6);
        r6 = "w";
        r3.append(r6);
        r3.append(r4);
        r3 = r3.toString();
        r1.mo1903a(r3);
        r1 = r10.f4676a;	 Catch:{ all -> 0x00e5 }
        r3 = r0.f4672b;	 Catch:{ all -> 0x00e5 }
        r1 = r1.m10702a(r3);	 Catch:{ all -> 0x00e5 }
        r3 = new fio;	 Catch:{ all -> 0x00e5 }
        r3.<init>(r1);	 Catch:{ all -> 0x00e5 }
        r1 = r0.f4671a;	 Catch:{ all -> 0x00e5 }
        r1 = r1.f16441a;	 Catch:{ all -> 0x00e5 }
        r4 = r1.iterator();	 Catch:{ all -> 0x00e5 }
    L_0x00d5:
        r1 = r4.hasNext();	 Catch:{ all -> 0x00e5 }
        if (r1 == 0) goto L_0x0113;
    L_0x00db:
        r1 = r4.next();	 Catch:{ all -> 0x00e5 }
        r1 = (p000.fin) r1;	 Catch:{ all -> 0x00e5 }
        r3.m2306a(r1);	 Catch:{ all -> 0x00e5 }
        goto L_0x00d5;
    L_0x00e5:
        r1 = move-exception;
        r3 = r10.f4676a;	 Catch:{ all -> 0x01b8 }
        r3 = r3.f16449h;	 Catch:{ all -> 0x01b8 }
        r4 = r0.m2365a();	 Catch:{ all -> 0x01b8 }
        r6 = new java.lang.StringBuilder;	 Catch:{ all -> 0x01b8 }
        r7 = 62;
        r6.<init>(r7);	 Catch:{ all -> 0x01b8 }
        r7 = "Failed to initiate reprocessing for image ";
        r6.append(r7);	 Catch:{ all -> 0x01b8 }
        r6.append(r4);	 Catch:{ all -> 0x01b8 }
        r4 = r6.toString();	 Catch:{ all -> 0x01b8 }
        r3.mo517c(r4, r1);	 Catch:{ all -> 0x01b8 }
        r0.m2366a(r1);	 Catch:{ all -> 0x01b8 }
        r2.close();
        r0 = r10.f4676a;
        r0 = r0.f16450i;
        r0.mo1904b();
        goto L_0x0000;
    L_0x0113:
        r1 = r0.f4674d;	 Catch:{ all -> 0x00e5 }
        r3.m2307a(r1);	 Catch:{ all -> 0x00e5 }
        r1 = r10.f4676a;	 Catch:{ all -> 0x00e5 }
        r1 = r1.f16447f;	 Catch:{ all -> 0x00e5 }
        r3.m2304a(r1);	 Catch:{ all -> 0x00e5 }
        r1 = r3.m2301a();	 Catch:{ all -> 0x00e5 }
        r3 = new iuy;	 Catch:{ all -> 0x00e5 }
        r4 = r0.f4671a;	 Catch:{ all -> 0x00e5 }
        r4 = r4.b;	 Catch:{ all -> 0x00e5 }
        r3.<init>(r4);	 Catch:{ all -> 0x00e5 }
        r4 = r10.f4676a;	 Catch:{ all -> 0x00e5 }
        r4 = r4.f16450i;	 Catch:{ all -> 0x00e5 }
        r5 = "submit";
        r4.mo1903a(r5);	 Catch:{ all -> 0x00e5 }
        r4 = r0.m2365a();	 Catch:{ all -> 0x01a6 }
        r3 = r2.m10538a(r4, r3);	 Catch:{ all -> 0x01a6 }
        r3.mo3444h();	 Catch:{ all -> 0x01af }
        r4 = r10.f4676a;	 Catch:{ all -> 0x01af }
        r4 = r4.f16445d;	 Catch:{ all -> 0x01af }
        r4.mo1387a(r1);	 Catch:{ all -> 0x01af }
        r1 = r10.f4676a;	 Catch:{ all -> 0x01af }
        r1.m10709d();	 Catch:{ all -> 0x01af }
        r1 = r10.f4676a;	 Catch:{ all -> 0x01af }
        r1 = r1.f16449h;	 Catch:{ all -> 0x01af }
        r4 = r0.m2365a();	 Catch:{ all -> 0x01af }
        r6 = r3.mo2719f();	 Catch:{ all -> 0x01af }
        r8 = new java.lang.StringBuilder;	 Catch:{ all -> 0x01af }
        r9 = 88;
        r8.<init>(r9);	 Catch:{ all -> 0x01af }
        r9 = "Reprocessing started for request ";
        r8.append(r9);	 Catch:{ all -> 0x01af }
        r8.append(r4);	 Catch:{ all -> 0x01af }
        r4 = " with image at ";
        r8.append(r4);	 Catch:{ all -> 0x01af }
        r8.append(r6);	 Catch:{ all -> 0x01af }
        r4 = r8.toString();	 Catch:{ all -> 0x01af }
        r1.mo518d(r4);	 Catch:{ all -> 0x01af }
        if (r3 == 0) goto L_0x017b;
    L_0x0178:
        r3.close();	 Catch:{ all -> 0x01a6 }
    L_0x017b:
        r1 = r10.f4676a;	 Catch:{ all -> 0x00e5 }
        r1 = r1.f16450i;	 Catch:{ all -> 0x00e5 }
        r1.mo1904b();	 Catch:{ all -> 0x00e5 }
        r2.close();
        r0 = r10.f4676a;
        r0 = r0.f16450i;
        r0.mo1904b();
        goto L_0x0000;
    L_0x018e:
        r0 = r10.f4676a;	 Catch:{ all -> 0x0196 }
        r2 = 0;
        r0.f16454m = r2;	 Catch:{ all -> 0x0196 }
        monitor-exit(r1);	 Catch:{ all -> 0x0196 }
        goto L_0x0019;
    L_0x0196:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0196 }
        throw r0;
    L_0x0199:
        r0 = r10.f4676a;	 Catch:{ all -> 0x0196 }
        r0 = r0.f16447f;	 Catch:{ all -> 0x0196 }
        r2 = 1;
        r0 = r0.mo3438b(r2);	 Catch:{ all -> 0x0196 }
        if (r0 == 0) goto L_0x0013;
    L_0x01a4:
        goto L_0x004d;
    L_0x01a6:
        r1 = move-exception;
        r3 = r10.f4676a;	 Catch:{ all -> 0x00e5 }
        r3 = r3.f16450i;	 Catch:{ all -> 0x00e5 }
        r3.mo1904b();	 Catch:{ all -> 0x00e5 }
        throw r1;	 Catch:{ all -> 0x00e5 }
    L_0x01af:
        r1 = move-exception;
        throw r1;	 Catch:{ all -> 0x01b1 }
    L_0x01b1:
        r4 = move-exception;
        if (r3 == 0) goto L_0x01b7;
    L_0x01b4:
        r3.close();	 Catch:{ all -> 0x01c4 }
    L_0x01b7:
        throw r4;	 Catch:{ all -> 0x01a6 }
    L_0x01b8:
        r0 = move-exception;
        r2.close();
        r1 = r10.f4676a;
        r1 = r1.f16450i;
        r1.mo1904b();
        throw r0;
    L_0x01c4:
        r3 = move-exception;
        p000.kqg.m5044a(r1, r3);	 Catch:{ all -> 0x01a6 }
        goto L_0x01b7;
        */
        throw new UnsupportedOperationException("Method not decompiled: frr.run():void");
    }
}
