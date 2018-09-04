package p000;

/* compiled from: PG */
/* renamed from: ib */
public final class ib {
    /* renamed from: a */
    private final C0122if f6891a;
    /* renamed from: b */
    private final boolean f6892b;

    private ib(C0122if c0122if) {
        this.f6891a = c0122if;
    }

    ib(C0122if c0122if, boolean z) {
        this(c0122if);
        this.f6892b = z;
    }

    /* renamed from: a */
    public final boolean m3607a(CharSequence charSequence, int i) {
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            throw new IllegalArgumentException();
        }
        C0122if c0122if = this.f6891a;
        if (c0122if == null) {
            return this.f6892b;
        }
        switch (c0122if.mo1842a(charSequence, 0, i)) {
            case 0:
                return true;
            case 1:
                return false;
            default:
                return this.f6892b;
        }
    }
}
