package p000;

import java.util.Locale;

/* compiled from: PG */
/* renamed from: kpx */
public final class kpx {
    /* renamed from: a */
    public String f8412a = null;

    /* renamed from: a */
    static String m5041a(String str, Object... objArr) {
        return String.format(Locale.ROOT, str, objArr);
    }

    /* renamed from: a */
    public final kpx m5042a(String str) {
        kpx.m5041a(str, Integer.valueOf(0));
        this.f8412a = str;
        return this;
    }
}
