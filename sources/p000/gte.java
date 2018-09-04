package p000;

import java.io.File;

/* compiled from: PG */
/* renamed from: gte */
public final class gte implements gsx {
    /* renamed from: a */
    private static final String f17314a = bli.m862a("OvrDetachableFolder");
    /* renamed from: b */
    private final gsx f17315b;

    public gte(gsx gsx) {
        this.f17315b = gsx;
    }

    /* renamed from: a */
    public final File mo1623a() {
        return this.f17315b.mo1623a();
    }

    /* renamed from: b */
    public final String mo1624b() {
        return this.f17315b.mo1624b();
    }

    /* renamed from: a */
    public final gsx mo1622a(String str) {
        return this.f17315b.mo1622a(str);
    }

    public final String toString() {
        return this.f17315b.toString();
    }

    /* renamed from: c */
    public final boolean mo1625c() {
        while (!this.f17315b.mo1625c()) {
            File file = new File(this.f17315b.mo1624b());
            if (file.isFile() && file.delete()) {
                String str = f17314a;
                String valueOf = String.valueOf(file.getAbsolutePath());
                String str2 = "Overwriting existing file: ";
                if (valueOf.length() == 0) {
                    valueOf = new String(str2);
                } else {
                    valueOf = str2.concat(valueOf);
                }
                bli.m869c(str, valueOf);
            }
        }
        return true;
    }
}
