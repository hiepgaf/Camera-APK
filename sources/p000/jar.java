package p000;

/* compiled from: PG */
/* renamed from: jar */
public final class jar extends Exception {
    private jar(Throwable th) {
        super(th);
        setStackTrace(th.getStackTrace());
    }

    /* renamed from: a */
    public static jar m4390a(Throwable th) {
        if (th instanceof jar) {
            return (jar) th;
        }
        return new jar(th);
    }
}
