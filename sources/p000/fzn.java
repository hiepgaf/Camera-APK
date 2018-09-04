package p000;

/* compiled from: PG */
/* renamed from: fzn */
public final class fzn {
    /* renamed from: a */
    public final fzp f4860a;
    /* renamed from: b */
    public final int f4861b;
    /* renamed from: c */
    public final int f4862c;
    /* renamed from: d */
    public final int f4863d;

    public fzn(fzp fzp, int i, int i2, int i3) {
        this.f4860a = fzp;
        this.f4861b = i;
        this.f4862c = i2;
        this.f4863d = i3;
    }

    public final boolean equals(Object obj) {
        if (obj != null && this.f4860a == ((fzn) obj).f4860a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4861b;
    }
}
