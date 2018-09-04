package p000;

import android.support.design.internal.CheckableImageButton;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* compiled from: PG */
/* renamed from: ch */
public final class ch extends jd {
    /* renamed from: c */
    private final /* synthetic */ CheckableImageButton f11931c;

    public ch(CheckableImageButton checkableImageButton) {
        this.f11931c = checkableImageButton;
    }

    /* renamed from: a */
    public final void mo683a(View view, AccessibilityEvent accessibilityEvent) {
        super.mo683a(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.f11931c.isChecked());
    }

    /* renamed from: a */
    public final void mo684a(View view, kk kkVar) {
        super.mo684a(view, kkVar);
        kkVar.m4988a(true);
        kkVar.f8327a.setChecked(this.f11931c.isChecked());
    }
}
