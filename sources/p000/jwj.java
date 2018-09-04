package p000;

import com.google.android.libraries.smartburst.utils.MathUtils;

/* compiled from: PG */
/* renamed from: jwj */
public final class jwj implements jwb {
    /* renamed from: a */
    public long f19078a;
    /* renamed from: b */
    public long f19079b;
    /* renamed from: c */
    private long f19080c = -1;
    /* renamed from: d */
    private long f19081d;
    /* renamed from: e */
    private final jtv f19082e;
    /* renamed from: f */
    private long f19083f;

    public jwj(jtv jtv) {
        this.f19082e = jtv;
    }

    /* renamed from: a */
    public final boolean mo2057a(long j) {
        if (this.f19080c < 0) {
            this.f19080c = j;
            this.f19081d = j;
        }
        this.f19078a = j - this.f19080c;
        this.f19080c = j;
        this.f19083f = ((long) (MathUtils.linearMapToRange(this.f19082e.mo2049a(j).mo2076a(), 0.0f, 0.3f, 0.5f, 1.0f) * ((float) (j - this.f19081d)))) + this.f19083f;
        this.f19079b = 0;
        long j2 = this.f19083f;
        if (j2 <= 16666666) {
            return false;
        }
        this.f19081d = j;
        this.f19079b = j2;
        this.f19083f = 0;
        return true;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f19082e);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 39);
        stringBuilder.append("VariableSamplingRateFrameFilter[range=");
        stringBuilder.append(valueOf);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
