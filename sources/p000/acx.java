package p000;

import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* compiled from: PG */
/* renamed from: acx */
final class acx implements Closeable {
    /* renamed from: a */
    public final Charset f283a;
    /* renamed from: b */
    public int f284b;
    /* renamed from: c */
    private final InputStream f285c;
    /* renamed from: d */
    private byte[] f286d;
    /* renamed from: e */
    private int f287e;

    private acx(InputStream inputStream, Charset charset) {
        if (inputStream == null || charset == null) {
            throw new NullPointerException();
        } else if (charset.equals(acz.f289a)) {
            this.f285c = inputStream;
            this.f283a = charset;
            this.f286d = new byte[8192];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }

    public acx(InputStream inputStream, Charset charset, byte b) {
        this(inputStream, charset);
    }

    public final void close() {
        synchronized (this.f285c) {
            if (this.f286d != null) {
                this.f286d = null;
                this.f285c.close();
            }
        }
    }

    /* renamed from: b */
    private final void m143b() {
        InputStream inputStream = this.f285c;
        byte[] bArr = this.f286d;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read == -1) {
            throw new EOFException();
        }
        this.f287e = 0;
        this.f284b = read;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final java.lang.String m144a() {
        /*
        r7 = this;
        r5 = 10;
        r3 = r7.f285c;
        monitor-enter(r3);
        r0 = r7.f286d;	 Catch:{ all -> 0x0011 }
        if (r0 != 0) goto L_0x0014;
    L_0x0009:
        r0 = new java.io.IOException;	 Catch:{ all -> 0x0011 }
        r1 = "LineReader is closed";
        r0.<init>(r1);	 Catch:{ all -> 0x0011 }
        throw r0;	 Catch:{ all -> 0x0011 }
    L_0x0011:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0011 }
        throw r0;
    L_0x0014:
        r0 = r7.f287e;	 Catch:{ all -> 0x0011 }
        r1 = r7.f284b;	 Catch:{ all -> 0x0011 }
        if (r0 < r1) goto L_0x001d;
    L_0x001a:
        r7.m143b();	 Catch:{ all -> 0x0011 }
    L_0x001d:
        r2 = r7.f287e;	 Catch:{ all -> 0x0011 }
    L_0x001f:
        r0 = r7.f284b;	 Catch:{ all -> 0x0011 }
        if (r2 == r0) goto L_0x004f;
    L_0x0023:
        r4 = r7.f286d;	 Catch:{ all -> 0x0011 }
        r0 = r4[r2];	 Catch:{ all -> 0x0011 }
        if (r0 == r5) goto L_0x002c;
    L_0x0029:
        r2 = r2 + 1;
        goto L_0x001f;
    L_0x002c:
        r5 = r7.f287e;	 Catch:{ all -> 0x0011 }
        if (r2 == r5) goto L_0x004d;
    L_0x0030:
        r0 = r2 + -1;
        r1 = r4[r0];	 Catch:{ all -> 0x0011 }
        r6 = 13;
        if (r1 == r6) goto L_0x004b;
    L_0x0038:
        r1 = r2;
    L_0x0039:
        r0 = new java.lang.String;	 Catch:{ all -> 0x0011 }
        r1 = r1 - r5;
        r6 = r7.f283a;	 Catch:{ all -> 0x0011 }
        r6 = r6.name();	 Catch:{ all -> 0x0011 }
        r0.<init>(r4, r5, r1, r6);	 Catch:{ all -> 0x0011 }
        r1 = r2 + 1;
        r7.f287e = r1;	 Catch:{ all -> 0x0011 }
        monitor-exit(r3);	 Catch:{ all -> 0x0011 }
    L_0x004a:
        return r0;
    L_0x004b:
        r1 = r0;
        goto L_0x0039;
    L_0x004d:
        r1 = r2;
        goto L_0x0039;
    L_0x004f:
        r1 = new acy;	 Catch:{ all -> 0x0011 }
        r2 = r7.f287e;	 Catch:{ all -> 0x0011 }
        r0 = r0 - r2;
        r0 = r0 + 80;
        r1.<init>(r7, r0);	 Catch:{ all -> 0x0011 }
    L_0x0059:
        r0 = r7.f286d;	 Catch:{ all -> 0x0011 }
        r2 = r7.f287e;	 Catch:{ all -> 0x0011 }
        r4 = r7.f284b;	 Catch:{ all -> 0x0011 }
        r4 = r4 - r2;
        r1.write(r0, r2, r4);	 Catch:{ all -> 0x0011 }
        r0 = -1;
        r7.f284b = r0;	 Catch:{ all -> 0x0011 }
        r7.m143b();	 Catch:{ all -> 0x0011 }
        r0 = r7.f287e;	 Catch:{ all -> 0x0011 }
    L_0x006b:
        r2 = r7.f284b;	 Catch:{ all -> 0x0011 }
        if (r0 == r2) goto L_0x0059;
    L_0x006f:
        r2 = r7.f286d;	 Catch:{ all -> 0x0011 }
        r4 = r2[r0];	 Catch:{ all -> 0x0011 }
        if (r4 == r5) goto L_0x0078;
    L_0x0075:
        r0 = r0 + 1;
        goto L_0x006b;
    L_0x0078:
        r4 = r7.f287e;	 Catch:{ all -> 0x0011 }
        if (r0 == r4) goto L_0x0081;
    L_0x007c:
        r5 = r0 - r4;
        r1.write(r2, r4, r5);	 Catch:{ all -> 0x0011 }
    L_0x0081:
        r0 = r0 + 1;
        r7.f287e = r0;	 Catch:{ all -> 0x0011 }
        r0 = r1.toString();	 Catch:{ all -> 0x0011 }
        monitor-exit(r3);	 Catch:{ all -> 0x0011 }
        goto L_0x004a;
        */
        throw new UnsupportedOperationException("Method not decompiled: acx.a():java.lang.String");
    }
}
