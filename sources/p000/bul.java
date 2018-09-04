package p000;

/* compiled from: PG */
/* renamed from: bul */
public final class bul {
    /* renamed from: a */
    private final hjy f1598a;

    public bul(hjy hjy) {
        this.f1598a = hjy;
    }

    /* renamed from: a */
    public final boolean m995a() {
        long currentTimeMillis = System.currentTimeMillis();
        boolean a = this.f1598a.m3215a("2.13");
        long currentTimeMillis2 = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder(98);
        stringBuilder.append("Photos version is checked and gallery will be supported ");
        stringBuilder.append(a);
        stringBuilder.append(", which costs ");
        stringBuilder.append(currentTimeMillis2 - currentTimeMillis);
        stringBuilder.append(" ms");
        bli.m863a("PhotosOemApiDet", stringBuilder.toString());
        return a;
    }
}
