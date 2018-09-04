package p000;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: PG */
/* renamed from: ow */
final class ow extends FrameLayout implements np {
    /* renamed from: a */
    public final CollapsibleActionView f19537a;

    ow(View view) {
        super(view.getContext());
        this.f19537a = (CollapsibleActionView) view;
        addView(view);
    }

    /* renamed from: a */
    public final void mo309a() {
        this.f19537a.onActionViewCollapsed();
    }

    /* renamed from: b */
    public final void mo310b() {
        this.f19537a.onActionViewExpanded();
    }
}
