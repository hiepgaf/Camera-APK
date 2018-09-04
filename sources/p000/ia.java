package p000;

/* compiled from: PG */
/* renamed from: ia */
final class ia {
    /* renamed from: f */
    private static final byte[] f6859f = new byte[1792];
    /* renamed from: a */
    public final CharSequence f6860a;
    /* renamed from: b */
    public final boolean f6861b = false;
    /* renamed from: c */
    public final int f6862c;
    /* renamed from: d */
    public int f6863d;
    /* renamed from: e */
    public char f6864e;

    static {
        for (int i = 0; i < 1792; i++) {
            f6859f[i] = Character.getDirectionality(i);
        }
    }

    ia(CharSequence charSequence) {
        this.f6860a = charSequence;
        this.f6862c = charSequence.length();
    }

    /* renamed from: a */
    final byte m3598a() {
        this.f6864e = this.f6860a.charAt(this.f6863d - 1);
        if (Character.isLowSurrogate(this.f6864e)) {
            int codePointBefore = Character.codePointBefore(this.f6860a, this.f6863d);
            this.f6863d -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f6863d--;
        return ia.m3597a(this.f6864e);
    }

    /* renamed from: a */
    static byte m3597a(char c) {
        return c < '܀' ? f6859f[c] : Character.getDirectionality(c);
    }
}
