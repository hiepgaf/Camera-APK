package p000;

import java.util.Collections;

/* renamed from: ipc */
public final /* synthetic */ class ipc implements Runnable {
    /* renamed from: a */
    private final ioo f7274a;

    public ipc(ioo ioo) {
        this.f7274a = ioo;
    }

    public final void run() {
        for (iop d : Collections.unmodifiableCollection(this.f7274a.f18411d)) {
            d.mo2662d();
        }
    }
}
