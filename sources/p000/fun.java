package p000;

import java.io.OutputStream;

/* compiled from: PG */
/* renamed from: fun */
final class fun implements kov {
    /* renamed from: a */
    private final /* synthetic */ String f16537a;
    /* renamed from: b */
    private final /* synthetic */ ful f16538b;

    /* renamed from: a */
    private static /* synthetic */ void m10780a(Throwable th, OutputStream outputStream) {
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

    fun(ful ful, String str) {
        this.f16538b = ful;
        this.f16537a = str;
    }

    /* renamed from: a */
    public final void mo349a(Throwable th) {
        this.f16538b.f16533a.mo515b("Failed to write TotalCaptureResult", th);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void b_(java.lang.Object r8) {
        /*
        r7 = this;
        r2 = 0;
        r8 = (p000.iwp) r8;
        p000.jri.m13152b(r8);	 Catch:{ RuntimeException -> 0x006a }
        r0 = p000.fuf.m2395a(r8);	 Catch:{ RuntimeException -> 0x006a }
        if (r0 != 0) goto L_0x00ad;
    L_0x000c:
        r3 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x006a }
        r3.<init>();	 Catch:{ RuntimeException -> 0x006a }
        r0 = "{";
        r3.append(r0);	 Catch:{ RuntimeException -> 0x006a }
        r0 = 10;
        r3.append(r0);	 Catch:{ RuntimeException -> 0x006a }
        r0 = r8.mo3145c();	 Catch:{ RuntimeException -> 0x006a }
        r4 = r0.iterator();	 Catch:{ RuntimeException -> 0x006a }
        r1 = 1;
    L_0x0024:
        r0 = r4.hasNext();	 Catch:{ RuntimeException -> 0x006a }
        if (r0 == 0) goto L_0x0077;
    L_0x002a:
        r0 = r4.next();	 Catch:{ RuntimeException -> 0x006a }
        r0 = (android.hardware.camera2.CaptureResult.Key) r0;	 Catch:{ RuntimeException -> 0x006a }
        r5 = r8.mo3143a(r0);	 Catch:{ RuntimeException -> 0x006a }
        if (r5 == 0) goto L_0x0024;
    L_0x0036:
        if (r1 != 0) goto L_0x0075;
    L_0x0038:
        r6 = 44;
        r3.append(r6);	 Catch:{ RuntimeException -> 0x006a }
        r6 = 10;
        r3.append(r6);	 Catch:{ RuntimeException -> 0x006a }
    L_0x0042:
        r6 = 34;
        r3.append(r6);	 Catch:{ RuntimeException -> 0x006a }
        r0 = r0.getName();	 Catch:{ RuntimeException -> 0x006a }
        r3.append(r0);	 Catch:{ RuntimeException -> 0x006a }
        r0 = 34;
        r3.append(r0);	 Catch:{ RuntimeException -> 0x006a }
        r0 = " : ";
        r3.append(r0);	 Catch:{ RuntimeException -> 0x006a }
        r0 = 34;
        r3.append(r0);	 Catch:{ RuntimeException -> 0x006a }
        r0 = r5.toString();	 Catch:{ RuntimeException -> 0x006a }
        r3.append(r0);	 Catch:{ RuntimeException -> 0x006a }
        r0 = 34;
        r3.append(r0);	 Catch:{ RuntimeException -> 0x006a }
        goto L_0x0024;
    L_0x006a:
        r0 = move-exception;
        r1 = r7.f16538b;
        r1 = r1.f16533a;
        r2 = "Failed to write TotalCaptureResult";
        r1.mo515b(r2, r0);
    L_0x0074:
        return;
    L_0x0075:
        r1 = r2;
        goto L_0x0042;
    L_0x0077:
        r0 = "}";
        r3.append(r0);	 Catch:{ RuntimeException -> 0x006a }
        r0 = r3.toString();	 Catch:{ RuntimeException -> 0x006a }
        r1 = r7.f16538b;	 Catch:{ IOException -> 0x00a6 }
        r1 = r1.f16534b;	 Catch:{ IOException -> 0x00a6 }
        r2 = r7.f16537a;	 Catch:{ IOException -> 0x00a6 }
        r3 = "txt";
        r1 = r1.m2385a(r2, r3);	 Catch:{ IOException -> 0x00a6 }
        r2 = new java.io.PrintStream;	 Catch:{ all -> 0x00cc }
        r2.<init>(r1);	 Catch:{ all -> 0x00cc }
        r2.print(r0);	 Catch:{ all -> 0x00cc }
        r2.flush();	 Catch:{ all -> 0x00cc }
        r0 = r7.f16538b;	 Catch:{ all -> 0x00cc }
        r0 = r0.f16535c;	 Catch:{ all -> 0x00cc }
        r2 = "Saved metadata";
        r3 = 0;
        r0.m888a(r2, r3);	 Catch:{ all -> 0x00cc }
        r0 = 0;
        p000.fun.m10780a(r0, r1);	 Catch:{ IOException -> 0x00a6 }
        goto L_0x0074;
    L_0x00a6:
        r0 = move-exception;
        r1 = new java.lang.RuntimeException;	 Catch:{ RuntimeException -> 0x006a }
        r1.<init>(r0);	 Catch:{ RuntimeException -> 0x006a }
        throw r1;	 Catch:{ RuntimeException -> 0x006a }
    L_0x00ad:
        r1 = r7.f16538b;	 Catch:{ IOException -> 0x00c5 }
        r1 = r1.f16534b;	 Catch:{ IOException -> 0x00c5 }
        r3 = r7.f16537a;	 Catch:{ IOException -> 0x00c5 }
        r4 = "bin";
        r1 = r1.m2385a(r3, r4);	 Catch:{ IOException -> 0x00c5 }
        r1.write(r0);	 Catch:{ all -> 0x00d3 }
        r1.flush();	 Catch:{ all -> 0x00d3 }
        r0 = 0;
        p000.fun.m10780a(r0, r1);	 Catch:{ IOException -> 0x00c5 }
        goto L_0x000c;
    L_0x00c5:
        r0 = move-exception;
        r1 = new java.lang.RuntimeException;	 Catch:{ RuntimeException -> 0x006a }
        r1.<init>(r0);	 Catch:{ RuntimeException -> 0x006a }
        throw r1;	 Catch:{ RuntimeException -> 0x006a }
    L_0x00cc:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00ce }
    L_0x00ce:
        r2 = move-exception;
        p000.fun.m10780a(r0, r1);	 Catch:{ IOException -> 0x00a6 }
        throw r2;	 Catch:{ IOException -> 0x00a6 }
    L_0x00d3:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00d5 }
    L_0x00d5:
        r2 = move-exception;
        p000.fun.m10780a(r0, r1);	 Catch:{ IOException -> 0x00c5 }
        throw r2;	 Catch:{ IOException -> 0x00c5 }
        */
        throw new UnsupportedOperationException("Method not decompiled: fun.b_(java.lang.Object):void");
    }
}
