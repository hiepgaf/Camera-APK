package p000;

import android.app.Dialog;
import android.content.Context;

/* compiled from: PG */
/* renamed from: clu */
final class clu extends Dialog {
    /* renamed from: a */
    private final /* synthetic */ cls f2132a;

    clu(cls cls, Context context, int i) {
        this.f2132a = cls;
        super(context, i);
    }

    public final void onBackPressed() {
        if (this.f2132a.f12158b.m1200a()) {
            this.f2132a.m8340d();
            return;
        }
        cmp cmp = this.f2132a.f12167k;
        if (cmp.f2162c) {
            cmp.m1192a();
        } else {
            super.onBackPressed();
        }
    }
}
