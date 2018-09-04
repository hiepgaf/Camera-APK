package p000;

import android.support.v7.view.menu.ListMenuItemView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: oo */
public final class oo extends BaseAdapter {
    /* renamed from: a */
    public op f9006a;
    /* renamed from: b */
    public boolean f9007b;
    /* renamed from: c */
    private int f9008c = -1;
    /* renamed from: d */
    private final boolean f9009d;
    /* renamed from: e */
    private final LayoutInflater f9010e;
    /* renamed from: f */
    private final int f9011f;

    public oo(op opVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.f9009d = z;
        this.f9010e = layoutInflater;
        this.f9006a = opVar;
        this.f9011f = i;
        m5660a();
    }

    /* renamed from: a */
    private final void m5660a() {
        op opVar = this.f9006a;
        ot otVar = opVar.f19487i;
        if (otVar != null) {
            ArrayList c = opVar.m14257c();
            int size = c.size();
            for (int i = 0; i < size; i++) {
                if (((ot) c.get(i)) == otVar) {
                    this.f9008c = i;
                    return;
                }
            }
        }
        this.f9008c = -1;
    }

    public final int getCount() {
        ArrayList c;
        if (this.f9009d) {
            c = this.f9006a.m14257c();
        } else {
            c = this.f9006a.m14259e();
        }
        if (this.f9008c < 0) {
            return c.size();
        }
        return c.size() - 1;
    }

    /* renamed from: a */
    public final ot m5661a(int i) {
        ArrayList c;
        if (this.f9009d) {
            c = this.f9006a.m14257c();
        } else {
            c = this.f9006a.m14259e();
        }
        int i2 = this.f9008c;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (ot) c.get(i);
    }

    public final /* synthetic */ Object getItem(int i) {
        return m5661a(i);
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        View inflate;
        int groupId;
        int i2 = 0;
        if (view == null) {
            inflate = this.f9010e.inflate(this.f9011f, viewGroup, false);
        } else {
            inflate = view;
        }
        int groupId2 = m5661a(i).getGroupId();
        int i3 = i - 1;
        if (i3 >= 0) {
            groupId = m5661a(i3).getGroupId();
        } else {
            groupId = groupId2;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) inflate;
        if (!this.f9006a.mo3319f()) {
            groupId = 0;
        } else if (groupId2 != groupId) {
            boolean z = true;
        } else {
            groupId = 0;
        }
        ImageView imageView = listMenuItemView.f10017b;
        if (imageView != null) {
            if (listMenuItemView.f10019d) {
                i2 = 8;
            } else if (groupId == 0) {
                i2 = 8;
            }
            imageView.setVisibility(i2);
        }
        ph phVar = (ph) inflate;
        if (this.f9007b) {
            listMenuItemView.f10020e = true;
            listMenuItemView.f10018c = true;
        }
        phVar.mo281a(m5661a(i));
        return inflate;
    }

    public final void notifyDataSetChanged() {
        m5660a();
        super.notifyDataSetChanged();
    }
}
