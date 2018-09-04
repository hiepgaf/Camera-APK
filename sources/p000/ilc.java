package p000;

import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* renamed from: ilc */
final class ilc implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ Object f7074a;
    /* renamed from: b */
    private final /* synthetic */ ilb f7075b;

    ilc(ilb ilb, Object obj) {
        this.f7075b = ilb;
        this.f7074a = obj;
    }

    public final void run() {
        ilb ilb = this.f7075b;
        ilb.f21734c = this.f7074a;
        for (iqt a : ilb.f21733b) {
            try {
                a.mo348a(this.f7074a);
            } catch (RejectedExecutionException e) {
            }
        }
    }
}
