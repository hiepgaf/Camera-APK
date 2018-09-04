package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: qy */
public final class qy extends MultiAutoCompleteTextView {
    /* renamed from: a */
    private static final int[] f9092a = new int[]{16843126};
    /* renamed from: b */
    private final ql f9093b;
    /* renamed from: c */
    private final rm f9094c;

    public qy(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private qy(Context context, AttributeSet attributeSet, byte b) {
        super(vh.m6044a(context), attributeSet, R.attr.autoCompleteTextViewStyle);
        vk a = vk.m6047a(getContext(), attributeSet, f9092a, R.attr.autoCompleteTextViewStyle, 0);
        if (a.m6060f(0)) {
            setDropDownBackgroundDrawable(a.m6052b(0));
        }
        a.f9419b.recycle();
        this.f9093b = new ql(this);
        this.f9093b.m5715a(attributeSet, R.attr.autoCompleteTextViewStyle);
        this.f9094c = new rm(this);
        this.f9094c.m5755a(attributeSet, (int) R.attr.autoCompleteTextViewStyle);
        this.f9094c.m5753a();
    }

    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        ql qlVar = this.f9093b;
        if (qlVar != null) {
            qlVar.m5713a();
        }
        rm rmVar = this.f9094c;
        if (rmVar != null) {
            rmVar.m5753a();
        }
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return ha.m2962a(super.onCreateInputConnection(editorInfo), editorInfo, (View) this);
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        ql qlVar = this.f9093b;
        if (qlVar != null) {
            qlVar.m5716b();
        }
    }

    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        ql qlVar = this.f9093b;
        if (qlVar != null) {
            qlVar.m5714a(i);
        }
    }

    public final void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(nj.m5620b(getContext(), i));
    }

    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        rm rmVar = this.f9094c;
        if (rmVar != null) {
            rmVar.m5754a(context, i);
        }
    }
}
