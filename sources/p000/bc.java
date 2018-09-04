package p000;

import android.content.Context;
import android.graphics.Rect;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import java.util.List;

/* compiled from: PG */
/* renamed from: bc */
public abstract class bc extends be {
    /* renamed from: a */
    public final Rect f19867a = new Rect();
    /* renamed from: b */
    public int f19868b = 0;
    /* renamed from: c */
    public int f19869c;
    /* renamed from: f */
    private final Rect f19870f = new Rect();

    /* renamed from: a */
    public abstract View mo3359a(List list);

    public bc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: d */
    public final int m14741d(View view) {
        if (this.f19869c == 0) {
            return 0;
        }
        float a = mo3358a(view);
        int i = this.f19869c;
        return df.m1576a((int) (a * ((float) i)), 0, i);
    }

    /* renamed from: a */
    public float mo3358a(View view) {
        return 1.0f;
    }

    /* renamed from: b */
    public int mo3361b(View view) {
        return view.getMeasuredHeight();
    }

    /* renamed from: b */
    protected final void mo2653b(CoordinatorLayout coordinatorLayout, View view, int i) {
        View a = mo3359a(coordinatorLayout.m6729a(view));
        if (a != null) {
            dm dmVar = (dm) view.getLayoutParams();
            Rect rect = this.f19867a;
            rect.set(coordinatorLayout.getPaddingLeft() + dmVar.leftMargin, a.getBottom() + dmVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - dmVar.rightMargin, ((coordinatorLayout.getHeight() + a.getBottom()) - coordinatorLayout.getPaddingBottom()) - dmVar.bottomMargin);
            kj kjVar = coordinatorLayout.f9960b;
            if (!(kjVar == null || !jm.m4573g(coordinatorLayout) || jm.m4573g(view))) {
                rect.left += kjVar.m4978b();
                rect.right -= kjVar.m4979c();
            }
            Rect rect2 = this.f19870f;
            int i2 = dmVar.f3134c;
            if (i2 == 0) {
                i2 = 8388659;
            }
            ha.m2968a(i2, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            i2 = m14741d(a);
            view.layout(rect2.left, rect2.top - i2, rect2.right, rect2.bottom - i2);
            this.f19868b = rect2.top - a.getBottom();
            return;
        }
        super.mo2653b(coordinatorLayout, view, i);
        this.f19868b = 0;
    }

    /* renamed from: a */
    public boolean mo2652a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        int i5 = view.getLayoutParams().height;
        if (i5 == -1 || i5 == -2) {
            View a = mo3359a(coordinatorLayout.m6729a(view));
            if (a != null) {
                if (jm.m4573g(a) && !jm.m4573g(view)) {
                    jm.m4544C(view);
                    if (jm.m4573g(view)) {
                        view.requestLayout();
                        return true;
                    }
                }
                int size = MeasureSpec.getSize(i3);
                if (size == 0) {
                    size = coordinatorLayout.getHeight();
                }
                int b = mo3361b(a) + (size - a.getMeasuredHeight());
                if (i5 == -1) {
                    size = 1073741824;
                } else {
                    size = kvl.UNSET_ENUM_VALUE;
                }
                coordinatorLayout.m6732a(view, i, i2, MeasureSpec.makeMeasureSpec(b, size), i4);
                return true;
            }
        }
        return false;
    }
}
