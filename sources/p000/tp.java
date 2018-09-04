package p000;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* compiled from: PG */
/* renamed from: tp */
public final class tp extends tg implements to {
    /* renamed from: a */
    public static Method f22578a;
    /* renamed from: b */
    public to f22579b;

    static {
        try {
            f22578a = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
        } catch (NoSuchMethodException e) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public tp(Context context, int i, int i2) {
        super(context, null, i, i2);
    }

    /* renamed from: a */
    final sh mo3349a(Context context, boolean z) {
        sh tqVar = new tq(context, z);
        tqVar.f19638c = this;
        return tqVar;
    }

    /* renamed from: a */
    public final void mo2443a(op opVar, MenuItem menuItem) {
        to toVar = this.f22579b;
        if (toVar != null) {
            toVar.mo2443a(opVar, menuItem);
        }
    }

    /* renamed from: b */
    public final void mo2444b(op opVar, MenuItem menuItem) {
        to toVar = this.f22579b;
        if (toVar != null) {
            toVar.mo2444b(opVar, menuItem);
        }
    }
}
