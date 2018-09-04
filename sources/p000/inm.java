package p000;

/* compiled from: PG */
/* renamed from: inm */
public final class inm {
    /* renamed from: a */
    public final imz f7164a;
    /* renamed from: b */
    public final int f7165b;
    /* renamed from: c */
    public final int f7166c;
    /* renamed from: d */
    public final int f7167d;

    public inm(imz imz, int i, int i2, int i3) {
        this.f7164a = imz;
        this.f7165b = i;
        this.f7166c = i2;
        this.f7167d = i3;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f7164a);
        int i = this.f7166c;
        int i2 = this.f7165b;
        int i3 = this.f7167d;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 79);
        stringBuilder.append("encoder=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", sampling rate=");
        stringBuilder.append(i);
        stringBuilder.append(", bit rate=");
        stringBuilder.append(i2);
        stringBuilder.append(", channels=");
        stringBuilder.append(i3);
        return stringBuilder.toString();
    }
}
