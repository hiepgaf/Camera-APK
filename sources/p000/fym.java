package p000;

import java.util.List;

/* renamed from: fym */
final /* synthetic */ class fym implements kaw {
    /* renamed from: a */
    public static final kaw f16646a = new fym();

    private fym() {
    }

    /* renamed from: a */
    public final Object mo370a(Object obj) {
        int i = 0;
        for (Integer intValue : (List) obj) {
            i = intValue.intValue() + i;
        }
        return Integer.valueOf(i);
    }
}
