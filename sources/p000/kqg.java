package p000;

import java.io.PrintStream;

/* compiled from: PG */
/* renamed from: kqg */
public final class kqg {
    /* renamed from: a */
    public static final kqh f8420a;

    static {
        Integer a;
        kqh kqm;
        Throwable th;
        PrintStream printStream;
        String name;
        StringBuilder stringBuilder;
        try {
            a = kqg.m5043a();
            if (a != null) {
                try {
                    if (a.intValue() >= 19) {
                        kqm = new kqm();
                        f8420a = kqm;
                        if (a == null) {
                            a.intValue();
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    printStream = System.err;
                    name = kql.class.getName();
                    stringBuilder = new StringBuilder(String.valueOf(name).length() + 132);
                    stringBuilder.append("An error has occured when initializing the try-with-resources desuguring strategy. The default strategy ");
                    stringBuilder.append(name);
                    stringBuilder.append("will be used. The error is: ");
                    printStream.println(stringBuilder.toString());
                    th.printStackTrace(System.err);
                    kqm = new kql();
                    f8420a = kqm;
                    if (a == null) {
                        a.intValue();
                    }
                }
            }
            kqm = (Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic") ^ 1) != 0 ? new kqk() : new kql();
        } catch (Throwable th3) {
            th = th3;
            a = null;
            printStream = System.err;
            name = kql.class.getName();
            stringBuilder = new StringBuilder(String.valueOf(name).length() + 132);
            stringBuilder.append("An error has occured when initializing the try-with-resources desuguring strategy. The default strategy ");
            stringBuilder.append(name);
            stringBuilder.append("will be used. The error is: ");
            printStream.println(stringBuilder.toString());
            th.printStackTrace(System.err);
            kqm = new kql();
            f8420a = kqm;
            if (a == null) {
                a.intValue();
            }
        }
        f8420a = kqm;
        if (a == null) {
            a.intValue();
        }
    }

    /* renamed from: a */
    public static void m5044a(Throwable th, Throwable th2) {
        f8420a.mo2208a(th, th2);
    }

    /* renamed from: a */
    private static Integer m5043a() {
        try {
            return (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Exception e) {
            System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            e.printStackTrace(System.err);
            return null;
        }
    }
}
