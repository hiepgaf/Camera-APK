package p000;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug.CapturedViewProperty;
import android.widget.LinearLayout;

/* compiled from: PG */
/* renamed from: ot */
public final class ot implements hg {
    /* renamed from: A */
    private View f19506A;
    /* renamed from: B */
    private OnActionExpandListener f19507B;
    /* renamed from: C */
    private boolean f19508C = false;
    /* renamed from: a */
    public final int f19509a;
    /* renamed from: b */
    public int f19510b = 4096;
    /* renamed from: c */
    public int f19511c = 4096;
    /* renamed from: d */
    public op f19512d;
    /* renamed from: e */
    public int f19513e = 0;
    /* renamed from: f */
    public jf f19514f;
    /* renamed from: g */
    private final int f19515g;
    /* renamed from: h */
    private final int f19516h;
    /* renamed from: i */
    private final int f19517i;
    /* renamed from: j */
    private CharSequence f19518j;
    /* renamed from: k */
    private CharSequence f19519k;
    /* renamed from: l */
    private Intent f19520l;
    /* renamed from: m */
    private char f19521m;
    /* renamed from: n */
    private char f19522n;
    /* renamed from: o */
    private Drawable f19523o;
    /* renamed from: p */
    private int f19524p = 0;
    /* renamed from: q */
    private pn f19525q;
    /* renamed from: r */
    private OnMenuItemClickListener f19526r;
    /* renamed from: s */
    private CharSequence f19527s;
    /* renamed from: t */
    private CharSequence f19528t;
    /* renamed from: u */
    private ColorStateList f19529u = null;
    /* renamed from: v */
    private Mode f19530v = null;
    /* renamed from: w */
    private boolean f19531w = false;
    /* renamed from: x */
    private boolean f19532x = false;
    /* renamed from: y */
    private boolean f19533y = false;
    /* renamed from: z */
    private int f19534z = 16;

    ot(op opVar, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f19512d = opVar;
        this.f19515g = i2;
        this.f19516h = i;
        this.f19517i = i3;
        this.f19509a = i4;
        this.f19518j = charSequence;
        this.f19513e = i5;
    }

    /* renamed from: a */
    public static void m14271a(StringBuilder stringBuilder, int i, int i2, String str) {
        if ((i & i2) == i2) {
            stringBuilder.append(str);
        }
    }

    /* renamed from: a */
    private final Drawable m14269a(Drawable drawable) {
        if (drawable != null && this.f19533y && (this.f19531w || this.f19532x)) {
            drawable = drawable.mutate();
            if (this.f19531w) {
                drawable.setTintList(this.f19529u);
            }
            if (this.f19532x) {
                drawable.setTintMode(this.f19530v);
            }
            this.f19533y = false;
        }
        return drawable;
    }

    public final boolean collapseActionView() {
        if ((this.f19513e & 8) == 0) {
            return false;
        }
        if (this.f19506A == null) {
            return true;
        }
        OnActionExpandListener onActionExpandListener = this.f19507B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f19512d.mo3315a(this);
        }
        return false;
    }

    public final boolean expandActionView() {
        if (!m14283c()) {
            return false;
        }
        OnActionExpandListener onActionExpandListener = this.f19507B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f19512d.mo3317b(this);
        }
        return false;
    }

    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public final View getActionView() {
        View view = this.f19506A;
        if (view != null) {
            return view;
        }
        jf jfVar = this.f19514f;
        if (jfVar == null) {
            return null;
        }
        this.f19506A = jfVar.mo3309a((MenuItem) this);
        return this.f19506A;
    }

    public final int getAlphabeticModifiers() {
        return this.f19511c;
    }

    public final char getAlphabeticShortcut() {
        return this.f19522n;
    }

    public final CharSequence getContentDescription() {
        return this.f19527s;
    }

    public final int getGroupId() {
        return this.f19516h;
    }

    public final Drawable getIcon() {
        Drawable drawable = this.f19523o;
        if (drawable != null) {
            return m14269a(drawable);
        }
        int i = this.f19524p;
        if (i == 0) {
            return null;
        }
        drawable = nj.m5620b(this.f19512d.f19479a, i);
        this.f19524p = 0;
        this.f19523o = drawable;
        return m14269a(drawable);
    }

    public final ColorStateList getIconTintList() {
        return this.f19529u;
    }

    public final Mode getIconTintMode() {
        return this.f19530v;
    }

    public final Intent getIntent() {
        return this.f19520l;
    }

    @CapturedViewProperty
    public final int getItemId() {
        return this.f19515g;
    }

    public final ContextMenuInfo getMenuInfo() {
        return null;
    }

    public final int getNumericModifiers() {
        return this.f19510b;
    }

    public final char getNumericShortcut() {
        return this.f19521m;
    }

    public final int getOrder() {
        return this.f19517i;
    }

    /* renamed from: b */
    public final char m14279b() {
        return !this.f19512d.mo3320g() ? this.f19521m : this.f19522n;
    }

    public final SubMenu getSubMenu() {
        return this.f19525q;
    }

    /* renamed from: a */
    public final jf mo2412a() {
        return this.f19514f;
    }

    @CapturedViewProperty
    public final CharSequence getTitle() {
        return this.f19518j;
    }

    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f19519k;
        if (charSequence == null) {
            return this.f19518j;
        }
        return charSequence;
    }

    /* renamed from: a */
    public final CharSequence m14275a(ph phVar) {
        if (phVar == null || !phVar.mo282b()) {
            return getTitle();
        }
        return getTitleCondensed();
    }

    public final CharSequence getTooltipText() {
        return this.f19528t;
    }

    /* renamed from: c */
    public final boolean m14283c() {
        if ((this.f19513e & 8) == 0) {
            return false;
        }
        if (this.f19506A == null) {
            jf jfVar = this.f19514f;
            if (jfVar != null) {
                this.f19506A = jfVar.mo3309a((MenuItem) this);
            }
        }
        if (this.f19506A != null) {
            return true;
        }
        return false;
    }

    public final boolean hasSubMenu() {
        return this.f19525q != null;
    }

    /* renamed from: d */
    public final boolean m14284d() {
        OnMenuItemClickListener onMenuItemClickListener = this.f19526r;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        op opVar = this.f19512d;
        if (opVar.mo3314a(opVar, (MenuItem) this)) {
            return true;
        }
        Intent intent = this.f19520l;
        if (intent != null) {
            try {
                this.f19512d.f19479a.startActivity(intent);
                return true;
            } catch (Throwable e) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
            }
        }
        jf jfVar = this.f19514f;
        if (jfVar == null || !jfVar.mo2448d()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final boolean m14286e() {
        return (this.f19534z & 32) == 32;
    }

    public final boolean isActionViewExpanded() {
        return this.f19508C;
    }

    public final boolean isCheckable() {
        return this.f19534z & 1;
    }

    public final boolean isChecked() {
        return (this.f19534z & 2) == 2;
    }

    public final boolean isEnabled() {
        return (this.f19534z & 16) != 0;
    }

    /* renamed from: f */
    public final boolean m14287f() {
        return (this.f19534z & 4) != 0;
    }

    public final boolean isVisible() {
        jf jfVar = this.f19514f;
        if (jfVar == null || !jfVar.mo3312e()) {
            if ((this.f19534z & 8) != 0) {
                return false;
            }
            return true;
        } else if ((this.f19534z & 8) == 0 && this.f19514f.mo3311b()) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: g */
    public final boolean m14288g() {
        return (this.f19513e & 2) == 2;
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public final /* synthetic */ MenuItem setActionView(int i) {
        Context context = this.f19512d.f19479a;
        m14270a(LayoutInflater.from(context).inflate(i, new LinearLayout(context), false));
        return this;
    }

    /* renamed from: a */
    private final hg m14270a(View view) {
        this.f19506A = view;
        this.f19514f = null;
        if (view != null && view.getId() == -1) {
            int i = this.f19515g;
            if (i > 0) {
                view.setId(i);
            }
        }
        this.f19512d.m14263i();
        return this;
    }

    public final /* synthetic */ MenuItem setActionView(View view) {
        return m14270a(view);
    }

    /* renamed from: a */
    public final void m14278a(boolean z) {
        this.f19508C = z;
        this.f19512d.m14255b(false);
    }

    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.f19522n != c) {
            this.f19522n = Character.toLowerCase(c);
            this.f19512d.m14255b(false);
        }
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (!(this.f19522n == c && this.f19511c == i)) {
            this.f19522n = Character.toLowerCase(c);
            this.f19511c = KeyEvent.normalizeMetaState(i);
            this.f19512d.m14255b(false);
        }
        return this;
    }

    public final MenuItem setCheckable(boolean z) {
        int i = this.f19534z;
        this.f19534z = (i & -2) | z;
        if (i != this.f19534z) {
            this.f19512d.m14255b(false);
        }
        return this;
    }

    public final MenuItem setChecked(boolean z) {
        if ((this.f19534z & 4) != 0) {
            op opVar = this.f19512d;
            int groupId = getGroupId();
            int size = opVar.f19481c.size();
            opVar.m14266l();
            for (int i = 0; i < size; i++) {
                ot otVar = (ot) opVar.f19481c.get(i);
                if (otVar.getGroupId() == groupId && otVar.m14287f() && otVar.isCheckable()) {
                    boolean z2;
                    if (otVar == this) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    otVar.m14272e(z2);
                }
            }
            opVar.m14265k();
        } else {
            m14272e(z);
        }
        return this;
    }

    /* renamed from: e */
    private final void m14272e(boolean z) {
        int i;
        int i2 = this.f19534z;
        int i3 = i2 & -3;
        if (z) {
            i = 2;
        } else {
            i = 0;
        }
        this.f19534z = i | i3;
        if (i2 != this.f19534z) {
            this.f19512d.m14255b(false);
        }
    }

    /* renamed from: a */
    public final hg mo2410a(CharSequence charSequence) {
        this.f19527s = charSequence;
        this.f19512d.m14255b(false);
        return this;
    }

    public final /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        return mo2410a(charSequence);
    }

    public final MenuItem setEnabled(boolean z) {
        if (z) {
            this.f19534z |= 16;
        } else {
            this.f19534z &= -17;
        }
        this.f19512d.m14255b(false);
        return this;
    }

    /* renamed from: b */
    public final void m14281b(boolean z) {
        int i;
        int i2 = this.f19534z & -5;
        if (z) {
            i = 4;
        } else {
            i = 0;
        }
        this.f19534z = i | i2;
    }

    public final MenuItem setIcon(int i) {
        this.f19523o = null;
        this.f19524p = i;
        this.f19533y = true;
        this.f19512d.m14255b(false);
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.f19524p = 0;
        this.f19523o = drawable;
        this.f19533y = true;
        this.f19512d.m14255b(false);
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f19529u = colorStateList;
        this.f19531w = true;
        this.f19533y = true;
        this.f19512d.m14255b(false);
        return this;
    }

    public final MenuItem setIconTintMode(Mode mode) {
        this.f19530v = mode;
        this.f19532x = true;
        this.f19533y = true;
        this.f19512d.m14255b(false);
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.f19520l = intent;
        return this;
    }

    /* renamed from: c */
    public final void m14282c(boolean z) {
        if (z) {
            this.f19534z |= 32;
        } else {
            this.f19534z &= -33;
        }
    }

    public final MenuItem setNumericShortcut(char c) {
        if (this.f19521m != c) {
            this.f19521m = c;
            this.f19512d.m14255b(false);
        }
        return this;
    }

    public final MenuItem setNumericShortcut(char c, int i) {
        if (!(this.f19521m == c && this.f19510b == i)) {
            this.f19521m = c;
            this.f19510b = KeyEvent.normalizeMetaState(i);
            this.f19512d.m14255b(false);
        }
        return this;
    }

    public final MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        this.f19507B = onActionExpandListener;
        return this;
    }

    public final MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.f19526r = onMenuItemClickListener;
        return this;
    }

    public final MenuItem setShortcut(char c, char c2) {
        this.f19521m = c;
        this.f19522n = Character.toLowerCase(c2);
        this.f19512d.m14255b(false);
        return this;
    }

    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f19521m = c;
        this.f19510b = KeyEvent.normalizeMetaState(i);
        this.f19522n = Character.toLowerCase(c2);
        this.f19511c = KeyEvent.normalizeMetaState(i2);
        this.f19512d.m14255b(false);
        return this;
    }

    public final void setShowAsAction(int i) {
        switch (i & 3) {
            case 0:
            case 1:
            case 2:
                this.f19513e = i;
                this.f19512d.m14263i();
                return;
            default:
                throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
    }

    public final /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    /* renamed from: a */
    public final void m14277a(pn pnVar) {
        this.f19525q = pnVar;
        pnVar.setHeaderTitle(getTitle());
    }

    /* renamed from: a */
    public final hg mo2411a(jf jfVar) {
        jf jfVar2 = this.f19514f;
        if (jfVar2 != null) {
            jfVar2.f7753a = null;
        }
        this.f19506A = null;
        this.f19514f = jfVar;
        this.f19512d.m14255b(true);
        jfVar2 = this.f19514f;
        if (jfVar2 != null) {
            jfVar2.mo3310a(new jg(this));
        }
        return this;
    }

    public final MenuItem setTitle(int i) {
        return setTitle(this.f19512d.f19479a.getString(i));
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.f19518j = charSequence;
        this.f19512d.m14255b(false);
        pn pnVar = this.f19525q;
        if (pnVar != null) {
            pnVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f19519k = charSequence;
        this.f19512d.m14255b(false);
        return this;
    }

    /* renamed from: b */
    public final hg mo2413b(CharSequence charSequence) {
        this.f19528t = charSequence;
        this.f19512d.m14255b(false);
        return this;
    }

    public final /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        return mo2413b(charSequence);
    }

    public final MenuItem setVisible(boolean z) {
        if (m14285d(z)) {
            this.f19512d.m14264j();
        }
        return this;
    }

    /* renamed from: d */
    final boolean m14285d(boolean z) {
        int i;
        int i2 = this.f19534z;
        int i3 = i2 & -9;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        this.f19534z = i | i3;
        if (i2 != this.f19534z) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final boolean m14289h() {
        return this.f19512d.mo3321h() && m14279b() != '\u0000';
    }

    public final String toString() {
        CharSequence charSequence = this.f19518j;
        return charSequence != null ? charSequence.toString() : null;
    }
}
