package p000;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* renamed from: jxt */
final class jxt implements jxw {
    /* renamed from: a */
    private final Pattern f19101a;
    /* renamed from: b */
    private final int f19102b = 1;
    /* renamed from: c */
    private final int f19103c;

    public jxt(Pattern pattern, int i) {
        this.f19101a = pattern;
        this.f19103c = i;
    }

    /* renamed from: a */
    public final Pattern mo2070a() {
        return this.f19101a;
    }

    /* renamed from: a */
    public final int mo2069a(Matcher matcher) {
        int i = this.f19103c;
        if (i != -1) {
            String group = matcher.group(i);
            if (group != null) {
                return Integer.parseInt(group);
            }
            throw new jya("timestamp");
        }
        throw new jya("timestamp");
    }

    /* renamed from: b */
    public final long mo2071b(Matcher matcher) {
        return Long.parseLong(matcher.group(this.f19102b));
    }

    /* renamed from: c */
    public final boolean mo2072c(Matcher matcher) {
        return false;
    }

    /* renamed from: d */
    public final boolean mo2073d(Matcher matcher) {
        return false;
    }

    /* renamed from: e */
    public final boolean mo2074e(Matcher matcher) {
        return false;
    }
}
