package p000;

import java.io.File;

/* compiled from: PG */
/* renamed from: cip */
final class cip implements kaw {
    /* renamed from: a */
    private final kpw f12037a;
    /* renamed from: b */
    private final /* synthetic */ cig f12038b;

    public cip(cig cig, kpw kpw) {
        this.f12038b = cig;
        jri.m13152b((Object) kpw);
        this.f12037a = kpw;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo370a(Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool == null || !bool.booleanValue()) {
            return Boolean.valueOf(false);
        }
        String format = String.format("burst-%d", new Object[]{Long.valueOf(System.currentTimeMillis())});
        Object file = new File(m8218a(), format);
        if (file.mkdirs() || file.exists()) {
            this.f12037a.mo3557a(file);
            return Boolean.valueOf(true);
        }
        String str = cig.f2026a;
        String valueOf = String.valueOf(format);
        String str2 = "Unable to create burst session directory: ";
        if (valueOf.length() == 0) {
            valueOf = new String(str2);
        } else {
            valueOf = str2.concat(valueOf);
        }
        bli.m873e(str, valueOf);
        this.f12038b.f2036c.f2004e.mo2697e();
        valueOf = String.valueOf(format);
        format = "Unable to create burst session directory: ";
        if (valueOf.length() == 0) {
            valueOf = new String(format);
        } else {
            valueOf = format.concat(valueOf);
        }
        throw new IllegalStateException(valueOf);
    }

    /* renamed from: a */
    private final File m8218a() {
        cig cig = this.f12038b;
        try {
            return gnv.m11222a(cig.f2035b, cig.f2050q).mo1507a("burst");
        } catch (Throwable e) {
            kqg.f8420a.mo2210b(e);
            throw new RuntimeException(e);
        }
    }
}
