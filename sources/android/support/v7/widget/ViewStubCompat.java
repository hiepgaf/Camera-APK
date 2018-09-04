package android.support.v7.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import p000.ni;

/* compiled from: PG */
public final class ViewStubCompat extends View {
    /* renamed from: a */
    public LayoutInflater f736a;
    /* renamed from: b */
    private int f737b;
    /* renamed from: c */
    private int f738c;
    /* renamed from: d */
    private WeakReference f739d;

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f737b = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ni.cF, i, 0);
        this.f738c = obtainStyledAttributes.getResourceId(ni.cH, -1);
        this.f737b = obtainStyledAttributes.getResourceId(ni.cI, 0);
        setId(obtainStyledAttributes.getResourceId(ni.cG, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    protected final void dispatchDraw(Canvas canvas) {
    }

    @SuppressLint({"MissingSuperCall"})
    public final void draw(Canvas canvas) {
    }

    /* renamed from: a */
    public final View m513a() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.f737b != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflater = this.f736a;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View inflate = layoutInflater.inflate(this.f737b, viewGroup, false);
            int i = this.f738c;
            if (i != -1) {
                inflate.setId(i);
            }
            i = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, i, layoutParams);
            } else {
                viewGroup.addView(inflate, i);
            }
            this.f739d = new WeakReference(inflate);
            return inflate;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    protected final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public final void setVisibility(int i) {
        WeakReference weakReference = this.f739d;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            m513a();
        }
    }
}
