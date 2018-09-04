package p000;

import android.util.Log;

/* compiled from: PG */
/* renamed from: ezs */
public final class ezs implements kov {
    /* renamed from: a */
    private final /* synthetic */ kpk f15814a;
    /* renamed from: b */
    private final /* synthetic */ Throwable f15815b;

    public ezs(kpk kpk, Throwable th) {
        this.f15814a = kpk;
        this.f15815b = th;
    }

    /* renamed from: a */
    public final void mo349a(Throwable th) {
        if (!this.f15814a.isDone()) {
            Log.w("MvLogging", "Future timed out", th);
            Log.w("MvLogging", "Check done at ", this.f15815b);
        }
    }

    public final void b_(Object obj) {
    }
}
