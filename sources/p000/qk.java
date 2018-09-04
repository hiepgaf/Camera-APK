package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: qk */
public class qk extends AutoCompleteTextView {
    /* renamed from: a */
    private static final int[] f9047a = new int[]{16843126};
    /* renamed from: b */
    private final ql f9048b;
    /* renamed from: c */
    private final rm f9049c;

    public qk(Context context) {
        this(context, null);
    }

    public qk(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
    }

    public qk(Context context, AttributeSet attributeSet, int i) {
        super(vh.m6044a(context), attributeSet, i);
        vk a = vk.m6047a(getContext(), attributeSet, f9047a, i, 0);
        if (a.m6060f(0)) {
            setDropDownBackgroundDrawable(a.m6052b(0));
        }
        a.f9419b.recycle();
        this.f9048b = new ql(this);
        this.f9048b.m5715a(attributeSet, i);
        this.f9049c = new rm(this);
        this.f9049c.m5755a(attributeSet, i);
        this.f9049c.m5753a();
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        ql qlVar = this.f9048b;
        if (qlVar != null) {
            qlVar.m5713a();
        }
        rm rmVar = this.f9049c;
        if (rmVar != null) {
            rmVar.m5753a();
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return ha.m2962a(super.onCreateInputConnection(editorInfo), editorInfo, (View) this);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        ql qlVar = this.f9048b;
        if (qlVar != null) {
            qlVar.m5716b();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        ql qlVar = this.f9048b;
        if (qlVar != null) {
            qlVar.m5714a(i);
        }
    }

    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(nj.m5620b(getContext(), i));
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        rm rmVar = this.f9049c;
        if (rmVar != null) {
            rmVar.m5754a(context, i);
        }
    }
}
