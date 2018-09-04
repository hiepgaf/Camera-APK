package android.support.design.appbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Parcelable;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import java.lang.ref.WeakReference;
import java.util.List;
import p000.ay;
import p000.ba;
import p000.bc;
import p000.bd;
import p000.df;
import p000.dk;
import p000.dm;
import p000.jm;

@dk(a = Behavior.class)
/* compiled from: PG */
public class AppBarLayout extends LinearLayout {

    /* compiled from: PG */
    public class BaseBehavior extends ba {
        /* renamed from: b */
        private int f22586b;
        /* renamed from: c */
        private WeakReference f22587c;

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: a */
        final /* synthetic */ boolean mo3354a() {
            WeakReference weakReference = this.f22587c;
            if (weakReference != null) {
                View view = (View) weakReference.get();
                if (view == null || !view.isShown() || view.canScrollVertically(-1)) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: a */
        final /* synthetic */ int mo3352a(View view) {
            throw new NoSuchMethodError();
        }

        /* renamed from: b */
        final /* synthetic */ int mo3357b(View view) {
            throw new NoSuchMethodError();
        }

        /* renamed from: b */
        final int mo3356b() {
            return m7279c();
        }

        final /* synthetic */ void a_(View view) {
            m16836a((AppBarLayout) view);
        }

        /* renamed from: a */
        public final /* synthetic */ boolean mo118a(CoordinatorLayout coordinatorLayout, View view, int i) {
            super.mo118a(coordinatorLayout, (AppBarLayout) view, i);
            throw new NoSuchMethodError();
        }

        /* renamed from: a */
        public final /* synthetic */ boolean mo2652a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            View view2 = (AppBarLayout) view;
            if (((dm) view2.getLayoutParams()).height != -2) {
                return super.mo2652a(coordinatorLayout, view2, i, i2, i3, i4);
            }
            coordinatorLayout.m6732a(view2, i, i2, MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo124a(View view, View view2, int i, int[] iArr, int i2) {
            if (i == 0) {
                return;
            }
            if (i >= 0) {
                throw new NoSuchMethodError();
            }
            throw new NoSuchMethodError();
        }

        /* renamed from: a */
        public final /* synthetic */ void mo3353a(View view, int i, int i2, int i3) {
            if (i2 < 0) {
                throw new NoSuchMethodError();
            }
        }

        /* renamed from: a */
        public final /* synthetic */ void mo122a(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (parcelable instanceof ay) {
                ay ayVar = (ay) parcelable;
                super.mo122a(coordinatorLayout, (View) appBarLayout, ayVar.f7631e);
                int i = ayVar.f10516a;
                float f = ayVar.f10517b;
                boolean z = ayVar.f10518c;
                return;
            }
            super.mo122a(coordinatorLayout, (View) appBarLayout, parcelable);
        }

        /* renamed from: a */
        public final /* synthetic */ Parcelable mo121a(CoordinatorLayout coordinatorLayout, View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            Parcelable a = super.mo121a(coordinatorLayout, (View) appBarLayout);
            int c = m7279c();
            int childCount = appBarLayout.getChildCount();
            int i = 0;
            while (i < childCount) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + c;
                if (childAt.getTop() + c > 0 || bottom < 0) {
                    i++;
                } else {
                    new ay(a).f10516a = i;
                    jm.m4577k(childAt);
                    throw new NoSuchMethodError();
                }
            }
            return a;
        }

        /* renamed from: a */
        public final /* synthetic */ boolean mo125a(int i, int i2) {
            if ((i & 2) == 0) {
                this.f22587c = null;
                this.f22586b = i2;
                return false;
            }
            throw new NoSuchMethodError();
        }

        /* renamed from: a */
        public final /* synthetic */ void mo123a(View view, View view2, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.f22586b == 0 || i == 1) {
                m16836a(appBarLayout);
            }
            this.f22587c = new WeakReference(view2);
        }

        /* renamed from: a */
        final /* synthetic */ int mo3351a(int i, int i2, int i3) {
            int c = m7279c();
            if (i2 == 0 || c < i2 || c > i3 || c == df.m1576a(i, i2, i3)) {
                return 0;
            }
            throw new NoSuchMethodError();
        }

        /* renamed from: a */
        private final void m16836a(AppBarLayout appBarLayout) {
            int c = m7279c();
            int childCount = appBarLayout.getChildCount();
            int i = 0;
            while (i < childCount) {
                View childAt = appBarLayout.getChildAt(i);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                childAt.getLayoutParams();
                int i2 = -c;
                if (top <= i2 && bottom >= i2) {
                    break;
                }
                i++;
            }
            i = -1;
            if (i >= 0) {
                appBarLayout.getChildAt(i).getLayoutParams();
            }
        }
    }

    /* compiled from: PG */
    public class ScrollingViewBehavior extends bc {
        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bd.f1077a);
            this.f19869c = obtainStyledAttributes.getDimensionPixelSize(bd.f1078b, 0);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: b */
        private static AppBarLayout m16850b(List list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = (View) list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        /* renamed from: a */
        final /* synthetic */ View mo3359a(List list) {
            return m16850b(list);
        }

        /* renamed from: a */
        final float mo3358a(View view) {
            if (!(view instanceof AppBarLayout)) {
                return 0.0f;
            }
            throw new NoSuchMethodError();
        }

        /* renamed from: b */
        final int mo3361b(View view) {
            if (!(view instanceof AppBarLayout)) {
                return super.mo3361b(view);
            }
            throw new NoSuchMethodError();
        }

        /* renamed from: c */
        public final boolean mo3362c(View view) {
            return view instanceof AppBarLayout;
        }

        /* renamed from: a */
        public final boolean mo128a(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (((dm) view2.getLayoutParams()).f3132a instanceof BaseBehavior) {
                jm.m4565b(view, ((view2.getBottom() - view.getTop()) + this.f19868b) - m14741d(view2));
            }
            return false;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo2652a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            return super.mo2652a(coordinatorLayout, view, i, i2, i3, i4);
        }

        /* renamed from: a */
        public final boolean mo3360a(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            if (m16850b(coordinatorLayout.m6729a(view)) != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.a;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    throw new NoSuchMethodError();
                }
            }
            return false;
        }
    }

    /* compiled from: PG */
    public class Behavior extends BaseBehavior {
        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    protected boolean checkLayoutParams(LayoutParams layoutParams) {
        throw new NoSuchMethodError();
    }

    public /* synthetic */ LayoutParams generateDefaultLayoutParams() {
        throw new NoSuchMethodError();
    }

    /* renamed from: generateDefaultLayoutParams */
    public /* synthetic */ LinearLayout.LayoutParams m18070generateDefaultLayoutParams() {
        throw new NoSuchMethodError();
    }

    public /* synthetic */ LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        throw new NoSuchMethodError();
    }

    /* renamed from: generateLayoutParams */
    public /* synthetic */ LinearLayout.LayoutParams m18071generateLayoutParams(AttributeSet attributeSet) {
        throw new NoSuchMethodError();
    }

    public /* synthetic */ LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        throw new NoSuchMethodError();
    }

    /* renamed from: generateLayoutParams */
    public /* synthetic */ LinearLayout.LayoutParams m18072generateLayoutParams(LayoutParams layoutParams) {
        throw new NoSuchMethodError();
    }

    protected int[] onCreateDrawableState(int i) {
        throw new NoSuchMethodError();
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        throw new NoSuchMethodError();
    }

    protected void onMeasure(int i, int i2) {
        throw new NoSuchMethodError();
    }

    public void setOrientation(int i) {
        throw new NoSuchMethodError();
    }
}
