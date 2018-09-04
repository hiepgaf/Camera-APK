package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* renamed from: pi */
public class pi extends oe implements Menu {
    public pi(Context context, hf hfVar) {
        super(context, hfVar);
    }

    public MenuItem add(int i) {
        return m14225a(((hf) this.d).add(i));
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return m14225a(((hf) this.d).add(i, i2, i3, i4));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m14225a(((hf) this.d).add(i, i2, i3, charSequence));
    }

    public MenuItem add(CharSequence charSequence) {
        return m14225a(((hf) this.d).add(charSequence));
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2;
        if (menuItemArr != null) {
            menuItemArr2 = new MenuItem[menuItemArr.length];
        } else {
            menuItemArr2 = null;
        }
        int addIntentOptions = ((hf) this.d).addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = m14225a(menuItemArr2[i5]);
            }
        }
        return addIntentOptions;
    }

    public SubMenu addSubMenu(int i) {
        return m14226a(((hf) this.d).addSubMenu(i));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return m14226a(((hf) this.d).addSubMenu(i, i2, i3, i4));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return m14226a(((hf) this.d).addSubMenu(i, i2, i3, charSequence));
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return m14226a(((hf) this.d).addSubMenu(charSequence));
    }

    public void clear() {
        Map map = this.f19468b;
        if (map != null) {
            map.clear();
        }
        map = this.f19469c;
        if (map != null) {
            map.clear();
        }
        ((hf) this.d).clear();
    }

    public void close() {
        ((hf) this.d).close();
    }

    public MenuItem findItem(int i) {
        return m14225a(((hf) this.d).findItem(i));
    }

    public MenuItem getItem(int i) {
        return m14225a(((hf) this.d).getItem(i));
    }

    public boolean hasVisibleItems() {
        return ((hf) this.d).hasVisibleItems();
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return ((hf) this.d).isShortcutKey(i, keyEvent);
    }

    public boolean performIdentifierAction(int i, int i2) {
        return ((hf) this.d).performIdentifierAction(i, i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return ((hf) this.d).performShortcut(i, keyEvent, i2);
    }

    public void removeGroup(int i) {
        Map map = this.f19468b;
        if (map != null) {
            Iterator it = map.keySet().iterator();
            while (it.hasNext()) {
                if (i == ((MenuItem) it.next()).getGroupId()) {
                    it.remove();
                }
            }
        }
        ((hf) this.d).removeGroup(i);
    }

    public void removeItem(int i) {
        Map map = this.f19468b;
        if (map != null) {
            Iterator it = map.keySet().iterator();
            while (it.hasNext()) {
                if (i == ((MenuItem) it.next()).getItemId()) {
                    it.remove();
                    break;
                }
            }
        }
        ((hf) this.d).removeItem(i);
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        ((hf) this.d).setGroupCheckable(i, z, z2);
    }

    public void setGroupEnabled(int i, boolean z) {
        ((hf) this.d).setGroupEnabled(i, z);
    }

    public void setGroupVisible(int i, boolean z) {
        ((hf) this.d).setGroupVisible(i, z);
    }

    public void setQwertyMode(boolean z) {
        ((hf) this.d).setQwertyMode(z);
    }

    public int size() {
        return ((hf) this.d).size();
    }
}
