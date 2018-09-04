package p000;

import java.util.Collections;

/* renamed from: ipe */
public final /* synthetic */ class ipe implements Runnable {
    /* renamed from: a */
    private final ioo f7276a;

    public ipe(ioo ioo) {
        this.f7276a = ioo;
    }

    public final void run() {
        ioo ioo = this.f7276a;
        if (!ioo.f18417j) {
            for (iop e : Collections.unmodifiableCollection(ioo.f18411d)) {
                e.mo2663e();
            }
            ioo.f18417j = true;
        }
    }
}
