package p000;

/* compiled from: PG */
/* renamed from: abz */
public final class abz {
    /* renamed from: a */
    private static final aby f182a = new aby("SysProps");

    /* renamed from: a */
    public static String m92a(String str, String str2) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{String.class, String.class}).invoke(null, new Object[]{str, str2});
        } catch (Throwable e) {
            abx.m85a(f182a, "Exception while getting system property: ", e);
            return str2;
        }
    }
}
