package p000;

import android.view.MenuItem;
import android.widget.Toolbar.OnMenuItemClickListener;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: cml */
final class cml implements OnMenuItemClickListener {
    /* renamed from: a */
    private final /* synthetic */ cmh f2155a;

    cml(cmh cmh) {
        this.f2155a = cmh;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.action_share) {
            this.f2155a.f2145b.mo721i();
        } else if (itemId == R.id.action_delete) {
            this.f2155a.f2145b.mo719g();
        }
        return false;
    }
}
