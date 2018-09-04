package p000;

/* compiled from: PG */
/* renamed from: isr */
public class isr extends Exception {
    public isr(String str) {
        super(str);
    }

    public isr(Throwable th) {
        super(th);
    }

    /* renamed from: a */
    public static Object m4143a(kpk kpk) {
        try {
            return kpk.get();
        } catch (Throwable e) {
            throw new isr(e);
        }
    }
}
