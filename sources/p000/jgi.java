package p000;

import android.util.Log;

/* compiled from: PG */
/* renamed from: jgi */
public final class jgi extends jgj {
    /* renamed from: a */
    private final AutoCloseable f21845a;

    public jgi(jgk jgk, AutoCloseable autoCloseable) {
        super(jgk);
        this.f21845a = autoCloseable;
    }

    /* renamed from: a */
    public final void mo1302a(int i) {
        try {
            this.f21845a.close();
        } catch (Throwable e) {
            Log.w("CloseOnStopListener", "Exception while trying to close object.", e);
        }
        super.mo1302a(i);
    }
}
