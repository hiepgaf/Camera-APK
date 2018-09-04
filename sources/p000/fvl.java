package p000;

import android.util.Pair;

/* compiled from: PG */
/* renamed from: fvl */
final class fvl extends fvr {
    /* renamed from: a */
    private final Float f16561a;
    /* renamed from: b */
    private final Pair f16562b;

    fvl(Float f, Pair pair) {
        this.f16561a = f;
        this.f16562b = pair;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
        r4 = this;
        r0 = 1;
        r1 = 0;
        if (r5 != r4) goto L_0x0005;
    L_0x0004:
        return r0;
    L_0x0005:
        r2 = r5 instanceof p000.fvr;
        if (r2 == 0) goto L_0x0037;
    L_0x0009:
        r5 = (p000.fvr) r5;
        r2 = r4.f16561a;
        if (r2 == 0) goto L_0x0030;
    L_0x000f:
        r3 = r5.mo1426a();
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x0027;
    L_0x0019:
        r2 = r4.f16562b;
        if (r2 == 0) goto L_0x0029;
    L_0x001d:
        r3 = r5.mo1427b();
        r2 = r2.equals(r3);
        if (r2 != 0) goto L_0x0004;
    L_0x0027:
        r0 = r1;
        goto L_0x0004;
    L_0x0029:
        r2 = r5.mo1427b();
        if (r2 == 0) goto L_0x0004;
    L_0x002f:
        goto L_0x0027;
    L_0x0030:
        r2 = r5.mo1426a();
        if (r2 != 0) goto L_0x0027;
    L_0x0036:
        goto L_0x0019;
    L_0x0037:
        r0 = r1;
        goto L_0x0004;
        */
        throw new UnsupportedOperationException("Method not decompiled: fvl.equals(java.lang.Object):boolean");
    }

    /* renamed from: a */
    public final Float mo1426a() {
        return this.f16561a;
    }

    /* renamed from: b */
    public final Pair mo1427b() {
        return this.f16562b;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        Float f = this.f16561a;
        if (f != null) {
            hashCode = f.hashCode();
        } else {
            hashCode = 0;
        }
        hashCode = (hashCode ^ 1000003) * 1000003;
        Pair pair = this.f16562b;
        if (pair != null) {
            i = pair.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f16561a);
        String valueOf2 = String.valueOf(this.f16562b);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 48) + String.valueOf(valueOf2).length());
        stringBuilder.append("FocusDistanceResult{focusDistance=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", focusRange=");
        stringBuilder.append(valueOf2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
