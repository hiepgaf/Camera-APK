package p000;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow.OnDismissListener;

/* compiled from: PG */
/* renamed from: pb */
abstract class pb implements OnItemClickListener, pe, pj {
    /* renamed from: g */
    public Rect f19540g;

    pb() {
    }

    /* renamed from: a */
    public abstract void mo3300a(int i);

    /* renamed from: a */
    public abstract void mo3301a(View view);

    /* renamed from: a */
    public abstract void mo3302a(OnDismissListener onDismissListener);

    /* renamed from: a */
    public abstract void mo3303a(op opVar);

    /* renamed from: b */
    public abstract void mo3304b(int i);

    /* renamed from: b */
    public abstract void mo3305b(boolean z);

    /* renamed from: c */
    public abstract void mo3307c(int i);

    /* renamed from: c */
    public abstract void mo3308c(boolean z);

    /* renamed from: b */
    protected boolean mo3306b() {
        return true;
    }

    /* renamed from: a */
    public final boolean mo2440a(ot otVar) {
        return false;
    }

    /* renamed from: b */
    public final boolean mo2442b(ot otVar) {
        return false;
    }

    /* renamed from: a */
    public final void mo2435a(Context context, op opVar) {
    }

    /* renamed from: a */
    protected static int m14296a(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i2 = 0;
        int i3 = 0;
        View view = null;
        int i4 = 0;
        ViewGroup viewGroup2 = viewGroup;
        while (i2 < count) {
            int i5;
            View view2;
            ViewGroup frameLayout;
            int itemViewType = listAdapter.getItemViewType(i2);
            if (itemViewType != i3) {
                i5 = itemViewType;
            } else {
                i5 = i3;
            }
            if (itemViewType != i3) {
                view2 = null;
            } else {
                view2 = view;
            }
            if (viewGroup2 == null) {
                frameLayout = new FrameLayout(context);
            } else {
                frameLayout = viewGroup2;
            }
            view2 = listAdapter.getView(i2, view2, frameLayout);
            view2.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view2.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth <= i4) {
                measuredWidth = i4;
            }
            i2++;
            i3 = i5;
            i4 = measuredWidth;
            viewGroup2 = frameLayout;
            view = view2;
        }
        return i4;
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        int i2;
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        op opVar = pb.m14297a(listAdapter).f9006a;
        MenuItem menuItem = (MenuItem) listAdapter.getItem(i);
        if (mo3306b()) {
            i2 = 0;
        } else {
            i2 = 4;
        }
        opVar.m14249a(menuItem, (pe) this, i2);
    }

    /* renamed from: b */
    protected static boolean m14298b(op opVar) {
        int size = opVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = opVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    protected static oo m14297a(ListAdapter listAdapter) {
        if (listAdapter instanceof HeaderViewListAdapter) {
            return (oo) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        }
        return (oo) listAdapter;
    }
}
