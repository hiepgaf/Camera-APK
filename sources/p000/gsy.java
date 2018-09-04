package p000;

import java.io.File;

/* compiled from: PG */
/* renamed from: gsy */
public final class gsy implements gsx {
    /* renamed from: a */
    private final File f17306a;

    public gsy(File file) {
        this.f17306a = (File) jri.m13152b((Object) file);
    }

    /* renamed from: a */
    public final File mo1623a() {
        boolean c = mo1625c();
        String valueOf = String.valueOf(this.f17306a);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 44);
        stringBuilder.append("Folder doesn't exist and cannot be created: ");
        stringBuilder.append(valueOf);
        jri.m13154b(c, stringBuilder.toString());
        return this.f17306a;
    }

    /* renamed from: b */
    public final String mo1624b() {
        return this.f17306a.getAbsolutePath();
    }

    /* renamed from: a */
    public final gsx mo1622a(String str) {
        return new gsy(new File(this.f17306a, str));
    }

    public final String toString() {
        return this.f17306a.toString();
    }

    /* renamed from: c */
    public final boolean mo1625c() {
        return this.f17306a.mkdirs() || this.f17306a.isDirectory();
    }
}
