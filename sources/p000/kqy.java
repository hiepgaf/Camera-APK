package p000;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* compiled from: PG */
/* renamed from: kqy */
final class kqy extends krc {
    public static final long serialVersionUID = 1;
    /* renamed from: d */
    private final int f23435d;
    /* renamed from: e */
    private final int f23436e;

    kqy(byte[] bArr, int i, int i2) {
        super(bArr);
        kqx.m5053a(i, i + i2, bArr.length);
        this.f23435d = i;
        this.f23436e = i2;
    }

    /* renamed from: a */
    public final byte mo3262a(int i) {
        int i2 = this.f23436e;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.c[this.f23435d + i];
        }
        if (i < 0) {
            StringBuilder stringBuilder = new StringBuilder(22);
            stringBuilder.append("Index < 0: ");
            stringBuilder.append(i);
            throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
        }
        StringBuilder stringBuilder2 = new StringBuilder(40);
        stringBuilder2.append("Index > length: ");
        stringBuilder2.append(i);
        stringBuilder2.append(", ");
        stringBuilder2.append(i2);
        throw new ArrayIndexOutOfBoundsException(stringBuilder2.toString());
    }

    /* renamed from: a */
    protected final void mo3266a(byte[] bArr, int i) {
        System.arraycopy(this.c, this.f23435d, bArr, 0, i);
    }

    /* renamed from: e */
    protected final int mo3531e() {
        return this.f23435d;
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }

    /* renamed from: b */
    public final int mo3268b() {
        return this.f23436e;
    }

    final Object writeReplace() {
        return kqx.m5055a(m5067c());
    }
}
