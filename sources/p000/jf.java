package p000;

import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: PG */
/* renamed from: jf */
public abstract class jf {
    /* renamed from: a */
    public jg f7753a;

    /* renamed from: c */
    public abstract View mo2447c();

    /* renamed from: a */
    public boolean mo2446a() {
        return false;
    }

    /* renamed from: b */
    public boolean mo3311b() {
        return true;
    }

    /* renamed from: a */
    public View mo3309a(MenuItem menuItem) {
        return mo2447c();
    }

    /* renamed from: d */
    public boolean mo2448d() {
        return false;
    }

    /* renamed from: a */
    public void mo2445a(SubMenu subMenu) {
    }

    /* renamed from: e */
    public boolean mo3312e() {
        return false;
    }

    /* renamed from: a */
    public void mo3310a(jg jgVar) {
        if (this.f7753a != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ");
            stringBuilder.append(getClass().getSimpleName());
            stringBuilder.append(" instance while it is still in use somewhere else?");
            Log.w("ActionProvider(support)", stringBuilder.toString());
        }
        this.f7753a = jgVar;
    }
}
