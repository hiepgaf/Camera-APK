package p000;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.support.v7.widget.ActionMenuView;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: pp */
public class pp extends ViewGroup {
    /* renamed from: a */
    public final Context f9027a;
    /* renamed from: b */
    public ActionMenuView f9028b;
    /* renamed from: c */
    public py f9029c;
    /* renamed from: d */
    public int f9030d;
    /* renamed from: e */
    public kd f9031e;
    /* renamed from: f */
    private final pq f9032f;
    /* renamed from: g */
    private boolean f9033g;
    /* renamed from: h */
    private boolean f9034h;

    pp(Context context) {
        this(context, null);
    }

    pp(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public pp(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f9032f = new pq(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f9027a = context;
        } else {
            this.f9027a = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    /* renamed from: a */
    public static int m5692a(View view, int i, int i2) {
        view.measure(MeasureSpec.makeMeasureSpec(i, kvl.UNSET_ENUM_VALUE), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    /* renamed from: a */
    public static int m5691a(int i, int i2, boolean z) {
        return !z ? i + i2 : i - i2;
    }

    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, ni.f8899a, R.attr.actionBarStyle, 0);
        mo286a(obtainStyledAttributes.getLayoutDimension(ni.f8910l, 0));
        obtainStyledAttributes.recycle();
        py pyVar = this.f9029c;
        if (pyVar != null) {
            pyVar.f22542i = nm.m5621a(pyVar.b).m5622a();
            if (pyVar.c != null) {
                pyVar.c.m14255b(true);
            }
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f9034h = false;
        }
        if (!this.f9034h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f9034h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f9034h = false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f9033g = false;
        }
        if (!this.f9033g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f9033g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f9033g = false;
        }
        return true;
    }

    /* renamed from: a */
    public static int m5693a(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    /* renamed from: a */
    public void mo286a(int i) {
        this.f9030d = i;
        requestLayout();
    }

    public void setVisibility(int i) {
        if (i != getVisibility()) {
            kd kdVar = this.f9031e;
            if (kdVar != null) {
                kdVar.m4772a();
            }
            super.setVisibility(i);
        }
    }

    /* renamed from: a */
    public final kd m5696a(int i, long j) {
        kd kdVar = this.f9031e;
        if (kdVar != null) {
            kdVar.m4772a();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            kdVar = jm.m4547a(this).m4768a(1.0f);
            kdVar.m4769a(j);
            kdVar.m4770a(this.f9032f.m14311a(kdVar, i));
            return kdVar;
        }
        kdVar = jm.m4547a(this).m4768a(0.0f);
        kdVar.m4769a(j);
        kdVar.m4770a(this.f9032f.m14311a(kdVar, i));
        return kdVar;
    }

    /* renamed from: a */
    public boolean mo287a() {
        py pyVar = this.f9029c;
        return pyVar != null ? pyVar.m16770f() : false;
    }
}
