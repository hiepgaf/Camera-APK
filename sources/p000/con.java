package p000;

import java.io.File;
import java.io.OutputStream;

/* compiled from: PG */
/* renamed from: con */
final class con extends izy {
    /* renamed from: a */
    private final /* synthetic */ File f20756a;
    /* renamed from: b */
    private final /* synthetic */ int f20757b;
    /* renamed from: c */
    private final /* synthetic */ com f20758c;

    /* renamed from: a */
    private static /* synthetic */ void m15130a(Throwable th, jqr jqr) {
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
    private static /* synthetic */ void m15129a(Throwable th, OutputStream outputStream) {
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

    con(com com, File file, int i) {
        this.f20758c = com;
        this.f20756a = file;
        this.f20757b = i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void a_(java.lang.Object r7) {
        /*
        r6 = this;
        r5 = 0;
        r7 = (p000.jqs) r7;
        r0 = r6.f20758c;
        r0 = r0.f12429j;
        r1 = r7.mo3173a(r0);
        r0 = r6.f20756a;	 Catch:{ all -> 0x0028 }
        r2 = p000.jqk.m13077a(r0);	 Catch:{ all -> 0x0028 }
        r0 = r1.mo3191e();	 Catch:{ all -> 0x0031 }
        r0 = (android.graphics.Bitmap) r0;	 Catch:{ all -> 0x0031 }
        r3 = android.graphics.Bitmap.CompressFormat.JPEG;	 Catch:{ all -> 0x0031 }
        r4 = r6.f20757b;	 Catch:{ all -> 0x0031 }
        r0.compress(r3, r4, r2);	 Catch:{ all -> 0x0031 }
        r0 = 0;
        p000.con.m15129a(r0, r2);	 Catch:{ all -> 0x0028 }
        if (r1 == 0) goto L_0x0027;
    L_0x0024:
        p000.con.m15130a(r5, r1);
    L_0x0027:
        return;
    L_0x0028:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x002a }
    L_0x002a:
        r2 = move-exception;
        if (r1 == 0) goto L_0x0030;
    L_0x002d:
        p000.con.m15130a(r0, r1);
    L_0x0030:
        throw r2;
    L_0x0031:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0033 }
    L_0x0033:
        r3 = move-exception;
        p000.con.m15129a(r0, r2);	 Catch:{ all -> 0x0028 }
        throw r3;	 Catch:{ all -> 0x0028 }
        */
        throw new UnsupportedOperationException("Method not decompiled: con.a_(java.lang.Object):void");
    }
}
