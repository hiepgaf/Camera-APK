package p000;

import java.io.File;

/* compiled from: PG */
/* renamed from: jlo */
public final class jlo {
    /* renamed from: a */
    private static String f7918a = null;

    /* renamed from: a */
    public static File m4539a() {
        return new File(jcc.m4395a("sb.eval.logdirpath", ""));
    }

    /* renamed from: b */
    public static boolean m4540b() {
        if (f7918a == null) {
            f7918a = jcc.m4395a("sb.debugtracking", "false");
        }
        return f7918a.equalsIgnoreCase("true");
    }

    /* renamed from: c */
    public static boolean m4541c() {
        File a = jlo.m4539a();
        return a.exists() && a.isDirectory();
    }
}
