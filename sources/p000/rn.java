package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;

/* compiled from: PG */
/* renamed from: rn */
public class rn extends TextView {
    /* renamed from: a */
    private final ql f9128a;
    /* renamed from: b */
    private final rm f9129b;

    public rn(Context context) {
        this(context, null);
    }

    public rn(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public rn(Context context, AttributeSet attributeSet, int i) {
        super(vh.m6044a(context), attributeSet, i);
        this.f9128a = new ql(this);
        this.f9128a.m5715a(attributeSet, i);
        this.f9129b = new rm(this);
        this.f9129b.m5755a(attributeSet, i);
        this.f9129b.m5753a();
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        ql qlVar = this.f9128a;
        if (qlVar != null) {
            qlVar.m5713a();
        }
        rm rmVar = this.f9129b;
        if (rmVar != null) {
            rmVar.m5753a();
        }
    }

    public int getAutoSizeTextType() {
        return super.getAutoSizeTextType() != 1 ? 0 : 1;
    }

    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return ha.m2962a(super.onCreateInputConnection(editorInfo), editorInfo, (View) this);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        ql qlVar = this.f9128a;
        if (qlVar != null) {
            qlVar.m5716b();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        ql qlVar = this.f9128a;
        if (qlVar != null) {
            qlVar.m5714a(i);
        }
    }

    public void setLineHeight(int i) {
        ha.m2970a((TextView) this, i);
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        rm rmVar = this.f9129b;
        if (rmVar != null) {
            rmVar.m5754a(context, i);
        }
    }
}
