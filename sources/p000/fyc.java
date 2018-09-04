package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: fyc */
final class fyc implements fyr {
    /* renamed from: a */
    private AtomicBoolean f21435a = new AtomicBoolean(false);
    /* renamed from: b */
    private final /* synthetic */ fyb f21436b;

    fyc(fyb fyb) {
        this.f21436b = fyb;
    }

    public final void close() {
        fyr fyr = null;
        boolean z = true;
        if (!this.f21435a.getAndSet(true)) {
            fyb fyb = this.f21436b;
            synchronized (fyb.f4818b) {
                fyb.f4820d--;
                if (fyb.f4820d < 0) {
                    z = false;
                }
                jri.m13153b(z);
                if (fyb.f4819c && fyb.f4820d == 0) {
                    fyr = fyb.f4817a;
                }
            }
            if (fyr != null) {
                fyr.close();
            }
        }
    }
}
