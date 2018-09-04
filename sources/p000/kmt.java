package p000;

import java.lang.reflect.ParameterizedType;

/* compiled from: PG */
/* renamed from: kmt */
enum kmt {
    ;
    
    /* renamed from: a */
    public static final kmt f8350a = null;

    static {
        ParameterizedType parameterizedType = (ParameterizedType) new kmv((byte) 0).getClass().getGenericSuperclass();
        kmt[] values = kmt.values();
        int length = values.length;
        int i;
        while (i < length) {
            kmt kmt = values[i];
            if (kmt.mo2187a(kmv.class) != parameterizedType.getOwnerType()) {
                i++;
            } else {
                f8350a = kmt;
                return;
            }
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    abstract Class mo2187a(Class cls);
}
