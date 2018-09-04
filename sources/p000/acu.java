package p000;

import java.io.File;
import java.io.IOException;

/* compiled from: PG */
/* renamed from: acu */
public final class acu {
    /* renamed from: a */
    public final acv f271a;
    /* renamed from: b */
    public final boolean[] f272b;
    /* renamed from: c */
    private boolean f273c;
    /* renamed from: d */
    private final /* synthetic */ acr f274d;

    acu(acr acr, acv acv) {
        boolean[] zArr;
        this.f274d = acr;
        this.f271a = acv;
        if (acv.f279e) {
            zArr = null;
        } else {
            zArr = new boolean[acr.f257b];
        }
        this.f272b = zArr;
    }

    /* renamed from: a */
    public final void m137a() {
        this.f274d.m130a(this, false);
    }

    /* renamed from: b */
    public final void m138b() {
        if (!this.f273c) {
            try {
                m137a();
            } catch (IOException e) {
            }
        }
    }

    /* renamed from: c */
    public final void m139c() {
        this.f274d.m130a(this, true);
        this.f273c = true;
    }

    /* renamed from: d */
    public final File m140d() {
        File file;
        synchronized (this.f274d) {
            acv acv = this.f271a;
            if (acv.f280f != this) {
                throw new IllegalStateException();
            }
            if (!acv.f279e) {
                this.f272b[0] = true;
            }
            file = acv.f278d[0];
            if (!this.f274d.f256a.exists()) {
                this.f274d.f256a.mkdirs();
            }
        }
        return file;
    }
}
