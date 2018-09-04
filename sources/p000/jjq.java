package p000;

/* compiled from: PG */
/* renamed from: jjq */
public abstract class jjq implements jiq {
    /* renamed from: a */
    public final String f18858a;
    /* renamed from: b */
    public final int f18859b;
    /* renamed from: c */
    private final String f18860c = getClass().getSimpleName();

    protected jjq(String str, int i) {
        this.f18858a = str;
        this.f18859b = i;
    }

    /* renamed from: a */
    public final int mo2011a() {
        return this.f18859b;
    }

    /* renamed from: b */
    public final String mo2012b() {
        return this.f18858a;
    }

    public String toString() {
        String str = this.f18860c;
        String str2 = this.f18858a;
        int i = this.f18859b;
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 29) + String.valueOf(str2).length());
        stringBuilder.append(str);
        stringBuilder.append("[type=");
        stringBuilder.append(str2);
        stringBuilder.append(", priority=");
        stringBuilder.append(i);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
