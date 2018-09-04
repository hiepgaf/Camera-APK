package p000;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* compiled from: PG */
/* renamed from: arl */
public final class arl extends InputStream {
    /* renamed from: b */
    private static final Queue f912b = arq.m652a(0);
    /* renamed from: a */
    public IOException f913a;
    /* renamed from: c */
    private InputStream f914c;

    arl() {
    }

    public final int available() {
        return this.f914c.available();
    }

    public final void close() {
        this.f914c.close();
    }

    public final void mark(int i) {
        this.f914c.mark(i);
    }

    public final boolean markSupported() {
        return this.f914c.markSupported();
    }

    /* renamed from: a */
    public static arl m627a(InputStream inputStream) {
        arl arl;
        synchronized (f912b) {
            arl = (arl) f912b.poll();
        }
        if (arl == null) {
            arl = new arl();
        }
        arl.f914c = inputStream;
        return arl;
    }

    public final int read() {
        try {
            return this.f914c.read();
        } catch (IOException e) {
            this.f913a = e;
            return -1;
        }
    }

    public final int read(byte[] bArr) {
        try {
            return this.f914c.read(bArr);
        } catch (IOException e) {
            this.f913a = e;
            return -1;
        }
    }

    public final int read(byte[] bArr, int i, int i2) {
        try {
            return this.f914c.read(bArr, i, i2);
        } catch (IOException e) {
            this.f913a = e;
            return -1;
        }
    }

    /* renamed from: a */
    public final void m628a() {
        this.f913a = null;
        this.f914c = null;
        synchronized (f912b) {
            f912b.offer(this);
        }
    }

    public final synchronized void reset() {
        this.f914c.reset();
    }

    public final long skip(long j) {
        try {
            return this.f914c.skip(j);
        } catch (IOException e) {
            this.f913a = e;
            return 0;
        }
    }
}
