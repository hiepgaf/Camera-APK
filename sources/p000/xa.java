package p000;

/* compiled from: PG */
/* renamed from: xa */
public final class xa implements xl {
    /* renamed from: a */
    private final /* synthetic */ String f19670a;
    /* renamed from: b */
    private final /* synthetic */ String f19671b;
    /* renamed from: c */
    private final /* synthetic */ String f19672c;
    /* renamed from: d */
    private final /* synthetic */ xf f19673d;

    public xa(String str, String str2, String str3, xf xfVar) {
        this.f19670a = str;
        this.f19671b = str2;
        this.f19672c = str3;
        this.f19673d = xfVar;
    }

    /* renamed from: a */
    public final xf mo2536a() {
        return this.f19673d;
    }

    /* renamed from: b */
    public final String mo2537b() {
        return this.f19670a;
    }

    /* renamed from: c */
    public final String mo2538c() {
        return this.f19671b;
    }

    /* renamed from: d */
    public final String mo2539d() {
        return this.f19672c;
    }

    public final String toString() {
        String str = this.f19671b;
        String str2 = this.f19672c;
        String str3 = this.f19670a;
        String valueOf = String.valueOf(this.f19673d);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        StringBuilder stringBuilder = new StringBuilder((((length + 14) + length2) + String.valueOf(str3).length()) + String.valueOf(valueOf).length());
        stringBuilder.append(str);
        stringBuilder.append(str2);
        stringBuilder.append(" NS(");
        stringBuilder.append(str3);
        stringBuilder.append("), FORM (");
        stringBuilder.append(valueOf);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
