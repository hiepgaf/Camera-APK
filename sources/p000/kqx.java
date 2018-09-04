package p000;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: kqx */
public abstract class kqx implements Serializable, Iterable {
    /* renamed from: a */
    public static final kqx f8429a = new krc(ksd.f8516b);
    /* renamed from: c */
    private static final kqz f8430c;
    /* renamed from: b */
    public int f8431b = 0;

    static {
        kqz krd;
        if (kqs.m5051a()) {
            krd = new krd();
        } else {
            krd = new ktm();
        }
        f8430c = krd;
    }

    /* renamed from: a */
    public abstract byte mo3262a(int i);

    /* renamed from: a */
    protected abstract int mo3263a(int i, int i2);

    /* renamed from: a */
    protected abstract String mo3264a(Charset charset);

    /* renamed from: a */
    abstract void mo3265a(kqw kqw);

    /* renamed from: a */
    protected abstract void mo3266a(byte[] bArr, int i);

    /* renamed from: a */
    public abstract boolean mo3267a();

    /* renamed from: b */
    public abstract int mo3268b();

    /* renamed from: c */
    public abstract kqx mo3269c(int i);

    public abstract boolean equals(Object obj);

    kqx() {
    }

    /* renamed from: a */
    static int m5053a(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((((i | i2) | i4) | (i3 - i2)) >= 0) {
            return i4;
        }
        StringBuilder stringBuilder;
        if (i < 0) {
            stringBuilder = new StringBuilder(32);
            stringBuilder.append("Beginning index: ");
            stringBuilder.append(i);
            stringBuilder.append(" < 0");
            throw new IndexOutOfBoundsException(stringBuilder.toString());
        } else if (i2 < i) {
            stringBuilder = new StringBuilder(66);
            stringBuilder.append("Beginning index larger than ending index: ");
            stringBuilder.append(i);
            stringBuilder.append(", ");
            stringBuilder.append(i2);
            throw new IndexOutOfBoundsException(stringBuilder.toString());
        } else {
            stringBuilder = new StringBuilder(37);
            stringBuilder.append("End index: ");
            stringBuilder.append(i2);
            stringBuilder.append(" >= ");
            stringBuilder.append(i3);
            throw new IndexOutOfBoundsException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    public static kqx m5056a(byte[] bArr, int i, int i2) {
        return new krc(f8430c.mo2258a(bArr, i, i2));
    }

    /* renamed from: a */
    public static kqx m5054a(String str) {
        return new krc(str.getBytes(ksd.f8515a));
    }

    public final int hashCode() {
        int i = this.f8431b;
        if (i == 0) {
            i = mo3268b();
            i = mo3263a(i, i);
            if (i == 0) {
                i = 1;
            }
            this.f8431b = i;
        }
        return i;
    }

    public /* synthetic */ Iterator iterator() {
        return new kra(this);
    }

    /* renamed from: b */
    static kue m5058b(int i) {
        return new kue(i);
    }

    /* renamed from: c */
    public final byte[] m5067c() {
        int b = mo3268b();
        if (b == 0) {
            return ksd.f8516b;
        }
        byte[] bArr = new byte[b];
        mo3266a(bArr, b);
        return bArr;
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(mo3268b())});
    }

    /* renamed from: d */
    public final String m5068d() {
        return mo3268b() != 0 ? mo3264a(ksd.f8515a) : "";
    }

    /* renamed from: a */
    static kqx m5055a(byte[] bArr) {
        return new krc(bArr);
    }

    /* renamed from: b */
    static kqx m5057b(byte[] bArr, int i, int i2) {
        return new kqy(bArr, i, i2);
    }
}
