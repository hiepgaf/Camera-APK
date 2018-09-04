package p000;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.app.ActionBarDrawerToggle;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;

/* compiled from: PG */
/* renamed from: oa */
public final class oa implements hg {
    /* renamed from: a */
    private final int f19441a;
    /* renamed from: b */
    private CharSequence f19442b;
    /* renamed from: c */
    private CharSequence f19443c;
    /* renamed from: d */
    private Intent f19444d;
    /* renamed from: e */
    private char f19445e;
    /* renamed from: f */
    private int f19446f = 4096;
    /* renamed from: g */
    private char f19447g;
    /* renamed from: h */
    private int f19448h = 4096;
    /* renamed from: i */
    private Drawable f19449i;
    /* renamed from: j */
    private Context f19450j;
    /* renamed from: k */
    private CharSequence f19451k;
    /* renamed from: l */
    private CharSequence f19452l;
    /* renamed from: m */
    private ColorStateList f19453m = null;
    /* renamed from: n */
    private Mode f19454n = null;
    /* renamed from: o */
    private boolean f19455o = false;
    /* renamed from: p */
    private boolean f19456p = false;
    /* renamed from: q */
    private int f19457q = 16;

    public oa(Context context, CharSequence charSequence) {
        this.f19450j = context;
        this.f19441a = ActionBarDrawerToggle.ID_HOME;
        this.f19442b = charSequence;
    }

    /* renamed from: b */
    private final void m14205b() {
        Drawable drawable = this.f19449i;
        if (drawable == null) {
            return;
        }
        if (this.f19455o || this.f19456p) {
            this.f19449i = drawable;
            this.f19449i = this.f19449i.mutate();
            if (this.f19455o) {
                this.f19449i.setTintList(this.f19453m);
            }
            if (this.f19456p) {
                this.f19449i.setTintMode(this.f19454n);
            }
        }
    }

    public final boolean collapseActionView() {
        return false;
    }

    public final boolean expandActionView() {
        return false;
    }

    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public final View getActionView() {
        return null;
    }

    public final int getAlphabeticModifiers() {
        return this.f19448h;
    }

    public final char getAlphabeticShortcut() {
        return this.f19447g;
    }

    public final CharSequence getContentDescription() {
        return this.f19451k;
    }

    public final int getGroupId() {
        return 0;
    }

    public final Drawable getIcon() {
        return this.f19449i;
    }

    public final ColorStateList getIconTintList() {
        return this.f19453m;
    }

    public final Mode getIconTintMode() {
        return this.f19454n;
    }

    public final Intent getIntent() {
        return this.f19444d;
    }

    public final int getItemId() {
        return this.f19441a;
    }

    public final ContextMenuInfo getMenuInfo() {
        return null;
    }

    public final int getNumericModifiers() {
        return this.f19446f;
    }

    public final char getNumericShortcut() {
        return this.f19445e;
    }

    public final int getOrder() {
        return 0;
    }

    public final SubMenu getSubMenu() {
        return null;
    }

    /* renamed from: a */
    public final jf mo2412a() {
        return null;
    }

    public final CharSequence getTitle() {
        return this.f19442b;
    }

    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f19443c;
        return charSequence == null ? this.f19442b : charSequence;
    }

    public final CharSequence getTooltipText() {
        return this.f19452l;
    }

    public final boolean hasSubMenu() {
        return false;
    }

    public final boolean isActionViewExpanded() {
        return false;
    }

    public final boolean isCheckable() {
        return this.f19457q & 1;
    }

    public final boolean isChecked() {
        return (this.f19457q & 2) != 0;
    }

    public final boolean isEnabled() {
        return (this.f19457q & 16) != 0;
    }

    public final boolean isVisible() {
        return (this.f19457q & 8) == 0;
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setAlphabeticShortcut(char c) {
        this.f19447g = Character.toLowerCase(c);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.f19447g = Character.toLowerCase(c);
        this.f19448h = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public final MenuItem setCheckable(boolean z) {
        this.f19457q = (this.f19457q & -2) | z;
        return this;
    }

    public final MenuItem setChecked(boolean z) {
        int i;
        int i2 = this.f19457q & -3;
        if (z) {
            i = 2;
        } else {
            i = 0;
        }
        this.f19457q = i | i2;
        return this;
    }

    /* renamed from: a */
    public final hg mo2410a(CharSequence charSequence) {
        this.f19451k = charSequence;
        return this;
    }

    public final /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        this.f19451k = charSequence;
        return this;
    }

    public final MenuItem setEnabled(boolean z) {
        int i;
        int i2 = this.f19457q & -17;
        if (z) {
            i = 16;
        } else {
            i = 0;
        }
        this.f19457q = i | i2;
        return this;
    }

    public final MenuItem setIcon(int i) {
        this.f19449i = ge.getDrawable(this.f19450j, i);
        m14205b();
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.f19449i = drawable;
        m14205b();
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f19453m = colorStateList;
        this.f19455o = true;
        m14205b();
        return this;
    }

    public final MenuItem setIconTintMode(Mode mode) {
        this.f19454n = mode;
        this.f19456p = true;
        m14205b();
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.f19444d = intent;
        return this;
    }

    public final MenuItem setNumericShortcut(char c) {
        this.f19445e = c;
        return this;
    }

    public final MenuItem setNumericShortcut(char c, int i) {
        this.f19445e = c;
        this.f19446f = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public final MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    public final MenuItem setShortcut(char c, char c2) {
        this.f19445e = c;
        this.f19447g = Character.toLowerCase(c2);
        return this;
    }

    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f19445e = c;
        this.f19446f = KeyEvent.normalizeMetaState(i);
        this.f19447g = Character.toLowerCase(c2);
        this.f19448h = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public final void setShowAsAction(int i) {
    }

    public final /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    /* renamed from: a */
    public final hg mo2411a(jf jfVar) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setTitle(int i) {
        this.f19442b = this.f19450j.getResources().getString(i);
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.f19442b = charSequence;
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f19443c = charSequence;
        return this;
    }

    /* renamed from: b */
    public final hg mo2413b(CharSequence charSequence) {
        this.f19452l = charSequence;
        return this;
    }

    public final /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        this.f19452l = charSequence;
        return this;
    }

    public final MenuItem setVisible(boolean z) {
        int i;
        int i2 = this.f19457q & 8;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        this.f19457q = i | i2;
        return this;
    }
}
