package p000;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Matcher;

/* compiled from: PG */
/* renamed from: jxu */
final class jxu implements jxy {
    /* renamed from: a */
    public final jxw f19104a;
    /* renamed from: b */
    private final FilenameFilter f19105b = new jxv(this);

    public jxu(jxw jxw) {
        jri.m13152b((Object) jxw);
        this.f19104a = jxw;
    }

    /* renamed from: a */
    public final int mo2062a(File file) {
        Matcher matcher = this.f19104a.mo2070a().matcher(file.getName());
        if (matcher.matches()) {
            return this.f19104a.mo2069a(matcher);
        }
        String valueOf = String.valueOf(file);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 34);
        stringBuilder.append("Could not parse media file name : ");
        stringBuilder.append(valueOf);
        throw new jxz(stringBuilder.toString());
    }

    /* renamed from: b */
    public final boolean mo2063b(File file) {
        return this.f19104a.mo2070a().matcher(file.getName()).matches();
    }

    /* renamed from: c */
    public final boolean mo2064c(File file) {
        Matcher matcher = this.f19104a.mo2070a().matcher(file.getName());
        if (matcher.matches()) {
            return this.f19104a.mo2072c(matcher);
        }
        String valueOf = String.valueOf(file);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 34);
        stringBuilder.append("Could not parse media file name : ");
        stringBuilder.append(valueOf);
        throw new jxz(stringBuilder.toString());
    }

    /* renamed from: d */
    public final boolean mo2065d(File file) {
        Matcher matcher = this.f19104a.mo2070a().matcher(file.getName());
        if (matcher.matches()) {
            return this.f19104a.mo2073d(matcher);
        }
        String valueOf = String.valueOf(file);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 34);
        stringBuilder.append("Could not parse media file name : ");
        stringBuilder.append(valueOf);
        throw new jxz(stringBuilder.toString());
    }

    /* renamed from: e */
    public final boolean mo2066e(File file) {
        Matcher matcher = this.f19104a.mo2070a().matcher(file.getName());
        return matcher.matches() ? this.f19104a.mo2074e(matcher) : false;
    }

    /* renamed from: f */
    public final File[] mo2067f(File file) {
        File[] listFiles = file.listFiles(this.f19105b);
        if (listFiles != null) {
            return listFiles;
        }
        String valueOf = String.valueOf(file);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 12);
        stringBuilder.append("Cannot list ");
        stringBuilder.append(valueOf);
        throw new RuntimeException(stringBuilder.toString());
    }

    /* renamed from: g */
    public final long mo2068g(File file) {
        Matcher matcher = this.f19104a.mo2070a().matcher(file.getName());
        if (matcher.matches()) {
            return this.f19104a.mo2071b(matcher);
        }
        String valueOf = String.valueOf(file);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 34);
        stringBuilder.append("Could not parse media file name : ");
        stringBuilder.append(valueOf);
        throw new jxz(stringBuilder.toString());
    }
}
