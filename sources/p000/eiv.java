package p000;

import android.view.View;
import android.view.View.OnClickListener;

/* compiled from: PG */
/* renamed from: eiv */
final class eiv implements OnClickListener {
    /* renamed from: a */
    private final /* synthetic */ eiu f3649a;

    eiv(eiu eiu) {
        this.f3649a = eiu;
    }

    public final void onClick(View view) {
        if (this.f3649a.f3646c != null) {
            view.setEnabled(false);
            chc chc = this.f3649a.f3646c;
            che che = new che(view);
            if (chc.f1972b == go.f5540D) {
                chc.f1975e = che;
                chc.f1971a.mo1108a(chw.A11Y_BUTTON);
                chc.f1973c.postDelayed(chc.f1974d, 5000);
            }
            chc.f1972b = go.f5541E;
        }
    }
}
