package p000;

import java.lang.ref.WeakReference;

/* renamed from: hxc */
abstract class hxc extends hxa {
    /* renamed from: b */
    private static final WeakReference f23336b = new WeakReference(null);
    /* renamed from: a */
    private WeakReference f23337a = f23336b;

    hxc(byte[] bArr) {
        super(bArr);
    }

    /* renamed from: c */
    final byte[] mo3472c() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.f23337a.get();
            if (bArr == null) {
                bArr = mo3572d();
                this.f23337a = new WeakReference(bArr);
            }
        }
        return bArr;
    }

    /* renamed from: d */
    protected abstract byte[] mo3572d();
}
