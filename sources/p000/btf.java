package p000;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

/* compiled from: PG */
/* renamed from: btf */
public final class btf implements kwk {
    /* renamed from: a */
    private final File f11245a;
    /* renamed from: b */
    private final String f11246b;
    /* renamed from: c */
    private final iqz f11247c;
    /* renamed from: d */
    private final long f11248d = System.currentTimeMillis();
    /* renamed from: e */
    private boolean f11249e;

    /* renamed from: a */
    private static /* synthetic */ void m7728a(Throwable th, FileOutputStream fileOutputStream) {
        if (th != null) {
            try {
                fileOutputStream.close();
                return;
            } catch (Throwable th2) {
                kqg.m5044a(th, th2);
                return;
            }
        }
        fileOutputStream.close();
    }

    /* renamed from: a */
    private static /* synthetic */ void m7729a(Throwable th, OutputStreamWriter outputStreamWriter) {
        if (th != null) {
            try {
                outputStreamWriter.close();
                return;
            } catch (Throwable th2) {
                kqg.m5044a(th, th2);
                return;
            }
        }
        outputStreamWriter.close();
    }

    public btf(File file, String str, iqz iqz) {
        this.f11245a = file;
        this.f11246b = str;
        this.f11247c = iqz;
    }

    /* renamed from: b */
    public final synchronized void m7732b() {
        boolean z = true;
        synchronized (this) {
            if (!this.f11249e) {
                this.f11249e = true;
                if (this.f11245a.exists() && !this.f11245a.delete()) {
                    z = false;
                }
                jqk.m13095a(z);
            }
        }
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        throw new NoSuchMethodError();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final synchronized void m7731a(java.lang.String r9) {
        /*
        r8 = this;
        r0 = 0;
        r1 = 1;
        monitor-enter(r8);
        r2 = r8.f11249e;	 Catch:{ IOException -> 0x0056 }
        if (r2 != 0) goto L_0x0050;
    L_0x0007:
        r2 = java.lang.System.currentTimeMillis();	 Catch:{ IOException -> 0x0056 }
        r4 = r8.f11245a;	 Catch:{ IOException -> 0x0056 }
        r4 = r4.exists();	 Catch:{ IOException -> 0x0056 }
        if (r4 != 0) goto L_0x0054;
    L_0x0013:
        r4 = r8.f11245a;	 Catch:{ IOException -> 0x0056 }
        r4 = r4.createNewFile();	 Catch:{ IOException -> 0x0056 }
        if (r4 != 0) goto L_0x0052;
    L_0x001b:
        p000.jqk.m13095a(r0);	 Catch:{ IOException -> 0x0056 }
        r1 = new java.io.FileOutputStream;	 Catch:{ IOException -> 0x0056 }
        r0 = r8.f11245a;	 Catch:{ IOException -> 0x0056 }
        r4 = 1;
        r1.<init>(r0, r4);	 Catch:{ IOException -> 0x0056 }
        r4 = new java.io.OutputStreamWriter;	 Catch:{ all -> 0x008e }
        r4.<init>(r1);	 Catch:{ all -> 0x008e }
        r0 = "t+%-6s%s\n";
        r5 = 2;
        r5 = new java.lang.Object[r5];	 Catch:{ all -> 0x0095 }
        r6 = r8.f11248d;	 Catch:{ all -> 0x0095 }
        r2 = r2 - r6;
        r2 = java.lang.Long.valueOf(r2);	 Catch:{ all -> 0x0095 }
        r3 = 0;
        r5[r3] = r2;	 Catch:{ all -> 0x0095 }
        r2 = 1;
        r5[r2] = r9;	 Catch:{ all -> 0x0095 }
        r2 = 0;
        r0 = java.lang.String.format(r2, r0, r5);	 Catch:{ all -> 0x0095 }
        r4.write(r0);	 Catch:{ all -> 0x0095 }
        r4.flush();	 Catch:{ all -> 0x0095 }
        r0 = 0;
        p000.btf.m7729a(r0, r4);	 Catch:{ all -> 0x008e }
        r0 = 0;
        p000.btf.m7728a(r0, r1);	 Catch:{ IOException -> 0x0056 }
    L_0x0050:
        monitor-exit(r8);
        return;
    L_0x0052:
        r0 = r1;
        goto L_0x001b;
    L_0x0054:
        r0 = r1;
        goto L_0x001b;
    L_0x0056:
        r0 = move-exception;
        r1 = r8.f11247c;	 Catch:{ all -> 0x008b }
        r2 = r8.f11246b;	 Catch:{ all -> 0x008b }
        r3 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x008b }
        r3 = r3.length();	 Catch:{ all -> 0x008b }
        r4 = java.lang.String.valueOf(r9);	 Catch:{ all -> 0x008b }
        r4 = r4.length();	 Catch:{ all -> 0x008b }
        r5 = new java.lang.StringBuilder;	 Catch:{ all -> 0x008b }
        r3 = r3 + 41;
        r3 = r3 + r4;
        r5.<init>(r3);	 Catch:{ all -> 0x008b }
        r3 = "Failed to log message to file for shot ";
        r5.append(r3);	 Catch:{ all -> 0x008b }
        r5.append(r2);	 Catch:{ all -> 0x008b }
        r2 = ": ";
        r5.append(r2);	 Catch:{ all -> 0x008b }
        r5.append(r9);	 Catch:{ all -> 0x008b }
        r2 = r5.toString();	 Catch:{ all -> 0x008b }
        r1.mo517c(r2, r0);	 Catch:{ all -> 0x008b }
        goto L_0x0050;
    L_0x008b:
        r0 = move-exception;
        monitor-exit(r8);
        throw r0;
    L_0x008e:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0090 }
    L_0x0090:
        r2 = move-exception;
        p000.btf.m7728a(r0, r1);	 Catch:{ IOException -> 0x0056 }
        throw r2;	 Catch:{ IOException -> 0x0056 }
    L_0x0095:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0097 }
    L_0x0097:
        r2 = move-exception;
        p000.btf.m7729a(r0, r4);	 Catch:{ all -> 0x008e }
        throw r2;	 Catch:{ all -> 0x008e }
        */
        throw new UnsupportedOperationException("Method not decompiled: btf.a(java.lang.String):void");
    }
}
