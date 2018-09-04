package p000;

/* compiled from: PG */
/* renamed from: id */
final class id implements C0122if {
    /* renamed from: a */
    public static final id f18223a = new id(true);
    /* renamed from: b */
    private final boolean f18224b;

    static {
        id idVar = new id(false);
    }

    private id(boolean z) {
        this.f18224b = z;
    }

    /* renamed from: a */
    public final int mo1842a(CharSequence charSequence, int i, int i2) {
        int i3 = i2 + 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            switch (ic.m3665a(Character.getDirectionality(charSequence.charAt(i5)))) {
                case 0:
                    if (!this.f18224b) {
                        i4 = 1;
                        break;
                    }
                    return 0;
                case 1:
                    if (this.f18224b) {
                        i4 = 1;
                        break;
                    }
                    return 1;
                default:
                    break;
            }
        }
        return i4 != 0 ? this.f18224b : 2;
    }
}
