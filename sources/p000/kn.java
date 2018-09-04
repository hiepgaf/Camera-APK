package p000;

import android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo;

/* compiled from: PG */
/* renamed from: kn */
public final class kn {
    /* renamed from: a */
    public final Object f8361a;

    private kn(Object obj) {
        this.f8361a = obj;
    }

    /* renamed from: a */
    public static kn m5012a(int i, int i2, int i3, int i4, boolean z) {
        return new kn(CollectionItemInfo.obtain(i, i2, i3, i4, z, false));
    }
}
