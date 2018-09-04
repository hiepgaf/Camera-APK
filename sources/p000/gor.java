package p000;

/* compiled from: PG */
/* renamed from: gor */
public final class gor {
    /* renamed from: a */
    private final gos f5608a;
    /* renamed from: b */
    private final iqz f5609b;

    public gor(gos gos, ira ira) {
        this.f5608a = gos;
        this.f5609b = ira.mo511a("Settings");
    }

    /* renamed from: a */
    public final ilp m2667a(String str, boolean z) {
        return m2666a("default_scope", str, z);
    }

    /* renamed from: a */
    public final ilp m2662a(String str, int i) {
        return m2664a("default_scope", str, i);
    }

    /* renamed from: a */
    public final ilp m2666a(String str, String str2, boolean z) {
        if (!this.f5608a.mo1544e(str, str2)) {
            iqz iqz = this.f5609b;
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 48) + String.valueOf(str2).length());
            stringBuilder.append("Initializing default value (");
            stringBuilder.append(z);
            stringBuilder.append(") for key: (");
            stringBuilder.append(str);
            stringBuilder.append(", ");
            stringBuilder.append(str2);
            stringBuilder.append(")");
            iqz.mo518d(stringBuilder.toString());
            this.f5608a.mo1540b(str, str2, z);
        }
        return new gof(this.f5608a, str, str2);
    }

    /* renamed from: a */
    public final ilp m2664a(String str, String str2, int i) {
        if (!this.f5608a.mo1544e(str, str2)) {
            iqz iqz = this.f5609b;
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 54) + String.valueOf(str2).length());
            stringBuilder.append("Initializing default value (");
            stringBuilder.append(i);
            stringBuilder.append(") for key: (");
            stringBuilder.append(str);
            stringBuilder.append(", ");
            stringBuilder.append(str2);
            stringBuilder.append(")");
            iqz.mo518d(stringBuilder.toString());
            this.f5608a.mo1531a(str, str2, i);
        }
        return new gok(this.f5608a, str, str2);
    }

    /* renamed from: a */
    public final ilp m2663a(String str, String str2) {
        return new gox(this.f5608a, str, str2);
    }

    /* renamed from: a */
    public final ilp m2665a(String str, String str2, String str3) {
        if (!this.f5608a.mo1544e(str, str2)) {
            iqz iqz = this.f5609b;
            int length = String.valueOf(str3).length();
            StringBuilder stringBuilder = new StringBuilder(((length + 43) + String.valueOf(str).length()) + String.valueOf(str2).length());
            stringBuilder.append("Initializing default value (");
            stringBuilder.append(str3);
            stringBuilder.append(") for key: (");
            stringBuilder.append(str);
            stringBuilder.append(", ");
            stringBuilder.append(str2);
            stringBuilder.append(")");
            iqz.mo518d(stringBuilder.toString());
            this.f5608a.mo1532a(str, str2, str3);
        }
        return m2663a(str, str2);
    }

    /* renamed from: b */
    public final ilp m2668b(String str, String str2) {
        return m2665a("default_scope", str, str2);
    }
}
