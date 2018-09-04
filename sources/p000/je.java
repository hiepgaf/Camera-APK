package p000;

import android.os.Bundle;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;

/* compiled from: PG */
/* renamed from: je */
final class je extends AccessibilityDelegate {
    /* renamed from: a */
    private final jd f7737a;

    je(jd jdVar) {
        this.f7737a = jdVar;
    }

    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.f7737a.mo2325b(view, accessibilityEvent);
    }

    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        ko koVar;
        AccessibilityNodeProvider accessibilityNodeProvider = jd.f7716a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            koVar = new ko(accessibilityNodeProvider);
        } else {
            koVar = null;
        }
        if (koVar == null) {
            return null;
        }
        return (AccessibilityNodeProvider) koVar.f8385a;
    }

    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f7737a.mo683a(view, accessibilityEvent);
    }

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f7737a.mo684a(view, kk.m4982a(accessibilityNodeInfo));
    }

    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        jd.f7716a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f7737a.mo2324a(viewGroup, view, accessibilityEvent);
    }

    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.f7737a.mo2056a(view, i, bundle);
    }

    public final void sendAccessibilityEvent(View view, int i) {
        jd.m4411a(view, i);
    }

    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        jd.f7716a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
