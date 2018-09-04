package p000;

import java.security.MessageDigest;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: kik */
final class kik extends kic {
    /* renamed from: a */
    private final MessageDigest f22058a;
    /* renamed from: b */
    private final int f22059b;
    /* renamed from: c */
    private boolean f22060c;

    kik(MessageDigest messageDigest, int i) {
        this.f22058a = messageDigest;
        this.f22059b = i;
    }

    /* renamed from: b */
    private final void m16550b() {
        jri.m13154b(this.f22060c ^ 1, (Object) "Cannot re-use a Hasher after calling hash() on it");
    }

    /* renamed from: a */
    public final kid mo3245a() {
        m16550b();
        this.f22060c = true;
        if (this.f22059b == this.f22058a.getDigestLength()) {
            return kid.m4945a(this.f22058a.digest());
        }
        return kid.m4945a(Arrays.copyOf(this.f22058a.digest(), this.f22059b));
    }

    /* renamed from: b */
    protected final void mo3247b(byte b) {
        m16550b();
        this.f22058a.update(b);
    }

    /* renamed from: a */
    protected final void mo3246a(byte[] bArr) {
        m16550b();
        this.f22058a.update(bArr, 0, 2);
    }
}
