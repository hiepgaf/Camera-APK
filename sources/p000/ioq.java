package p000;

import android.media.MediaFormat;

/* compiled from: PG */
/* renamed from: ioq */
public final class ioq implements Comparable {
    /* renamed from: a */
    public final boolean f7239a;
    /* renamed from: b */
    public boolean f7240b = false;
    /* renamed from: c */
    public boolean f7241c = true;
    /* renamed from: d */
    public MediaFormat f7242d = null;
    /* renamed from: e */
    private int f7243e = -1;

    public ioq(boolean z) {
        this.f7239a = z;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return m3971a() - ((ioq) obj).m3971a();
    }

    /* renamed from: a */
    public final int m3971a() {
        if (this.f7240b) {
            return this.f7243e;
        }
        throw new IllegalStateException("Track is not yet added");
    }

    /* renamed from: a */
    public final void m3972a(int i) {
        if (this.f7239a) {
            this.f7243e = i;
            this.f7240b = true;
            return;
        }
        throw new IllegalStateException("This track is not required.");
    }
}
