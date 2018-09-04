package p000;

import java.lang.ref.WeakReference;
import java.util.logging.Logger;

/* compiled from: PG */
/* renamed from: kbi */
public final class kbi {
    static {
        Logger.getLogger(kbi.class.getName());
        kbh kbh = new kbh();
    }

    private kbi() {
    }

    /* renamed from: a */
    static kbg m4751a(Class cls, String str) {
        WeakReference weakReference = (WeakReference) kav.m4728a(cls).get(str);
        if (weakReference != null) {
            return kbg.m4745c((Enum) cls.cast(weakReference.get()));
        }
        return kau.f19138a;
    }

    /* renamed from: a */
    public static boolean m4752a(String str) {
        return str == null || str.isEmpty();
    }
}
