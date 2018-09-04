package p000;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;

/* compiled from: PG */
/* renamed from: qo */
public final class qo extends CheckedTextView {
    /* renamed from: a */
    private static final int[] f9059a = new int[]{16843016};
    /* renamed from: b */
    private final rm f9060b;

    public qo(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private qo(Context context, AttributeSet attributeSet, byte b) {
        super(vh.m6044a(context), attributeSet, 16843720);
        this.f9060b = new rm(this);
        this.f9060b.m5755a(attributeSet, 16843720);
        this.f9060b.m5753a();
        vk a = vk.m6047a(getContext(), attributeSet, f9059a, 16843720, 0);
        setCheckMarkDrawable(a.m6052b(0));
        a.f9419b.recycle();
    }

    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        rm rmVar = this.f9060b;
        if (rmVar != null) {
            rmVar.m5753a();
        }
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return ha.m2962a(super.onCreateInputConnection(editorInfo), editorInfo, (View) this);
    }

    public final void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(nj.m5620b(getContext(), i));
    }

    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        rm rmVar = this.f9060b;
        if (rmVar != null) {
            rmVar.m5754a(context, i);
        }
    }
}
