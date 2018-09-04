package p000;

/* compiled from: PG */
/* renamed from: apk */
final class apk implements aph {
    /* renamed from: a */
    private final /* synthetic */ apj f10127a;

    apk(apj apj) {
        this.f10127a = apj;
    }

    public final String toString() {
        String obj = super.toString();
        String valueOf = String.valueOf(this.f10127a);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(obj).length() + 11) + String.valueOf(valueOf).length());
        stringBuilder.append(obj);
        stringBuilder.append("{fragment=");
        stringBuilder.append(valueOf);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
