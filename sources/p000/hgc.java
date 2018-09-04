package p000;

import android.os.Trace;

/* compiled from: PG */
/* renamed from: hgc */
public final class hgc implements hgb {
    /* renamed from: a */
    private final String f17749a;

    public hgc(String str) {
        this.f17749a = str;
    }

    /* renamed from: a */
    public final void mo1728a(String str) {
        String str2 = this.f17749a;
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str2).length() + 1) + String.valueOf(str).length());
        stringBuilder.append(str2);
        stringBuilder.append(":");
        stringBuilder.append(str);
        Trace.beginSection(stringBuilder.toString());
    }

    /* renamed from: a */
    public final void mo1727a() {
        Trace.endSection();
    }
}
