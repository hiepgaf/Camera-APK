package p000;

/* renamed from: gio */
public final /* synthetic */ class gio implements Runnable {
    /* renamed from: a */
    private final gil f5252a;
    /* renamed from: b */
    private final fkp f5253b;
    /* renamed from: c */
    private final gik f5254c;

    public gio(gil gil, fkp fkp, gik gik) {
        this.f5252a = gil;
        this.f5253b = fkp;
        this.f5254c = gik;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
        r11 = this;
        r1 = 1;
        r2 = 0;
        r8 = r11.f5252a;
        r9 = r11.f5253b;
        r10 = r11.f5254c;
        r0 = p000.fkr.f4603c;
        r0 = r9.m17317a(r0);
        r0 = (p000.iqm) r0;
        r4 = new gfw;
        r3 = r9.m17318h();
        r4.<init>(r9, r0, r3);
        r0 = 2;
        r5 = android.media.CameraProfile.getJpegEncodingQualityParameter(r0);	 Catch:{ BufferOverflowException -> 0x005b }
        r0 = r8.f5249d;	 Catch:{ BufferOverflowException -> 0x005b }
        if (r0 == 0) goto L_0x0137;
    L_0x0022:
        r3 = r0.limit();	 Catch:{ BufferOverflowException -> 0x005b }
    L_0x0026:
        r0 = p000.gil.m2567b(r4);	 Catch:{ BufferOverflowException -> 0x005b }
        r0 = r0 / 2;
        if (r0 <= r3) goto L_0x0035;
    L_0x002e:
        r3 = java.nio.ByteBuffer.allocateDirect(r0);	 Catch:{ BufferOverflowException -> 0x005b }
        r8.f5249d = r3;	 Catch:{ BufferOverflowException -> 0x005b }
        r3 = r0;
    L_0x0035:
        r0 = r8.f5249d;	 Catch:{ BufferOverflowException -> 0x005b }
        r6 = p000.gij.m2565a(r4, r5, r0);	 Catch:{ BufferOverflowException -> 0x005b }
        if (r6 <= 0) goto L_0x0134;
    L_0x003d:
        r0 = r1;
    L_0x003e:
        p000.jri.m13153b(r0);	 Catch:{ BufferOverflowException -> 0x005b }
        if (r6 <= r3) goto L_0x0067;
    L_0x0043:
        r0 = p000.gil.m2567b(r4);	 Catch:{ BufferOverflowException -> 0x005b }
        r1 = java.nio.ByteBuffer.allocateDirect(r0);	 Catch:{ BufferOverflowException -> 0x005b }
        r8.f5249d = r1;	 Catch:{ BufferOverflowException -> 0x005b }
        r1 = r8.f5249d;	 Catch:{ BufferOverflowException -> 0x005b }
        r1 = p000.gij.m2565a(r4, r5, r1);	 Catch:{ BufferOverflowException -> 0x005b }
        if (r1 <= r0) goto L_0x0067;
    L_0x0055:
        r0 = new java.nio.BufferOverflowException;	 Catch:{ BufferOverflowException -> 0x005b }
        r0.<init>();	 Catch:{ BufferOverflowException -> 0x005b }
        throw r0;	 Catch:{ BufferOverflowException -> 0x005b }
    L_0x005b:
        r0 = move-exception;
        r1 = r10.f5244a;
        r1.m17780a(r0);
        r1 = r10.f5245b;
        r1.m17780a(r0);
    L_0x0066:
        return;
    L_0x0067:
        r5 = p000.itg.m4197a();	 Catch:{ BufferOverflowException -> 0x005b }
        r0 = p000.gil.m2566a(r4);	 Catch:{ BufferOverflowException -> 0x005b }
        r1 = r4.f5153f;	 Catch:{ BufferOverflowException -> 0x005b }
        r1 = p000.iqp.m4045a(r1);	 Catch:{ BufferOverflowException -> 0x005b }
        r2 = r4.f5150c;	 Catch:{ BufferOverflowException -> 0x005b }
        r3 = r1.m4047a(r2);	 Catch:{ BufferOverflowException -> 0x005b }
        r1 = r3.f7329a;	 Catch:{ BufferOverflowException -> 0x005b }
        r2 = r3.f7330b;	 Catch:{ BufferOverflowException -> 0x005b }
        r7 = r4.f5150c;	 Catch:{ BufferOverflowException -> 0x005b }
        r0 = p000.kbg.m4744b(r0);	 Catch:{ BufferOverflowException -> 0x005b }
        r5.m4199a(r1, r2, r7, r0);	 Catch:{ BufferOverflowException -> 0x005b }
        r0 = r4.f5149b;	 Catch:{ BufferOverflowException -> 0x005b }
        r0 = r0.mo2719f();	 Catch:{ BufferOverflowException -> 0x005b }
        r2 = r8.f5249d;	 Catch:{ BufferOverflowException -> 0x005b }
        r7 = r2.hasArray();	 Catch:{ BufferOverflowException -> 0x005b }
        if (r7 == 0) goto L_0x0126;
    L_0x0096:
        r7 = r2.limit();	 Catch:{ BufferOverflowException -> 0x005b }
        if (r7 != r6) goto L_0x0126;
    L_0x009c:
        r2 = r2.array();	 Catch:{ BufferOverflowException -> 0x005b }
    L_0x00a0:
        r4 = r4.f5150c;	 Catch:{ BufferOverflowException -> 0x005b }
        r4 = r4.f7326e;	 Catch:{ BufferOverflowException -> 0x005b }
        r5 = r5.f7455a;	 Catch:{ BufferOverflowException -> 0x005b }
        r6 = r8.f5248c;	 Catch:{ BufferOverflowException -> 0x005b }
        r7 = 0;
        r0 = p000.foz.m2358a(r0, r2, r3, r4, r5, r6, r7);	 Catch:{ BufferOverflowException -> 0x005b }
        r9.close();	 Catch:{ BufferOverflowException -> 0x005b }
        r1 = r10.f5244a;	 Catch:{ BufferOverflowException -> 0x005b }
        r1.mo3557a(r0);	 Catch:{ BufferOverflowException -> 0x005b }
        r1 = r8.f5247b;	 Catch:{ IOException -> 0x0109 }
        r2 = r1.f5250a;	 Catch:{ IOException -> 0x0109 }
        r1 = r1.f5251b;	 Catch:{ IOException -> 0x0109 }
        r3 = new gim;	 Catch:{ IOException -> 0x0109 }
        r3.<init>(r9, r2, r1);	 Catch:{ IOException -> 0x0109 }
        r1 = r3.f16940a;	 Catch:{ all -> 0x0118 }
        r1 = r3.m11101a(r1);	 Catch:{ all -> 0x0118 }
        r2 = new java.io.BufferedOutputStream;	 Catch:{ all -> 0x0118 }
        r4 = new java.io.FileOutputStream;	 Catch:{ all -> 0x0118 }
        r4.<init>(r1);	 Catch:{ all -> 0x0118 }
        r2.<init>(r4);	 Catch:{ all -> 0x0118 }
        r1 = r0.f4655d;	 Catch:{ all -> 0x0111 }
        r1 = r1.m8481a(r2);	 Catch:{ all -> 0x0111 }
        r4 = r0.f4653b;	 Catch:{ all -> 0x011f }
        r0 = r3.f16940a;	 Catch:{ all -> 0x011f }
        r5 = p000.fkr.f4604d;	 Catch:{ all -> 0x011f }
        r0 = r0.m17317a(r5);	 Catch:{ all -> 0x011f }
        r0 = (java.util.UUID) r0;	 Catch:{ all -> 0x011f }
        r5 = p000.bve.BURSTS;	 Catch:{ all -> 0x011f }
        r5 = r5.m1007d();	 Catch:{ all -> 0x011f }
        r6 = 0;
        r7 = 1;
        r0 = p000.bbz.m788a(r0, r6, r5, r7);	 Catch:{ all -> 0x011f }
        p000.bdf.m801b(r4, r1, r0);	 Catch:{ all -> 0x011f }
        r0 = 0;
        p000.gim.m11100a(r0, r1);	 Catch:{ all -> 0x0111 }
        r0 = 0;
        p000.gim.m11100a(r0, r2);	 Catch:{ all -> 0x0118 }
        r0 = r10.f5245b;	 Catch:{ all -> 0x0118 }
        r1 = r3.f16940a;	 Catch:{ all -> 0x0118 }
        r1 = r3.m11101a(r1);	 Catch:{ all -> 0x0118 }
        r0.mo3557a(r1);	 Catch:{ all -> 0x0118 }
        r3.close();	 Catch:{ IOException -> 0x0109 }
        goto L_0x0066;
    L_0x0109:
        r0 = move-exception;
        r1 = r10.f5245b;	 Catch:{ BufferOverflowException -> 0x005b }
        r1.m17780a(r0);	 Catch:{ BufferOverflowException -> 0x005b }
        goto L_0x0066;
    L_0x0111:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0113 }
    L_0x0113:
        r1 = move-exception;
        p000.gim.m11100a(r0, r2);	 Catch:{ all -> 0x0118 }
        throw r1;	 Catch:{ all -> 0x0118 }
    L_0x0118:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x011a }
    L_0x011a:
        r1 = move-exception;
        r3.close();	 Catch:{ all -> 0x013a }
    L_0x011e:
        throw r1;	 Catch:{ IOException -> 0x0109 }
    L_0x011f:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0121 }
    L_0x0121:
        r4 = move-exception;
        p000.gim.m11100a(r0, r1);	 Catch:{ all -> 0x0111 }
        throw r4;	 Catch:{ all -> 0x0111 }
    L_0x0126:
        r7 = r2.duplicate();	 Catch:{ BufferOverflowException -> 0x005b }
        r7.rewind();	 Catch:{ BufferOverflowException -> 0x005b }
        r2 = new byte[r6];	 Catch:{ BufferOverflowException -> 0x005b }
        r7.get(r2);	 Catch:{ BufferOverflowException -> 0x005b }
        goto L_0x00a0;
    L_0x0134:
        r0 = r2;
        goto L_0x003e;
    L_0x0137:
        r3 = r2;
        goto L_0x0026;
    L_0x013a:
        r2 = move-exception;
        p000.kqg.m5044a(r0, r2);	 Catch:{ IOException -> 0x0109 }
        goto L_0x011e;
        */
        throw new UnsupportedOperationException("Method not decompiled: gio.run():void");
    }
}
