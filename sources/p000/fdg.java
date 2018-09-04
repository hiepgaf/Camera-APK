package p000;

/* compiled from: PG */
/* renamed from: fdg */
public final class fdg {
    /* renamed from: a */
    public final fdh f4477a;
    /* renamed from: b */
    public final fdh f4478b;
    /* renamed from: c */
    public final fdh f4479c;

    public fdg(fdh fdh, fdh fdh2, fdh fdh3) {
        this.f4478b = fdh2;
        this.f4477a = fdh;
        this.f4479c = fdh3;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f4477a);
        String valueOf2 = String.valueOf(this.f4478b);
        String valueOf3 = String.valueOf(this.f4479c);
        int length = String.valueOf(valueOf).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 35) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length());
        stringBuilder.append("{ exposure=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", focus=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", whiteBalance=");
        stringBuilder.append(valueOf3);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public final fdg m2256a(fdh fdh) {
        return new fdg(fdh, this.f4478b, this.f4479c);
    }

    /* renamed from: b */
    public final fdg m2257b(fdh fdh) {
        return new fdg(this.f4477a, fdh, this.f4479c);
    }

    /* renamed from: c */
    public final fdg m2258c(fdh fdh) {
        return new fdg(this.f4477a, this.f4478b, fdh);
    }
}
