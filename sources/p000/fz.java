package p000;

import android.view.View;
import android.view.WindowId;

/* compiled from: PG */
/* renamed from: fz */
final class fz {
    /* renamed from: a */
    private final WindowId f4836a;

    fz(View view) {
        this.f4836a = view.getWindowId();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof fz) && ((fz) obj).f4836a.equals(this.f4836a);
    }

    public final int hashCode() {
        return this.f4836a.hashCode();
    }
}
