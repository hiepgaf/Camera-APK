package p000;

import java.io.OutputStream;

/* compiled from: PG */
/* renamed from: jki */
final class jki extends izy {
    /* renamed from: a */
    private final OutputStream f21874a;

    public jki(OutputStream outputStream) {
        this.f21874a = outputStream;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void a_(java.lang.Object r6) {
        /*
        r5 = this;
        r6 = (java.util.List) r6;
        r2 = r5.f21874a;	 Catch:{ IOException -> 0x002a }
        p000.jri.m13152b(r6);	 Catch:{ all -> 0x0033 }
        p000.jri.m13152b(r2);	 Catch:{ all -> 0x0033 }
        r0 = 0;
        r1 = r0;
    L_0x000c:
        r0 = r6.size();	 Catch:{ all -> 0x0033 }
        if (r1 >= r0) goto L_0x0021;
    L_0x0012:
        r0 = r6.get(r1);	 Catch:{ all -> 0x0033 }
        r0 = (byte[]) r0;	 Catch:{ all -> 0x0033 }
        if (r0 == 0) goto L_0x003c;
    L_0x001a:
        r2.write(r0);	 Catch:{ all -> 0x0033 }
        r0 = r1 + 1;
        r1 = r0;
        goto L_0x000c;
    L_0x0021:
        r2.flush();	 Catch:{ all -> 0x0033 }
        if (r2 == 0) goto L_0x0029;
    L_0x0026:
        r2.close();	 Catch:{ IOException -> 0x002a }
    L_0x0029:
        return;
    L_0x002a:
        r0 = move-exception;
        r1 = new java.lang.RuntimeException;
        r2 = "Could not encode GIF data";
        r1.<init>(r2, r0);
        throw r1;
    L_0x0033:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0035 }
    L_0x0035:
        r1 = move-exception;
        if (r2 == 0) goto L_0x003b;
    L_0x0038:
        r2.close();	 Catch:{ all -> 0x005a }
    L_0x003b:
        throw r1;	 Catch:{ IOException -> 0x002a }
    L_0x003c:
        r0 = new java.lang.RuntimeException;	 Catch:{ all -> 0x0033 }
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0033 }
        r4 = 34;
        r3.<init>(r4);	 Catch:{ all -> 0x0033 }
        r4 = "Encoded frame ";
        r3.append(r4);	 Catch:{ all -> 0x0033 }
        r3.append(r1);	 Catch:{ all -> 0x0033 }
        r1 = " is null.";
        r3.append(r1);	 Catch:{ all -> 0x0033 }
        r1 = r3.toString();	 Catch:{ all -> 0x0033 }
        r0.<init>(r1);	 Catch:{ all -> 0x0033 }
        throw r0;	 Catch:{ all -> 0x0033 }
    L_0x005a:
        r2 = move-exception;
        p000.kqg.m5044a(r0, r2);	 Catch:{ IOException -> 0x002a }
        goto L_0x003b;
        */
        throw new UnsupportedOperationException("Method not decompiled: jki.a_(java.lang.Object):void");
    }
}
