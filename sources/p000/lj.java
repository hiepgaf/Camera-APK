package p000;

import android.widget.ListView;

/* compiled from: PG */
/* renamed from: lj */
public final class lj extends kv {
    /* renamed from: f */
    private final ListView f19341f;

    public lj(ListView listView) {
        super(listView);
        this.f19341f = listView;
    }

    /* renamed from: a */
    public final boolean mo2328a() {
        return false;
    }

    /* renamed from: a */
    public final boolean mo2329a(int i) {
        ListView listView = this.f19341f;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i2 = firstVisiblePosition + childCount;
        if (i > 0) {
            if (i2 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else if (i >= 0) {
            return false;
        } else {
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public final void mo2330b(int i) {
        this.f19341f.scrollListBy(i);
    }
}
