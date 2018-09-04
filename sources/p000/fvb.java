package p000;

import java.util.List;

/* renamed from: fvb */
public final /* synthetic */ class fvb implements kaw {
    /* renamed from: a */
    public static final kaw f16554a = new fvb();

    private fvb() {
    }

    /* renamed from: a */
    public final Object mo370a(Object obj) {
        boolean z = true;
        for (Boolean bool : (List) obj) {
            int i;
            if (bool == null) {
                i = 0;
            } else if (bool.booleanValue()) {
                i = 1;
            } else {
                i = 0;
            }
            z = i & z;
        }
        return Boolean.valueOf(z);
    }
}
