package p000;

import java.lang.reflect.Type;

/* compiled from: PG */
/* renamed from: kmy */
public enum kmy {
    ;
    
    /* renamed from: c */
    public static final kmy f8357c = null;

    /* renamed from: a */
    abstract Type mo2188a(Type type);

    /* renamed from: c */
    abstract Type mo2189c(Type type);

    /* renamed from: a */
    boolean mo2191a() {
        return true;
    }

    /* renamed from: b */
    public String mo2190b(Type type) {
        return kms.m5005b(type);
    }

    /* renamed from: a */
    final ken m5008a(Type[] typeArr) {
        keo d = ken.m13463d();
        for (Type c : typeArr) {
            d.m16494c(mo2189c(c));
        }
        return d.m16491a();
    }
}
