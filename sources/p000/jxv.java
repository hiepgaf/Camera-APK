package p000;

import java.io.File;
import java.io.FilenameFilter;

/* compiled from: PG */
/* renamed from: jxv */
final class jxv implements FilenameFilter {
    /* renamed from: a */
    private final /* synthetic */ jxu f8077a;

    jxv(jxu jxu) {
        this.f8077a = jxu;
    }

    public final boolean accept(File file, String str) {
        return this.f8077a.f19104a.mo2070a().matcher(str).matches();
    }
}
