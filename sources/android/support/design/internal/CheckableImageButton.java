package android.support.design.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.refocus.processing.DepthmapTask;
import p000.ch;
import p000.jm;
import p000.qv;

/* compiled from: PG */
public class CheckableImageButton extends qv implements Checkable {
    /* renamed from: a */
    private static final int[] f9952a = new int[]{16842912};
    /* renamed from: b */
    private boolean f9953b;

    public CheckableImageButton(Context context) {
        this(context, null);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        jm.m4559a((View) this, new ch(this));
    }

    public boolean isChecked() {
        return this.f9953b;
    }

    public int[] onCreateDrawableState(int i) {
        if (this.f9953b) {
            return mergeDrawableStates(super.onCreateDrawableState(f9952a.length + i), f9952a);
        }
        return super.onCreateDrawableState(i);
    }

    public void setChecked(boolean z) {
        if (this.f9953b != z) {
            this.f9953b = z;
            refreshDrawableState();
            sendAccessibilityEvent(DepthmapTask.MAX_REFERENCE_SIZE_HR_PX);
        }
    }

    public void toggle() {
        setChecked(this.f9953b ^ 1);
    }
}
