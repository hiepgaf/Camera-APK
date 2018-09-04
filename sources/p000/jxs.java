package p000;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* renamed from: jxs */
final class jxs implements jxw {
    /* renamed from: a */
    private static final Pattern f19100a = Pattern.compile("([a-zA-Z0-9]+)_([0-9]+)_BURST(\\d+)(_COVER)?(_[0-9])?\\.(JPG|jpg)");

    jxs() {
    }

    /* renamed from: a */
    public final Pattern mo2070a() {
        return f19100a;
    }

    /* renamed from: a */
    public final int mo2069a(Matcher matcher) {
        String group = matcher.group(2);
        if (group != null) {
            return Integer.parseInt(group);
        }
        throw new jya("timestamp");
    }

    /* renamed from: b */
    public final long mo2071b(Matcher matcher) {
        throw new jya("timestamp");
    }

    /* renamed from: c */
    public final boolean mo2072c(Matcher matcher) {
        return matcher.group(4) != null;
    }

    /* renamed from: d */
    public final boolean mo2073d(Matcher matcher) {
        return matcher.group(1).endsWith("XTR");
    }

    /* renamed from: e */
    public final boolean mo2074e(Matcher matcher) {
        return matcher.group(1).endsWith("PORTRAIT");
    }
}
