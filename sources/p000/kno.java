package p000;

/* compiled from: PG */
/* renamed from: kno */
class kno extends Throwable {
    kno(String str) {
        super(str);
    }

    public synchronized Throwable fillInStackTrace() {
        return this;
    }
}
