package p000;

import com.google.googlex.gcam.DngColorCalibration.Illuminant;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* renamed from: amw */
public final class amw extends FilterInputStream {
    /* renamed from: a */
    private volatile byte[] f543a;
    /* renamed from: b */
    private int f544b;
    /* renamed from: c */
    private int f545c;
    /* renamed from: d */
    private int f546d;
    /* renamed from: e */
    private int f547e;
    /* renamed from: f */
    private final agu f548f;

    public amw(InputStream inputStream, agu agu) {
        this(inputStream, agu, (byte) 0);
    }

    private amw(InputStream inputStream, agu agu, byte b) {
        super(inputStream);
        this.f546d = -1;
        this.f548f = agu;
        this.f543a = (byte[]) agu.m258a(65536, byte[].class);
    }

    public final synchronized int available() {
        InputStream inputStream;
        inputStream = this.in;
        if (this.f543a == null || inputStream == null) {
            throw amw.m359c();
        }
        return inputStream.available() + (this.f544b - this.f547e);
    }

    public final void close() {
        if (this.f543a != null) {
            this.f548f.m262a(this.f543a);
            this.f543a = null;
        }
        InputStream inputStream = this.in;
        this.in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    /* renamed from: a */
    private final int m358a(InputStream inputStream, byte[] bArr) {
        int i;
        int i2 = this.f546d;
        if (i2 != -1) {
            int i3 = this.f547e;
            i = this.f545c;
            if (i3 - i2 < i) {
                if (i2 == 0) {
                    i3 = bArr.length;
                    if (i > i3 && this.f544b == i3) {
                        i2 = i3 + i3;
                        if (i2 <= i) {
                            i = i2;
                        }
                        byte[] bArr2 = (byte[]) this.f548f.m258a(i, byte[].class);
                        System.arraycopy(bArr, 0, bArr2, 0, i3);
                        this.f543a = bArr2;
                        this.f548f.m262a((Object) bArr);
                        bArr = bArr2;
                        this.f547e -= this.f546d;
                        this.f546d = 0;
                        this.f544b = 0;
                        i = this.f547e;
                        i2 = inputStream.read(bArr, i, bArr.length - i);
                        if (i2 <= 0) {
                            i = this.f547e + i2;
                        } else {
                            i = this.f547e;
                        }
                        this.f544b = i;
                        return i2;
                    }
                }
                if (i2 > 0) {
                    System.arraycopy(bArr, i2, bArr, 0, bArr.length - i2);
                }
                this.f547e -= this.f546d;
                this.f546d = 0;
                this.f544b = 0;
                i = this.f547e;
                i2 = inputStream.read(bArr, i, bArr.length - i);
                if (i2 <= 0) {
                    i = this.f547e;
                } else {
                    i = this.f547e + i2;
                }
                this.f544b = i;
                return i2;
            }
        }
        i = inputStream.read(bArr);
        if (i <= 0) {
            return i;
        }
        this.f546d = -1;
        this.f547e = 0;
        this.f544b = i;
        return i;
    }

    /* renamed from: a */
    public final synchronized void m360a() {
        this.f545c = this.f543a.length;
    }

    public final synchronized void mark(int i) {
        this.f545c = Math.max(this.f545c, i);
        this.f546d = this.f547e;
    }

    public final boolean markSupported() {
        return true;
    }

    public final synchronized int read() {
        int i = -1;
        synchronized (this) {
            byte[] bArr = this.f543a;
            InputStream inputStream = this.in;
            if (bArr == null || inputStream == null) {
                throw amw.m359c();
            }
            if (this.f547e < this.f544b || m358a(inputStream, bArr) != -1) {
                if (bArr != this.f543a) {
                    bArr = this.f543a;
                    if (bArr == null) {
                        throw amw.m359c();
                    }
                }
                int i2 = this.f544b;
                int i3 = this.f547e;
                if (i2 - i3 > 0) {
                    this.f547e = i3 + 1;
                    i = bArr[i3] & Illuminant.kOther;
                }
            }
        }
        return i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int read(byte[] r8, int r9, int r10) {
        /*
        r7 = this;
        r1 = -1;
        monitor-enter(r7);
        r3 = r7.f543a;	 Catch:{ all -> 0x000b }
        if (r3 != 0) goto L_0x000e;
    L_0x0006:
        r0 = p000.amw.m359c();	 Catch:{ all -> 0x000b }
        throw r0;	 Catch:{ all -> 0x000b }
    L_0x000b:
        r0 = move-exception;
        monitor-exit(r7);
        throw r0;
    L_0x000e:
        if (r10 != 0) goto L_0x0013;
    L_0x0010:
        r10 = 0;
    L_0x0011:
        monitor-exit(r7);
        return r10;
    L_0x0013:
        r4 = r7.in;	 Catch:{ all -> 0x000b }
        if (r4 != 0) goto L_0x001c;
    L_0x0017:
        r0 = p000.amw.m359c();	 Catch:{ all -> 0x000b }
        throw r0;	 Catch:{ all -> 0x000b }
    L_0x001c:
        r2 = r7.f547e;	 Catch:{ all -> 0x000b }
        r0 = r7.f544b;	 Catch:{ all -> 0x000b }
        if (r2 >= r0) goto L_0x0084;
    L_0x0022:
        r0 = r0 - r2;
        if (r0 < r10) goto L_0x0026;
    L_0x0025:
        r0 = r10;
    L_0x0026:
        java.lang.System.arraycopy(r3, r2, r8, r9, r0);	 Catch:{ all -> 0x000b }
        r2 = r7.f547e;	 Catch:{ all -> 0x000b }
        r2 = r2 + r0;
        r7.f547e = r2;	 Catch:{ all -> 0x000b }
        if (r0 == r10) goto L_0x0036;
    L_0x0030:
        r2 = r4.available();	 Catch:{ all -> 0x000b }
        if (r2 != 0) goto L_0x0038;
    L_0x0036:
        r10 = r0;
        goto L_0x0011;
    L_0x0038:
        r9 = r9 + r0;
        r2 = r10 - r0;
        r0 = r3;
    L_0x003c:
        r3 = r7.f546d;	 Catch:{ all -> 0x000b }
        if (r3 != r1) goto L_0x006e;
    L_0x0040:
        r3 = r0.length;	 Catch:{ all -> 0x000b }
        if (r2 < r3) goto L_0x006e;
    L_0x0043:
        r3 = r4.read(r8, r9, r2);	 Catch:{ all -> 0x000b }
        if (r3 != r1) goto L_0x008c;
    L_0x0049:
        if (r2 == r10) goto L_0x004d;
    L_0x004b:
        r10 = r10 - r2;
        goto L_0x0011;
    L_0x004d:
        r10 = r1;
        goto L_0x0011;
    L_0x004f:
        r3 = r0;
    L_0x0050:
        r0 = r7.f544b;	 Catch:{ all -> 0x000b }
        r5 = r7.f547e;	 Catch:{ all -> 0x000b }
        r0 = r0 - r5;
        if (r0 < r2) goto L_0x0058;
    L_0x0057:
        r0 = r2;
    L_0x0058:
        java.lang.System.arraycopy(r3, r5, r8, r9, r0);	 Catch:{ all -> 0x000b }
        r5 = r7.f547e;	 Catch:{ all -> 0x000b }
        r5 = r5 + r0;
        r7.f547e = r5;	 Catch:{ all -> 0x000b }
    L_0x0060:
        r2 = r2 - r0;
        if (r2 == 0) goto L_0x0011;
    L_0x0063:
        r5 = r4.available();	 Catch:{ all -> 0x000b }
        if (r5 != 0) goto L_0x006b;
    L_0x0069:
        r10 = r10 - r2;
        goto L_0x0011;
    L_0x006b:
        r9 = r9 + r0;
        r0 = r3;
        goto L_0x003c;
    L_0x006e:
        r3 = r7.m358a(r4, r0);	 Catch:{ all -> 0x000b }
        if (r3 != r1) goto L_0x007a;
    L_0x0074:
        if (r2 == r10) goto L_0x0078;
    L_0x0076:
        r10 = r10 - r2;
        goto L_0x0011;
    L_0x0078:
        r10 = r1;
        goto L_0x0011;
    L_0x007a:
        r3 = r7.f543a;	 Catch:{ all -> 0x000b }
        if (r0 == r3) goto L_0x004f;
    L_0x007e:
        r0 = r7.f543a;	 Catch:{ all -> 0x000b }
        if (r0 == 0) goto L_0x0087;
    L_0x0082:
        r3 = r0;
        goto L_0x0050;
    L_0x0084:
        r2 = r10;
        r0 = r3;
        goto L_0x003c;
    L_0x0087:
        r0 = p000.amw.m359c();	 Catch:{ all -> 0x000b }
        throw r0;	 Catch:{ all -> 0x000b }
    L_0x008c:
        r6 = r3;
        r3 = r0;
        r0 = r6;
        goto L_0x0060;
        */
        throw new UnsupportedOperationException("Method not decompiled: amw.read(byte[], int, int):int");
    }

    /* renamed from: b */
    public final synchronized void m361b() {
        if (this.f543a != null) {
            this.f548f.m262a(this.f543a);
            this.f543a = null;
        }
    }

    public final synchronized void reset() {
        if (this.f543a == null) {
            throw new IOException("Stream is closed");
        }
        int i = this.f546d;
        if (i == -1) {
            int i2 = this.f547e;
            int i3 = this.f545c;
            StringBuilder stringBuilder = new StringBuilder(66);
            stringBuilder.append("Mark has been invalidated, pos: ");
            stringBuilder.append(i2);
            stringBuilder.append(" markLimit: ");
            stringBuilder.append(i3);
            throw new amx(stringBuilder.toString());
        }
        this.f547e = i;
    }

    public final synchronized long skip(long j) {
        if (j < 1) {
            j = 0;
        } else {
            byte[] bArr = this.f543a;
            if (bArr == null) {
                throw amw.m359c();
            }
            InputStream inputStream = this.in;
            if (inputStream == null) {
                throw amw.m359c();
            }
            int i = this.f544b;
            int i2 = this.f547e;
            if (((long) (i - i2)) >= j) {
                this.f547e = (int) (((long) i2) + j);
            } else {
                long j2 = ((long) i) - ((long) i2);
                this.f547e = i;
                if (this.f546d == -1 || j > ((long) this.f545c)) {
                    j = j2 + inputStream.skip(j - j2);
                } else if (m358a(inputStream, bArr) == -1) {
                    j = j2;
                } else {
                    int i3 = this.f544b;
                    int i4 = this.f547e;
                    if (((long) (i3 - i4)) >= j - j2) {
                        this.f547e = (int) ((((long) i4) + j) - j2);
                    } else {
                        this.f547e = i3;
                        j = (j2 + ((long) i3)) - ((long) i4);
                    }
                }
            }
        }
        return j;
    }

    /* renamed from: c */
    private static IOException m359c() {
        throw new IOException("BufferedInputStream is closed");
    }
}
