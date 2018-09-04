package p000;

import android.graphics.Rect;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;
import android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo;
import com.google.android.apps.refocus.processing.DepthmapTask;

/* compiled from: PG */
/* renamed from: kk */
public final class kk {
    /* renamed from: a */
    public final AccessibilityNodeInfo f8327a;

    private kk(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f8327a = accessibilityNodeInfo;
    }

    /* renamed from: a */
    public final void m4983a(int i) {
        this.f8327a.addAction(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        kk kkVar = (kk) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f8327a;
        if (accessibilityNodeInfo == null) {
            if (kkVar.f8327a != null) {
                return false;
            }
            return true;
        } else if (accessibilityNodeInfo.equals(kkVar.f8327a)) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public final void m4984a(Rect rect) {
        this.f8327a.getBoundsInParent(rect);
    }

    /* renamed from: b */
    public final void m4990b(Rect rect) {
        this.f8327a.getBoundsInScreen(rect);
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f8327a;
        return accessibilityNodeInfo != null ? accessibilityNodeInfo.hashCode() : 0;
    }

    /* renamed from: a */
    public final boolean m4989a(kl klVar) {
        return this.f8327a.removeAction((AccessibilityAction) klVar.f8330c);
    }

    /* renamed from: a */
    public final void m4988a(boolean z) {
        this.f8327a.setCheckable(z);
    }

    /* renamed from: a */
    public final void m4986a(CharSequence charSequence) {
        this.f8327a.setClassName(charSequence);
    }

    /* renamed from: a */
    public final void m4987a(Object obj) {
        CollectionItemInfo collectionItemInfo;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f8327a;
        if (obj != null) {
            collectionItemInfo = (CollectionItemInfo) ((kn) obj).f8361a;
        } else {
            collectionItemInfo = null;
        }
        accessibilityNodeInfo.setCollectionItemInfo(collectionItemInfo);
    }

    /* renamed from: b */
    public final void m4991b(boolean z) {
        this.f8327a.setFocusable(z);
    }

    /* renamed from: c */
    public final void m4992c(boolean z) {
        this.f8327a.setFocused(z);
    }

    /* renamed from: a */
    public final void m4985a(View view) {
        this.f8327a.setParent(view);
    }

    /* renamed from: d */
    public final void m4993d(boolean z) {
        this.f8327a.setScrollable(z);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        Rect rect = new Rect();
        m4984a(rect);
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("; boundsInParent: ");
        stringBuilder2.append(rect);
        stringBuilder.append(stringBuilder2.toString());
        m4990b(rect);
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append("; boundsInScreen: ");
        stringBuilder2.append(rect);
        stringBuilder.append(stringBuilder2.toString());
        stringBuilder.append("; packageName: ");
        stringBuilder.append(this.f8327a.getPackageName());
        stringBuilder.append("; className: ");
        stringBuilder.append(this.f8327a.getClassName());
        stringBuilder.append("; text: ");
        stringBuilder.append(this.f8327a.getText());
        stringBuilder.append("; contentDescription: ");
        stringBuilder.append(this.f8327a.getContentDescription());
        stringBuilder.append("; viewId: ");
        stringBuilder.append(this.f8327a.getViewIdResourceName());
        stringBuilder.append("; checkable: ");
        stringBuilder.append(this.f8327a.isCheckable());
        stringBuilder.append("; checked: ");
        stringBuilder.append(this.f8327a.isChecked());
        stringBuilder.append("; focusable: ");
        stringBuilder.append(this.f8327a.isFocusable());
        stringBuilder.append("; focused: ");
        stringBuilder.append(this.f8327a.isFocused());
        stringBuilder.append("; selected: ");
        stringBuilder.append(this.f8327a.isSelected());
        stringBuilder.append("; clickable: ");
        stringBuilder.append(this.f8327a.isClickable());
        stringBuilder.append("; longClickable: ");
        stringBuilder.append(this.f8327a.isLongClickable());
        stringBuilder.append("; enabled: ");
        stringBuilder.append(this.f8327a.isEnabled());
        stringBuilder.append("; password: ");
        stringBuilder.append(this.f8327a.isPassword());
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append("; scrollable: ");
        stringBuilder3.append(this.f8327a.isScrollable());
        stringBuilder.append(stringBuilder3.toString());
        stringBuilder.append("; [");
        int actions = this.f8327a.getActions();
        while (actions != 0) {
            String str;
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(actions);
            int i = (numberOfTrailingZeros ^ -1) & actions;
            switch (numberOfTrailingZeros) {
                case 1:
                    str = "ACTION_FOCUS";
                    break;
                case 2:
                    str = "ACTION_CLEAR_FOCUS";
                    break;
                case 4:
                    str = "ACTION_SELECT";
                    break;
                case 8:
                    str = "ACTION_CLEAR_SELECTION";
                    break;
                case 16:
                    str = "ACTION_CLICK";
                    break;
                case 32:
                    str = "ACTION_LONG_CLICK";
                    break;
                case 64:
                    str = "ACTION_ACCESSIBILITY_FOCUS";
                    break;
                case 128:
                    str = "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                    break;
                case 256:
                    str = "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                    break;
                case 512:
                    str = "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                    break;
                case 1024:
                    str = "ACTION_NEXT_HTML_ELEMENT";
                    break;
                case DepthmapTask.MAX_REFERENCE_SIZE_HR_PX /*2048*/:
                    str = "ACTION_PREVIOUS_HTML_ELEMENT";
                    break;
                case 4096:
                    str = "ACTION_SCROLL_FORWARD";
                    break;
                case 8192:
                    str = "ACTION_SCROLL_BACKWARD";
                    break;
                case 16384:
                    str = "ACTION_COPY";
                    break;
                case 32768:
                    str = "ACTION_PASTE";
                    break;
                case 65536:
                    str = "ACTION_CUT";
                    break;
                case 131072:
                    str = "ACTION_SET_SELECTION";
                    break;
                default:
                    str = "ACTION_UNKNOWN";
                    break;
            }
            stringBuilder.append(str);
            if (i != 0) {
                stringBuilder.append(", ");
                actions = i;
            } else {
                actions = i;
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public static kk m4982a(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new kk(accessibilityNodeInfo);
    }
}
