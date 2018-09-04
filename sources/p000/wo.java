package p000;

/* compiled from: PG */
/* renamed from: wo */
public final class wo {
    /* renamed from: a */
    public String f9467a;

    public wo(String str) {
        int indexOf = str.indexOf(58);
        if (indexOf >= 0) {
            this.f9467a = str.substring(0, indexOf);
            str.substring(indexOf + 1);
            return;
        }
        this.f9467a = "";
    }
}
