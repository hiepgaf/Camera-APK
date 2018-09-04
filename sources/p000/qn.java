package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckBox;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: qn */
public final class qn extends CheckBox {
    /* renamed from: a */
    private final qp f9058a;

    public qn(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private qn(Context context, AttributeSet attributeSet, byte b) {
        super(vh.m6044a(context), attributeSet, R.attr.checkboxStyle);
        this.f9058a = new qp(this);
        this.f9058a.m5722a(attributeSet, R.attr.checkboxStyle);
    }

    public final int getCompoundPaddingLeft() {
        return this.f9058a != null ? super.getCompoundPaddingLeft() : super.getCompoundPaddingLeft();
    }

    public final void setButtonDrawable(int i) {
        setButtonDrawable(nj.m5620b(getContext(), i));
    }

    public final void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        qp qpVar = this.f9058a;
        if (qpVar != null) {
            qpVar.m5721a();
        }
    }
}
