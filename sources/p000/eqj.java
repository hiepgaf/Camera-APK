package p000;

import android.annotation.TargetApi;

@TargetApi(16)
/* compiled from: PG */
/* renamed from: eqj */
public final class eqj {
    /* renamed from: a */
    public String f4079a;
    /* renamed from: b */
    private final epw f4080b;
    /* renamed from: c */
    private long f4081c = -1;

    public eqj(epw epw) {
        this.f4080b = epw;
    }

    /* renamed from: a */
    public final epv m2004a() {
        boolean z;
        jri.m13152b(this.f4079a);
        if (this.f4081c >= 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13153b(z);
        epv a = new epv();
        a.m1990a("_data", this.f4079a);
        a.f4066a.putNull("mime_type");
        Integer valueOf = Integer.valueOf(0);
        a.m1988a("media_type", valueOf);
        a.m1988a("date_modified", valueOf);
        a.m1989a("datetaken", Long.valueOf(this.f4081c));
        return a;
    }

    /* renamed from: a */
    public final eqj m2005a(long j) {
        if (j <= 0) {
            StringBuilder stringBuilder = new StringBuilder(45);
            stringBuilder.append("invalid image taken time ");
            stringBuilder.append(j);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.f4081c = j;
        return this;
    }
}
