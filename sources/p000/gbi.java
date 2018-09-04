package p000;

import android.view.View;
import android.view.View.OnLayoutChangeListener;

/* compiled from: PG */
/* renamed from: gbi */
final class gbi implements OnLayoutChangeListener {
    /* renamed from: a */
    private final /* synthetic */ gxn f5018a;
    /* renamed from: b */
    private final /* synthetic */ View f5019b;
    /* renamed from: c */
    private final /* synthetic */ View f5020c;
    /* renamed from: d */
    private final /* synthetic */ gbd f5021d;

    gbi(gbd gbd, gxn gxn, View view, View view2) {
        this.f5021d = gbd;
        this.f5018a = gxn;
        this.f5019b = view;
        this.f5020c = view2;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f5018a.m2870a();
        gxn gxn = this.f5018a;
        View view2 = this.f5019b;
        gxn.m2872a(view2, gbd.m10932a(this.f5021d.f16720a, this.f5020c, view2));
    }
}
