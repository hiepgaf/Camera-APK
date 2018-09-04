package p000;

import android.database.DataSetObserver;

/* compiled from: PG */
/* renamed from: tk */
final class tk extends DataSetObserver {
    /* renamed from: a */
    private final /* synthetic */ tg f9280a;

    tk(tg tgVar) {
        this.f9280a = tgVar;
    }

    public final void onChanged() {
        if (this.f9280a.f19629r.isShowing()) {
            this.f9280a.mo2474f();
        }
    }

    public final void onInvalidated() {
        this.f9280a.mo2471c();
    }
}
