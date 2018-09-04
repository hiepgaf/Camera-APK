package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: PG */
/* renamed from: po */
public final class po extends pi implements SubMenu {
    public po(Context context, hh hhVar) {
        super(context, hhVar);
    }

    public final void clearHeader() {
        ((hh) this.d).clearHeader();
    }

    public final MenuItem getItem() {
        return m14225a(((hh) this.d).getItem());
    }

    public final SubMenu setHeaderIcon(int i) {
        ((hh) this.d).setHeaderIcon(i);
        return this;
    }

    public final SubMenu setHeaderIcon(Drawable drawable) {
        ((hh) this.d).setHeaderIcon(drawable);
        return this;
    }

    public final SubMenu setHeaderTitle(int i) {
        ((hh) this.d).setHeaderTitle(i);
        return this;
    }

    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        ((hh) this.d).setHeaderTitle(charSequence);
        return this;
    }

    public final SubMenu setHeaderView(View view) {
        ((hh) this.d).setHeaderView(view);
        return this;
    }

    public final SubMenu setIcon(int i) {
        ((hh) this.d).setIcon(i);
        return this;
    }

    public final SubMenu setIcon(Drawable drawable) {
        ((hh) this.d).setIcon(drawable);
        return this;
    }
}
