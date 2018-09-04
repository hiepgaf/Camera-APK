package p000;

import java.util.Collections;

/* renamed from: iph */
public final /* synthetic */ class iph implements Runnable {
    /* renamed from: a */
    private final ioo f7279a;

    public iph(ioo ioo) {
        this.f7279a = ioo;
    }

    public final void run() {
        for (iop f : Collections.unmodifiableCollection(this.f7279a.f18411d)) {
            f.mo2664f();
        }
    }
}
