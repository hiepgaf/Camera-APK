package p000;

import android.view.Surface;

/* compiled from: PG */
/* renamed from: bib */
public final class bib implements iqo, Runnable {
    /* renamed from: a */
    private final bic f10905a;
    /* renamed from: b */
    private final Surface f10906b;
    /* renamed from: c */
    private final bhj f10907c;
    /* renamed from: d */
    private final bhs f10908d;
    /* renamed from: e */
    private final Object f10909e = new Object();
    /* renamed from: f */
    private boolean f10910f = false;

    public bib(bic bic, Surface surface, bhj bhj, bhs bhs) {
        this.f10905a = bic;
        this.f10906b = surface;
        this.f10907c = bhj;
        this.f10908d = bhs;
    }

    public final void close() {
        synchronized (this.f10909e) {
            this.f10910f = true;
        }
    }

    public final void run() {
        synchronized (this.f10909e) {
            if (this.f10910f) {
                return;
            }
            this.f10905a.m7406a(this.f10907c, this.f10906b, this.f10908d);
        }
    }
}
