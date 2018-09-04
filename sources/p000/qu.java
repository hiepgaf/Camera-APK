package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: qu */
public final class qu extends EditText {
    /* renamed from: a */
    private final ql f9085a;
    /* renamed from: b */
    private final rm f9086b;

    public qu(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private qu(Context context, AttributeSet attributeSet, byte b) {
        super(vh.m6044a(context), attributeSet, R.attr.editTextStyle);
        this.f9085a = new ql(this);
        this.f9085a.m5715a(attributeSet, R.attr.editTextStyle);
        this.f9086b = new rm(this);
        this.f9086b.m5755a(attributeSet, (int) R.attr.editTextStyle);
        this.f9086b.m5753a();
    }

    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        ql qlVar = this.f9085a;
        if (qlVar != null) {
            qlVar.m5713a();
        }
        rm rmVar = this.f9086b;
        if (rmVar != null) {
            rmVar.m5753a();
        }
    }

    public final /* bridge */ /* synthetic */ CharSequence getText() {
        return getText();
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return ha.m2962a(super.onCreateInputConnection(editorInfo), editorInfo, (View) this);
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        ql qlVar = this.f9085a;
        if (qlVar != null) {
            qlVar.m5716b();
        }
    }

    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        ql qlVar = this.f9085a;
        if (qlVar != null) {
            qlVar.m5714a(i);
        }
    }

    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        rm rmVar = this.f9086b;
        if (rmVar != null) {
            rmVar.m5754a(context, i);
        }
    }
}
