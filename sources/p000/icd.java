package p000;

import java.util.Arrays;

/* renamed from: icd */
public final class icd {
    /* renamed from: a */
    public final huh f6922a;
    /* renamed from: b */
    private final boolean f6923b = false;
    /* renamed from: c */
    private final int f6924c;
    /* renamed from: d */
    private final hui f6925d;

    public icd(huh huh, hui hui) {
        this.f6922a = huh;
        this.f6925d = hui;
        this.f6924c = Arrays.hashCode(new Object[]{this.f6922a, this.f6925d});
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof icd)) {
            return false;
        }
        icd icd = (icd) obj;
        return htl.m3426a(this.f6922a, icd.f6922a) && htl.m3426a(this.f6925d, icd.f6925d);
    }

    public final int hashCode() {
        return this.f6924c;
    }
}
