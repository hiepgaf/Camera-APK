package p000;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.Window.Callback;
import java.util.List;

/* compiled from: PG */
/* renamed from: mp */
final class mp extends nz {
    /* renamed from: a */
    private final /* synthetic */ mg f19390a;

    mp(mg mgVar, Callback callback) {
        this.f19390a = mgVar;
        super(callback);
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f19390a.m14071a(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (!super.dispatchKeyShortcutEvent(keyEvent)) {
            boolean z;
            mg mgVar = this.f19390a;
            int keyCode = keyEvent.getKeyCode();
            lt c = mgVar.mo2342c();
            if (c == null || !c.mo2375a(keyCode, keyEvent)) {
                mt mtVar = mgVar.f19373m;
                if (mtVar != null && mgVar.m14072a(mtVar, keyEvent.getKeyCode(), keyEvent)) {
                    mt mtVar2 = mgVar.f19373m;
                    if (mtVar2 != null) {
                        mtVar2.f8845l = true;
                        z = true;
                    } else {
                        z = true;
                    }
                } else if (mgVar.f19373m == null) {
                    mtVar = mgVar.m14083e(0);
                    mgVar.m14073a(mtVar, keyEvent);
                    z = mgVar.m14072a(mtVar, keyEvent.getKeyCode(), keyEvent);
                    mtVar.f8844k = false;
                    if (z) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
            } else {
                z = true;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public final void onContentChanged() {
    }

    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof op)) {
            return super.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    public final boolean onMenuOpened(int i, Menu menu) {
        super.onMenuOpened(i, menu);
        mg mgVar = this.f19390a;
        if (i == 108) {
            lt c = mgVar.mo2342c();
            if (c != null) {
                c.mo2373a(true);
            }
        }
        return true;
    }

    public final void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
        mg mgVar = this.f19390a;
        if (i == 108) {
            lt c = mgVar.mo2342c();
            if (c != null) {
                c.mo2373a(false);
            }
        } else if (i == 0) {
            mt e = mgVar.m14083e(i);
            if (e.f8846m) {
                mgVar.m14068a(e, false);
            }
        }
    }

    public final boolean onPreparePanel(int i, View view, Menu menu) {
        op opVar;
        if (menu instanceof op) {
            opVar = (op) menu;
        } else {
            opVar = null;
        }
        if (i == 0 && opVar == null) {
            return false;
        }
        if (opVar != null) {
            opVar.f19488j = true;
        }
        boolean onPreparePanel = super.onPreparePanel(i, view, menu);
        if (opVar == null) {
            return onPreparePanel;
        }
        opVar.f19488j = false;
        return onPreparePanel;
    }

    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        mt e = this.f19390a.m14083e(0);
        if (e != null) {
            Menu menu2 = e.f8841h;
            if (menu2 != null) {
                super.onProvideKeyboardShortcuts(list, menu2, i);
                return;
            }
        }
        super.onProvideKeyboardShortcuts(list, menu, i);
    }

    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }

    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        mg mgVar = this.f19390a;
        if (mgVar.f19371k) {
            switch (i) {
                case 0:
                    Object ntVar = new nt(mgVar.f19362b, callback);
                    mgVar = this.f19390a;
                    nn nnVar = mgVar.f19366f;
                    if (nnVar != null) {
                        nnVar.mo2400b();
                    }
                    no mnVar = new mn(mgVar, ntVar);
                    lt c = mgVar.mo2342c();
                    if (c != null) {
                        mgVar.f19366f = c.mo2390a(mnVar);
                        if (mgVar.f19366f != null) {
                            me meVar = mgVar.f19364d;
                            if (meVar != null) {
                                meVar.mo2370c();
                            }
                        }
                    }
                    if (mgVar.f19366f == null) {
                        mgVar.f19366f = mgVar.m14062a(mnVar);
                    }
                    nn nnVar2 = mgVar.f19366f;
                    return nnVar2 != null ? ntVar.m14203b(nnVar2) : null;
            }
        }
        return super.onWindowStartingActionMode(callback, i);
    }
}
