package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Constructor;

/* compiled from: PG */
/* renamed from: nw */
final class nw {
    /* renamed from: A */
    public jf f8952A;
    /* renamed from: B */
    public CharSequence f8953B;
    /* renamed from: C */
    public CharSequence f8954C;
    /* renamed from: D */
    public ColorStateList f8955D = null;
    /* renamed from: E */
    public Mode f8956E = null;
    /* renamed from: F */
    public final /* synthetic */ nu f8957F;
    /* renamed from: a */
    public Menu f8958a;
    /* renamed from: b */
    public int f8959b;
    /* renamed from: c */
    public int f8960c;
    /* renamed from: d */
    public int f8961d;
    /* renamed from: e */
    public int f8962e;
    /* renamed from: f */
    public boolean f8963f;
    /* renamed from: g */
    public boolean f8964g;
    /* renamed from: h */
    public boolean f8965h;
    /* renamed from: i */
    public int f8966i;
    /* renamed from: j */
    public int f8967j;
    /* renamed from: k */
    public CharSequence f8968k;
    /* renamed from: l */
    public CharSequence f8969l;
    /* renamed from: m */
    public int f8970m;
    /* renamed from: n */
    public char f8971n;
    /* renamed from: o */
    public int f8972o;
    /* renamed from: p */
    public char f8973p;
    /* renamed from: q */
    public int f8974q;
    /* renamed from: r */
    public int f8975r;
    /* renamed from: s */
    public boolean f8976s;
    /* renamed from: t */
    public boolean f8977t;
    /* renamed from: u */
    public boolean f8978u;
    /* renamed from: v */
    public int f8979v;
    /* renamed from: w */
    public int f8980w;
    /* renamed from: x */
    public String f8981x;
    /* renamed from: y */
    public String f8982y;
    /* renamed from: z */
    public String f8983z;

    public nw(nu nuVar, Menu menu) {
        this.f8957F = nuVar;
        this.f8958a = menu;
        m5651b();
    }

    /* renamed from: a */
    public final SubMenu m5648a() {
        this.f8965h = true;
        SubMenu addSubMenu = this.f8958a.addSubMenu(this.f8959b, this.f8966i, this.f8967j, this.f8968k);
        m5650a(addSubMenu.getItem());
        return addSubMenu;
    }

    /* renamed from: a */
    static char m5647a(String str) {
        if (str == null) {
            return '\u0000';
        }
        return str.charAt(0);
    }

    /* renamed from: a */
    final Object m5649a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor constructor = this.f8957F.f8946c.getClassLoader().loadClass(str).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Cannot instantiate class: ");
            stringBuilder.append(str);
            Log.w("SupportMenuInflater", stringBuilder.toString(), e);
            return null;
        }
    }

    /* renamed from: b */
    public final void m5651b() {
        this.f8959b = 0;
        this.f8960c = 0;
        this.f8961d = 0;
        this.f8962e = 0;
        this.f8963f = true;
        this.f8964g = true;
    }

    /* renamed from: a */
    final void m5650a(MenuItem menuItem) {
        boolean z;
        boolean z2 = true;
        MenuItem enabled = menuItem.setChecked(this.f8976s).setVisible(this.f8977t).setEnabled(this.f8978u);
        if (this.f8975r > 0) {
            z = true;
        } else {
            z = false;
        }
        enabled.setCheckable(z).setTitleCondensed(this.f8969l).setIcon(this.f8970m);
        int i = this.f8979v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        if (this.f8983z != null) {
            if (this.f8957F.f8946c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            nu nuVar = this.f8957F;
            if (nuVar.f8947d == null) {
                nuVar.f8947d = nu.m5645a(nuVar.f8946c);
            }
            menuItem.setOnMenuItemClickListener(new nv(nuVar.f8947d, this.f8983z));
        }
        z = menuItem instanceof ot;
        if (this.f8975r >= 2) {
            if (z) {
                ((ot) menuItem).m14281b(true);
            } else if (menuItem instanceof ou) {
                ou ouVar = (ou) menuItem;
                try {
                    if (ouVar.f22513e == null) {
                        ouVar.f22513e = ((hg) ouVar.d).getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
                    }
                    ouVar.f22513e.invoke(ouVar.d, new Object[]{Boolean.valueOf(true)});
                } catch (Throwable e) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
                }
            }
        }
        String str = this.f8981x;
        if (str != null) {
            menuItem.setActionView((View) m5649a(str, nu.f8943a, this.f8957F.f8945b));
        } else {
            z2 = false;
        }
        i = this.f8980w;
        if (i > 0) {
            if (z2) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i);
            }
        }
        jf jfVar = this.f8952A;
        if (jfVar != null) {
            if (menuItem instanceof hg) {
                ((hg) menuItem).mo2411a(jfVar);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.f8953B;
        z2 = menuItem instanceof hg;
        if (z2) {
            ((hg) menuItem).mo2410a(charSequence);
        } else {
            menuItem.setContentDescription(charSequence);
        }
        charSequence = this.f8954C;
        if (z2) {
            ((hg) menuItem).mo2413b(charSequence);
        } else {
            menuItem.setTooltipText(charSequence);
        }
        char c = this.f8971n;
        int i2 = this.f8972o;
        if (z2) {
            ((hg) menuItem).setAlphabeticShortcut(c, i2);
        } else {
            menuItem.setAlphabeticShortcut(c, i2);
        }
        c = this.f8973p;
        i2 = this.f8974q;
        if (z2) {
            ((hg) menuItem).setNumericShortcut(c, i2);
        } else {
            menuItem.setNumericShortcut(c, i2);
        }
        Mode mode = this.f8956E;
        if (mode != null) {
            if (z2) {
                ((hg) menuItem).setIconTintMode(mode);
            } else {
                menuItem.setIconTintMode(mode);
            }
        }
        ColorStateList colorStateList = this.f8955D;
        if (colorStateList == null) {
            return;
        }
        if (z2) {
            ((hg) menuItem).setIconTintList(colorStateList);
        } else {
            menuItem.setIconTintList(colorStateList);
        }
    }
}
