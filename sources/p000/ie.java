package p000;

/* compiled from: PG */
/* renamed from: ie */
final class ie implements C0122if {
    /* renamed from: a */
    public static final ie f18285a = new ie();

    private ie() {
    }

    /* renamed from: a */
    public final int mo1842a(CharSequence charSequence, int i, int i2) {
        int i3 = i2 + 0;
        int i4 = 2;
        for (int i5 = 0; i5 < i3 && i4 == 2; i5++) {
            i4 = ic.m3666b(Character.getDirectionality(charSequence.charAt(i5)));
        }
        return i4;
    }
}
