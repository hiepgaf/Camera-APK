package p000;

import android.annotation.TargetApi;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

@TargetApi(23)
/* compiled from: PG */
/* renamed from: ful */
public final class ful implements fue {
    /* renamed from: a */
    public final iqz f16533a;
    /* renamed from: b */
    public final ftp f16534b;
    /* renamed from: c */
    public final bmh f16535c;
    /* renamed from: d */
    private final Executor f16536d;

    /* renamed from: a */
    static /* synthetic */ void m10775a(Throwable th, OutputStream outputStream) {
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

    /* renamed from: a */
    static /* synthetic */ void m10776a(Throwable th, PrintStream printStream) {
        if (th != null) {
            try {
                printStream.close();
                return;
            } catch (Throwable th2) {
                kqg.m5044a(th, th2);
                return;
            }
        }
        printStream.close();
    }

    ful(ira ira, fuf fuf, bmh bmh) {
        this(ira, fuf, bmh, Executors.newCachedThreadPool(iel.m3722d("TuneIoEx", 0)));
    }

    private ful(ira ira, fuf fuf, bmh bmh, Executor executor) {
        this.f16535c = bmh;
        this.f16533a = ira.mo511a("TuningDataCollector");
        this.f16536d = executor;
        this.f16534b = new ftp("tuning");
    }

    /* renamed from: a */
    public final void mo1424a(fub fub) {
        this.f16536d.execute(new fum(this, fub));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    final void m10778a(p000.kbg r4, java.lang.String r5, java.lang.String r6) {
        /*
        r3 = this;
        r0 = r4.mo2084b();
        if (r0 == 0) goto L_0x0019;
    L_0x0006:
        r0 = r3.f16534b;	 Catch:{ IOException -> 0x001a }
        r1 = r0.m2385a(r5, r6);	 Catch:{ IOException -> 0x001a }
        r0 = r4.mo2081a();	 Catch:{ all -> 0x0021 }
        r0 = (byte[]) r0;	 Catch:{ all -> 0x0021 }
        r1.write(r0);	 Catch:{ all -> 0x0021 }
        r0 = 0;
        p000.ful.m10775a(r0, r1);	 Catch:{ IOException -> 0x001a }
    L_0x0019:
        return;
    L_0x001a:
        r0 = move-exception;
        r1 = new java.lang.RuntimeException;
        r1.<init>(r0);
        throw r1;
    L_0x0021:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0023 }
    L_0x0023:
        r2 = move-exception;
        p000.ful.m10775a(r0, r1);	 Catch:{ IOException -> 0x001a }
        throw r2;	 Catch:{ IOException -> 0x001a }
        */
        throw new UnsupportedOperationException("Method not decompiled: ful.a(kbg, java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    final void m10779a(kpk kpk, String str) {
        kow.m13622a(kpk, new fun(this, str), kpq.f8410a);
    }
}
