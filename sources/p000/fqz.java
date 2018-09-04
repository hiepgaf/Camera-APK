package p000;

/* compiled from: PG */
/* renamed from: fqz */
final class fqz implements Runnable {
    /* renamed from: a */
    private final gfw f4663a;
    /* renamed from: b */
    private final kpw f4664b;
    /* renamed from: c */
    private final /* synthetic */ fqx f4665c;

    public fqz(fqx fqx, gfw gfw, kpw kpw) {
        this.f4665c = fqx;
        this.f4663a = gfw;
        this.f4664b = kpw;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find block by offset: 0x0072 in list [B:4:0x005e]
	at jadx.core.utils.BlockUtils.getBlockByOffset(BlockUtils.java:43)
	at jadx.core.dex.instructions.IfNode.initBlocks(IfNode.java:60)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.initBlocksInIfNodes(BlockFinish.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.visit(BlockFinish.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/224100622.run(Unknown Source)
*/
        /*
        r9 = this;
        r0 = r9.f4665c;	 Catch:{ Exception -> 0x0073, all -> 0x0096 }
        r1 = r9.f4663a;	 Catch:{ Exception -> 0x0073, all -> 0x0096 }
        r2 = 2;	 Catch:{ Exception -> 0x0073, all -> 0x0096 }
        r2 = android.media.CameraProfile.getJpegEncodingQualityParameter(r2);	 Catch:{ Exception -> 0x0073, all -> 0x0096 }
        r2 = r0.m10677a(r1, r2);	 Catch:{ Exception -> 0x0073, all -> 0x0096 }
        r5 = p000.itg.m4197a();	 Catch:{ Exception -> 0x0073, all -> 0x0096 }
        r0 = r9.f4663a;	 Catch:{ Exception -> 0x0073, all -> 0x0096 }
        r0 = r0.f5151d;	 Catch:{ Exception -> 0x0073, all -> 0x0096 }
        r0 = p000.jri.m13152b(r0);	 Catch:{ Exception -> 0x0073, all -> 0x0096 }
        r0 = (p000.kpk) r0;	 Catch:{ Exception -> 0x0073, all -> 0x0096 }
        r0 = r0.get();	 Catch:{ Exception -> 0x0073, all -> 0x0096 }
        r0 = (p000.iwp) r0;	 Catch:{ Exception -> 0x0073, all -> 0x0096 }
        r1 = r9.f4663a;	 Catch:{ Exception -> 0x0073, all -> 0x0096 }
        r1 = r1.f5153f;	 Catch:{ Exception -> 0x0073, all -> 0x0096 }
        r3 = p000.iqp.m4045a(r1);	 Catch:{ Exception -> 0x0073, all -> 0x0096 }
        r1 = r3.f7329a;	 Catch:{ Exception -> 0x0073, all -> 0x0096 }
        r4 = r3.f7330b;	 Catch:{ Exception -> 0x0073, all -> 0x0096 }
        r6 = r9.f4663a;	 Catch:{ Exception -> 0x0073, all -> 0x0096 }
        r6 = r6.f5150c;	 Catch:{ Exception -> 0x0073, all -> 0x0096 }
        r0 = p000.kbg.m4745c(r0);	 Catch:{ Exception -> 0x0073, all -> 0x0096 }
        r5.m4199a(r1, r4, r6, r0);	 Catch:{ Exception -> 0x0073, all -> 0x0096 }
        r8 = r9.f4664b;	 Catch:{ Exception -> 0x0073, all -> 0x0096 }
        r0 = r9.f4663a;	 Catch:{ Exception -> 0x0073, all -> 0x0096 }
        r0 = r0.f5149b;	 Catch:{ Exception -> 0x0073, all -> 0x0096 }
        r0 = r0.mo2719f();	 Catch:{ Exception -> 0x0073, all -> 0x0096 }
        r4 = r9.f4663a;	 Catch:{ Exception -> 0x0073, all -> 0x0096 }
        r4 = r4.f5150c;	 Catch:{ Exception -> 0x0073, all -> 0x0096 }
        r4 = r4.f7326e;	 Catch:{ Exception -> 0x0073, all -> 0x0096 }
        r5 = r5.f7455a;	 Catch:{ Exception -> 0x0073, all -> 0x0096 }
        r6 = r9.f4665c;	 Catch:{ Exception -> 0x0073, all -> 0x0096 }
        r6 = r6.f16407b;	 Catch:{ Exception -> 0x0073, all -> 0x0096 }
        r7 = 0;	 Catch:{ Exception -> 0x0073, all -> 0x0096 }
        r0 = p000.foz.m2358a(r0, r2, r3, r4, r5, r6, r7);	 Catch:{ Exception -> 0x0073, all -> 0x0096 }
        r8.mo3557a(r0);	 Catch:{ Exception -> 0x0073, all -> 0x0096 }
        r0 = r9.f4664b;
        r0 = r0.isDone();
        if (r0 != 0) goto L_0x0072;
    L_0x005e:
        r0 = r9.f4664b;
        r0 = r0.isCancelled();
        if (r0 != 0) goto L_0x0072;
    L_0x0066:
        r0 = r9.f4664b;
        r1 = new java.lang.RuntimeException;
        r2 = "Unknown error while encoding imageToProcess";
        r1.<init>(r2);
        r0.m17780a(r1);
    L_0x0072:
        return;
    L_0x0073:
        r0 = move-exception;
        r1 = r9.f4664b;	 Catch:{ Exception -> 0x0073, all -> 0x0096 }
        r1.m17780a(r0);	 Catch:{ Exception -> 0x0073, all -> 0x0096 }
        r0 = r9.f4664b;
        r0 = r0.isDone();
        if (r0 != 0) goto L_0x0072;
    L_0x0081:
        r0 = r9.f4664b;
        r0 = r0.isCancelled();
        if (r0 != 0) goto L_0x0072;
    L_0x0089:
        r0 = r9.f4664b;
        r1 = new java.lang.RuntimeException;
        r2 = "Unknown error while encoding imageToProcess";
        r1.<init>(r2);
        r0.m17780a(r1);
        goto L_0x0072;
    L_0x0096:
        r0 = move-exception;
        r1 = r9.f4664b;
        r1 = r1.isDone();
        if (r1 != 0) goto L_0x00b3;
    L_0x009f:
        r1 = r9.f4664b;
        r1 = r1.isCancelled();
        if (r1 != 0) goto L_0x00b3;
    L_0x00a7:
        r1 = r9.f4664b;
        r2 = new java.lang.RuntimeException;
        r3 = "Unknown error while encoding imageToProcess";
        r2.<init>(r3);
        r1.m17780a(r2);
    L_0x00b3:
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: fqz.run():void");
    }
}
