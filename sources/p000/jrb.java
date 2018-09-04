package p000;

import android.graphics.Bitmap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: jrb */
public class jrb implements jqt {
    /* renamed from: a */
    private final jaq f18965a;
    /* renamed from: b */
    private final jrj f18966b;
    /* renamed from: c */
    private Executor f18967c;

    public jrb(kpk kpk, jrj jrj) {
        jri.m13152b((Object) kpk);
        jri.m13152b((Object) jrj);
        this.f18965a = jli.m12940a(kpk);
        this.f18966b = jrj;
    }

    /* renamed from: b */
    private final synchronized Executor m13120b() {
        if (this.f18967c == null) {
            Executor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 250, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            this.f18967c = threadPoolExecutor;
        }
        return this.f18967c;
    }

    /* renamed from: a */
    public final void mo2040a(long j, Bitmap bitmap, boolean z) {
        jaq a = this.f18965a.mo1973a(m13120b(), new jrc(j, bitmap));
        this.f18966b.m4621a(j, a, bitmap.getWidth(), bitmap.getHeight(), z);
    }

    /* renamed from: a */
    public final void mo2039a() {
    }
}
