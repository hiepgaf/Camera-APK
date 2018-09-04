package p000;

import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: PG */
/* renamed from: lb */
final class lb extends jd {
    /* renamed from: c */
    private final Rect f19330c = new Rect();
    /* renamed from: d */
    private final /* synthetic */ kz f19331d;

    lb(kz kzVar) {
        this.f19331d = kzVar;
    }

    /* renamed from: b */
    public final boolean mo2325b(View view, AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            return super.mo2325b(view, accessibilityEvent);
        }
        accessibilityEvent.getText();
        View b = this.f19331d.m5500b();
        if (b != null) {
            Gravity.getAbsoluteGravity(this.f19331d.m5502c(b), jm.m4576j(this.f19331d));
        }
        return true;
    }

    /* renamed from: a */
    public final void mo683a(View view, AccessibilityEvent accessibilityEvent) {
        super.mo683a(view, accessibilityEvent);
        accessibilityEvent.setClassName(kz.class.getName());
    }

    /* renamed from: a */
    public final void mo684a(View view, kk kkVar) {
        if (kz.f8744b) {
            super.mo684a(view, kkVar);
        } else {
            kk a = kk.m4982a(AccessibilityNodeInfo.obtain(kkVar.f8327a));
            super.mo684a(view, a);
            kkVar.f8327a.setSource(view);
            ViewParent o = jm.m4581o(view);
            if (o instanceof View) {
                kkVar.m4985a((View) o);
            }
            Rect rect = this.f19330c;
            a.m4984a(rect);
            kkVar.f8327a.setBoundsInParent(rect);
            a.m4990b(rect);
            kkVar.f8327a.setBoundsInScreen(rect);
            kkVar.f8327a.setVisibleToUser(a.f8327a.isVisibleToUser());
            kkVar.f8327a.setPackageName(a.f8327a.getPackageName());
            kkVar.m4986a(a.f8327a.getClassName());
            kkVar.f8327a.setContentDescription(a.f8327a.getContentDescription());
            kkVar.f8327a.setEnabled(a.f8327a.isEnabled());
            kkVar.f8327a.setClickable(a.f8327a.isClickable());
            kkVar.m4991b(a.f8327a.isFocusable());
            kkVar.m4992c(a.f8327a.isFocused());
            kkVar.f8327a.setAccessibilityFocused(a.f8327a.isAccessibilityFocused());
            kkVar.f8327a.setSelected(a.f8327a.isSelected());
            kkVar.f8327a.setLongClickable(a.f8327a.isLongClickable());
            kkVar.m4983a(a.f8327a.getActions());
            a.f8327a.recycle();
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (kz.m5487e(childAt)) {
                    kkVar.f8327a.addChild(childAt);
                }
            }
        }
        kkVar.m4986a(kz.class.getName());
        kkVar.m4991b(false);
        kkVar.m4992c(false);
        kkVar.m4989a(kl.f8328a);
        kkVar.m4989a(kl.f8329b);
    }

    /* renamed from: a */
    public final boolean mo2324a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return (kz.f8744b || kz.m5487e(view)) ? super.mo2324a(viewGroup, view, accessibilityEvent) : false;
    }
}
