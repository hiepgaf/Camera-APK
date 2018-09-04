package p000;

import java.io.OutputStream;

/* compiled from: PG */
/* renamed from: jks */
final class jks implements izi {
    /* renamed from: a */
    private final jqo f18898a;
    /* renamed from: b */
    private final jxo f18899b;
    /* renamed from: c */
    private final jxp f18900c;

    /* renamed from: a */
    private static /* synthetic */ void m12912a(Throwable th, jqr jqr) {
        if (th != null) {
            try {
                jqr.close();
                return;
            } catch (Throwable th2) {
                kqg.m5044a(th, th2);
                return;
            }
        }
        jqr.close();
    }

    /* renamed from: a */
    private static /* synthetic */ void m12911a(Throwable th, OutputStream outputStream) {
        if (th != null) {
            try {
                outputStream.close();
                return;
            } catch (Throwable th2) {
                kqg.m5044a(th, th2);
                return;
            }
        }
        outputStream.close();
    }

    public jks(jqo jqo, jxo jxo, jxp jxp) {
        this.f18898a = jqo;
        this.f18899b = jxo;
        this.f18900c = jxp;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private final p000.jxp m12910a(p000.jqs r7) {
        /*
        r6 = this;
        r5 = 0;
        p000.jri.m13152b(r7);
        r0 = r6.f18898a;
        r1 = r7.mo3173a(r0);
        r0 = r1.mo3191e();	 Catch:{ all -> 0x002d }
        r0 = (android.graphics.Bitmap) r0;	 Catch:{ all -> 0x002d }
        r2 = r6.f18899b;	 Catch:{ IOException -> 0x0036 }
        r3 = r6.f18900c;	 Catch:{ IOException -> 0x0036 }
        r2 = r2.mo427a(r3);	 Catch:{ IOException -> 0x0036 }
        r3 = android.graphics.Bitmap.CompressFormat.JPEG;	 Catch:{ all -> 0x003f }
        r4 = 80;
        r0.compress(r3, r4, r2);	 Catch:{ all -> 0x003f }
        if (r2 == 0) goto L_0x0025;
    L_0x0021:
        r0 = 0;
        p000.jks.m12911a(r0, r2);	 Catch:{ IOException -> 0x0036 }
    L_0x0025:
        if (r1 == 0) goto L_0x002a;
    L_0x0027:
        p000.jks.m12912a(r5, r1);
    L_0x002a:
        r0 = r6.f18900c;
        return r0;
    L_0x002d:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x002f }
    L_0x002f:
        r2 = move-exception;
        if (r1 == 0) goto L_0x0035;
    L_0x0032:
        p000.jks.m12912a(r0, r1);
    L_0x0035:
        throw r2;
    L_0x0036:
        r0 = move-exception;
        r2 = new java.lang.RuntimeException;	 Catch:{ all -> 0x002d }
        r3 = "Could not compress bitmap";
        r2.<init>(r3, r0);	 Catch:{ all -> 0x002d }
        throw r2;	 Catch:{ all -> 0x002d }
    L_0x003f:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0041 }
    L_0x0041:
        r3 = move-exception;
        if (r2 == 0) goto L_0x0047;
    L_0x0044:
        p000.jks.m12911a(r0, r2);	 Catch:{ IOException -> 0x0036 }
    L_0x0047:
        throw r3;	 Catch:{ IOException -> 0x0036 }
        */
        throw new UnsupportedOperationException("Method not decompiled: jks.a(jqs):jxp");
    }
}
