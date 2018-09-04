package p000;

import android.view.View;
import android.view.View.OnClickListener;

/* compiled from: PG */
/* renamed from: elt */
final class elt implements OnClickListener {
    /* renamed from: a */
    private final /* synthetic */ els f3947a;

    elt(els els) {
        this.f3947a = els;
    }

    public final void onClick(View view) {
        els els = this.f3947a;
        int i = els.f15285a + 1;
        if (i >= els.f15286b.length) {
            els.m3086a();
        } else {
            els.m9753a(i);
        }
    }
}
