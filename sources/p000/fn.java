package p000;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* compiled from: PG */
/* renamed from: fn */
public final class fn {
    /* renamed from: a */
    public final ViewGroupOverlay f4632a;

    public fn(ViewGroup viewGroup) {
        this.f4632a = viewGroup.getOverlay();
    }

    /* renamed from: a */
    public final void m2346a(View view) {
        this.f4632a.remove(view);
    }
}
