package p000;

import android.app.Activity;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: awi */
public final class awi {
    /* renamed from: a */
    private static final String f977a = bli.m862a("ActivityCloser");
    /* renamed from: b */
    private final WeakReference f978b;
    /* renamed from: c */
    private final AtomicBoolean f979c = new AtomicBoolean(false);

    awi(WeakReference weakReference) {
        this.f978b = weakReference;
    }

    /* renamed from: a */
    public final void m707a(String str) {
        ikd.m12259a();
        jri.m13143a(kbi.m4752a(str) ^ 1);
        Activity activity = (Activity) this.f978b.get();
        if (activity != null && !this.f979c.getAndSet(true)) {
            String str2 = f977a;
            String valueOf = String.valueOf(str);
            String str3 = "WARNING: Activity was artificially finished: ";
            if (valueOf.length() == 0) {
                valueOf = new String(str3);
            } else {
                valueOf = str3.concat(valueOf);
            }
            bli.m873e(str2, valueOf);
            activity.finish();
        }
    }
}
