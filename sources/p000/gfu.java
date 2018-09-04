package p000;

import android.content.Context;

/* compiled from: PG */
/* renamed from: gfu */
public final class gfu implements gft {
    /* renamed from: c */
    private static final String f21450c = bli.m862a("ImageShadowTask");
    /* renamed from: a */
    public final ghh f21451a;
    /* renamed from: b */
    public final Runnable f21452b;
    /* renamed from: d */
    private final get f21453d;

    public gfu(ghh ghh, get get, kbg kbg) {
        this.f21451a = ghh;
        this.f21453d = get;
        this.f21452b = (Runnable) kbg.mo2085c();
    }

    public gfu(gkr gkr) {
        this(new ghh().m2555b(1), gkr, kau.f19138a);
    }

    public final void addFinishedCallback(iqb iqb) {
        throw new RuntimeException("Not implemented yet");
    }

    public final get getSession() {
        return this.f21453d;
    }

    public final void process(Context context) {
        try {
            this.f21451a.m2553a();
        } catch (InterruptedException e) {
            bli.m873e(f21450c, "Image Shadow task Interrupted.");
        }
    }

    public final void removeFinishedCallback(iqb iqb) {
        throw new RuntimeException("Not implemented yet");
    }

    public final void resume() {
    }

    public final void suspend() {
    }

    /* renamed from: a */
    public final void mo3058a() {
        this.f21451a.m2555b(0);
        this.f21451a.m2556c();
    }
}
