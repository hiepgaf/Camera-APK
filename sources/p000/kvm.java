package p000;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: kvm */
final class kvm {
    /* renamed from: a */
    public final int f8656a;
    /* renamed from: b */
    public final byte[] f8657b;

    kvm(int i, byte[] bArr) {
        this.f8656a = i;
        this.f8657b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kvm)) {
            return false;
        }
        kvm kvm = (kvm) obj;
        if (this.f8656a == kvm.f8656a && Arrays.equals(this.f8657b, kvm.f8657b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f8656a + 527) * 31) + Arrays.hashCode(this.f8657b);
    }
}
