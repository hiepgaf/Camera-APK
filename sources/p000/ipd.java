package p000;

import java.util.Collections;

/* renamed from: ipd */
public final /* synthetic */ class ipd implements Runnable {
    /* renamed from: a */
    private final ioo f7275a;

    public ipd(ioo ioo) {
        this.f7275a = ioo;
    }

    public final void run() {
        ioo ioo = this.f7275a;
        if (!ioo.f18417j) {
            for (iop e : Collections.unmodifiableCollection(ioo.f18411d)) {
                e.mo2663e();
            }
            ioo.f18417j = true;
        }
    }
}
