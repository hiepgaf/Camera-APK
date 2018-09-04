package p000;

import android.database.ContentObserver;

/* compiled from: PG */
/* renamed from: cpl */
public final class cpl extends ContentObserver {
    /* renamed from: a */
    public cpm f2541a;
    /* renamed from: b */
    public boolean f2542b = false;
    /* renamed from: c */
    private boolean f2543c = false;

    public cpl() {
        super(null);
    }

    public final void onChange(boolean z) {
        if (this.f2541a != null) {
            bli.m863a(cfk.f20249a, "localImagesObserver foreground listener detected change.");
        }
        if (this.f2543c) {
            this.f2542b = true;
        }
    }

    /* renamed from: a */
    public final void m1391a(boolean z) {
        this.f2543c = z;
        if (!z) {
            this.f2542b = false;
        }
    }
}
