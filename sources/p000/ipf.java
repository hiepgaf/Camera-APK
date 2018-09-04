package p000;

import java.util.Collections;

/* renamed from: ipf */
public final /* synthetic */ class ipf implements Runnable {
    /* renamed from: a */
    private final ioo f7277a;

    public ipf(ioo ioo) {
        this.f7277a = ioo;
    }

    public final void run() {
        ioo ioo = this.f7277a;
        if (!ioo.f18418k) {
            for (iop c : Collections.unmodifiableCollection(ioo.f18411d)) {
                c.mo2661c();
            }
            ioo.f18418k = true;
        }
    }
}
