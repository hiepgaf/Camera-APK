package p000;

/* compiled from: PG */
/* renamed from: kph */
final class kph extends kpf {
    /* renamed from: a */
    public static final kph f23578a = new kph(null);
    /* renamed from: b */
    private final Object f23579b;

    kph(Object obj) {
        this.f23579b = obj;
    }

    public final Object get() {
        return this.f23579b;
    }

    public final String toString() {
        String obj = super.toString();
        String valueOf = String.valueOf(this.f23579b);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(obj).length() + 27) + String.valueOf(valueOf).length());
        stringBuilder.append(obj);
        stringBuilder.append("[status=SUCCESS, result=[");
        stringBuilder.append(valueOf);
        stringBuilder.append("]]");
        return stringBuilder.toString();
    }
}
