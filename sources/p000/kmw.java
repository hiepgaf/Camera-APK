package p000;

/* compiled from: PG */
/* renamed from: kmw */
enum kmw extends kmt {
    kmw(String str) {
        super(str, 1);
    }

    /* renamed from: a */
    final Class mo2187a(Class cls) {
        if (cls.isLocalClass()) {
            return null;
        }
        return cls.getEnclosingClass();
    }
}
