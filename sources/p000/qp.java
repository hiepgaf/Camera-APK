package p000;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/* compiled from: PG */
/* renamed from: qp */
final class qp {
    /* renamed from: a */
    private final CompoundButton f9061a;
    /* renamed from: b */
    private boolean f9062b;

    qp(CompoundButton compoundButton) {
        this.f9061a = compoundButton;
    }

    /* renamed from: a */
    final void m5722a(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f9061a.getContext().obtainStyledAttributes(attributeSet, ni.ay, i, 0);
        try {
            if (obtainStyledAttributes.hasValue(0)) {
                int resourceId = obtainStyledAttributes.getResourceId(0, 0);
                if (resourceId != 0) {
                    CompoundButton compoundButton = this.f9061a;
                    compoundButton.setButtonDrawable(nj.m5620b(compoundButton.getContext(), resourceId));
                }
            }
            if (obtainStyledAttributes.hasValue(1)) {
                this.f9061a.setButtonTintList(obtainStyledAttributes.getColorStateList(1));
            }
            if (obtainStyledAttributes.hasValue(2)) {
                this.f9061a.setButtonTintMode(sg.m5804a(obtainStyledAttributes.getInt(2, -1), null));
            }
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    final void m5721a() {
        if (this.f9062b) {
            this.f9062b = false;
            return;
        }
        this.f9062b = true;
        this.f9061a.getButtonDrawable();
    }
}
