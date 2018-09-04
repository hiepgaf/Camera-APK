package android.support.v7.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import p000.op;
import p000.or;
import p000.ot;
import p000.pg;
import p000.vk;

/* compiled from: PG */
public final class ExpandedMenuView extends ListView implements OnItemClickListener, or, pg {
    /* renamed from: a */
    private static final int[] f10014a = new int[]{16842964, 16843049};
    /* renamed from: b */
    private op f10015b;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        vk a = vk.m6047a(context, attributeSet, f10014a, i, 0);
        if (a.m6060f(0)) {
            setBackgroundDrawable(a.m6052b(0));
        }
        if (a.m6060f(1)) {
            setDivider(a.m6052b(1));
        }
        a.f9419b.recycle();
    }

    /* renamed from: a */
    public final void mo130a(op opVar) {
        this.f10015b = opVar;
    }

    /* renamed from: a */
    public final boolean mo285a(ot otVar) {
        return this.f10015b.m14249a((MenuItem) otVar, null, 0);
    }

    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo285a((ot) getAdapter().getItem(i));
    }
}
