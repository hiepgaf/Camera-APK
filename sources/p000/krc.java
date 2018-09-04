package p000;

import java.nio.charset.Charset;

/* compiled from: PG */
/* renamed from: krc */
class krc extends krb {
    public static final long serialVersionUID = 1;
    /* renamed from: c */
    public final byte[] f22464c;

    krc(byte[] bArr) {
        this.f22464c = bArr;
    }

    /* renamed from: a */
    public byte mo3262a(int i) {
        return this.f22464c[i];
    }

    /* renamed from: a */
    protected void mo3266a(byte[] bArr, int i) {
        System.arraycopy(this.f22464c, 0, bArr, 0, i);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kqx)) {
            return false;
        }
        if (mo3268b() != ((kqx) obj).mo3268b()) {
            return false;
        }
        if (mo3268b() == 0) {
            return true;
        }
        if (!(obj instanceof krc)) {
            return obj.equals(this);
        }
        krc krc = (krc) obj;
        int i = this.f8431b;
        int i2 = krc.f8431b;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        i = mo3268b();
        if (i > krc.mo3268b()) {
            int b = mo3268b();
            StringBuilder stringBuilder = new StringBuilder(40);
            stringBuilder.append("Length too large: ");
            stringBuilder.append(i);
            stringBuilder.append(b);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (i > krc.mo3268b()) {
            i2 = krc.mo3268b();
            StringBuilder stringBuilder2 = new StringBuilder(59);
            stringBuilder2.append("Ran off end of other: ");
            stringBuilder2.append(0);
            stringBuilder2.append(", ");
            stringBuilder2.append(i);
            stringBuilder2.append(", ");
            stringBuilder2.append(i2);
            throw new IllegalArgumentException(stringBuilder2.toString());
        } else if (!(krc instanceof krc)) {
            return krc.mo3269c(i).equals(mo3269c(i));
        } else {
            byte[] bArr = this.f22464c;
            byte[] bArr2 = krc.f22464c;
            int e = mo3531e() + i;
            i2 = mo3531e();
            i = krc.mo3531e();
            while (i2 < e) {
                if (bArr[i2] != bArr2[i]) {
                    return false;
                }
                i2++;
                i++;
            }
            return true;
        }
    }

    /* renamed from: e */
    protected int mo3531e() {
        return 0;
    }

    /* renamed from: a */
    public final boolean mo3267a() {
        int e = mo3531e();
        return kur.m5359b(this.f22464c, e, mo3268b() + e);
    }

    /* renamed from: a */
    protected final int mo3263a(int i, int i2) {
        return ksd.m5127a(i, this.f22464c, mo3531e(), i2);
    }

    /* renamed from: b */
    public int mo3268b() {
        return this.f22464c.length;
    }

    /* renamed from: c */
    public final kqx mo3269c(int i) {
        int a = kqx.m5053a(0, i, mo3268b());
        if (a == 0) {
            return kqx.f8429a;
        }
        return new kqy(this.f22464c, mo3531e(), a);
    }

    /* renamed from: a */
    protected final String mo3264a(Charset charset) {
        return new String(this.f22464c, mo3531e(), mo3268b(), charset);
    }

    /* renamed from: a */
    final void mo3265a(kqw kqw) {
        kqw.mo2284a(this.f22464c, mo3531e(), mo3268b());
    }
}
