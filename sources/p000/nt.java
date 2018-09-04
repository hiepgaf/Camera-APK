package p000;

import android.content.Context;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: nt */
public final class nt implements no {
    /* renamed from: a */
    private final Callback f19437a;
    /* renamed from: b */
    private final Context f19438b;
    /* renamed from: c */
    private final ArrayList f19439c = new ArrayList();
    /* renamed from: d */
    private final iz f19440d = new iz();

    public nt(Context context, Callback callback) {
        this.f19438b = context;
        this.f19437a = callback;
    }

    /* renamed from: b */
    public final ActionMode m14203b(nn nnVar) {
        int size = this.f19439c.size();
        for (int i = 0; i < size; i++) {
            ns nsVar = (ns) this.f19439c.get(i);
            if (nsVar != null && nsVar.f8941a == nnVar) {
                return nsVar;
            }
        }
        ActionMode nsVar2 = new ns(this.f19438b, nnVar);
        this.f19439c.add(nsVar2);
        return nsVar2;
    }

    /* renamed from: a */
    private final Menu m14199a(Menu menu) {
        Menu menu2 = (Menu) this.f19440d.get(menu);
        if (menu2 != null) {
            return menu2;
        }
        menu2 = ha.m2960a(this.f19438b, (hf) menu);
        this.f19440d.put(menu, menu2);
        return menu2;
    }

    /* renamed from: a */
    public final boolean mo2357a(nn nnVar, MenuItem menuItem) {
        return this.f19437a.onActionItemClicked(m14203b(nnVar), ha.m2961a(this.f19438b, (hg) menuItem));
    }

    /* renamed from: a */
    public final boolean mo2356a(nn nnVar, Menu menu) {
        return this.f19437a.onCreateActionMode(m14203b(nnVar), m14199a(menu));
    }

    /* renamed from: a */
    public final void mo2355a(nn nnVar) {
        this.f19437a.onDestroyActionMode(m14203b(nnVar));
    }

    /* renamed from: b */
    public final boolean mo2358b(nn nnVar, Menu menu) {
        return this.f19437a.onPrepareActionMode(m14203b(nnVar), m14199a(menu));
    }
}
