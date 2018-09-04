package p000;

import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: hda */
final class hda implements OnGlobalLayoutListener, hcz {
    /* renamed from: a */
    private final AtomicReference f21568a;
    /* renamed from: b */
    private final List f21569b;
    /* renamed from: c */
    private final List f21570c;
    /* renamed from: d */
    private final AtomicInteger f21571d;
    /* renamed from: e */
    private final Object f21572e;
    /* renamed from: f */
    private boolean f21573f;
    /* renamed from: g */
    private iqo f21574g = hdb.f17668a;

    hda(View view) {
        this.f21568a = new AtomicReference(view);
        this.f21571d = new AtomicInteger(-1);
        this.f21572e = new Object();
        this.f21569b = Collections.synchronizedList(new ArrayList());
        this.f21570c = Collections.synchronizedList(new ArrayList());
        this.f21573f = false;
    }

    /* renamed from: a */
    public final void mo3074a(Runnable runnable) {
        this.f21570c.add(runnable);
    }

    /* renamed from: b */
    public final void mo3076b(Runnable runnable) {
        this.f21569b.add(runnable);
    }

    public final void close() {
        mo3075b();
        this.f21569b.clear();
        this.f21570c.clear();
        this.f21568a.set(null);
    }

    public final void onGlobalLayout() {
        View view = (View) this.f21568a.get();
        if (view != null) {
            int visibility = view.getVisibility();
            if (visibility == 0) {
                if (!view.isShown()) {
                    return;
                }
            }
            if (visibility == 4) {
                if (view.isShown()) {
                    return;
                }
            }
            if (visibility != 8 || !view.isShown()) {
                int andSet = this.f21571d.getAndSet(visibility);
                if (andSet == visibility) {
                    return;
                }
                if (visibility == 0) {
                    for (Runnable run : this.f21569b) {
                        run.run();
                    }
                } else if (andSet >= 0) {
                    for (Runnable run2 : this.f21570c) {
                        run2.run();
                    }
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final void mo3073a() {
        /*
        r3 = this;
        r1 = r3.f21572e;
        monitor-enter(r1);
        r0 = r3.f21568a;	 Catch:{ all -> 0x0026 }
        r0 = r0.get();	 Catch:{ all -> 0x0026 }
        r0 = (android.view.View) r0;	 Catch:{ all -> 0x0026 }
        r2 = r3.f21573f;	 Catch:{ all -> 0x0026 }
        if (r2 != 0) goto L_0x0011;
    L_0x000f:
        if (r0 != 0) goto L_0x0013;
    L_0x0011:
        monitor-exit(r1);	 Catch:{ all -> 0x0026 }
    L_0x0012:
        return;
    L_0x0013:
        r0 = r0.getViewTreeObserver();	 Catch:{ all -> 0x0026 }
        r0.addOnGlobalLayoutListener(r3);	 Catch:{ all -> 0x0026 }
        r2 = 1;
        r3.f21573f = r2;	 Catch:{ all -> 0x0026 }
        r2 = new hdc;	 Catch:{ all -> 0x0026 }
        r2.<init>(r3, r0);	 Catch:{ all -> 0x0026 }
        r3.f21574g = r2;	 Catch:{ all -> 0x0026 }
        monitor-exit(r1);	 Catch:{ all -> 0x0026 }
        goto L_0x0012;
    L_0x0026:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0026 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: hda.a():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    public final void mo3075b() {
        /*
        r3 = this;
        r1 = r3.f21572e;
        monitor-enter(r1);
        r0 = r3.f21568a;	 Catch:{ all -> 0x0021 }
        r0 = r0.get();	 Catch:{ all -> 0x0021 }
        r0 = (android.view.View) r0;	 Catch:{ all -> 0x0021 }
        r2 = r3.f21573f;	 Catch:{ all -> 0x0021 }
        if (r2 == 0) goto L_0x0011;
    L_0x000f:
        if (r0 != 0) goto L_0x0013;
    L_0x0011:
        monitor-exit(r1);	 Catch:{ all -> 0x0021 }
    L_0x0012:
        return;
    L_0x0013:
        r0 = r3.f21574g;	 Catch:{ all -> 0x0021 }
        r0.close();	 Catch:{ all -> 0x0021 }
        r0 = p000.hdd.f17671a;	 Catch:{ all -> 0x0021 }
        r3.f21574g = r0;	 Catch:{ all -> 0x0021 }
        r0 = 0;
        r3.f21573f = r0;	 Catch:{ all -> 0x0021 }
        monitor-exit(r1);	 Catch:{ all -> 0x0021 }
        goto L_0x0012;
    L_0x0021:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0021 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: hda.b():void");
    }
}
