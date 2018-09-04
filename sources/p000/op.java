package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyCharacterMap.KeyData;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* renamed from: op */
public class op implements hf {
    /* renamed from: k */
    private static final int[] f19478k = new int[]{1, 4, 5, 3, 2, 0};
    /* renamed from: a */
    public final Context f19479a;
    /* renamed from: b */
    public oq f19480b;
    /* renamed from: c */
    public ArrayList f19481c;
    /* renamed from: d */
    public ArrayList f19482d;
    /* renamed from: e */
    public int f19483e = 1;
    /* renamed from: f */
    public CharSequence f19484f;
    /* renamed from: g */
    public Drawable f19485g;
    /* renamed from: h */
    public View f19486h;
    /* renamed from: i */
    public ot f19487i;
    /* renamed from: j */
    public boolean f19488j;
    /* renamed from: l */
    private final Resources f19489l;
    /* renamed from: m */
    private boolean f19490m;
    /* renamed from: n */
    private boolean f19491n;
    /* renamed from: o */
    private ArrayList f19492o;
    /* renamed from: p */
    private boolean f19493p;
    /* renamed from: q */
    private ArrayList f19494q;
    /* renamed from: r */
    private boolean f19495r;
    /* renamed from: s */
    private boolean f19496s = false;
    /* renamed from: t */
    private boolean f19497t = false;
    /* renamed from: u */
    private boolean f19498u = false;
    /* renamed from: v */
    private boolean f19499v = false;
    /* renamed from: w */
    private ArrayList f19500w = new ArrayList();
    /* renamed from: x */
    private CopyOnWriteArrayList f19501x = new CopyOnWriteArrayList();
    /* renamed from: y */
    private boolean f19502y = false;

    public op(Context context) {
        boolean z = true;
        this.f19479a = context;
        this.f19489l = context.getResources();
        this.f19481c = new ArrayList();
        this.f19492o = new ArrayList();
        this.f19493p = true;
        this.f19482d = new ArrayList();
        this.f19494q = new ArrayList();
        this.f19495r = true;
        if (this.f19489l.getConfiguration().keyboard == 1) {
            z = false;
        } else if (!ViewConfiguration.get(this.f19479a).shouldShowMenuShortcutsWhenKeyboardPresent()) {
            z = false;
        }
        this.f19491n = z;
    }

    public MenuItem add(int i) {
        return m14238a(0, 0, 0, this.f19489l.getString(i));
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return m14238a(i, i2, i3, this.f19489l.getString(i4));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m14238a(i, i2, i3, charSequence);
    }

    public MenuItem add(CharSequence charSequence) {
        return m14238a(0, 0, 0, charSequence);
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int size;
        int i5;
        PackageManager packageManager = this.f19479a.getPackageManager();
        List queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        if (queryIntentActivityOptions != null) {
            size = queryIntentActivityOptions.size();
        } else {
            size = 0;
        }
        if ((i4 & 1) == 0) {
            removeGroup(i);
            i5 = 0;
        } else {
            i5 = 0;
        }
        while (i5 < size) {
            Intent intent2;
            ResolveInfo resolveInfo = (ResolveInfo) queryIntentActivityOptions.get(i5);
            if (resolveInfo.specificIndex >= 0) {
                intent2 = intentArr[resolveInfo.specificIndex];
            } else {
                intent2 = intent;
            }
            Intent intent3 = new Intent(intent2);
            intent3.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            MenuItem intent4 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent3);
            if (menuItemArr != null && resolveInfo.specificIndex >= 0) {
                menuItemArr[resolveInfo.specificIndex] = intent4;
            }
            i5++;
        }
        return size;
    }

    /* renamed from: a */
    private final MenuItem m14238a(int i, int i2, int i3, CharSequence charSequence) {
        int i4 = i3 >> 16;
        if (i4 < 0 || i4 >= f19478k.length) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i5;
        int i6 = (f19478k[i4] << 16) | ((char) i3);
        MenuItem otVar = new ot(this, i, i2, i3, i6, charSequence, this.f19483e);
        ArrayList arrayList = this.f19481c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((ot) arrayList.get(size)).f19509a <= i6) {
                i5 = size + 1;
                break;
            }
        }
        i5 = 0;
        arrayList.add(i5, otVar);
        m14255b(true);
        return otVar;
    }

    /* renamed from: a */
    public final void m14246a(pe peVar) {
        m14247a(peVar, this.f19479a);
    }

    /* renamed from: a */
    public final void m14247a(pe peVar, Context context) {
        this.f19501x.add(new WeakReference(peVar));
        peVar.mo2435a(context, this);
        this.f19495r = true;
    }

    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f19489l.getString(i));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f19489l.getString(i4));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        ot otVar = (ot) m14238a(i, i2, i3, charSequence);
        pn pnVar = new pn(this.f19479a, this, otVar);
        otVar.m14277a(pnVar);
        return pnVar;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void clear() {
        ot otVar = this.f19487i;
        if (otVar != null) {
            mo3315a(otVar);
        }
        this.f19481c.clear();
        m14255b(true);
    }

    public void clearHeader() {
        this.f19485g = null;
        this.f19484f = null;
        this.f19486h = null;
        m14255b(false);
    }

    public void close() {
        m14248a(true);
    }

    /* renamed from: a */
    public final void m14248a(boolean z) {
        if (!this.f19499v) {
            this.f19499v = true;
            Iterator it = this.f19501x.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                pe peVar = (pe) weakReference.get();
                if (peVar == null) {
                    this.f19501x.remove(weakReference);
                } else {
                    peVar.mo2436a(this, z);
                }
            }
            this.f19499v = false;
        }
    }

    /* renamed from: a */
    public boolean mo3315a(ot otVar) {
        boolean z = false;
        if (!this.f19501x.isEmpty() && this.f19487i == otVar) {
            m14266l();
            Iterator it = this.f19501x.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                pe peVar = (pe) weakReference.get();
                if (peVar == null) {
                    this.f19501x.remove(weakReference);
                    z = z2;
                } else {
                    z = peVar.mo2440a(otVar);
                    if (z) {
                        break;
                    }
                }
                z2 = z;
            }
            z = z2;
            m14265k();
            if (z) {
                this.f19487i = null;
            }
        }
        return z;
    }

    /* renamed from: a */
    boolean mo3314a(op opVar, MenuItem menuItem) {
        oq oqVar = this.f19480b;
        return oqVar != null && oqVar.mo2337a(opVar, menuItem);
    }

    /* renamed from: b */
    public boolean mo3317b(ot otVar) {
        boolean z = false;
        if (!this.f19501x.isEmpty()) {
            m14266l();
            Iterator it = this.f19501x.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                pe peVar = (pe) weakReference.get();
                if (peVar == null) {
                    this.f19501x.remove(weakReference);
                    z = z2;
                } else {
                    z = peVar.mo2442b(otVar);
                    if (z) {
                        break;
                    }
                }
                z2 = z;
            }
            z = z2;
            m14265k();
            if (z) {
                this.f19487i = otVar;
            }
        }
        return z;
    }

    public MenuItem findItem(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            ot otVar = (ot) this.f19481c.get(i2);
            if (otVar.getItemId() == i) {
                return otVar;
            }
            if (otVar.hasSubMenu()) {
                MenuItem findItem = otVar.getSubMenu().findItem(i);
                if (findItem != null) {
                    return findItem;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    private final ot m14239a(int i, KeyEvent keyEvent) {
        List list = this.f19500w;
        list.clear();
        m14241a(list, i, keyEvent);
        if (list.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyData keyData = new KeyData();
        keyEvent.getKeyData(keyData);
        int size = list.size();
        if (size == 1) {
            return (ot) list.get(0);
        }
        boolean g = mo3320g();
        for (int i2 = 0; i2 < size; i2++) {
            char alphabeticShortcut;
            ot otVar = (ot) list.get(i2);
            if (g) {
                alphabeticShortcut = otVar.getAlphabeticShortcut();
            } else {
                alphabeticShortcut = otVar.getNumericShortcut();
            }
            if (alphabeticShortcut == keyData.meta[0]) {
                if ((metaState & 2) == 0) {
                    return otVar;
                }
            }
            if (alphabeticShortcut == keyData.meta[2] && (metaState & 2) != 0) {
                return otVar;
            }
            if (g && alphabeticShortcut == '\b' && i == 67) {
                return otVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    private final void m14241a(List list, int i, KeyEvent keyEvent) {
        boolean g = mo3320g();
        int modifiers = keyEvent.getModifiers();
        KeyData keyData = new KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f19481c.size();
            for (int i2 = 0; i2 < size; i2++) {
                int alphabeticModifiers;
                ot otVar = (ot) this.f19481c.get(i2);
                if (otVar.hasSubMenu()) {
                    ((op) otVar.getSubMenu()).m14241a(list, i, keyEvent);
                }
                char alphabeticShortcut;
                if (g) {
                    alphabeticShortcut = otVar.getAlphabeticShortcut();
                } else {
                    alphabeticShortcut = otVar.getNumericShortcut();
                }
                if (g) {
                    alphabeticModifiers = otVar.getAlphabeticModifiers();
                } else {
                    alphabeticModifiers = otVar.getNumericModifiers();
                }
                if ((modifiers & 69647) == (alphabeticModifiers & 69647) && r2 != '\u0000' && ((r2 == keyData.meta[0] || r2 == keyData.meta[2] || (g && r2 == '\b' && i == 67)) && otVar.isEnabled())) {
                    list.add(otVar);
                }
            }
        }
    }

    /* renamed from: a */
    public final void m14242a() {
        ArrayList e = m14259e();
        if (this.f19495r) {
            Iterator it = this.f19501x.iterator();
            int i = 0;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                pe peVar = (pe) weakReference.get();
                if (peVar == null) {
                    this.f19501x.remove(weakReference);
                } else {
                    i = peVar.mo2439a() | i;
                }
            }
            if (i != 0) {
                this.f19482d.clear();
                this.f19494q.clear();
                i = e.size();
                for (int i2 = 0; i2 < i; i2++) {
                    ot otVar = (ot) e.get(i2);
                    if (otVar.m14286e()) {
                        this.f19482d.add(otVar);
                    } else {
                        this.f19494q.add(otVar);
                    }
                }
            } else {
                this.f19482d.clear();
                this.f19494q.clear();
                this.f19494q.addAll(m14259e());
            }
            this.f19495r = false;
        }
    }

    /* renamed from: b */
    protected String mo3316b() {
        return "android:menu:actionviewstates";
    }

    public MenuItem getItem(int i) {
        return (MenuItem) this.f19481c.get(i);
    }

    /* renamed from: c */
    public final ArrayList m14257c() {
        m14242a();
        return this.f19494q;
    }

    /* renamed from: d */
    public op mo3318d() {
        return this;
    }

    /* renamed from: e */
    public final ArrayList m14259e() {
        if (!this.f19493p) {
            return this.f19492o;
        }
        this.f19492o.clear();
        int size = this.f19481c.size();
        for (int i = 0; i < size; i++) {
            ot otVar = (ot) this.f19481c.get(i);
            if (otVar.isVisible()) {
                this.f19492o.add(otVar);
            }
        }
        this.f19493p = false;
        this.f19495r = true;
        return this.f19492o;
    }

    public boolean hasVisibleItems() {
        if (this.f19488j) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (((ot) this.f19481c.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo3319f() {
        return this.f19502y;
    }

    /* renamed from: g */
    public boolean mo3320g() {
        return this.f19490m;
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return m14239a(i, keyEvent) != null;
    }

    /* renamed from: h */
    public boolean mo3321h() {
        return this.f19491n;
    }

    /* renamed from: i */
    final void m14263i() {
        this.f19495r = true;
        m14255b(true);
    }

    /* renamed from: j */
    public final void m14264j() {
        this.f19493p = true;
        m14255b(true);
    }

    /* renamed from: b */
    public final void m14255b(boolean z) {
        if (this.f19496s) {
            this.f19497t = true;
            if (z) {
                this.f19498u = true;
                return;
            }
            return;
        }
        if (z) {
            this.f19493p = true;
            this.f19495r = true;
        }
        if (!this.f19501x.isEmpty()) {
            m14266l();
            Iterator it = this.f19501x.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                pe peVar = (pe) weakReference.get();
                if (peVar == null) {
                    this.f19501x.remove(weakReference);
                } else {
                    peVar.mo2438a(z);
                }
            }
            m14265k();
        }
    }

    public boolean performIdentifierAction(int i, int i2) {
        return m14249a(findItem(i), null, i2);
    }

    /* renamed from: a */
    public final boolean m14249a(MenuItem menuItem, pe peVar, int i) {
        boolean z = false;
        ot otVar = (ot) menuItem;
        if (otVar == null || !otVar.isEnabled()) {
            return false;
        }
        boolean z2;
        boolean d = otVar.m14284d();
        jf jfVar = otVar.f19514f;
        if (jfVar == null) {
            z2 = false;
        } else if (jfVar.mo2446a()) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean expandActionView;
        if (otVar.m14283c()) {
            expandActionView = otVar.expandActionView() | d;
            if (!expandActionView) {
                return expandActionView;
            }
            m14248a(true);
            return expandActionView;
        } else if (otVar.hasSubMenu() || z2) {
            int i2;
            if ((i & 4) == 0) {
                m14248a(false);
            }
            if (!otVar.hasSubMenu()) {
                otVar.m14277a(new pn(this.f19479a, this, otVar));
            }
            pn pnVar = (pn) otVar.getSubMenu();
            if (z2) {
                jfVar.mo2445a((SubMenu) pnVar);
            }
            if (this.f19501x.isEmpty()) {
                i2 = 0;
            } else {
                if (peVar != null) {
                    z = peVar.mo2441a(pnVar);
                }
                Iterator it = this.f19501x.iterator();
                i2 = z;
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    pe peVar2 = (pe) weakReference.get();
                    if (peVar2 == null) {
                        this.f19501x.remove(weakReference);
                    } else if (i2 == 0) {
                        i2 = peVar2.mo2441a(pnVar);
                    }
                }
            }
            expandActionView = d | i2;
            if (expandActionView) {
                return expandActionView;
            }
            m14248a(true);
            return expandActionView;
        } else if ((i & 1) != 0) {
            return d;
        } else {
            m14248a(true);
            return d;
        }
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        boolean a;
        MenuItem a2 = m14239a(i, keyEvent);
        if (a2 != null) {
            a = m14249a(a2, null, i2);
        } else {
            a = false;
        }
        if ((i2 & 2) != 0) {
            m14248a(true);
        }
        return a;
    }

    public void removeGroup(int i) {
        int i2;
        int size = size();
        for (i2 = 0; i2 < size; i2++) {
            if (((ot) this.f19481c.get(i2)).getGroupId() == i) {
                size = i2;
                break;
            }
        }
        size = -1;
        if (size >= 0) {
            int size2 = this.f19481c.size() - size;
            int i3 = 0;
            while (true) {
                i2 = i3 + 1;
                if (i3 >= size2 || ((ot) this.f19481c.get(size)).getGroupId() != i) {
                    m14255b(true);
                } else {
                    m14240a(size, false);
                    i3 = i2;
                }
            }
            m14255b(true);
        }
    }

    public void removeItem(int i) {
        int i2;
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            if (((ot) this.f19481c.get(i3)).getItemId() == i) {
                i2 = i3;
                break;
            }
        }
        i2 = -1;
        m14240a(i2, true);
    }

    /* renamed from: a */
    private final void m14240a(int i, boolean z) {
        if (i >= 0 && i < this.f19481c.size()) {
            this.f19481c.remove(i);
            if (z) {
                m14255b(true);
            }
        }
    }

    /* renamed from: b */
    public final void m14254b(pe peVar) {
        Iterator it = this.f19501x.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            pe peVar2 = (pe) weakReference.get();
            if (peVar2 == null || peVar2 == peVar) {
                this.f19501x.remove(weakReference);
            }
        }
    }

    /* renamed from: a */
    public final void m14244a(Bundle bundle) {
        if (bundle != null) {
            MenuItem item;
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(mo3316b());
            int size = size();
            for (int i = 0; i < size; i++) {
                item = getItem(i);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((pn) item.getSubMenu()).m14244a(bundle);
                }
            }
            int i2 = bundle.getInt("android:menu:expandedactionview");
            if (i2 > 0) {
                item = findItem(i2);
                if (item != null) {
                    item.expandActionView();
                }
            }
        }
    }

    /* renamed from: b */
    public final void m14253b(Bundle bundle) {
        int size = size();
        int i = 0;
        SparseArray sparseArray = null;
        while (i < size) {
            SparseArray sparseArray2;
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView == null) {
                sparseArray2 = sparseArray;
            } else if (actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                    sparseArray2 = sparseArray;
                } else {
                    sparseArray2 = sparseArray;
                }
            } else {
                sparseArray2 = sparseArray;
            }
            if (item.hasSubMenu()) {
                ((pn) item.getSubMenu()).m14253b(bundle);
            }
            i++;
            sparseArray = sparseArray2;
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo3316b(), sparseArray);
        }
    }

    /* renamed from: a */
    public void mo3313a(oq oqVar) {
        this.f19480b = oqVar;
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f19481c.size();
        for (int i2 = 0; i2 < size; i2++) {
            ot otVar = (ot) this.f19481c.get(i2);
            if (otVar.getGroupId() == i) {
                otVar.m14281b(z2);
                otVar.setCheckable(z);
            }
        }
    }

    public void setGroupDividerEnabled(boolean z) {
        this.f19502y = z;
    }

    public void setGroupEnabled(int i, boolean z) {
        int size = this.f19481c.size();
        for (int i2 = 0; i2 < size; i2++) {
            ot otVar = (ot) this.f19481c.get(i2);
            if (otVar.getGroupId() == i) {
                otVar.setEnabled(z);
            }
        }
    }

    public void setGroupVisible(int i, boolean z) {
        int size = this.f19481c.size();
        int i2 = 0;
        boolean z2 = false;
        while (i2 < size) {
            ot otVar = (ot) this.f19481c.get(i2);
            boolean z3 = otVar.getGroupId() == i ? otVar.m14285d(z) ? true : z2 : z2;
            i2++;
            z2 = z3;
        }
        if (z2) {
            m14255b(true);
        }
    }

    /* renamed from: a */
    final void m14243a(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources resources = this.f19489l;
        if (view != null) {
            this.f19486h = view;
            this.f19484f = null;
            this.f19485g = null;
        } else {
            if (i > 0) {
                this.f19484f = resources.getText(i);
            } else if (charSequence != null) {
                this.f19484f = charSequence;
            }
            if (i2 > 0) {
                this.f19485g = ge.getDrawable(this.f19479a, i2);
            } else if (drawable != null) {
                this.f19485g = drawable;
            }
            this.f19486h = null;
        }
        m14255b(false);
    }

    public void setQwertyMode(boolean z) {
        this.f19490m = z;
        m14255b(false);
    }

    public int size() {
        return this.f19481c.size();
    }

    /* renamed from: k */
    public final void m14265k() {
        this.f19496s = false;
        if (this.f19497t) {
            this.f19497t = false;
            m14255b(this.f19498u);
        }
    }

    /* renamed from: l */
    public final void m14266l() {
        if (!this.f19496s) {
            this.f19496s = true;
            this.f19497t = false;
            this.f19498u = false;
        }
    }
}
