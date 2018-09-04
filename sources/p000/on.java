package p000;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: on */
public final class on extends BaseAdapter {
    /* renamed from: a */
    private int f9004a = -1;
    /* renamed from: b */
    private final /* synthetic */ om f9005b;

    public on(om omVar) {
        this.f9005b = omVar;
        m5658a();
    }

    /* renamed from: a */
    private final void m5658a() {
        op opVar = this.f9005b.f19472b;
        ot otVar = opVar.f19487i;
        if (otVar != null) {
            ArrayList c = opVar.m14257c();
            int size = c.size();
            for (int i = 0; i < size; i++) {
                if (((ot) c.get(i)) == otVar) {
                    this.f9004a = i;
                    return;
                }
            }
        }
        this.f9004a = -1;
    }

    public final int getCount() {
        int size = this.f9005b.f19472b.m14257c().size();
        return this.f9004a < 0 ? size : size - 1;
    }

    /* renamed from: a */
    public final ot m5659a(int i) {
        ArrayList c = this.f9005b.f19472b.m14257c();
        int i2 = this.f9004a;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (ot) c.get(i);
    }

    public final /* synthetic */ Object getItem(int i) {
        return m5659a(i);
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        View inflate;
        if (view == null) {
            om omVar = this.f9005b;
            inflate = omVar.f19471a.inflate(omVar.f19474d, viewGroup, false);
        } else {
            inflate = view;
        }
        ((ph) inflate).mo281a(m5659a(i));
        return inflate;
    }

    public final void notifyDataSetChanged() {
        m5658a();
        super.notifyDataSetChanged();
    }
}
