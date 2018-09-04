package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import com.google.android.GoogleCamera.R;
import p000.jm;
import p000.kvl;
import p000.ni;
import p000.pr;

/* compiled from: PG */
public class ActionBarContainer extends FrameLayout {
    /* renamed from: a */
    public View f629a;
    /* renamed from: b */
    public Drawable f630b;
    /* renamed from: c */
    public Drawable f631c;
    /* renamed from: d */
    public Drawable f632d;
    /* renamed from: e */
    public boolean f633e;
    /* renamed from: f */
    public boolean f634f;
    /* renamed from: g */
    private boolean f635g;
    /* renamed from: h */
    private View f636h;
    /* renamed from: i */
    private View f637i;
    /* renamed from: j */
    private int f638j;

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        boolean z = true;
        super(context, attributeSet);
        jm.m4555a((View) this, new pr(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ni.f8899a);
        this.f630b = obtainStyledAttributes.getDrawable(ni.f8902d);
        this.f631c = obtainStyledAttributes.getDrawable(ni.f8904f);
        this.f638j = obtainStyledAttributes.getDimensionPixelSize(ni.f8910l, -1);
        if (getId() == R.id.split_action_bar) {
            this.f633e = true;
            this.f632d = obtainStyledAttributes.getDrawable(ni.f8903e);
        }
        obtainStyledAttributes.recycle();
        if (this.f633e) {
            if (this.f632d != null) {
                z = false;
            }
        } else if (this.f630b != null) {
            z = false;
        } else if (this.f631c != null) {
            z = false;
        }
        setWillNotDraw(z);
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f630b;
        if (drawable != null && drawable.isStateful()) {
            this.f630b.setState(getDrawableState());
        }
        drawable = this.f631c;
        if (drawable != null && drawable.isStateful()) {
            this.f631c.setState(getDrawableState());
        }
        drawable = this.f632d;
        if (drawable != null && drawable.isStateful()) {
            this.f632d.setState(getDrawableState());
        }
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f630b;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        drawable = this.f631c;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        drawable = this.f632d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f636h = findViewById(R.id.action_bar);
        this.f637i = findViewById(R.id.action_context_bar);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f635g || super.onInterceptTouchEvent(motionEvent);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = true;
        super.onLayout(z, i, i2, i3, i4);
        if (this.f633e) {
            Drawable drawable = this.f632d;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.f630b == null) {
                z2 = false;
            } else if (this.f636h.getVisibility() == 0) {
                this.f630b.setBounds(this.f636h.getLeft(), this.f636h.getTop(), this.f636h.getRight(), this.f636h.getBottom());
            } else {
                View view = this.f637i;
                if (view == null || view.getVisibility() != 0) {
                    this.f630b.setBounds(0, 0, 0, 0);
                } else {
                    this.f630b.setBounds(this.f637i.getLeft(), this.f637i.getTop(), this.f637i.getRight(), this.f637i.getBottom());
                }
            }
            this.f634f = false;
        }
        if (z2) {
            invalidate();
        }
    }

    public void onMeasure(int i, int i2) {
        if (this.f636h == null && MeasureSpec.getMode(i2) == kvl.UNSET_ENUM_VALUE) {
            int i3 = this.f638j;
            if (i3 >= 0) {
                i2 = MeasureSpec.makeMeasureSpec(Math.min(i3, MeasureSpec.getSize(i2)), kvl.UNSET_ENUM_VALUE);
            }
        }
        super.onMeasure(i, i2);
        if (this.f636h != null) {
            MeasureSpec.getMode(i2);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    /* renamed from: a */
    public final void m410a(boolean z) {
        int i;
        this.f635g = z;
        if (z) {
            i = 393216;
        } else {
            i = 262144;
        }
        setDescendantFocusability(i);
    }

    public void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        Drawable drawable = this.f630b;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        drawable = this.f631c;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        drawable = this.f632d;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    public ActionMode startActionModeForChild(View view, Callback callback) {
        return null;
    }

    public ActionMode startActionModeForChild(View view, Callback callback, int i) {
        return i != 0 ? super.startActionModeForChild(view, callback, i) : null;
    }

    protected boolean verifyDrawable(Drawable drawable) {
        if (drawable == this.f630b) {
            if (this.f633e) {
            }
            return true;
        }
        if (drawable == this.f631c) {
            if (!this.f634f) {
            }
            return true;
        }
        if (!((drawable == this.f632d && this.f633e) || super.verifyDrawable(drawable))) {
            return false;
        }
        return true;
    }
}
