package p000;

import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: ist */
public final class ist {
    /* renamed from: a */
    public final ith[] f7394a = new ith[5];
    /* renamed from: b */
    public byte[] f7395b;
    /* renamed from: c */
    public ArrayList f7396c = new ArrayList();
    /* renamed from: d */
    public final ByteOrder f7397d;

    public ist(ByteOrder byteOrder) {
        this.f7397d = byteOrder;
    }

    /* renamed from: a */
    public final void m4151a(ith ith) {
        this.f7394a[ith.f7457a] = ith;
    }

    /* renamed from: a */
    public final ite m4149a(ite ite) {
        if (ite == null) {
            return null;
        }
        int i = ite.f7450e;
        if (ite == null || !ite.m4176b(i)) {
            return null;
        }
        ith ith = this.f7394a[i];
        if (ith == null) {
            ith = new ith(i);
            this.f7394a[i] = ith;
        }
        return ith.m4201a(ite);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ist)) {
            return false;
        }
        ist ist = (ist) obj;
        if (ist.f7397d != this.f7397d || ist.f7396c.size() != this.f7396c.size() || !Arrays.equals(ist.f7395b, this.f7395b)) {
            return false;
        }
        for (int i = 0; i < this.f7396c.size(); i++) {
            if (!Arrays.equals((byte[]) ist.f7396c.get(i), (byte[]) this.f7396c.get(i))) {
                return false;
            }
        }
        for (int i2 = 0; i2 < 5; i2++) {
            ith a = ist.m4150a(i2);
            ith a2 = m4150a(i2);
            if (a != null && !a.equals(a2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public final ith m4150a(int i) {
        return ite.m4176b(i) ? this.f7394a[i] : null;
    }

    /* renamed from: b */
    protected final byte[] m4155b(int i) {
        return (byte[]) this.f7396c.get(i);
    }

    /* renamed from: a */
    protected final boolean m4153a() {
        return this.f7395b != null;
    }

    /* renamed from: b */
    protected final boolean m4154b() {
        return this.f7396c.size() != 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f7394a)), Integer.valueOf(Arrays.hashCode(this.f7395b)), this.f7396c, this.f7397d});
    }

    /* renamed from: a */
    public final void m4152a(short s, int i) {
        ith ith = this.f7394a[i];
        if (ith != null) {
            ith.m4205b(s);
        }
    }
}
