package p000;

/* compiled from: PG */
/* renamed from: jju */
final class jju extends izy {
    /* renamed from: a */
    private final jkq f21862a;
    /* renamed from: b */
    private final /* synthetic */ jjs f21863b;

    public jju(jjs jjs, jkq jkq) {
        this.f21863b = jjs;
        this.f21862a = jkq;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void a_(java.lang.Object r12) {
        /*
        r11 = this;
        r12 = (p000.jqs) r12;
        p000.jri.m13152b(r12);
        r0 = r11.f21862a;
        r0 = r0.f7894a;
        r0 = r0.f7868c;
        r1 = r11.f21863b;
        r1 = r1.f18862b;
        r0 = (float) r0;
        r0 = r0 * r1;
        r0 = java.lang.Math.round(r0);
        r1 = r11.f21862a;
        r1 = r1.f7894a;
        r1 = r1.f7869d;
        r2 = r11.f21863b;
        r2 = r2.f18862b;
        r1 = (float) r1;
        r1 = r1 * r2;
        r1 = java.lang.Math.round(r1);
        r0 = p000.jzp.m4713a(r0, r1);
        r1 = p000.jzp.m4714a(r12);
        r0 = com.google.android.libraries.smartburst.utils.MathUtils.fitSizeAround(r1, r0);
        r1 = r0.f8149a;
        r0 = r0.f8150b;
        r2 = r11.f21863b;
        r2 = r2.f18863c;
        r2 = r12.mo3171a(r1, r0, r2);
        r0 = r11.f21862a;	 Catch:{ all -> 0x00c2 }
        r3 = r0.f7896c;	 Catch:{ all -> 0x00c2 }
        r4 = r0.f7897d;	 Catch:{ all -> 0x00c2 }
        r0 = r11.f21863b;	 Catch:{ all -> 0x00c2 }
        r5 = r0.f18864d;	 Catch:{ all -> 0x00c2 }
        monitor-enter(r5);	 Catch:{ all -> 0x00c2 }
        r0 = r2.mo3191e();	 Catch:{ all -> 0x00cb }
        r0 = (android.graphics.Bitmap) r0;	 Catch:{ all -> 0x00cb }
        r1 = r11.f21863b;	 Catch:{ all -> 0x00cb }
        r1 = r1.f18864d;	 Catch:{ all -> 0x00cb }
        r1 = r1.mo3191e();	 Catch:{ all -> 0x00cb }
        r1 = (android.graphics.Bitmap) r1;	 Catch:{ all -> 0x00cb }
        r6 = new android.graphics.Rect;	 Catch:{ all -> 0x00cb }
        r7 = r3.left;	 Catch:{ all -> 0x00cb }
        r8 = r0.getWidth();	 Catch:{ all -> 0x00cb }
        r8 = (float) r8;	 Catch:{ all -> 0x00cb }
        r7 = r7 * r8;
        r7 = (int) r7;	 Catch:{ all -> 0x00cb }
        r8 = r3.top;	 Catch:{ all -> 0x00cb }
        r9 = r0.getHeight();	 Catch:{ all -> 0x00cb }
        r9 = (float) r9;	 Catch:{ all -> 0x00cb }
        r8 = r8 * r9;
        r8 = (int) r8;	 Catch:{ all -> 0x00cb }
        r9 = r3.right;	 Catch:{ all -> 0x00cb }
        r10 = r0.getWidth();	 Catch:{ all -> 0x00cb }
        r10 = (float) r10;	 Catch:{ all -> 0x00cb }
        r9 = r9 * r10;
        r9 = (int) r9;	 Catch:{ all -> 0x00cb }
        r3 = r3.bottom;	 Catch:{ all -> 0x00cb }
        r10 = r0.getHeight();	 Catch:{ all -> 0x00cb }
        r10 = (float) r10;	 Catch:{ all -> 0x00cb }
        r3 = r3 * r10;
        r3 = (int) r3;	 Catch:{ all -> 0x00cb }
        r6.<init>(r7, r8, r9, r3);	 Catch:{ all -> 0x00cb }
        r3 = new android.graphics.Rect;	 Catch:{ all -> 0x00cb }
        r7 = r4.left;	 Catch:{ all -> 0x00cb }
        r8 = r1.getWidth();	 Catch:{ all -> 0x00cb }
        r8 = (float) r8;	 Catch:{ all -> 0x00cb }
        r7 = r7 * r8;
        r7 = (int) r7;	 Catch:{ all -> 0x00cb }
        r8 = r4.top;	 Catch:{ all -> 0x00cb }
        r9 = r1.getHeight();	 Catch:{ all -> 0x00cb }
        r9 = (float) r9;	 Catch:{ all -> 0x00cb }
        r8 = r8 * r9;
        r8 = (int) r8;	 Catch:{ all -> 0x00cb }
        r9 = r4.right;	 Catch:{ all -> 0x00cb }
        r10 = r1.getWidth();	 Catch:{ all -> 0x00cb }
        r10 = (float) r10;	 Catch:{ all -> 0x00cb }
        r9 = r9 * r10;
        r9 = (int) r9;	 Catch:{ all -> 0x00cb }
        r4 = r4.bottom;	 Catch:{ all -> 0x00cb }
        r10 = r1.getHeight();	 Catch:{ all -> 0x00cb }
        r10 = (float) r10;	 Catch:{ all -> 0x00cb }
        r4 = r4 * r10;
        r4 = (int) r4;	 Catch:{ all -> 0x00cb }
        r3.<init>(r7, r8, r9, r4);	 Catch:{ all -> 0x00cb }
        r4 = new android.graphics.Canvas;	 Catch:{ all -> 0x00cb }
        r4.<init>(r1);	 Catch:{ all -> 0x00cb }
        r1 = new android.graphics.Paint;	 Catch:{ all -> 0x00cb }
        r1.<init>();	 Catch:{ all -> 0x00cb }
        r7 = 1;
        r1.setFilterBitmap(r7);	 Catch:{ all -> 0x00cb }
        r4.drawBitmap(r0, r6, r3, r1);	 Catch:{ all -> 0x00cb }
        monitor-exit(r5);	 Catch:{ all -> 0x00cb }
        if (r2 == 0) goto L_0x00c1;
    L_0x00be:
        r2.close();
    L_0x00c1:
        return;
    L_0x00c2:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00c4 }
    L_0x00c4:
        r1 = move-exception;
        if (r2 == 0) goto L_0x00ca;
    L_0x00c7:
        r2.close();	 Catch:{ all -> 0x00ce }
    L_0x00ca:
        throw r1;
    L_0x00cb:
        r0 = move-exception;
        monitor-exit(r5);	 Catch:{ all -> 0x00cb }
        throw r0;	 Catch:{ all -> 0x00c2 }
    L_0x00ce:
        r2 = move-exception;
        p000.kqg.m5044a(r0, r2);
        goto L_0x00ca;
        */
        throw new UnsupportedOperationException("Method not decompiled: jju.a_(java.lang.Object):void");
    }
}
