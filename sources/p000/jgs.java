package p000;

/* renamed from: jgs */
final /* synthetic */ class jgs implements Runnable {
    /* renamed from: a */
    private final jhl f7814a;
    /* renamed from: b */
    private final jgy f7815b;

    jgs(jhl jhl, jgy jgy) {
        this.f7814a = jhl;
        this.f7815b = jgy;
    }

    public final void run() {
        Object obj = null;
        jhl jhl = this.f7814a;
        jgy jgy = this.f7815b;
        long j = jgy.f7819b.presentationTimeUs;
        if (j >= jhl.f7836b && !jhl.m4491a(j)) {
            obj = 1;
        }
        if (obj != null) {
            ((jhf) jhl.f7835a).mo1295a(jgy.f7818a, jgy.f7819b);
            jgy.f7818a.rewind();
        } else if (jhl.m4491a(jgy.f7819b.presentationTimeUs)) {
            ((jhf) jhl.f7835a).close();
        }
    }
}
