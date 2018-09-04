package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: rb */
public final class rb extends RadioButton {
    /* renamed from: a */
    private final qp f9098a;
    /* renamed from: b */
    private final rm f9099b;

    public rb(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private rb(Context context, AttributeSet attributeSet, byte b) {
        super(vh.m6044a(context), attributeSet, R.attr.radioButtonStyle);
        this.f9098a = new qp(this);
        this.f9098a.m5722a(attributeSet, R.attr.radioButtonStyle);
        this.f9099b = new rm(this);
        this.f9099b.m5755a(attributeSet, (int) R.attr.radioButtonStyle);
    }

    public final int getCompoundPaddingLeft() {
        return this.f9098a != null ? super.getCompoundPaddingLeft() : super.getCompoundPaddingLeft();
    }

    public final void setButtonDrawable(int i) {
        setButtonDrawable(nj.m5620b(getContext(), i));
    }

    public final void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        qp qpVar = this.f9098a;
        if (qpVar != null) {
            qpVar.m5721a();
        }
    }
}
