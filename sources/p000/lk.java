package p000;

import android.os.Bundle;
import android.support.v4.widget.NestedScrollView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ScrollView;

/* compiled from: PG */
/* renamed from: lk */
public final class lk extends jd {
    /* renamed from: a */
    public final void mo683a(View view, AccessibilityEvent accessibilityEvent) {
        boolean z;
        super.mo683a(view, accessibilityEvent);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        accessibilityEvent.setClassName(ScrollView.class.getName());
        if (nestedScrollView.m6763a() > 0) {
            z = true;
        } else {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
        accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setMaxScrollY(nestedScrollView.m6763a());
    }

    /* renamed from: a */
    public final void mo684a(View view, kk kkVar) {
        super.mo684a(view, kkVar);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        kkVar.m4986a(ScrollView.class.getName());
        if (nestedScrollView.isEnabled()) {
            int a = nestedScrollView.m6763a();
            if (a > 0) {
                kkVar.m4993d(true);
                if (nestedScrollView.getScrollY() > 0) {
                    kkVar.m4983a(8192);
                }
                if (nestedScrollView.getScrollY() < a) {
                    kkVar.m4983a(4096);
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo2056a(View view, int i, Bundle bundle) {
        if (super.mo2056a(view, i, bundle)) {
            return true;
        }
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        if (!nestedScrollView.isEnabled()) {
            return false;
        }
        int height;
        int paddingBottom;
        switch (i) {
            case 4096:
                height = nestedScrollView.getHeight();
                paddingBottom = nestedScrollView.getPaddingBottom();
                height = Math.min(((height - paddingBottom) - nestedScrollView.getPaddingTop()) + nestedScrollView.getScrollY(), nestedScrollView.m6763a());
                if (height == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.m6764a(height);
                return true;
            case 8192:
                height = nestedScrollView.getHeight();
                paddingBottom = nestedScrollView.getPaddingBottom();
                height = Math.max(nestedScrollView.getScrollY() - ((height - paddingBottom) - nestedScrollView.getPaddingTop()), 0);
                if (height == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.m6764a(height);
                return true;
            default:
                return false;
        }
    }
}
