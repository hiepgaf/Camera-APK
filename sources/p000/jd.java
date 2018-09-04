package p000;

import android.os.Bundle;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* compiled from: PG */
/* renamed from: jd */
public class jd {
    /* renamed from: a */
    public static final AccessibilityDelegate f7716a = new AccessibilityDelegate();
    /* renamed from: b */
    public final AccessibilityDelegate f7717b = new je(this);

    /* renamed from: b */
    public boolean mo2325b(View view, AccessibilityEvent accessibilityEvent) {
        return f7716a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: a */
    public void mo683a(View view, AccessibilityEvent accessibilityEvent) {
        f7716a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: a */
    public void mo684a(View view, kk kkVar) {
        f7716a.onInitializeAccessibilityNodeInfo(view, kkVar.f8327a);
    }

    /* renamed from: a */
    public boolean mo2324a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return f7716a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* renamed from: a */
    public boolean mo2056a(View view, int i, Bundle bundle) {
        return f7716a.performAccessibilityAction(view, i, bundle);
    }

    /* renamed from: a */
    public static void m4411a(View view, int i) {
        f7716a.sendAccessibilityEvent(view, i);
    }
}
