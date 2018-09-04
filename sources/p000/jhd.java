package p000;

/* renamed from: jhd */
final /* synthetic */ class jhd implements Runnable {
    /* renamed from: a */
    private final jgz f7831a;

    jhd(jgz jgz) {
        this.f7831a = jgz;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find block by offset: 0x003d in list [B:13:0x0036]
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
        r4 = this;
        r2 = r4.f7831a;
        r0 = r2.f18786f;
        r0 = p000.kow.m13625c(r0);
        r0 = (android.media.MediaMuxer) r0;
        r1 = r2.f18787g;	 Catch:{ all -> 0x007c, all -> 0x00ab, all -> 0x00bf }
        r1 = r1.isDone();	 Catch:{ all -> 0x007c, all -> 0x00ab, all -> 0x00bf }
        if (r1 == 0) goto L_0x003e;	 Catch:{ all -> 0x007c, all -> 0x00ab, all -> 0x00bf }
    L_0x0012:
        r1 = r2.f18787g;	 Catch:{ all -> 0x007c, all -> 0x00ab, all -> 0x00bf }
        r1 = r1.isCancelled();	 Catch:{ all -> 0x007c, all -> 0x00ab, all -> 0x00bf }
        if (r1 != 0) goto L_0x003e;	 Catch:{ all -> 0x007c, all -> 0x00ab, all -> 0x00bf }
    L_0x001a:
        r1 = r2.f18787g;	 Catch:{ all -> 0x007c, all -> 0x00ab, all -> 0x00bf }
        r1 = p000.kow.m13623b(r1);	 Catch:{ all -> 0x007c, all -> 0x00ab, all -> 0x00bf }
        r1 = (java.lang.Boolean) r1;	 Catch:{ all -> 0x007c, all -> 0x00ab, all -> 0x00bf }
        r1 = r1.booleanValue();	 Catch:{ all -> 0x007c, all -> 0x00ab, all -> 0x00bf }
        if (r1 == 0) goto L_0x003e;	 Catch:{ all -> 0x007c, all -> 0x00ab, all -> 0x00bf }
    L_0x0028:
        r0.stop();	 Catch:{ all -> 0x007c, all -> 0x00ab, all -> 0x00bf }
    L_0x002b:
        r0.release();	 Catch:{ all -> 0x0095, all -> 0x00d6 }
        r0 = r2.f18788h;
        r0 = r0.isDone();
        if (r0 != 0) goto L_0x003d;
    L_0x0036:
        r0 = r2.f18788h;
        r1 = p000.jgz.class;
        r0.mo3557a(r1);
    L_0x003d:
        return;
    L_0x003e:
        r1 = "MuxerImpl";	 Catch:{ all -> 0x007c, all -> 0x00ab, all -> 0x00bf }
        r3 = "Output cancelled since no data written to at least one track.";	 Catch:{ all -> 0x007c, all -> 0x00ab, all -> 0x00bf }
        android.util.Log.w(r1, r3);	 Catch:{ all -> 0x007c, all -> 0x00ab, all -> 0x00bf }
        r1 = r2.f18788h;	 Catch:{ all -> 0x007c, all -> 0x00ab, all -> 0x00bf }
        r3 = 0;	 Catch:{ all -> 0x007c, all -> 0x00ab, all -> 0x00bf }
        r1.cancel(r3);	 Catch:{ all -> 0x007c, all -> 0x00ab, all -> 0x00bf }
        r1 = r2.f18782b;	 Catch:{ all -> 0x007c, all -> 0x00ab, all -> 0x00bf }
        r1 = r1.isDone();	 Catch:{ all -> 0x007c, all -> 0x00ab, all -> 0x00bf }
        if (r1 == 0) goto L_0x002b;	 Catch:{ all -> 0x007c, all -> 0x00ab, all -> 0x00bf }
    L_0x0053:
        r1 = r2.f18782b;	 Catch:{ all -> 0x007c, all -> 0x00ab, all -> 0x00bf }
        r1 = r1.isCancelled();	 Catch:{ all -> 0x007c, all -> 0x00ab, all -> 0x00bf }
        if (r1 != 0) goto L_0x002b;	 Catch:{ all -> 0x007c, all -> 0x00ab, all -> 0x00bf }
    L_0x005b:
        r1 = r2.f18782b;	 Catch:{ all -> 0x007c, all -> 0x00ab, all -> 0x00bf }
        r1 = p000.kow.m13625c(r1);	 Catch:{ all -> 0x007c, all -> 0x00ab, all -> 0x00bf }
        r1 = (p000.jgw) r1;	 Catch:{ all -> 0x007c, all -> 0x00ab, all -> 0x00bf }
        r3 = r1.f7816a;	 Catch:{ all -> 0x007c, all -> 0x00ab, all -> 0x00bf }
        r3 = r3.mo2084b();	 Catch:{ all -> 0x007c, all -> 0x00ab, all -> 0x00bf }
        if (r3 == 0) goto L_0x002b;	 Catch:{ all -> 0x007c, all -> 0x00ab, all -> 0x00bf }
    L_0x006b:
        r3 = new java.io.File;	 Catch:{ all -> 0x007c, all -> 0x00ab, all -> 0x00bf }
        r1 = r1.f7816a;	 Catch:{ all -> 0x007c, all -> 0x00ab, all -> 0x00bf }
        r1 = r1.mo2081a();	 Catch:{ all -> 0x007c, all -> 0x00ab, all -> 0x00bf }
        r1 = (java.lang.String) r1;	 Catch:{ all -> 0x007c, all -> 0x00ab, all -> 0x00bf }
        r3.<init>(r1);	 Catch:{ all -> 0x007c, all -> 0x00ab, all -> 0x00bf }
        r3.delete();	 Catch:{ all -> 0x007c, all -> 0x00ab, all -> 0x00bf }
        goto L_0x002b;
    L_0x007c:
        r1 = move-exception;
        r3 = r2.f18788h;	 Catch:{ all -> 0x007c, all -> 0x00ab, all -> 0x00bf }
        r3.m17780a(r1);	 Catch:{ all -> 0x007c, all -> 0x00ab, all -> 0x00bf }
        r0.release();	 Catch:{ all -> 0x007c, all -> 0x00ab, all -> 0x00bf }
        r0 = r2.f18788h;
        r0 = r0.isDone();
        if (r0 != 0) goto L_0x003d;
    L_0x008d:
        r0 = r2.f18788h;
        r1 = p000.jgz.class;
        r0.mo3557a(r1);
        goto L_0x003d;
    L_0x0095:
        r0 = move-exception;
        r1 = r2.f18788h;	 Catch:{ all -> 0x0095, all -> 0x00d6 }
        r1.m17780a(r0);	 Catch:{ all -> 0x0095, all -> 0x00d6 }
        r0 = r2.f18788h;
        r0 = r0.isDone();
        if (r0 != 0) goto L_0x003d;
    L_0x00a3:
        r0 = r2.f18788h;
        r1 = p000.jgz.class;
        r0.mo3557a(r1);
        goto L_0x003d;
    L_0x00ab:
        r1 = move-exception;
        r0.release();	 Catch:{ all -> 0x00e7 }
        r0 = r2.f18788h;
        r0 = r0.isDone();
        if (r0 != 0) goto L_0x00be;
    L_0x00b7:
        r0 = r2.f18788h;
        r2 = p000.jgz.class;
        r0.mo3557a(r2);
    L_0x00be:
        throw r1;
    L_0x00bf:
        r0 = move-exception;
        r1 = r2.f18788h;	 Catch:{ all -> 0x00fd }
        r1.m17780a(r0);	 Catch:{ all -> 0x00fd }
        r0 = r2.f18788h;
        r0 = r0.isDone();
        if (r0 != 0) goto L_0x003d;
    L_0x00cd:
        r0 = r2.f18788h;
        r1 = p000.jgz.class;
        r0.mo3557a(r1);
        goto L_0x003d;
    L_0x00d6:
        r0 = move-exception;
        r1 = r2.f18788h;
        r1 = r1.isDone();
        if (r1 != 0) goto L_0x00e6;
    L_0x00df:
        r1 = r2.f18788h;
        r2 = p000.jgz.class;
        r1.mo3557a(r2);
    L_0x00e6:
        throw r0;
    L_0x00e7:
        r0 = move-exception;
        r3 = r2.f18788h;	 Catch:{ all -> 0x010e }
        r3.m17780a(r0);	 Catch:{ all -> 0x010e }
        r0 = r2.f18788h;
        r0 = r0.isDone();
        if (r0 != 0) goto L_0x00be;
    L_0x00f5:
        r0 = r2.f18788h;
        r2 = p000.jgz.class;
        r0.mo3557a(r2);
        goto L_0x00be;
    L_0x00fd:
        r0 = move-exception;
        r1 = r2.f18788h;
        r1 = r1.isDone();
        if (r1 != 0) goto L_0x010d;
    L_0x0106:
        r1 = r2.f18788h;
        r2 = p000.jgz.class;
        r1.mo3557a(r2);
    L_0x010d:
        throw r0;
    L_0x010e:
        r0 = move-exception;
        r1 = r2.f18788h;
        r1 = r1.isDone();
        if (r1 != 0) goto L_0x011e;
    L_0x0117:
        r1 = r2.f18788h;
        r2 = p000.jgz.class;
        r1.mo3557a(r2);
    L_0x011e:
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: jhd.run():void");
    }
}
