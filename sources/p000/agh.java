package p000;

/* compiled from: PG */
/* renamed from: agh */
final class agh implements Appendable {
    /* renamed from: a */
    private final Appendable f436a;
    /* renamed from: b */
    private boolean f437b = true;

    agh(Appendable appendable) {
        this.f436a = appendable;
    }

    public final Appendable append(char c) {
        boolean z = false;
        if (this.f437b) {
            this.f437b = false;
            this.f436a.append("  ");
        }
        if (c == '\n') {
            z = true;
        }
        this.f437b = z;
        this.f436a.append(c);
        return this;
    }

    public final Appendable append(CharSequence charSequence) {
        CharSequence a = agh.m238a(charSequence);
        return append(a, 0, a.length());
    }

    public final Appendable append(CharSequence charSequence, int i, int i2) {
        boolean z = false;
        CharSequence a = agh.m238a(charSequence);
        if (this.f437b) {
            this.f437b = false;
            this.f436a.append("  ");
        }
        if (a.length() > 0 && a.charAt(i2 - 1) == '\n') {
            z = true;
        }
        this.f437b = z;
        this.f436a.append(a, i, i2);
        return this;
    }

    /* renamed from: a */
    private static CharSequence m238a(CharSequence charSequence) {
        if (charSequence == null) {
            return "";
        }
        return charSequence;
    }
}
