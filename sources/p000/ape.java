package p000;

/* compiled from: PG */
/* renamed from: ape */
final class ape implements aph {
    /* renamed from: a */
    private final /* synthetic */ apd f10126a;

    ape(apd apd) {
        this.f10126a = apd;
    }

    public final String toString() {
        String obj = super.toString();
        String valueOf = String.valueOf(this.f10126a);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(obj).length() + 11) + String.valueOf(valueOf).length());
        stringBuilder.append(obj);
        stringBuilder.append("{fragment=");
        stringBuilder.append(valueOf);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
