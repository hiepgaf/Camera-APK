package p000;

import android.support.design.widget.CoordinatorLayout;
import android.view.View;
import android.view.ViewGroup.OnHierarchyChangeListener;

/* compiled from: PG */
/* renamed from: dl */
public final class dl implements OnHierarchyChangeListener {
    /* renamed from: a */
    private final /* synthetic */ CoordinatorLayout f3119a;

    public dl(CoordinatorLayout coordinatorLayout) {
        this.f3119a = coordinatorLayout;
    }

    public final void onChildViewAdded(View view, View view2) {
        OnHierarchyChangeListener onHierarchyChangeListener = this.f3119a.f9962d;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    public final void onChildViewRemoved(View view, View view2) {
        this.f3119a.m6730a(2);
        OnHierarchyChangeListener onHierarchyChangeListener = this.f3119a.f9962d;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
