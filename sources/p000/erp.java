package p000;

import java.io.InputStream;

/* compiled from: PG */
/* renamed from: erp */
final class erp implements erq {
    /* renamed from: a */
    private final InputStream f15432a;

    erp(InputStream inputStream) {
        this.f15432a = inputStream;
    }

    public final void close() {
        this.f15432a.close();
    }

    /* renamed from: a */
    public final int mo1269a() {
        return this.f15432a.read();
    }

    /* renamed from: a */
    public final eyo mo1271a(int i, int i2) {
        byte[] bArr = new byte[i];
        return new eyo(bArr, i2, 0, this.f15432a.read(bArr));
    }

    /* renamed from: a */
    public final eyo mo1270a(int i) {
        return mo1271a(this.f15432a.available(), i);
    }

    /* renamed from: b */
    public final void mo1272b(int i) {
        this.f15432a.skip((long) i);
    }
}
