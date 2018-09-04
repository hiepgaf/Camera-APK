package p000;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: PG */
/* renamed from: kij */
final class kij extends kif implements Serializable {
    /* renamed from: a */
    private final MessageDigest f19216a;
    /* renamed from: b */
    private final int f19217b;
    /* renamed from: c */
    private final boolean f19218c;
    /* renamed from: d */
    private final String f19219d;

    kij(String str, int i, String str2) {
        this.f19219d = (String) jri.m13152b((Object) str2);
        this.f19216a = kij.m13560a(str);
        int digestLength = this.f19216a.getDigestLength();
        boolean z = i < 4 ? false : i <= digestLength;
        jri.m13146a(z, "bytes (%s) must be >= 4 and < %s", i, digestLength);
        this.f19217b = i;
        this.f19218c = kij.m13561a(this.f19216a);
    }

    kij(String str, String str2) {
        this.f19216a = kij.m13560a(str);
        this.f19217b = this.f19216a.getDigestLength();
        this.f19219d = (String) jri.m13152b((Object) str2);
        this.f19218c = kij.m13561a(this.f19216a);
    }

    /* renamed from: a */
    private static MessageDigest m13560a(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public final kig mo2180a() {
        if (this.f19218c) {
            try {
                return new kik((MessageDigest) this.f19216a.clone(), this.f19217b);
            } catch (CloneNotSupportedException e) {
            }
        }
        return new kik(kij.m13560a(this.f19216a.getAlgorithm()), this.f19217b);
    }

    /* renamed from: a */
    private static boolean m13561a(MessageDigest messageDigest) {
        try {
            messageDigest.clone();
            return true;
        } catch (CloneNotSupportedException e) {
            return false;
        }
    }

    public final String toString() {
        return this.f19219d;
    }

    final Object writeReplace() {
        return new kil(this.f19216a.getAlgorithm(), this.f19217b, this.f19219d);
    }
}
