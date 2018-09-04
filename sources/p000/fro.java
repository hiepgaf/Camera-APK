package p000;

/* compiled from: PG */
/* renamed from: fro */
final class fro implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ frk f4670a;

    fro(frk frk) {
        this.f4670a = frk;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
        r10 = this;
        r1 = 0;
        r2 = 1;
        r3 = 0;
    L_0x0003:
        r0 = r10.f4670a;	 Catch:{ all -> 0x00aa }
        r4 = r0.f16442a;	 Catch:{ all -> 0x00aa }
        monitor-enter(r4);	 Catch:{ all -> 0x00aa }
        r0 = r10.f4670a;	 Catch:{ all -> 0x0127 }
        r0 = r0.f16452k;	 Catch:{ all -> 0x0127 }
        r0 = r0.size();	 Catch:{ all -> 0x0127 }
        if (r0 == 0) goto L_0x011f;
    L_0x0012:
        monitor-exit(r4);	 Catch:{ all -> 0x0127 }
        r0 = r10.f4670a;	 Catch:{ all -> 0x00aa }
        r0 = r0.f16450i;	 Catch:{ all -> 0x00aa }
        r4 = "stream#getNext";
        r0.mo1903a(r4);	 Catch:{ all -> 0x00aa }
        r0 = r10.f4670a;	 Catch:{ InterruptedException -> 0x012a, bbg -> 0x013c }
        r0 = r0.f16447f;	 Catch:{ InterruptedException -> 0x012a, bbg -> 0x013c }
        r0 = r0.mo2649a();	 Catch:{ InterruptedException -> 0x012a, bbg -> 0x013c }
        r0 = (p000.fjj) r0;	 Catch:{ InterruptedException -> 0x012a, bbg -> 0x013c }
        r4 = r10.f4670a;	 Catch:{ all -> 0x00aa }
        r4 = r4.f16450i;	 Catch:{ all -> 0x00aa }
        r4.mo1904b();	 Catch:{ all -> 0x00aa }
    L_0x002d:
        if (r0 == 0) goto L_0x0103;
    L_0x002f:
        r4 = r0.mo3044e();	 Catch:{ all -> 0x00aa }
        r6 = r0.mo3043d();	 Catch:{ all -> 0x00aa }
        r7 = 1;
        r7 = new int[r7];	 Catch:{ all -> 0x00aa }
        r8 = 0;
        r9 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        r7[r8] = r9;	 Catch:{ all -> 0x00aa }
        r7 = p000.fds.m10247a(r0, r7);	 Catch:{ all -> 0x00aa }
        r0 = r10.f4670a;	 Catch:{ all -> 0x00aa }
        r8 = r0.m10706b(r6);	 Catch:{ all -> 0x00aa }
        r6 = r0.m10701a(r4, r8);	 Catch:{ all -> 0x00aa }
        if (r6 != 0) goto L_0x0060;
    L_0x004f:
        if (r7 == 0) goto L_0x0054;
    L_0x0051:
        r7.close();	 Catch:{ all -> 0x00aa }
    L_0x0054:
        r0 = r10.f4670a;	 Catch:{ all -> 0x00aa }
        r1 = r0.f16442a;	 Catch:{ all -> 0x00aa }
        monitor-enter(r1);	 Catch:{ all -> 0x00aa }
        r0 = r10.f4670a;	 Catch:{ all -> 0x0159 }
        r2 = 0;
        r0.f16455n = r2;	 Catch:{ all -> 0x0159 }
        monitor-exit(r1);	 Catch:{ all -> 0x0159 }
    L_0x005f:
        return;
    L_0x0060:
        r8 = r6.m2365a();	 Catch:{ all -> 0x00aa }
        r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1));
        if (r0 != 0) goto L_0x0100;
    L_0x0068:
        r0 = r2;
    L_0x0069:
        p000.jqk.m13095a(r0);	 Catch:{ all -> 0x00aa }
        if (r7 != 0) goto L_0x00c6;
    L_0x006e:
        r0 = r10.f4670a;	 Catch:{ all -> 0x00aa }
        r0 = r0.f16449h;	 Catch:{ all -> 0x00aa }
        r7 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00aa }
        r8 = 56;
        r7.<init>(r8);	 Catch:{ all -> 0x00aa }
        r8 = "Failed to retrieve image from frame ";
        r7.append(r8);	 Catch:{ all -> 0x00aa }
        r7.append(r4);	 Catch:{ all -> 0x00aa }
        r7 = r7.toString();	 Catch:{ all -> 0x00aa }
        r0.mo520f(r7);	 Catch:{ all -> 0x00aa }
        r0 = new isr;	 Catch:{ all -> 0x00aa }
        r7 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00aa }
        r8 = 51;
        r7.<init>(r8);	 Catch:{ all -> 0x00aa }
        r8 = "Reprocessing failed for image ";
        r7.append(r8);	 Catch:{ all -> 0x00aa }
        r7.append(r4);	 Catch:{ all -> 0x00aa }
        r4 = "!";
        r7.append(r4);	 Catch:{ all -> 0x00aa }
        r4 = r7.toString();	 Catch:{ all -> 0x00aa }
        r0.<init>(r4);	 Catch:{ all -> 0x00aa }
        r6.m2366a(r0);	 Catch:{ all -> 0x00aa }
        goto L_0x0003;
    L_0x00aa:
        r0 = move-exception;
        r1 = r10.f4670a;
        r1 = r1.f16442a;
        monitor-enter(r1);
        r2 = r10.f4670a;	 Catch:{ all -> 0x00c3 }
        r2 = r2.f16449h;	 Catch:{ all -> 0x00c3 }
        r3 = "Reprocessing ReadLoop failed unexpectedly.";
        r2.mo517c(r3, r0);	 Catch:{ all -> 0x00c3 }
        r0 = r10.f4670a;	 Catch:{ all -> 0x00c3 }
        r2 = 0;
        r0.f16455n = r2;	 Catch:{ all -> 0x00c3 }
        r0.m10705a();	 Catch:{ all -> 0x00c3 }
        monitor-exit(r1);	 Catch:{ all -> 0x00c3 }
        goto L_0x005f;
    L_0x00c3:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x00c3 }
        throw r0;
    L_0x00c6:
        r0 = r10.f4670a;	 Catch:{ all -> 0x00aa }
        r0 = r0.f16449h;	 Catch:{ all -> 0x00aa }
        r8 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00aa }
        r9 = 53;
        r8.<init>(r9);	 Catch:{ all -> 0x00aa }
        r9 = "Reprocessing succeeded for image ";
        r8.append(r9);	 Catch:{ all -> 0x00aa }
        r8.append(r4);	 Catch:{ all -> 0x00aa }
        r4 = r8.toString();	 Catch:{ all -> 0x00aa }
        r0.mo518d(r4);	 Catch:{ all -> 0x00aa }
        r0 = new frq;	 Catch:{ all -> 0x00aa }
        r0.<init>(r6, r7);	 Catch:{ all -> 0x00aa }
        r4 = r6.f4673c;	 Catch:{ all -> 0x00aa }
        r5 = p000.fkp.m17314a(r0);	 Catch:{ all -> 0x00aa }
        r7 = p000.fkr.f4601a;	 Catch:{ all -> 0x00aa }
        r6 = r6.f4674d;	 Catch:{ all -> 0x00aa }
        r6 = r6.f16576a;	 Catch:{ all -> 0x00aa }
        r5 = r5.m17316a(r7, r6);	 Catch:{ all -> 0x00aa }
        r4 = r4.mo3557a(r5);	 Catch:{ all -> 0x00aa }
        if (r4 != 0) goto L_0x0003;
    L_0x00fb:
        r0.close();	 Catch:{ all -> 0x00aa }
        goto L_0x0003;
    L_0x0100:
        r0 = r3;
        goto L_0x0069;
    L_0x0103:
        r0 = r10.f4670a;	 Catch:{ all -> 0x00aa }
        r1 = r0.f16442a;	 Catch:{ all -> 0x00aa }
        monitor-enter(r1);	 Catch:{ all -> 0x00aa }
        r0 = r10.f4670a;	 Catch:{ all -> 0x011c }
        r0 = r0.f16449h;	 Catch:{ all -> 0x011c }
        r2 = "Failed to acquire a jpeg via reprocessing.";
        r0.mo520f(r2);	 Catch:{ all -> 0x011c }
        r0 = r10.f4670a;	 Catch:{ all -> 0x011c }
        r2 = 0;
        r0.f16455n = r2;	 Catch:{ all -> 0x011c }
        r0.m10705a();	 Catch:{ all -> 0x011c }
        monitor-exit(r1);	 Catch:{ all -> 0x011c }
        goto L_0x005f;
    L_0x011c:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x011c }
        throw r0;	 Catch:{ all -> 0x00aa }
    L_0x011f:
        r0 = r10.f4670a;	 Catch:{ all -> 0x0127 }
        r1 = 0;
        r0.f16455n = r1;	 Catch:{ all -> 0x0127 }
        monitor-exit(r4);	 Catch:{ all -> 0x0127 }
        goto L_0x005f;
    L_0x0127:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x0127 }
        throw r0;	 Catch:{ all -> 0x00aa }
    L_0x012a:
        r0 = move-exception;
        r0 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x0150 }
        r0.interrupt();	 Catch:{ all -> 0x0150 }
        r0 = r10.f4670a;	 Catch:{ all -> 0x00aa }
        r0 = r0.f16450i;	 Catch:{ all -> 0x00aa }
        r0.mo1904b();	 Catch:{ all -> 0x00aa }
        r0 = r1;
        goto L_0x002d;
    L_0x013c:
        r0 = move-exception;
        r0 = r10.f4670a;	 Catch:{ all -> 0x0150 }
        r0 = r0.f16449h;	 Catch:{ all -> 0x0150 }
        r4 = "Failed to acquire the next frame from the stream. The stream is closed.";
        r0.mo516c(r4);	 Catch:{ all -> 0x0150 }
        r0 = r10.f4670a;	 Catch:{ all -> 0x00aa }
        r0 = r0.f16450i;	 Catch:{ all -> 0x00aa }
        r0.mo1904b();	 Catch:{ all -> 0x00aa }
        r0 = r1;
        goto L_0x002d;
    L_0x0150:
        r0 = move-exception;
        r1 = r10.f4670a;	 Catch:{ all -> 0x00aa }
        r1 = r1.f16450i;	 Catch:{ all -> 0x00aa }
        r1.mo1904b();	 Catch:{ all -> 0x00aa }
        throw r0;	 Catch:{ all -> 0x00aa }
    L_0x0159:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0159 }
        throw r0;	 Catch:{ all -> 0x00aa }
        */
        throw new UnsupportedOperationException("Method not decompiled: fro.run():void");
    }
}
