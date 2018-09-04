package p000;

import android.graphics.RectF;
import android.widget.FrameLayout.LayoutParams;

/* compiled from: PG */
/* renamed from: dam */
final class dam implements ham {
    /* renamed from: a */
    private final /* synthetic */ dak f13038a;

    dam(dak dak) {
        this.f13038a = dak;
    }

    /* renamed from: a */
    public final void mo1132a(RectF rectF) {
        LayoutParams layoutParams = (LayoutParams) this.f13038a.f2908d.getLayoutParams();
        layoutParams.width = (int) Math.ceil((double) rectF.width());
        layoutParams.height = Math.round(rectF.height());
        layoutParams.setMargins(Math.round(rectF.left), Math.round(rectF.top), 0, 0);
        this.f13038a.f2908d.setLayoutParams(layoutParams);
        this.f13038a.f2909e.setLayoutParams(layoutParams);
        this.f13038a.f2910f.f2429b.set(new RectF(rectF));
    }
}
