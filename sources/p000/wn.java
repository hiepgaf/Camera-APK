package p000;

/* compiled from: PG */
/* renamed from: wn */
public final class wn {
    /* renamed from: a */
    public String f9465a;
    /* renamed from: b */
    public int f9466b = 0;

    public wn(String str) {
        this.f9465a = str;
    }

    /* renamed from: a */
    public final char m6153a() {
        if (this.f9466b >= this.f9465a.length()) {
            return '\u0000';
        }
        return this.f9465a.charAt(this.f9466b);
    }

    /* renamed from: a */
    public final char m6154a(int i) {
        if (i >= this.f9465a.length()) {
            return '\u0000';
        }
        return this.f9465a.charAt(i);
    }

    /* renamed from: a */
    public final int m6155a(String str, int i) {
        int a = m6154a(this.f9466b);
        Object obj = null;
        int i2 = 0;
        while (a >= 48 && a <= 57) {
            int i3 = (i2 * 10) + (a - 48);
            this.f9466b++;
            i2 = i3;
            i3 = 1;
            char a2 = m6154a(this.f9466b);
        }
        if (obj == null) {
            throw new wb(str, 5);
        } else if (i2 > i) {
            return i;
        } else {
            if (i2 < 0) {
                return 0;
            }
            return i2;
        }
    }

    /* renamed from: b */
    public final boolean m6156b() {
        return this.f9466b < this.f9465a.length();
    }

    /* renamed from: c */
    public final void m6157c() {
        this.f9466b++;
    }
}
